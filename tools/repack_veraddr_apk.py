import pathlib, zipfile, shutil, sys

BASE = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok\decompiled")
SRC_APK = BASE / "original" / "com.dts.freefireth.apk"
NEW_META = BASE / "il2cpp" / "global-metadata.veraddr.dat"
OUT_APK = BASE / "original" / "com.dts.freefireth.veraddr.apk"
ENTRY = "assets/bin/Data/Managed/Metadata/global-metadata.dat"

if not SRC_APK.exists():
    raise SystemExit(f"missing {SRC_APK}")
if not NEW_META.exists():
    raise SystemExit(f"missing {NEW_META}; run patch_veraddr_meta.py first")

new_meta = NEW_META.read_bytes()
print("new metadata size", hex(len(new_meta)))

with zipfile.ZipFile(SRC_APK, "r") as zin, zipfile.ZipFile(OUT_APK, "w") as zout:
    found = False
    for item in zin.infolist():
        data = zin.read(item.filename)
        if item.filename == ENTRY:
            if len(data) != len(new_meta):
                raise SystemExit(f"size mismatch: apk={len(data)} patched={len(new_meta)}")
            data = new_meta
            found = True
        zout.writestr(item, data)
    if not found:
        raise SystemExit(f"{ENTRY} not found in APK")

print("wrote", OUT_APK, hex(OUT_APK.stat().st_size))
print("next: zipalign -p 4 <in> <out>  ->  apksigner sign --ks <keystore> <out>")
