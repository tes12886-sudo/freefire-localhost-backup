package com.facebook.j0.w;

import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private f() {
    }

    public static final void a(a aVar, a aVar2) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return;
        }
        try {
            i.e(aVar, "x");
            i.e(aVar2, "b");
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            int iB3 = aVar.b(2);
            float[] fArrA = aVar.a();
            float[] fArrA2 = aVar2.a();
            for (int i2 = 0; i2 < iB; i2++) {
                for (int i3 = 0; i3 < iB2; i3++) {
                    for (int i4 = 0; i4 < iB3; i4++) {
                        int i5 = (i2 * iB2 * iB3) + (i3 * iB3) + i4;
                        fArrA[i5] = fArrA[i5] + fArrA2[i4];
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
        }
    }

    public static final a b(a[] aVarArr) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            i.e(aVarArr, "tensors");
            int iB = aVarArr[0].b(0);
            int iB2 = 0;
            for (a aVar : aVarArr) {
                iB2 += aVar.b(1);
            }
            a aVar2 = new a(new int[]{iB, iB2});
            float[] fArrA = aVar2.a();
            for (int i2 = 0; i2 < iB; i2++) {
                int i3 = i2 * iB2;
                int length = aVarArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    float[] fArrA2 = aVarArr[i4].a();
                    int iB3 = aVarArr[i4].b(1);
                    System.arraycopy(fArrA2, i2 * iB3, fArrA, i3, iB3);
                    i3 += iB3;
                }
            }
            return aVar2;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    public static final a c(a aVar, a aVar2) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            i.e(aVar, "x");
            i.e(aVar2, "w");
            int i2 = 0;
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            int iB3 = aVar.b(2);
            int iB4 = aVar2.b(0);
            int i3 = (iB2 - iB4) + 1;
            int iB5 = aVar2.b(2);
            a aVar3 = new a(new int[]{iB, i3, iB5});
            float[] fArrA = aVar.a();
            float[] fArrA2 = aVar3.a();
            float[] fArrA3 = aVar2.a();
            int i4 = 0;
            while (i4 < iB) {
                int i5 = 0;
                while (i5 < iB5) {
                    int i6 = 0;
                    while (i6 < i3) {
                        float f = 0.0f;
                        while (i2 < iB4) {
                            for (int i7 = 0; i7 < iB3; i7++) {
                                f += fArrA[(iB2 * iB3 * i4) + ((i2 + i6) * iB3) + i7] * fArrA3[(((i2 * iB3) + i7) * iB5) + i5];
                            }
                            i2++;
                        }
                        fArrA2[(i3 * iB5 * i4) + (i6 * iB5) + i5] = f;
                        i6++;
                        i2 = 0;
                    }
                    i5++;
                    i2 = 0;
                }
                i4++;
                i2 = 0;
            }
            return aVar3;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    public static final a d(a aVar, a aVar2, a aVar3) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            i.e(aVar, "x");
            i.e(aVar2, "w");
            i.e(aVar3, "b");
            int iB = aVar.b(0);
            int iB2 = aVar3.b(0);
            a aVarH = h(aVar, aVar2);
            float[] fArrA = aVar3.a();
            float[] fArrA2 = aVarH.a();
            for (int i2 = 0; i2 < iB; i2++) {
                for (int i3 = 0; i3 < iB2; i3++) {
                    int i4 = (i2 * iB2) + i3;
                    fArrA2[i4] = fArrA2[i4] + fArrA[i3];
                }
            }
            return aVarH;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    public static final a e(String[] strArr, int i2, a aVar) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            i.e(strArr, "texts");
            i.e(aVar, "w");
            int length = strArr.length;
            int iB = aVar.b(1);
            a aVar2 = new a(new int[]{length, i2, iB});
            float[] fArrA = aVar2.a();
            float[] fArrA2 = aVar.a();
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArrD = g.a.d(strArr[i3], i2);
                for (int i4 = 0; i4 < i2; i4++) {
                    System.arraycopy(fArrA2, iArrD[i4] * iB, fArrA, (iB * i2 * i3) + (iB * i4), iB);
                }
            }
            return aVar2;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    public static final void f(a aVar, int i2) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return;
        }
        try {
            i.e(aVar, "x");
            if (i2 >= aVar.c()) {
                return;
            }
            int iC = aVar.c();
            int iB = 1;
            for (int i3 = i2; i3 < iC; i3++) {
                iB *= aVar.b(i3);
            }
            int[] iArr = new int[i2 + 1];
            for (int i4 = 0; i4 < i2; i4++) {
                iArr[i4] = aVar.b(i4);
            }
            iArr[i2] = iB;
            aVar.d(iArr);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
        }
    }

    public static final a g(a aVar, int i2) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            i.e(aVar, "x");
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            int iB3 = aVar.b(2);
            int i3 = (iB2 - i2) + 1;
            a aVar2 = new a(new int[]{iB, i3, iB3});
            float[] fArrA = aVar.a();
            float[] fArrA2 = aVar2.a();
            for (int i4 = 0; i4 < iB; i4++) {
                for (int i5 = 0; i5 < iB3; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        int i7 = i6 * iB3;
                        int i8 = (i4 * i3 * iB3) + i7 + i5;
                        int i9 = (i4 * iB2 * iB3) + i7 + i5;
                        fArrA2[i8] = Float.MIN_VALUE;
                        for (int i10 = 0; i10 < i2; i10++) {
                            fArrA2[i8] = Math.max(fArrA2[i8], fArrA[i9 + (i10 * iB3)]);
                        }
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    public static final a h(a aVar, a aVar2) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            i.e(aVar, "x");
            i.e(aVar2, "w");
            int iB = aVar.b(0);
            int iB2 = aVar2.b(0);
            int iB3 = aVar2.b(1);
            a aVar3 = new a(new int[]{iB, iB3});
            float[] fArrA = aVar.a();
            float[] fArrA2 = aVar2.a();
            float[] fArrA3 = aVar3.a();
            for (int i2 = 0; i2 < iB; i2++) {
                for (int i3 = 0; i3 < iB3; i3++) {
                    int i4 = (i2 * iB3) + i3;
                    fArrA3[i4] = 0.0f;
                    for (int i5 = 0; i5 < iB2; i5++) {
                        fArrA3[i4] = fArrA3[i4] + (fArrA[(i2 * iB2) + i5] * fArrA2[(i5 * iB3) + i3]);
                    }
                }
            }
            return aVar3;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    public static final void i(a aVar) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return;
        }
        try {
            i.e(aVar, "x");
            float[] fArrA = aVar.a();
            int length = fArrA.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (fArrA[i2] < 0) {
                    fArrA[i2] = 0.0f;
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
        }
    }

    public static final void j(a aVar) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return;
        }
        try {
            i.e(aVar, "x");
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            float[] fArrA = aVar.a();
            for (int i2 = 0; i2 < iB; i2++) {
                int i3 = i2 * iB2;
                int i4 = i3 + iB2;
                float f = Float.MIN_VALUE;
                float f2 = 0.0f;
                for (int i5 = i3; i5 < i4; i5++) {
                    if (fArrA[i5] > f) {
                        f = fArrA[i5];
                    }
                }
                for (int i6 = i3; i6 < i4; i6++) {
                    fArrA[i6] = (float) Math.exp(fArrA[i6] - f);
                    f2 += fArrA[i6];
                }
                while (i3 < i4) {
                    fArrA[i3] = fArrA[i3] / f2;
                    i3++;
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
        }
    }

    public static final a k(a aVar) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            i.e(aVar, "x");
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            a aVar2 = new a(new int[]{iB2, iB});
            float[] fArrA = aVar.a();
            float[] fArrA2 = aVar2.a();
            for (int i2 = 0; i2 < iB; i2++) {
                for (int i3 = 0; i3 < iB2; i3++) {
                    fArrA2[(i3 * iB) + i2] = fArrA[(i2 * iB2) + i3];
                }
            }
            return aVar2;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    public static final a l(a aVar) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            i.e(aVar, "x");
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            int iB3 = aVar.b(2);
            a aVar2 = new a(new int[]{iB3, iB2, iB});
            float[] fArrA = aVar.a();
            float[] fArrA2 = aVar2.a();
            for (int i2 = 0; i2 < iB; i2++) {
                for (int i3 = 0; i3 < iB2; i3++) {
                    for (int i4 = 0; i4 < iB3; i4++) {
                        fArrA2[(i4 * iB * iB2) + (i3 * iB) + i2] = fArrA[(i2 * iB2 * iB3) + (i3 * iB3) + i4];
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }
}
