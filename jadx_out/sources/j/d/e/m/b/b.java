package j.d.e.m.b;

/* JADX INFO: loaded from: classes.dex */
final class b {
    private final byte[] a;
    private int b = 0;

    b(int i2) {
        this.a = new byte[i2];
    }

    private void c(int i2, boolean z) {
        this.a[i2] = z ? (byte) 1 : (byte) 0;
    }

    void a(boolean z, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.b;
            this.b = i4 + 1;
            c(i4, z);
        }
    }

    byte[] b(int i2) {
        int length = this.a.length * i2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            bArr[i3] = this.a[i3 / i2];
        }
        return bArr;
    }
}
