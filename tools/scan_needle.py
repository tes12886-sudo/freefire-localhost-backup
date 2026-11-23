import pathlib

root = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok")
needles = {
    "ascii": b"version.common.redflamenco.com",
    "utf16": "version.common.redflamenco.com".encode("utf-16-le"),
    "ascii_short": b"redflamenco",
    "utf16_short": "redflamenco".encode("utf-16-le"),
}
exts = {".so", ".dat", ".apk", ".xapk", ".bin", ".json", ".txt", ".assets", ".bundle", ".xml", ".smali"}
for p in root.rglob("*"):
    if not p.is_file():
        continue
    if p.suffix.lower() not in exts:
        continue
    try:
        if p.stat().st_size > 400 * 1024 * 1024:
            continue
        data = p.read_bytes()
    except Exception:
        continue
    hits = []
    for name, n in needles.items():
        i = data.find(n)
        if i != -1:
            hits.append(f"{name}@{hex(i)}")
    if hits:
        print(f"{p}  [{', '.join(hits)}]")
