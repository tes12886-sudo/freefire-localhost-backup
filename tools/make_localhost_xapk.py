import argparse, json, pathlib, shutil, struct, subprocess, zipfile

BASE = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok\decompiled")
IL2CPP = BASE / "il2cpp"
ENC_IN = IL2CPP / "input" / "global-metadata.dat"
PLAIN = IL2CPP / "global-metadata.reconstructed.dat"
META_OUT = IL2CPP / "global-metadata.localhost.dat"

ORIG_DIR = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok\penting\original")
SRC_APK = ORIG_DIR / "com.dts.freefireth.apk"
OUT_DIR = BASE / "patched_localhost"
APK_UNSIGNED = OUT_DIR / "com.dts.freefireth.unsigned.apk"
APK_ALIGNED = OUT_DIR / "com.dts.freefireth.aligned.apk"
APK_SIGNED = OUT_DIR / "com.dts.freefireth.apk"
XAPK_OUT = OUT_DIR / "com.dts.freefireth.localhost.xapk"
JKS = OUT_DIR / "localhost.jks"

JDK = BASE / "tools" / "jdk21" / "jdk-21.0.13.1+2"
KEYTOOL = JDK / "bin" / "keytool.exe"
JAVA = JDK / "bin" / "java.exe"
APKSIGNER = BASE / "tools" / "android-15" / "lib" / "apksigner.jar"

META_ENTRY = "assets/bin/Data/Managed/Metadata/global-metadata.dat"
SLO, SLS, SLDO = 0x110, 0x31390, 0x314A0
OLD_PRIMARY = "https://version.common.redflamenco.com/live/"
OLD_BACKUP = "https://bdversion.ggbluefox.com/live/"
STOREPASS = "changeit"
ALIAS = "localhost"


def find_entry(blob, text):
    needle = text.encode("latin1")
    for i in range(SLS // 8):
        length, data_index = struct.unpack_from("<II", blob, SLO + i * 8)
        if length != len(needle):
            continue
        off = SLDO + data_index
        if blob[off:off + length] == needle:
            return {"idx": i, "len": length, "data_index": data_index, "off": off}
    raise SystemExit(f"string literal not found in plaintext metadata: {text}")


def derive_key(enc, plain, anchor_off):
    aligned = anchor_off - (anchor_off % 8)
    return bytes(enc[aligned + i] ^ plain[aligned + i] for i in range(8))


def patch(enc, key, entry, new_text):
    new = new_text.encode("latin1")
    old_len = entry["len"]
    if len(new) > old_len:
        raise SystemExit(
            f"replacement longer than original ({len(new)} > {old_len}): {new_text}"
        )
    table_off = SLO + entry["idx"] * 8
    data_off = entry["off"]

    for i in range(4):
        enc[table_off + i] = ((len(new) >> (8 * i)) & 0xFF) ^ key[(table_off + i) % 8]
    for i in range(old_len):
        val = new[i] if i < len(new) else 0
        enc[data_off + i] = val ^ key[(data_off + i) % 8]

    got_len = int.from_bytes(
        bytes(enc[table_off + i] ^ key[(table_off + i) % 8] for i in range(4)), "little"
    )
    got = bytes(enc[data_off + i] ^ key[(data_off + i) % 8] for i in range(len(new)))
    if got_len != len(new) or got != new:
        raise SystemExit(f"verification failed for {new_text}")
    print(f"  entry #{entry['idx']}: 0x{data_off:X}  {old_len} -> {len(new)}  {got.decode('latin1')}")


def alignment_extra(zout, name):
    start = zout.fp.tell()
    base = start + 30 + len(name.encode("utf-8"))
    rem = base % 4
    if rem == 0:
        return b""
    total = (4 - rem) % 4
    while total < 4:
        total += 4
    return struct.pack("<HH", 0xD935, total - 4) + b"\x00" * (total - 4)


def rebuild_apk(meta_bytes):
    OUT_DIR.mkdir(parents=True, exist_ok=True)
    with zipfile.ZipFile(SRC_APK, "r") as zin, zipfile.ZipFile(APK_UNSIGNED, "w") as zout:
        found = False
        for item in zin.infolist():
            name = item.filename
            if name.startswith("META-INF/") and name.upper().endswith((".RSA", ".SF", ".MF")):
                continue
            data = zin.read(name)
            if name == META_ENTRY:
                if len(data) != len(meta_bytes):
                    raise SystemExit(f"metadata size mismatch: apk={len(data)} new={len(meta_bytes)}")
                data = meta_bytes
                found = True
            zi = zipfile.ZipInfo(item.filename, date_time=item.date_time)
            zi.compress_type = item.compress_type
            zi.external_attr = item.external_attr
            zi.internal_attr = item.internal_attr
            zi.create_system = item.create_system
            zi.flag_bits = item.flag_bits
            zi.comment = item.comment
            if item.filename == "resources.arsc":
                zi.compress_type = zipfile.ZIP_STORED
                zi.extra = alignment_extra(zout, item.filename)
            else:
                zi.extra = item.extra
            zout.writestr(zi, data)
        if not found:
            raise SystemExit(f"missing {META_ENTRY} in {SRC_APK}")
    print(f"  rebuilt {APK_UNSIGNED.name}")


def align_and_sign():
    if not KEYTOOL.exists() or not JAVA.exists() or not APKSIGNER.exists():
        raise SystemExit(f"JDK tools missing under {JDK}")
    if not JKS.exists():
        subprocess.run(
            [
                str(KEYTOOL), "-genkeypair",
                "-alias", ALIAS,
                "-keyalg", "RSA",
                "-keysize", "2048",
                "-validity", "10000",
                "-keystore", str(JKS),
                "-storepass", STOREPASS,
                "-keypass", STOREPASS,
                "-dname", "CN=localhost, OU=local, O=local, L=local, ST=local, C=ID",
                "-noprompt",
            ],
            check=True,
        )
        print(f"  created {JKS.name}")
    subprocess.run(
        [
            str(JAVA), "-jar", str(APKSIGNER), "sign",
            "--ks", str(JKS),
            "--ks-key-alias", ALIAS,
            "--ks-pass", f"pass:{STOREPASS}",
            "--key-pass", f"pass:{STOREPASS}",
            "--v1-signing-enabled", "true",
            "--v2-signing-enabled", "true",
            "--alignment-preserved",
            "--out", str(APK_SIGNED),
            str(APK_UNSIGNED),
        ],
        check=True,
    )
    print(f"  signed {APK_SIGNED.name} with v1 + v2")


def build_xapk():
    manifest = json.loads((ORIG_DIR / "manifest.json").read_text(encoding="utf-8"))
    manifest["name"] = "Free Fire Localhost"
    with zipfile.ZipFile(XAPK_OUT, "w", zipfile.ZIP_DEFLATED) as z:
        z.writestr("manifest.json", json.dumps(manifest, ensure_ascii=False))
        z.write(APK_SIGNED, "com.dts.freefireth.apk")
        icon = ORIG_DIR / "icon.png"
        if icon.exists():
            z.write(icon, "icon.png")
        for exp in manifest.get("expansions", []):
            src = ORIG_DIR / exp["file"]
            if src.exists():
                z.write(src, exp["file"])
    print(f"  packaged {XAPK_OUT.name}")


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--url", default="http://localhost:8080/live/")
    ap.add_argument("--backup-url", default=None)
    args = ap.parse_args()
    backup = args.backup_url if args.backup_url else args.url

    enc = bytearray(ENC_IN.read_bytes())
    plain = PLAIN.read_bytes()

    primary = find_entry(plain, OLD_PRIMARY)
    secondary = find_entry(plain, OLD_BACKUP)
    key = derive_key(enc, plain, primary["off"])
    print("key8 =", key.hex(" "))
    print("patching verAddr literals:")
    patch(enc, key, primary, args.url)
    patch(enc, key, secondary, backup)

    META_OUT.write_bytes(enc)
    print(f"  wrote {META_OUT.name}")

    rebuild_apk(bytes(enc))
    align_and_sign()
    build_xapk()

    print("\nDone.")
    print(f"APK : {APK_SIGNED}")
    print(f"XAPK: {XAPK_OUT}")
    print(f"Ver : {args.url}")
    print(f"Bak : {backup}")


if __name__ == "__main__":
    main()
