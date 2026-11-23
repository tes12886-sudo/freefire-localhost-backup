package j.d.e.j.d;

import com.appff.haptic.base.Utils;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f2116g = new a(4201, Utils.CONTINUOUS_EVENT, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f2117h = new a(1033, 1024, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f2118i = new a(67, 64, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f2119j = new a(19, 16, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f2120k = new a(285, 256, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f2121l = new a(301, 256, 1);
    private final int[] a;
    private final int[] b;
    private final b c;
    private final int d;
    private final int e;
    private final int f;

    public a(int i2, int i3, int i4) {
        this.e = i2;
        this.d = i3;
        this.f = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new b(this, new int[]{0});
        new b(this, new int[]{1});
    }

    static int a(int i2, int i3) {
        return i2 ^ i3;
    }

    b b(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 == 0) {
            return this.c;
        }
        int[] iArr = new int[i2 + 1];
        iArr[0] = i3;
        return new b(this, iArr);
    }

    int c(int i2) {
        return this.a[i2];
    }

    public int d() {
        return this.f;
    }

    b e() {
        return this.c;
    }

    int f(int i2) {
        if (i2 != 0) {
            return this.a[(this.d - this.b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    int g(int i2) {
        if (i2 != 0) {
            return this.b[i2];
        }
        throw new IllegalArgumentException();
    }

    int h(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.d - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.e) + ',' + this.d + ')';
    }
}
