package j.d.a.c.f.g;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
final class c0 extends OutputStream {
    private long a = 0;

    c0() {
    }

    final long b() {
        return this.a;
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        this.a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        int length;
        int i4;
        if (i2 < 0 || i2 > (length = bArr.length) || i3 < 0 || (i4 = i2 + i3) > length || i4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.a += (long) i3;
    }
}
