import pathlib, re

base = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok\decompiled\il2cpp")
for name in ["global-metadata.localhost.dat", "global-metadata.reconstructed.dat", "global-metadata.dec8.dat"]:
    data = (base / name).read_bytes()
    text = data.decode("utf-8", errors="ignore")
    hits = [m.start() for m in re.finditer(r"10\.0\.2\.2|localhost|version\.common|ggbluefox|verAddr|serverUrl|server_url", text, re.I)]
    print(name, "hits", len(hits))
    for i in hits[:12]:
        print("  ", repr(text[max(0, i - 70): i + 140]))
