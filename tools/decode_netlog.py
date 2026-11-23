import re, pathlib, sys

path = pathlib.Path(sys.argv[1] if len(sys.argv) > 1 else r'C:\Users\runneradmin\Downloads\ok\decompiled\tools\netlog_version4.txt')
for line in path.read_text(errors='ignore').splitlines():
    m = re.match(r'\[TLS-(OUT|IN)\].*?hex=([0-9a-f]+)', line)
    if not m:
        continue
    direction, h = m.group(1), m.group(2)
    h = h[:len(h)//2*2]
    try:
        b = bytes.fromhex(h)
    except ValueError:
        continue
    s = b.decode('latin1', 'replace')
    if any(k in s.lower() for k in ('redflamenco', 'version', 'http/1.1')):
        print(f'===== TLS-{direction} len={len(b)} =====')
        print(s[:700])
        print()
