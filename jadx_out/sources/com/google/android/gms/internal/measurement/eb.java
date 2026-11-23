package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class eb {
    private static final eb f = new eb(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private eb() {
        this(0, new int[8], new Object[8], true);
    }

    private eb(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i2;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static eb a() {
        return f;
    }

    static eb b() {
        return new eb(0, new int[8], new Object[8], true);
    }

    static eb c(eb ebVar, eb ebVar2) {
        int i2 = ebVar.a + ebVar2.a;
        int[] iArrCopyOf = Arrays.copyOf(ebVar.b, i2);
        System.arraycopy(ebVar2.b, 0, iArrCopyOf, ebVar.a, ebVar2.a);
        Object[] objArrCopyOf = Arrays.copyOf(ebVar.c, i2);
        System.arraycopy(ebVar2.c, 0, objArrCopyOf, ebVar.a, ebVar2.a);
        return new eb(i2, iArrCopyOf, objArrCopyOf, true);
    }

    public final void d() {
        this.e = false;
    }

    public final int e() {
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int iA = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            z7 z7Var = (z7) this.c[i3];
            int iA2 = g8.A(8);
            int iD = z7Var.d();
            iA += iA2 + iA2 + g8.A(16) + g8.A(i4 >>> 3) + g8.A(24) + g8.A(iD) + iD;
        }
        this.d = iA;
        return iA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        int i2 = this.a;
        if (i2 == ebVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = ebVar.b;
            for (int i3 = 0; i3 < i2; i3++) {
                if (iArr[i3] == iArr2[i3]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = ebVar.c;
            int i4 = this.a;
            for (int i5 = 0; i5 < i4; i5++) {
                if (objArr[i5].equals(objArr2[i5])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int iA;
        int iB;
        int iA2;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int iA3 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        z7 z7Var = (z7) this.c[i3];
                        int iA4 = g8.A(i5 << 3);
                        int iD = z7Var.d();
                        iA3 += iA4 + g8.A(iD) + iD;
                    } else if (i6 == 3) {
                        int iY = g8.y(i5);
                        iA = iY + iY;
                        iB = ((eb) this.c[i3]).f();
                    } else {
                        if (i6 != 5) {
                            throw new IllegalStateException(i9.d());
                        }
                        ((Integer) this.c[i3]).intValue();
                        iA2 = g8.A(i5 << 3) + 4;
                    }
                } else {
                    ((Long) this.c[i3]).longValue();
                    iA2 = g8.A(i5 << 3) + 8;
                }
                iA3 += iA2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iA = g8.A(i5 << 3);
                iB = g8.B(jLongValue);
            }
            iA2 = iA + iB;
            iA3 += iA2;
        }
        this.d = iA3;
        return iA3;
    }

    final void g(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.a; i3++) {
            fa.b(sb, i2, String.valueOf(this.b[i3] >>> 3), this.c[i3]);
        }
    }

    final void h(int i2, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i3 = this.a;
        int[] iArr = this.b;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.b = Arrays.copyOf(iArr, i4);
            this.c = Arrays.copyOf(this.c, i4);
        }
        int[] iArr2 = this.b;
        int i5 = this.a;
        iArr2[i5] = i2;
        this.c[i5] = obj;
        this.a = i5 + 1;
    }

    public final int hashCode() {
        int i2 = this.a;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i3 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    public final void i(h8 h8Var) {
        if (this.a != 0) {
            for (int i2 = 0; i2 < this.a; i2++) {
                int i3 = this.b[i2];
                Object obj = this.c[i2];
                int i4 = i3 >>> 3;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    h8Var.n(i4, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    h8Var.u(i4, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    h8Var.y(i4, (z7) obj);
                } else if (i5 == 3) {
                    h8Var.E(i4);
                    ((eb) obj).i(h8Var);
                    h8Var.F(i4);
                } else {
                    if (i5 != 5) {
                        throw new RuntimeException(i9.d());
                    }
                    h8Var.v(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
