<div align="center">

# Free Fire Localhost Backup

**Workspace privat untuk dekompilasi Free Fire 1.98.1, patch `verAddr`, dan server versi lokal.**

[![Access](https://img.shields.io/badge/access-private-6f42c1?style=for-the-badge)](https://github.com/tes12886-sudo/freefire-localhost-backup)
[![Version](https://img.shields.io/badge/Free%20Fire-1.98.1-orange?style=for-the-badge)](https://github.com/tes12886-sudo/freefire-localhost-backup)
[![Engine](https://img.shields.io/badge/engine-Unity%20IL2CPP-111827?style=for-the-badge)](https://github.com/tes12886-sudo/freefire-localhost-backup)
[![Git LFS](https://img.shields.io/badge/storage-Git%20LFS-0b7285?style=for-the-badge)](https://git-lfs.com/)

</div>

---

## Daftar Isi

- [Ringkasan](#ringkasan)
- [Persyaratan](#persyaratan)
- [Quick Start](#quick-start)
- [Konfigurasi Path](#konfigurasi-path)
- [Struktur Repositori](#struktur-repositori)
- [Alur Build](#alur-build)
- [Troubleshooting](#troubleshooting)
- [Referensi](#referensi)

---

## Ringkasan

Arsip ini berisi hasil bongkar `com.dts.freefireth` 1.98.1, metadata IL2CPP hasil dekripsi, dump C#/DummyDll, dekompilasi native, APK/XAPK hasil patch ke localhost, server versi lokal, log, pcap, screenshot, dan tooling pendukung.

Alur utamanya:

> patch URL versi di metadata IL2CPP → rebuild APK → sign → package XAPK → arahkan client ke server lokal.

| Item | Nilai |
|---|---|
| Package asli | `com.dts.freefireth` |
| Package rename | `com.dtd.freefireth` |
| versionName / versionCode | `1.98.1` / `2019116185` |
| SDK | `minSdk 16`, `targetSdk 31` |
| Unity | `2018.4.11f1`, IL2CPP |
| Metadata IL2CPP | `24.1` |
| Snapshot | `2026-11-23` |
| Workspace asli | `C:\Users\runneradmin\Downloads\ok\decompiled` |

---

## Persyaratan

| Kebutuhan | Catatan |
|---|---|
| Windows | Script dibuat dan diuji di Windows |
| Python 3 | Server dan script patch |
| Git LFS | Wajib untuk `.xapk`, `.so`, dan `script.json` |
| JDK 21 | Tersedia di `tools/jdk21/jdk-21.0.13.1+2` |
| apksigner | Tersedia di `tools/android-15/lib/apksigner.jar` |
| Port 8080 | Buka di firewall jika client berada di emulator/device lain |

Clone dengan LFS:

```powershell
git lfs install
git clone https://github.com/tes12886-sudo/freefire-localhost-backup.git
Set-Location freefire-localhost-backup
git lfs pull
```

---

## Quick Start

### 1. Jalankan server

Dari root repositori:

```powershell
python tools\localhost_server.py --host 127.0.0.1 --port 8080
```

Untuk emulator yang mengakses Windows host:

```powershell
python tools\localhost_server.py --host 0.0.0.0 --port 8080
```

Endpoint:

```text
http://127.0.0.1:8080/live/
http://127.0.0.1:8080/health
```

Response diambil dari `tools/version_response.json`. File dibaca ulang setiap request, jadi tidak perlu restart setelah mengubah JSON.

### 2. Patch URL versi dan build

Jika workspace masih di path asli:

```powershell
python tools\make_localhost_xapk.py --url "http://localhost:8080/live/"
```

Untuk emulator dengan server di Windows host:

```powershell
python tools\make_localhost_xapk.py --url "http://10.0.2.2:8080/live/" --backup-url "http://10.0.2.2:8080/live/"
```

Output utama:

```text
patched_localhost\com.dts.freefireth.apk
patched_localhost\com.dts.freefireth.localhost.xapk
patched_localhost\localhost.jks
```

URL pengganti tidak boleh lebih panjang dari literal aslinya.

### 3. Install dan cek request

Install `patched_localhost\com.dts.freefireth.localhost.xapk` dengan XAPK installer, lalu cek log:

```powershell
Get-Content tools\localhost_server.log -Tail 40
curl.exe http://127.0.0.1:8080/health
```

Jika request ke `/live/` muncul, client sudah mengarah ke server lokal.

> Di dalam emulator, `localhost` berarti emulator itu sendiri. Jika server jalan di Windows host, pakai IP host seperti `10.0.2.2` atau IP LAN host.

### 4. Varian package rename

```powershell
python tools\rename_package.py
```

Output:

```text
patched_localhost_dtd\com.dtd.freefireth.apk
patched_localhost_dtd\com.dtd.freefireth.localhost.xapk
```

---

## Konfigurasi Path

Beberapa script masih memakai path absolut workspace asli. Jika repo dipindah, sesuaikan konstanta ini.

| File | Konstanta |
|---|---|
| `tools/make_localhost_xapk.py` | `BASE`, `ORIG_DIR`, `OUT_DIR`, `JDK`, `KEYTOOL`, `JAVA`, `APKSIGNER` |
| `tools/rename_package.py` | `SRC_DIR`, `OUT_DIR`, `JDK`, `APKSIGNER`, `PLAIN_META` |
| `tools/repack_veraddr_apk.py` | `BASE` |
| `il2cpp/scripts/*.py` | path input/output dan helper `elf_regs.py` |

`tools/localhost_server.py` relatif terhadap folder `tools/`, jadi bisa langsung dijalankan dari root repo.

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
├── original/                   # APK, OBB, manifest.json, icon.png
├── patched_localhost/          # hasil patch localhost
├── patched_localhost_dtd/      # hasil patch + rename package
├── tools/
│   ├── assets/                 # file untuk endpoint /assets/
│   ├── Il2CppDumper_patched/   # dumper dengan guard metadata usage
│   ├── localhost_server.py     # server versi lokal
│   ├── make_localhost_xapk.py  # patch metadata + build XAPK
│   ├── rename_package.py       # rename package
│   └── version_response.json   # response server versi
├── AES_DETAILS.txt
├── MATCH_ENC.txt
├── NETWORK_MATCH.txt
├── RINGKASAN.txt
└── README.md
```

---

## Alur Build

```mermaid
flowchart LR
    A[metadata asli] --> B[XOR + rebuild header]
    B --> C[metadata reconstructed]
    C --> D[Patch literal verAddr]
    D --> E[Rebuild APK]
    E --> F[Align + sign v1/v2]
    F --> G[Package XAPK]
    G --> H[Install]
    H --> I[Request /live/]
    I --> J[localhost_server.py]
```

---

## Troubleshooting

| Masalah | Solusi |
|---|---|
| File besar berisi pointer Git LFS | `git lfs pull` |
| `JDK tools missing under ...` | Cek path JDK dan `apksigner` di script |
| `string literal not found` | Pastikan `il2cpp/global-metadata.reconstructed.dat` tersedia |
| `replacement longer than original` | Persingkat URL pengganti |
| Emulator tidak bisa hubungi server | Bind `0.0.0.0`, pakai IP host, buka firewall |
| Request tidak muncul di log | Rebuild XAPK setelah ganti URL |
| `app not installed` | Uninstall versi lama sebelum install hasil patch |

---

## Referensi

| File | Isi |
|---|---|
| `RINGKASAN.txt` | Detail dekompilasi dan daftar endpoint |
| `AES_DETAILS.txt` | Detail AES HTTP login |
| `MATCH_ENC.txt` | Enkripsi match TEA/XXTEA dan AES native |
| `NETWORK_MATCH.txt` | Analisis MUDP/RUDP dan fallback jaringan |
| `tools/LOCALHOST_README.txt` | Catatan asli patch localhost |
| `il2cpp/dumper_out_final/dump.cs` | Dump IL2CPP utama |
