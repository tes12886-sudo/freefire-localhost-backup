package com.google.firebase.crashlytics.internal.d;

import com.appff.haptic.base.Utils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
class c implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f1384g = Logger.getLogger(c.class.getName());
    private final RandomAccessFile a;
    int b;
    private int c;
    private b d;
    private b e;
    private final byte[] f = new byte[16];

    class a implements d {
        boolean a = true;
        final /* synthetic */ StringBuilder b;

        a(c cVar, StringBuilder sb) {
            this.b = sb;
        }

        @Override // com.google.firebase.crashlytics.internal.d.c.d
        public void a(InputStream inputStream, int i2) {
            if (this.a) {
                this.a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i2);
        }
    }

    static class b {
        static final b c = new b(0, 0);
        final int a;
        final int b;

        b(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position = " + this.a + ", length = " + this.b + "]";
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.d.c$c, reason: collision with other inner class name */
    private final class C0133c extends InputStream {
        private int a;
        private int b;

        private C0133c(b bVar) {
            this.a = c.this.k0(bVar.a + 4);
            this.b = bVar.b;
        }

        /* synthetic */ C0133c(c cVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.b == 0) {
                return -1;
            }
            c.this.a.seek(this.a);
            int i2 = c.this.a.read();
            this.a = c.this.k0(this.a + 1);
            this.b--;
            return i2;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            c.c(bArr, "buffer");
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = this.b;
            if (i4 <= 0) {
                return -1;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            c.this.g0(this.a, bArr, i2, i3);
            this.a = c.this.k0(this.a + i3);
            this.b -= i3;
            return i3;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i2);
    }

    public c(File file) throws IOException {
        if (!file.exists()) {
            T(file);
        }
        this.a = a0(file);
        c0();
    }

    private void O(int i2) throws IOException {
        int i3 = i2 + 4;
        int iE0 = e0();
        if (iE0 >= i3) {
            return;
        }
        int i4 = this.b;
        do {
            iE0 += i4;
            i4 <<= 1;
        } while (iE0 < i3);
        i0(i4);
        b bVar = this.e;
        int iK0 = k0(bVar.a + 4 + bVar.b);
        if (iK0 < this.d.a) {
            FileChannel channel = this.a.getChannel();
            channel.position(this.b);
            long j2 = iK0 - 4;
            if (channel.transferTo(16L, j2, channel) != j2) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i5 = this.e.a;
        int i6 = this.d.a;
        if (i5 < i6) {
            int i7 = (this.b + i5) - 16;
            l0(i4, this.c, i6, i7);
            this.e = new b(i7, this.e.b);
        } else {
            l0(i4, this.c, i6, i5);
        }
        this.b = i4;
    }

    private static void T(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileA0 = a0(file2);
        try {
            randomAccessFileA0.setLength(4096L);
            randomAccessFileA0.seek(0L);
            byte[] bArr = new byte[16];
            n0(bArr, Utils.CONTINUOUS_EVENT, 0, 0, 0);
            randomAccessFileA0.write(bArr);
            randomAccessFileA0.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileA0.close();
            throw th;
        }
    }

    private static <T> T Z(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile a0(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b b0(int i2) throws IOException {
        if (i2 == 0) {
            return b.c;
        }
        this.a.seek(i2);
        return new b(i2, this.a.readInt());
    }

    static /* synthetic */ Object c(Object obj, String str) {
        Z(obj, str);
        return obj;
    }

    private void c0() throws IOException {
        this.a.seek(0L);
        this.a.readFully(this.f);
        int iD0 = d0(this.f, 0);
        this.b = iD0;
        if (iD0 <= this.a.length()) {
            this.c = d0(this.f, 4);
            int iD1 = d0(this.f, 8);
            int iD2 = d0(this.f, 12);
            this.d = b0(iD1);
            this.e = b0(iD2);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + this.a.length());
    }

    private static int d0(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    private int e0() {
        return this.b - j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i2, byte[] bArr, int i3, int i4) throws IOException {
        RandomAccessFile randomAccessFile;
        int iK0 = k0(i2);
        int i5 = iK0 + i4;
        int i6 = this.b;
        if (i5 <= i6) {
            this.a.seek(iK0);
            randomAccessFile = this.a;
        } else {
            int i7 = i6 - iK0;
            this.a.seek(iK0);
            this.a.readFully(bArr, i3, i7);
            this.a.seek(16L);
            randomAccessFile = this.a;
            i3 += i7;
            i4 -= i7;
        }
        randomAccessFile.readFully(bArr, i3, i4);
    }

    private void h0(int i2, byte[] bArr, int i3, int i4) throws IOException {
        RandomAccessFile randomAccessFile;
        int iK0 = k0(i2);
        int i5 = iK0 + i4;
        int i6 = this.b;
        if (i5 <= i6) {
            this.a.seek(iK0);
            randomAccessFile = this.a;
        } else {
            int i7 = i6 - iK0;
            this.a.seek(iK0);
            this.a.write(bArr, i3, i7);
            this.a.seek(16L);
            randomAccessFile = this.a;
            i3 += i7;
            i4 -= i7;
        }
        randomAccessFile.write(bArr, i3, i4);
    }

    private void i0(int i2) throws IOException {
        this.a.setLength(i2);
        this.a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k0(int i2) {
        int i3 = this.b;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    private void l0(int i2, int i3, int i4, int i5) throws IOException {
        n0(this.f, i2, i3, i4, i5);
        this.a.seek(0L);
        this.a.write(this.f);
    }

    private static void m0(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    private static void n0(byte[] bArr, int... iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            m0(bArr, i2, i3);
            i2 += 4;
        }
    }

    public synchronized void F() {
        l0(Utils.CONTINUOUS_EVENT, 0, 0, 0);
        this.c = 0;
        b bVar = b.c;
        this.d = bVar;
        this.e = bVar;
        if (this.b > 4096) {
            i0(Utils.CONTINUOUS_EVENT);
        }
        this.b = Utils.CONTINUOUS_EVENT;
    }

    public synchronized void Q(d dVar) {
        int iK0 = this.d.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            b bVarB0 = b0(iK0);
            dVar.a(new C0133c(this, bVarB0, null), bVarB0.b);
            iK0 = k0(bVarB0.a + 4 + bVarB0.b);
        }
    }

    public synchronized boolean Y() {
        return this.c == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.a.close();
    }

    public synchronized void f0() {
        if (Y()) {
            throw new NoSuchElementException();
        }
        if (this.c == 1) {
            F();
        } else {
            b bVar = this.d;
            int iK0 = k0(bVar.a + 4 + bVar.b);
            g0(iK0, this.f, 0, 4);
            int iD0 = d0(this.f, 0);
            l0(this.b, this.c - 1, iK0, this.e.a);
            this.c--;
            this.d = new b(iK0, iD0);
        }
    }

    public int j0() {
        if (this.c == 0) {
            return 16;
        }
        b bVar = this.e;
        int i2 = bVar.a;
        int i3 = this.d.a;
        return i2 >= i3 ? (i2 - i3) + 4 + bVar.b + 16 : (((i2 + 4) + bVar.b) + this.b) - i3;
    }

    public void l(byte[] bArr) {
        u(bArr, 0, bArr.length);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            Q(new a(this, sb));
        } catch (IOException e) {
            f1384g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public synchronized void u(byte[] bArr, int i2, int i3) {
        int iK0;
        Z(bArr, "buffer");
        if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        O(i3);
        boolean zY = Y();
        if (zY) {
            iK0 = 16;
        } else {
            b bVar = this.e;
            iK0 = k0(bVar.a + 4 + bVar.b);
        }
        b bVar2 = new b(iK0, i3);
        m0(this.f, 0, i3);
        h0(bVar2.a, this.f, 0, 4);
        h0(bVar2.a + 4, bArr, i2, i3);
        l0(this.b, this.c + 1, zY ? bVar2.a : this.d.a, bVar2.a);
        this.e = bVar2;
        this.c++;
        if (zY) {
            this.d = bVar2;
        }
    }
}
