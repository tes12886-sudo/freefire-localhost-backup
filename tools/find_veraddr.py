import pathlib, sys

needle = b"https://version.common.redflamenco.com/live/"
base = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok\decompiled")
targets = [
    base / "il2cpp/input/global-metadata.dat",
    base / "il2cpp/input/libil2cpp.so",
    base / "apktool/assets/bin/Data/Managed/Metadata/global-metadata.dat",
    base / "apktool/lib/arm64-v8a/libil2cpp.so",
]
for t in targets:
    if not t.exists():
        print(f"MISSING {t}")
        continue
    data = t.read_bytes()
    idx = data.find(needle)
    print(f"{t}  size=0x{len(data):X}  found={idx != -1}  offset={hex(idx) if idx != -1 else '-'}")

# also list nearby strings in metadata if found
md = base / "il2cpp/input/global-metadata.dat"
if md.exists():
    data = md.read_bytes()
    idx = data.find(needle)
    if idx != -1:
        start = max(0, idx - 200)
        chunk = data[start:idx + len(needle) + 200]
        print("--- metadata context ---")
        print(chunk.decode("latin1", "replace"))
