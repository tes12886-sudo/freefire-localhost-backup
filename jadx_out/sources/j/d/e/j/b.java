package j.d.e.j;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Cloneable {
    private final int a;
    private final int b;
    private final int c;
    private final int[] d;

    public b(int i2) {
        this(i2, i2);
    }

    public b(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.a = i2;
        this.b = i3;
        int i4 = (i2 + 31) / 32;
        this.c = i4;
        this.d = new int[i4 * i3];
    }

    private b(int i2, int i3, int i4, int[] iArr) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = iArr;
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.b * (this.a + 1));
        for (int i2 = 0; i2 < this.b; i2++) {
            for (int i3 = 0; i3 < this.a; i3++) {
                sb.append(g(i3, i2) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void d() {
        int length = this.d.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.d[i2] = 0;
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.a, this.b, this.c, (int[]) this.d.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && Arrays.equals(this.d, bVar.d);
    }

    public boolean g(int i2, int i3) {
        return ((this.d[(i3 * this.c) + (i2 / 32)] >>> (i2 & 31)) & 1) != 0;
    }

    public int h() {
        return this.b;
    }

    public int hashCode() {
        int i2 = this.a;
        return (((((((i2 * 31) + i2) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
    }

    public int i() {
        return this.a;
    }

    public void k(int i2, int i3) {
        int i4 = (i3 * this.c) + (i2 / 32);
        int[] iArr = this.d;
        iArr[i4] = (1 << (i2 & 31)) | iArr[i4];
    }

    public void m(int i2, int i3, int i4, int i5) {
        if (i3 < 0 || i2 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i5 <= 0 || i4 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i6 = i4 + i2;
        int i7 = i5 + i3;
        if (i7 > this.b || i6 > this.a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i3 < i7) {
            int i8 = this.c * i3;
            for (int i9 = i2; i9 < i6; i9++) {
                int[] iArr = this.d;
                int i10 = (i9 / 32) + i8;
                iArr[i10] = iArr[i10] | (1 << (i9 & 31));
            }
            i3++;
        }
    }

    public String n(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return n("X ", "  ");
    }
}
