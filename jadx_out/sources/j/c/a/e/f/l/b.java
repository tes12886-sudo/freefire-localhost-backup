package j.c.a.e.f.l;

import com.appff.haptic.base.Utils;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private int a;
    private byte[] b;
    private boolean c = false;
    private int d = 60000;

    public b(int i2, byte[] bArr) {
        this.a = i2;
        this.b = bArr;
    }

    private static void a(byte[] bArr, int i2) {
        bArr[0] = (byte) (i2 & Utils.MAX_STRENGTH_VALUE);
        bArr[1] = (byte) ((65280 & i2) >> 8);
        bArr[2] = (byte) ((16711680 & i2) >> 16);
        bArr[3] = (byte) ((i2 & (-16777216)) >> 24);
    }

    public int b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public boolean e() {
        return this.c;
    }

    public void f(boolean z) {
        this.c = z;
    }

    public void g(int i2) {
        this.d = i2;
    }

    public byte[] h() {
        int length = this.b.length + 5;
        byte[] bArr = new byte[length];
        bArr[4] = (byte) this.a;
        a(bArr, length - 4);
        byte[] bArr2 = this.b;
        System.arraycopy(bArr2, 0, bArr, 5, bArr2.length);
        return bArr;
    }
}
