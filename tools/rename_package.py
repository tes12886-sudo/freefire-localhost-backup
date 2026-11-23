import hashlib, json, pathlib, shutil, struct, subprocess, zipfile, zlib

SRC_DIR = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok\decompiled\patched_localhost")
OUT_DIR = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok\decompiled\patched_localhost_dtd")

SRC_APK = SRC_DIR / "com.dts.freefireth.apk"
SRC_MANIFEST = SRC_DIR.parent.parent / "penting" / "original" / "manifest.json"
ICON = SRC_DIR.parent.parent / "penting" / "original" / "icon.png"
SRC_OBB = SRC_DIR.parent.parent / "penting" / "original" / "Android" / "obb" / "com.dts.freefireth" / "main.2019116185.com.dts.freefireth.obb"

OUT_APK_UNSIGNED = OUT_DIR / "com.dtd.freefireth.unsigned.apk"
OUT_APK_SIGNED_RAW = OUT_DIR / "com.dtd.freefireth.signed_raw.apk"
OUT_APK = OUT_DIR / "com.dtd.freefireth.apk"
OUT_XAPK = OUT_DIR / "com.dtd.freefireth.localhost.xapk"
JKS = SRC_DIR / "localhost.jks"

JDK = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok\decompiled\tools\jdk21\jdk-21.0.13.1+2")
JAVA = JDK / "bin" / "java.exe"
APKSIGNER = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok\decompiled\tools\android-15\lib\apksigner.jar")
STOREPASS = "changeit"
ALIAS = "localhost"
PATCH_NATIVE = False

PLAIN_META = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok\decompiled\il2cpp\global-metadata.reconstructed.dat")
META_ENTRY = "assets/bin/Data/Managed/Metadata/global-metadata.dat"
META_KEY = bytes.fromhex("bf60b0d8ecf6fb7e")
SLO, SLS, SLDO = 0x110, 0x31390, 0x314A0

OLD_DOT = "com.dts.freefireth"
NEW_DOT = "com.dtd.freefireth"
OLD_SLASH = "com/dts/freefireth"
NEW_SLASH = "com/dtd/freefireth"

PAIRS = [
    (OLD_DOT.encode("ascii"), NEW_DOT.encode("ascii")),
    (OLD_SLASH.encode("ascii"), NEW_SLASH.encode("ascii")),
    (OLD_DOT.encode("utf-16le"), NEW_DOT.encode("utf-16le")),
    (OLD_DOT.encode("utf-16-be"), NEW_DOT.encode("utf-16-be")),
    (OLD_SLASH.encode("utf-16le"), NEW_SLASH.encode("utf-16le")),
    (OLD_SLASH.encode("utf-16-be"), NEW_SLASH.encode("utf-16-be")),
]


def patch_bytes(data):
    for old, new in PAIRS:
        if old != new:
            data = data.replace(old, new)
    return data


def fix_dex_header(data):
    if data[:4] != b"dex\n":
        return data
    signature = hashlib.sha1(data[0x20:]).digest()
    data = data[:0x0C] + signature + data[0x20:]
    checksum = zlib.adler32(data[0x0C:]) & 0xFFFFFFFF
    return data[:0x08] + struct.pack("<I", checksum) + data[0x0C:]


def patch_metadata_package(data):
    plain = PLAIN_META.read_bytes()
    if len(data) != len(plain):
        raise SystemExit(f"metadata size mismatch: apk={len(data)} plain={len(plain)}")

    enc = bytearray(data)
    patched = 0
    for idx in range(SLS // 8):
        length, data_index = struct.unpack_from("<II", plain, SLO + idx * 8)
        off = SLDO + data_index
        text = plain[off:off + length]
        new = text.replace(OLD_DOT.encode("ascii"), NEW_DOT.encode("ascii"))
        new = new.replace(OLD_SLASH.encode("ascii"), NEW_SLASH.encode("ascii"))
        if new == text:
            continue
        if len(new) != length:
            raise SystemExit(f"metadata literal #{idx} length changed: {length} -> {len(new)}")
        for pos, value in enumerate(new):
            enc[off + pos] = value ^ META_KEY[(off + pos) % 8]
        got = bytes(enc[off + pos] ^ META_KEY[(off + pos) % 8] for pos in range(length))
        if got != new:
            raise SystemExit(f"metadata literal #{idx} verification failed")
        patched += 1
    print("metadata literals patched:", patched)
    return bytes(enc)


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


def rebuild_apk():
    OUT_DIR.mkdir(parents=True, exist_ok=True)
    counts = {}
    with zipfile.ZipFile(SRC_APK, "r") as zin, zipfile.ZipFile(OUT_APK_UNSIGNED, "w") as zout:
        for item in zin.infolist():
            name = item.filename
            if name.startswith("META-INF/") and name.upper().endswith((".RSA", ".SF", ".MF")):
                continue
            data = zin.read(name)
            for old, new in PAIRS:
                c = data.count(old)
                if c:
                    counts[old.decode("latin1")] = counts.get(old.decode("latin1"), 0) + c
            if PATCH_NATIVE or not (name.startswith("lib/") and name.endswith(".so")):
                data = patch_bytes(data)
            if name == META_ENTRY:
                data = patch_metadata_package(data)
            if name == "classes.dex" or (name.startswith("classes") and name.endswith(".dex")):
                data = fix_dex_header(data)
            zi = zipfile.ZipInfo(name, date_time=item.date_time)
            zi.compress_type = item.compress_type
            zi.external_attr = item.external_attr
            zi.internal_attr = item.internal_attr
            zi.create_system = item.create_system
            zi.flag_bits = item.flag_bits
            zi.comment = item.comment
            if name == "resources.arsc":
                zi.compress_type = zipfile.ZIP_STORED
                zi.extra = alignment_extra(zout, name)
            else:
                zi.extra = item.extra
            zout.writestr(zi, data)
    print("replaced:", counts)


def sign():
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
            "--out", str(OUT_APK),
            str(OUT_APK_UNSIGNED),
        ],
        check=True,
    )
    print("  signed with APK Signature Scheme v1 + v2")


def build_xapk():
    manifest = json.loads(SRC_MANIFEST.read_text(encoding="utf-8"))
    manifest["package_name"] = NEW_DOT
    manifest["name"] = "Free Fire Localhost DTD"
    for split in manifest.get("split_apks", []):
        split["file"] = "com.dtd.freefireth.apk"

    new_obb_path = f"Android/obb/{NEW_DOT}/main.2019116185.{NEW_DOT}.obb"
    for exp in manifest.get("expansions", []):
        exp["file"] = new_obb_path
        exp["install_path"] = new_obb_path
        exp["install_location"] = "EXTERNAL_STORAGE"

    with zipfile.ZipFile(OUT_XAPK, "w", zipfile.ZIP_DEFLATED) as z:
        z.writestr("manifest.json", json.dumps(manifest, ensure_ascii=False))
        z.write(OUT_APK, "com.dtd.freefireth.apk")
        if ICON.exists():
            z.write(ICON, "icon.png")
        if SRC_OBB.exists():
            z.write(SRC_OBB, new_obb_path)
        else:
            raise SystemExit(f"missing obb: {SRC_OBB}")


def verify():
    with zipfile.ZipFile(OUT_APK) as z:
        leftovers = {}
        for name in z.namelist():
            if not PATCH_NATIVE and name.startswith("lib/") and name.endswith(".so"):
                continue
            data = z.read(name)
            for old, new in PAIRS:
                c = data.count(old)
                if c:
                    leftovers[old.decode("latin1")] = leftovers.get(old.decode("latin1"), 0) + c
        if leftovers:
            raise SystemExit(f"old package still present: {leftovers}")
        meta = z.read("assets/bin/Data/Managed/Metadata/global-metadata.dat")
        info = z.getinfo("resources.arsc")
        data_off = info.header_offset + 30 + len(info.filename.encode("utf-8")) + len(info.extra)
        if info.compress_type != zipfile.ZIP_STORED or data_off % 4 != 0:
            raise SystemExit(f"resources.arsc alignment failed: stored={info.compress_type} off={data_off} mod4={data_off % 4}")
        print("metadata bytes:", len(meta))
        print("resources.arsc stored+aligned:", hex(data_off))
    print("APK :", OUT_APK)
    print("XAPK:", OUT_XAPK)


def main():
    rebuild_apk()
    sign()
    build_xapk()
    verify()


if __name__ == "__main__":
    main()
