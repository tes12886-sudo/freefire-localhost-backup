import pathlib

base = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok\decompiled\il2cpp")
dec = (base / "global-metadata.decrypted.dat").read_bytes()
enc = (base / "il2cpp" / "input" / "global-metadata.dat")
enc = pathlib.Path(r"C:\Users\runneradmin\Downloads\ok\decompiled\il2cpp\input\global-metadata.dat").read_bytes()
print("dec size", hex(len(dec)), "magic", dec[:4].hex(" "))
print("enc size", hex(len(enc)), "magic", enc[:4].hex(" "))
off = 0x507F6
print("dec @-8..+80:", dec[off-8:off+80].hex(" "))
print("dec ascii   :", dec[off-8:off+80].decode("latin1", "replace"))
print("len prefix (u32):", int.from_bytes(dec[off-4:off], "little"))
print("enc @0x507F6:", enc[off:off+48].hex(" "))
print("xor dec/enc same range:", bytes(a ^ b for a, b in zip(dec[off:off+48], enc[off:off+48])).hex(" "))
print("first 32 xor:", bytes(a ^ b for a, b in zip(dec[4:36], enc[4:36])).hex(" "))
