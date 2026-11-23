package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
final class y1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final j.d.a.d.a.b.f f1352h = new j.d.a.d.a.b.f("SliceMetadataManager");
    private final v b;
    private final String c;
    private final int d;
    private final long e;
    private final String f;
    private final byte[] a = new byte[8192];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1353g = -1;

    y1(v vVar, String str, int i2, long j2, String str2) {
        this.b = vVar;
        this.c = str;
        this.d = i2;
        this.e = j2;
        this.f = str2;
    }

    private final File n() {
        File fileC = this.b.C(this.c, this.d, this.e, this.f);
        if (!fileC.exists()) {
            fileC.mkdirs();
        }
        return fileC;
    }

    private final File o() throws IOException {
        File fileA = this.b.A(this.c, this.d, this.e, this.f);
        fileA.getParentFile().mkdirs();
        fileA.createNewFile();
        return fileA;
    }

    final void a(String str, long j2, long j3, int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j2));
        properties.put("remainingBytes", String.valueOf(j3));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f1353g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                j.d.a.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final void b(byte[] bArr, int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f1353g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File fileB = this.b.B(this.c, this.d, this.e, this.f);
            if (fileB.exists()) {
                fileB.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileB);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream2.close();
                } catch (Throwable th2) {
                    j.d.a.d.a.b.d0.a(th, th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileOutputStream.close();
            } catch (Throwable th4) {
                j.d.a.d.a.b.d0.a(th3, th4);
            }
            throw th3;
        }
    }

    final void c(int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(j().length()));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f1353g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                j.d.a.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final void d(int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f1353g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                j.d.a.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final x1 e() throws IOException {
        File fileA = this.b.A(this.c, this.d, this.e, this.f);
        if (!fileA.exists()) {
            throw new k0("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileA);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new k0("Slice checkpoint file corrupt.");
            }
            try {
                int i2 = Integer.parseInt(properties.getProperty("fileStatus"));
                String property = properties.getProperty("fileName");
                long j2 = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                long j3 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                int i3 = Integer.parseInt(properties.getProperty("previousChunk"));
                this.f1353g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                return new x1(i2, property, j2, j3, i3);
            } catch (NumberFormatException e) {
                throw new k0("Slice checkpoint file corrupt.", e);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                j.d.a.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final void f(InputStream inputStream, long j2) throws IOException {
        int i2;
        RandomAccessFile randomAccessFile = new RandomAccessFile(j(), "rw");
        try {
            randomAccessFile.seek(j2);
            do {
                i2 = inputStream.read(this.a);
                if (i2 > 0) {
                    randomAccessFile.write(this.a, 0, i2);
                }
            } while (i2 == 8192);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                j.d.a.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final void g(byte[] bArr) {
        this.f1353g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format("%s-LFH.dat", Integer.valueOf(this.f1353g))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    j.d.a.d.a.b.d0.a(th, th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new k0("Could not write metadata file.", e);
        }
    }

    final void h(byte[] bArr, InputStream inputStream) throws IOException {
        this.f1353g++;
        FileOutputStream fileOutputStream = new FileOutputStream(j());
        try {
            fileOutputStream.write(bArr);
            int i2 = inputStream.read(this.a);
            while (i2 > 0) {
                fileOutputStream.write(this.a, 0, i2);
                i2 = inputStream.read(this.a);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                j.d.a.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final void i(long j2, byte[] bArr, int i2, int i3) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(j(), "rw");
        try {
            randomAccessFile.seek(j2);
            randomAccessFile.write(bArr, i2, i3);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                j.d.a.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final File j() {
        return new File(n(), String.format("%s-NAM.dat", Integer.valueOf(this.f1353g)));
    }

    final int k() throws IOException {
        File fileA = this.b.A(this.c, this.d, this.e, this.f);
        if (!fileA.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(fileA);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new k0("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                j.d.a.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final boolean l() {
        File fileA = this.b.A(this.c, this.d, this.e, this.f);
        if (!fileA.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(fileA);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                f1352h.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    j.d.a.d.a.b.d0.a(th, th2);
                }
                throw th;
            }
        } catch (IOException e) {
            f1352h.b("Could not read checkpoint while checking if extraction finished. %s", e);
            return false;
        }
    }

    final void m(byte[] bArr, int i2) throws IOException {
        this.f1353g++;
        FileOutputStream fileOutputStream = new FileOutputStream(j());
        try {
            fileOutputStream.write(bArr, 0, i2);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                j.d.a.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }
}
