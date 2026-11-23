package com.facebook.j0.w;

import l.t.h;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final C0087a d = new C0087a(null);
    private int a;
    private float[] b;
    private int[] c;

    /* JADX INFO: renamed from: com.facebook.j0.w.a$a, reason: collision with other inner class name */
    public static final class C0087a {
        private C0087a() {
        }

        public /* synthetic */ C0087a(l.y.c.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int[] iArr) {
            int i2 = 1;
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i3 = iArr[0];
            int iM = h.m(iArr);
            if (1 <= iM) {
                while (true) {
                    i3 *= iArr[i2];
                    if (i2 == iM) {
                        break;
                    }
                    i2++;
                }
            }
            return i3;
        }
    }

    public a(int[] iArr) {
        i.e(iArr, "shape");
        this.c = iArr;
        int iB = d.b(iArr);
        this.a = iB;
        this.b = new float[iB];
    }

    public final float[] a() {
        return this.b;
    }

    public final int b(int i2) {
        return this.c[i2];
    }

    public final int c() {
        return this.c.length;
    }

    public final void d(int[] iArr) {
        i.e(iArr, "shape");
        this.c = iArr;
        int iB = d.b(iArr);
        float[] fArr = new float[iB];
        System.arraycopy(this.b, 0, fArr, 0, Math.min(this.a, iB));
        this.b = fArr;
        this.a = iB;
    }
}
