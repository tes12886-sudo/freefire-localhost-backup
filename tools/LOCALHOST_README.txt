PATCH VERADDR -> LOCALHOST
==========================

1) Patch metadata + rebuild APK/XAPK:

   python "C:\Users\runneradmin\Downloads\ok\decompiled\tools\make_localhost_xapk.py"

   Optional ganti alamat:
   python make_localhost_xapk.py --url "http://localhost:8080/live/"
   python make_localhost_xapk.py --url "http://10.0.2.2:8080/live/" --backup-url "http://10.0.2.2:8080/live/"

   Output:
   decompiled\patched_localhost\com.dts.freefireth.apk
   decompiled\patched_localhost\com.dts.freefireth.localhost.xapk

2) Jalankan server version:

   python "C:\Users\runneradmin\Downloads\ok\decompiled\tools\localhost_server.py" --port 8080

   Endpoint: http://localhost:8080/live/
   Response diatur lewat version_response.json
   Request tercatat di localhost_server.log

3) Install:

   - HP/emulator: install XAPK atau APK hasil patch.
   - Emulator Android: "localhost" di dalam emulator = emulator itu sendiri.
     Kalau server jalan di Windows host, pakai:
     python make_localhost_xapk.py --url "http://10.0.2.2:8080/live/"
     Lalu jalankan server dengan --host 0.0.0.0.

GANTI PACKAGE -> com.dtd.freefireth
===================================

   python "C:\Users\runneradmin\Downloads\ok\decompiled\tools\rename_package.py"

   Output:
   decompiled\patched_localhost_dtd\com.dtd.freefireth.apk
   decompiled\patched_localhost_dtd\com.dtd.freefireth.localhost.xapk

   Script mengganti com.dts.freefireth / com/dts/freefireth di AndroidManifest.xml,
   resources.arsc, classes.dex, google-services.json, dan native libs. Path OBB
   di dalam XAPK juga ikut berganti.

Catatan teknis:
- String literal yang diganti:
  #5828 https://version.common.redflamenco.com/live/
  #5818 https://bdversion.ggbluefox.com/live/
- Metadata dienkripsi XOR 8-byte berulang; kunci diturunkan dari pasangan
  plaintext/ciphertext, panjang literal dan sisa byte di-zero-fill.
- APK ditandatangani ulang dengan keystore lokal localhost.jks (pass changeit).
