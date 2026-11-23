import struct, pathlib

p = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok\decompiled\il2cpp\global-metadata.reconstructed.dat")
d = p.read_bytes()
SLO, SLS = 0x110, 0x31390
SLDO, SLDS = 0x314A0, 0x96D54
N = SLS // 8
print("entries", N, "data range", hex(SLDO), hex(SLDO + SLDS))

targets = {
    "https://version.common.redflamenco.com/live/": None,
    "https://bdversion.ggbluefox.com/live/": None,
}
for i in range(N):
    length, data_index = struct.unpack_from("<II", d, SLO + i * 8)
    off = SLDO + data_index
    if off + length > len(d):
        continue
    s = d[off:off + length].decode("latin1", "replace")
    if s in targets:
        targets[s] = (i, length, data_index, off)
for s, t in targets.items():
    if t:
        i, length, data_index, off = t
        print(f"entry #{i}: len={length} dataIndex=0x{data_index:X} fileOffset=0x{off:X}  {s}")
    else:
        print("NOT FOUND", s)

# show nearby literals in the data blob
print("--- literals around 0x507F6 ---")
for i in range(N):
    length, data_index = struct.unpack_from("<II", d, SLO + i * 8)
    off = SLDO + data_index
    if 0x50500 <= off <= 0x50A00:
        print(f"#{i} off=0x{off:X} len={length} {d[off:off+length].decode('latin1','replace')!r}")
