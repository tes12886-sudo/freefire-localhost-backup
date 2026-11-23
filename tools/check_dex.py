import hashlib, pathlib, struct, zipfile, zlib

for apk in [
    r"C:\Users\runneradmin\Downloads\ok\penting\original\com.dts.freefireth.apk",
    r"C:\Users\runneradmin\Downloads\ok\decompiled\patched_localhost_dtd\com.dtd.freefireth.unsigned.apk",
]:
    z = zipfile.ZipFile(apk)
    names = [n for n in z.namelist() if n == "classes.dex" or (n.startswith("classes") and n.endswith(".dex"))]
    print("APK", apk, "dexes", names)
    for n in names:
        d = z.read(n)
        stored_sum = struct.unpack_from("<I", d, 8)[0]
        stored_sig = d[12:32]
        print(" ", n, "len", len(d), "header size", struct.unpack_from("<I", d, 0x24)[0])
        print("    stored checksum", hex(stored_sum), "sig", stored_sig.hex()[:24])
        for start, label in [(12, "from12"), (32, "from32")]:
            print("    adler", label, hex(zlib.adler32(d[start:]) & 0xFFFFFFFF))
        cand = bytearray(d)
        cand[8:12] = b"\0" * 4
        cand[12:32] = b"\0" * 20
        print("    adler zeroed12", hex(zlib.adler32(bytes(cand)[12:]) & 0xFFFFFFFF))
        print("    sha1 from32", hashlib.sha1(d[32:]).hexdigest()[:24])
