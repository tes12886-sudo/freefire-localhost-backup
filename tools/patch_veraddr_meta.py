import pathlib, struct, sys

BASE = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok\decompiled")
ENC = BASE / "il2cpp" / "input" / "global-metadata.dat"
REF = BASE / "il2cpp" / "global-metadata.reconstructed.dat"
OUT = BASE / "il2cpp" / "global-metadata.veraddr.dat"

# Header values from meta_build_header.py (metadata v24)
SLO, SLS = 0x110, 0x31390
SLDO = 0x314A0

# Entries found by find_literal_entry.py
PRIMARY = {"idx": 5828, "old_len": 44, "data_index": 0x1F34E}
BACKUP  = {"idx": 5818, "old_len": 37, "data_index": 0x1F1C5}

NEW_PRIMARY = b"https://version.rapz.com/live/"
NEW_BACKUP  = b"https://version.rapz.com/live/"   # set to None to leave backup untouched

enc = bytearray(ENC.read_bytes())
ref = REF.read_bytes()

def key_byte(off):
    # derive 8-byte repeating XOR key from known plaintext/ciphertext pair
    return enc[off] ^ ref[off]

base_off = 0x507EE
key = bytes(key_byte(base_off - (base_off % 8) + i) for i in range(8))
print("key8 =", key.hex(" "))
for i in range(min(len(enc), len(ref))):
    pass  # no full-file check, too slow

def put_encrypted(off, plain):
    for i, b in enumerate(plain):
        enc[off + i] = b ^ key[(off + i) % 8]

def patch(entry, new: bytes):
    idx = entry["idx"]
    table_off = SLO + idx * 8
    data_off = SLDO + entry["data_index"]
    old_len, data_index = struct.unpack_from("<II", ref, table_off)
    assert old_len == entry["old_len"], (idx, old_len)
    assert data_index == entry["data_index"], (idx, hex(data_index))
    print(f"entry #{idx}: table=0x{table_off:X} data=0x{data_off:X} old_len={old_len} new_len={len(new)}")
    print("  old:", ref[data_off:data_off + old_len].decode("latin1"))
    if len(new) > old_len:
        raise SystemExit("new string is longer than the original; not supported by this script")
    # update length entry (also XOR-encrypted)
    for i in range(4):
        enc[table_off + i] = ((len(new) >> (8 * i)) & 0xFF) ^ key[(table_off + i) % 8]
    # write new string + zero-fill the leftover space
    put_encrypted(data_off, new + b"\x00" * (old_len - len(new)))
    # verify by decrypting
    got = bytes(enc[data_off + i] ^ key[(data_off + i) % 8] for i in range(len(new)))
    assert got == new, (got, new)
    got_len = int.from_bytes(bytes(enc[table_off + i] ^ key[(table_off + i) % 8] for i in range(4)), "little")
    assert got_len == len(new), got_len
    print("  new:", got.decode("latin1"), "(verified)")

patch(PRIMARY, NEW_PRIMARY)
if NEW_BACKUP is not None:
    patch(BACKUP, NEW_BACKUP)

OUT.write_bytes(enc)
print("wrote", OUT, "size", hex(len(enc)))
