<div align="center">

# Free Fire Localhost Backup

**Arsip riset privat untuk dekompilasi, patch `verAddr`, dan server versi lokal Free Fire 1.98.1**

[![Access](https://img.shields.io/badge/access-private-6f42c1?style=for-the-badge)](https://github.com/tes12886-sudo/freefire-localhost-backup)
[![Game](https://img.shields.io/badge/Free%20Fire-1.98.1-orange?style=for-the-badge)](https://github.com/tes12886-sudo/freefire-localhost-backup)
[![Engine](https://img.shields.io/badge/engine-Unity%20IL2CPP-111827?style=for-the-badge)](https://github.com/tes12886-sudo/freefire-localhost-backup)
[![Platform](https://img.shields.io/badge/platform-Android-3DDC84?style=for-the-badge)](https://github.com/tes12886-sudo/freefire-localhost-backup)
[![Git LFS](https://img.shields.io/badge/storage-Git%20LFS-0b7285?style=for-the-badge)](https://git-lfs.com/)
[![Snapshot](https://img.shields.io/badge/snapshot-2026--11--23-2f81f7?style=for-the-badge)](https://github.com/tes12886-sudo/freefire-localhost-backup)

</div>

---

## Daftar Isi

- [Ringkasan](#ringkasan)
- [Isi Penting](#isi-penting)
- [Persyaratan](#persyaratan)
- [Quick Start](#quick-start)
- [Konfigurasi Path](#konfigurasi-path)
- [Server Versi Lokal](#server-versi-lokal)
- [Patch dan Build APK/XAPK](#patch-dan-build-apkxapk)
- [Install dan Verifikasi](#install-dan-verifikasi)
- [Struktur Repositori](#struktur-repositori)
- [Arsitektur Alur](#arsitektur-alur)
- [Status Ekstraksi](#status-ekstraksi)
- [Catatan Teknis](#catatan-teknis)
- [Troubleshooting](#troubleshooting)
- [Referensi File](#referensi-file)

---

## Ringkasan

Repositori ini menyimpan workspace lengkap hasil bongkar Free Fire **1.98.1** (`com.dts.freefireth`), termasuk:

- resources dan smali dari `apktool`
- source Java dari `jadx`
- metadata IL2CPP hasil dekripsi dan rekonstruksi
- dump C#, header,DummyDll, dan script IL2CPP
- dekompilasi native dari Ghidra
- APK/XAPK hasil patch `verAddr` ke server lokal
- server versi lokal, response JSON, log, pcap, screenshot, dan tooling pendukung

Tujuan utama arsip ini adalah mereproduksi alur:

> patch URL versi di metadata IL2CPP → rebuild APK → tanda tangani → paket XAPK → arahkan client ke server lokal.

| Item | Nilai |
|---|---|
| Package asli | `com.dts.freefireth` |
| Package hasil rename | `com.dtd.freefireth` |
| versionName | `1.98.1` |
| versionCode | `2019116185` |
| minSdk / targetSdk | `16` / `31` |
| Unity | `2018.4.11f1` |
| Metadata IL2CPP | `24.1` |
| Branch utama | `main` |
| Snapshot dibuat | `2026-11-23 10:51:04` |
| Workspace asli | `C:\Users\runneradmin\Downloads\ok\decompiled` |

---

## Isi Penting

| Path | Fungsi |
|---|---|
| `original/` | XAPK sumber, APK, `manifest.json`, `icon.png`, OBB |
| `apktool/` | Hasil decode resources, smali, dan AndroidManifest |
| `jadx_out/` | Hasil dekompilasi Java dari `classes.dex` |
| `il2cpp/` | Metadata, binary, dump IL2CPP, dan script reproduksi |
| `native/` | Dekompilasi native dari Ghidra dalam bentuk C |
| `ghidra_project/` | Project Ghidra yang bisa dibuka lewat GUI |
| `patched_localhost/` | APK/XAPK hasil patch ke localhost |
| `patched_localhost_dtd/` | Hasil patch dengan package `com.dtd.freefireth` |
| `tools/` | Server lokal, script build, keystore tooling, log, pcap, screenshot |
| `RINGKASAN.txt` | Ringkasan lengkap hasil bongkar dan temuan endpoint |
| `AES_DETAILS.txt` | Detail enkripsi HTTP login |
| `MATCH_ENC.txt` | Detail enkripsi traffic match |
| `NETWORK_MATCH.txt` | Detail jaringan match MUDP/RUDP |

---

## Persyaratan

| Kebutuhan | Catatan |
|---|---|
| Windows | Script dibuat dan diuji di lingkungan Windows |
| Python 3 | Dipakai untuk server dan script patch |
| Git LFS | Wajib untuk file besar seperti `.xapk`, `.so`, dan `script.json` |
| JDK 21 | Sudah ada di `tools/jdk21/jdk-21.0.13.1+2` |
| apksigner | Sudah ada di `tools/android-15/lib/apksigner.jar` |
| Port `8080` | Harus terbuka jika client berada di emulator/device lain |

Clone dengan LFS:

```powershell
git lfs install
git clone https://github.com/tes12886-sudo/freefire-localhost-backup.git
Set-Location freefire-localhost-backup
git lfs pull
```

Jika clone sudah ada tapi file besar masih berupa pointer teks:

```powershell
git lfs pull
```

---

## Quick Start

### 1. Jalankan server versi lokal

Dari root repositori:

```powershell
python tools\localhost_server.py --host 127.0.0.1 --port 8080
```

Untuk emulator Android yang mengakses server dari Windows host:

```powershell
python tools\localhost_server.py --host 0.0.0.0 --port 8080
```

Endpoint:

```text
http://127.0.0.1:8080/live/
http://127.0.0.1:8080/health
```

### 2. Patch URL versi dan build ulang

Jika workspace masih berada di path asli `C:\Users\runneradmin\Downloads\ok\decompiled`:

```powershell
python tools\make_localhost_xapk.py --url "http://localhost:8080/live/"
```

Untuk emulator dengan server di Windows host:

```powershell
python tools\make_localhost_xapk.py --url "http://10.0.2.2:8080/live/" --backup-url "http://10.0.2.2:8080/live/"
```

Output:

```text
patched_localhost\com.dts.freefireth.unsigned.apk
patched_localhost\com.dts.freefireth.aligned.apk
patched_localhost\com.dts.freefireth.apk
patched_localhost\com.dts.freefireth.localhost.xapk
patched_localhost\localhost.jks
```

### 3. Install hasil patch

Install salah satu:

```text
patched_localhost\com.dts.freefireth.localhost.xapk
patched_localhost\com.dts.freefireth.apk
```

Gunakan XAPK installer untuk paket `.xapk`, atau install APK langsung jika OBB sudah tersedia di path yang sesuai.

### 4. Cek request

```powershell
Get-Content tools\localhost_server.log -Tail 40
```

Server mencatat method, path, ukuran body, dan potongan body request setiap kali client menghubungi endpoint.

---

## Konfigurasi Path

Beberapa script masih memakai path absolut dari workspace asli:

```text
C:\Users\runneradmin\Downloads\ok\decompiled
```

Jika repositori dipindah atau di-clone ke folder lain, sesuaikan konstanta berikut.

| File | Konstanta yang perlu dicek |
|---|---|
| `tools/make_localhost_xapk.py` | `BASE`, `ORIG_DIR`, `OUT_DIR`, `JDK`, `KEYTOOL`, `JAVA`, `APKSIGNER` |
| `tools/rename_package.py` | `SRC_DIR`, `OUT_DIR`, `JDK`, `APKSIGNER`, `PLAIN_META` |
| `tools/repack_veraddr_apk.py` | `BASE` |
| `il2cpp/scripts/meta_build_header.py` | `src`, `out` |
| `il2cpp/scripts/meta_fix_usage.py` | `p` |
| `il2cpp/scripts/probe_fieldrefs.py` | `p` |
| `il2cpp/scripts/patch_il2cpp3.py` | `src`, `dst`, dan helper `elf_regs.py` |

`tools/localhost_server.py` relatif terhadap folder `tools/`, sehingga bisa langsung dijalankan dari root repositori selama struktur folder tidak diubah.

---

## Server Versi Lokal

Server membaca response dari:

```text
tools\version_response.json
```

File dibaca ulang setiap request, sehingga perubahan JSON langsung dipakai tanpa restart server.

Endpoint utama:

| Path | Perilaku |
|---|---|
| `/live/` | Mengembalikan isi `version_response.json` |
| `/health` | Mengembalikan status server |
| `/assets/...` | Mengambil file dari `tools/assets/` |
| Method lain | GET, POST, PUT, dan OPTIONS tetap mengembalikan response versi |

Contoh pengecekan:

```powershell
curl.exe http://127.0.0.1:8080/health
curl.exe http://127.0.0.1:8080/live/
```

Log:

```text
tools\localhost_server.log
tools\server_stdout.log
tools\server_stderr.log
```

Response cadangan:

```text
tools\version_response.json.local_assets
tools\version_response.json.user_backup
```

---

## Patch dan Build APK/XAPK

### Apa yang dilakukan script

`tools/make_localhost_xapk.py`:

1. Mencari string literal lama di metadata IL2CPP yang sudah direkonstruksi:
   - `https://version.common.redflamenco.com/live/`
   - `https://bdversion.ggbluefox.com/live/`
2. Turunkan kunci XOR 8 byte dari pasangan ciphertext/plaintext.
3. Patch kedua literal `verAddr` dengan URL baru.
4. Tulis metadata hasil patch ke `il2cpp/global-metadata.localhost.dat`.
5. Rebuild APK tanpa signature lama.
6. Align `resources.arsc`.
7. Tanda tangani APK dengan keystore lokal `localhost.jks`, password `changeit`.
8. Buat XAPK menggunakan `manifest.json`, APK, icon, dan OBB dari `original/`.

### Opsi URL

```powershell
python tools\make_localhost_xapk.py --url "http://localhost:8080/live/"
```

```powershell
python tools\make_localhost_xapk.py --url "http://10.0.2.2:8080/live/" --backup-url "http://10.0.2.2:8080/live/"
```

Batasan penting: URL pengganti tidak boleh lebih panjang dari string literal aslinya. Script akan berhenti dengan pesan `replacement longer than original` jika terlalu panjang.

### Rename package

Untuk menghasilkan varian `com.dtd.freefireth`:

```powershell
python tools\rename_package.py
```

Output:

```text
patched_localhost_dtd\com.dtd.freefireth.apk
patched_localhost_dtd\com.dtd.freefireth.localhost.xapk
```

Script ini mengganti package di AndroidManifest, resources.arsc, classes.dex, google-services.json, native libs, dan path OBB di dalam XAPK.

---

## Install dan Verifikasi

### Emulator Android

1. Jalankan server dengan bind `0.0.0.0`.
2. Patch APK/XAPK dengan URL host yang benar, misalnya `http://10.0.2.2:8080/live/`.
3. Izinkan port `8080` di firewall Windows.
4. Install XAPK/APK hasil patch.
5. Buka aplikasi dan tunggu request versi masuk ke server.

Catatan: di dalam emulator, `localhost` mengarah ke emulator itu sendiri. Jika server berjalan di Windows host, gunakan IP host emulator, umumnya `10.0.2.2`.

### Device fisik

Gunakan IP LAN Windows host:

```powershell
python tools\make_localhost_xapk.py --url "http://192.168.1.10:8080/live/" --backup-url "http://192.168.1.10:8080/live/"
python tools\localhost_server.py --host 0.0.0.0 --port 8080
```

Ganti `192.168.1.10` dengan IP host yang sebenarnya.

### Verifikasi cepat

```powershell
curl.exe http://127.0.0.1:8080/health
Get-Content tools\localhost_server.log -Tail 40
```

Jika muncul request ke `/live/`, berarti client sudah mengarah ke server lokal.

---

## Struktur Repositori

```text
freefire-localhost-backup/
├── apktool/                    # resource, smali, AndroidManifest
├── ghidra_project/             # project Ghidra
├── il2cpp/
│   ├── input/                  # libil2cpp.so + global-metadata.dat asli
│   ├── dumper_out_final/       # dump.cs, il2Cpp.h, DummyDll, script.json
│   └── scripts/                # rebuild metadata + patch IL2CPP
├── jadx_out/                   # source Java hasil dekompilasi
├── native/                     # dekompilasi native dari Ghidra
├── original/                   # XAPK sumber + OBB + manifest + icon
├── patched_localhost/          # hasil patch localhost
├── patched_localhost_dtd/      # hasil patch localhost + rename package
├── scripts/                    # export helper
├── tools/
│   ├── assets/                 # asset lokal untuk endpoint /assets/
│   ├── Il2CppDumper_patched/   # dumper dengan guard metadata usage
│   ├── jdk21/                  # JDK untuk build/sign
│   ├── ghidra/                 # tooling Ghidra
│   ├── jadx/                   # tooling jadx
│   ├── localhost_server.py     # server versi lokal
│   ├── make_localhost_xapk.py  # patch metadata + build XAPK
│   ├── rename_package.py       # rename package ke com.dtd.freefireth
│   └── version_response.json   # response server versi
├── AES_DETAILS.txt
├── MATCH_ENC.txt
├── NETWORK_MATCH.txt
├── RINGKASAN.txt
└── README.md
```

---

## Arsitektur Alur

```mermaid
flowchart LR
    A[global-metadata.dat asli] --> B[XOR period-8 + rebuild header]
    B --> C[global-metadata.reconstructed.dat]
    C --> D[Patch literal verAddr]
    D --> E[global-metadata.localhost.dat]
    E --> F[Rebuild APK]
    F --> G[Align resources.arsc]
    G --> H[Sign v1 + v2]
    H --> I[Package XAPK]
    I --> J[Install di emulator/device]
    J --> K[Request /live/]
    K --> L[localhost_server.py]
    L --> M[version_response.json]
```

---

## Status Ekstraksi

| Komponen | Status | Catatan |
|---|---|---|
| AndroidManifest + resources | Selesai | Decode via apktool |
| `classes.dex` | Selesai | 4032 file Java via jadx, 11 error kecil pada class obfuscated |
| `libanort.so` | Selesai | 1964 fungsi C |
| Native library lain | Selesai | Ghidra headless, termasuk `libunity.so` |
| `libil2cpp.so` penuh | Tertunda | Analisis Ghidra penuh butuh RAM lebih dari 8 GB |
| Metadata IL2CPP | Selesai | Metadata 24.1, dump C# + DummyDll berhasil |
| Server lokal | Selesai | Response JSON, asset, logging |
| Patch localhost | Selesai | APK dan XAPK tersedia |
| Rename package | Selesai | Varian `com.dtd.freefireth` tersedia |

---

## Catatan Teknis

<details>
<summary><b>IL2CPP metadata bypass</b></summary>

- Body `global-metadata.dat` dienkripsi XOR period-8 dengan kunci `4060b0d813f6fb7e`, lalu XOR `0xFF` pada setiap byte ke-4.
- Header 68 dword atau `0x110` byte direkonstruksi statis.
- Tabel yang dikoreksi:
  - `metadataUsageLists @ 0x1957048`, count `0xBFE98`
  - `metadataUsagePairs @ 0x1A16EE0`, count `0x3577A0`
  - `stringLiteralSize 0x31390`, 25202 entri
  - `fieldRefsSize 0xF98`, 499 entri
- Binary `libil2cpp.so` dipatch selektif pada genericMethodTable, methodSpecs, dan objek `Il2CppType`.
- Il2CppDumper stock crash di `AddMetadataUsageFieldInfo` karena fieldRef #366 memiliki `fieldDef = -1`.
- Build patched di `tools/Il2CppDumper_patched/` melewati entri tersebut sehingga generate struct dan DummyDll selesai.
- Warning `ERROR: This file may be protected.` bersifat non-blocking.

</details>

<details>
<summary><b>HTTP login encryption</b></summary>

- Jalur login/majorlogin memakai AES-128-CBC dengan PKCS7.
- Key dan IV statis dikonfigurasi di `GCommon.HttpManager.Init()`.
- Detail lengkap ada di `AES_DETAILS.txt`.
- Request body adalah Protobuf atau JSON, lalu opsional dienkripsi menjadi raw binary.
- Guard enkripsi: per-request flag `encrypt == true` dan `m_EnableEncrypt == true`.

</details>

<details>
<summary><b>Match network and encryption</b></summary>

- Match memakai UDP melalui custom reliable UDP Garena, MUDP/RUDP, dengan fallback UDP/TCP.
- Payload protobuf melewati TEA/XXTEA dan GZip tergantung flag.
- Mode normal: MUDP multi-session untuk Wifi dan Cellular.
- Saat VPN aktif atau optimasi mati: `UDPSession` biasa dengan fallback TCP.
- Channel native `libanogs.so` memakai TCP dan AES-128-CBC terpisah.
- Detail lengkap ada di `MATCH_ENC.txt` dan `NETWORK_MATCH.txt`.

</details>

<details>
<summary><b>Endpoint findings</b></summary>

- Daftar endpoint HTTPS hasil scan ada di `RINGKASAN.txt`, `endpoints.json`, `endpoints_all.json`, dan `endpoints_verified.json`.
- Temuan tambahan:
  - `com.ano.gshell.AnoApplication.dec(String)` memakai XOR `0x0A`.
  - File guard: `xx_tmp_guard.dat` dan `ShellFoo.dat`.
  - Cleartext HTTP diizinkan lewat `network_security_config.xml`.
  - `report_url = http://122.11.128.69:2205`.
  - Crash log ke `http://203.116.180.99/crash/logs/`.
- Path literal `/live` tidak ditemukan di source. Yang ditemukan adalah host `booyah.live/api/v3` dan UI "Live TV".

</details>

---

## Troubleshooting

| Masalah | Penyebab | Solusi |
|---|---|---|
| File `.xapk` atau `.so` berisi pointer Git LFS | LFS belum terpasang | Jalankan `git lfs install` lalu `git lfs pull` |
| `JDK tools missing under ...` | Path JDK/apksigner tidak cocok | Cek `JDK`, `KEYTOOL`, `JAVA`, dan `APKSIGNER` di script |
| `string literal not found in plaintext metadata` | File metadata rekonstruksi salah atau belum ada | Pastikan `il2cpp/global-metadata.reconstructed.dat` tersedia |
| `replacement longer than original` | URL baru lebih panjang dari literal lama | Persingkat URL atau pakai IP/host lebih pendek |
| Emulator tidak bisa menghubungi server | `localhost` mengarah ke emulator | Bind server ke `0.0.0.0` dan patch URL ke IP host |
| Request tidak muncul di log | Client masih memakai URL lama | Rebuild XAPK setelah mengubah URL |
| Server mengembalikan response default | `version_response.json` tidak terbaca | Cek file JSON dan log server |
| `app not installed` | Konflik tanda tangan atau package | Uninstall versi lama sebelum install hasil patch |
| `il2cpp/scripts/patch_il2cpp3.py` gagal | Helper `elf_regs.py` di path temp tidak ada | Simpan helper tersebut atau sesuaikan path `exec(open(...))` |

---

## Referensi File

| File | Isi |
|---|---|
| `RINGKASAN.txt` | Ringkasan lengkap dekompilasi dan endpoint |
| `AES_DETAILS.txt` | Detail AES HTTP login |
| `MATCH_ENC.txt` | TEA, AES native, dan jalur enkripsi match |
| `NETWORK_MATCH.txt` | Analisis MUDP/RUDP dan pemilihan mode jaringan |
| `tools/LOCALHOST_README.txt` | Catitan asli patch localhost dan rename package |
| `tools/version_response.json` | Response server versi aktif |
| `tools/localhost_server.log` | Riwayat request client |
| `endpoints_verified.json` | Endpoint terverifikasi |
| `cmd_method_map.json` | Pemetaan command dan method |
| `il2cpp/dumper_out_final/dump.cs` | Dump IL2CPP utama |
| `il2cpp/dumper_out_final/script.json` | Metadata dumper besar, tersimpan di Git LFS |

---

<div align="center">

**Arsip privat. Reproduksi alur build dimulai dari `tools/make_localhost_xapk.py` dan `tools/localhost_server.py`.**

</div>
