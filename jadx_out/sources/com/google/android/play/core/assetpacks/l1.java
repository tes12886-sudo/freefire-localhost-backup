package com.google.android.play.core.assetpacks;

import com.appff.haptic.base.Utils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class l1 {
    private byte[] a = new byte[Utils.CONTINUOUS_EVENT];
    private int b;
    private long c;
    private long d;
    private int e;
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f1333i;

    public l1() {
        d();
    }

    private final int e(int i2, byte[] bArr, int i3, int i4) {
        int i5 = this.b;
        if (i5 >= i2) {
            return 0;
        }
        int iMin = Math.min(i4, i2 - i5);
        System.arraycopy(bArr, i3, this.a, this.b, iMin);
        int i6 = this.b + iMin;
        this.b = i6;
        if (i6 < i2) {
            return -1;
        }
        return iMin;
    }

    public final int a(byte[] bArr, int i2, int i3) {
        int iE = e(30, bArr, i2, i3);
        if (iE == -1) {
            return -1;
        }
        if (this.c == -1) {
            long jB = j1.b(this.a, 0);
            this.c = jB;
            if (jB == 67324752) {
                this.f1332h = false;
                this.d = j1.b(this.a, 18);
                this.f1331g = j1.c(this.a, 8);
                this.e = j1.c(this.a, 26);
                int iC = this.e + 30 + j1.c(this.a, 28);
                this.f = iC;
                int length = this.a.length;
                if (length < iC) {
                    do {
                        length += length;
                    } while (length < iC);
                    this.a = Arrays.copyOf(this.a, length);
                }
            } else {
                this.f1332h = true;
            }
        }
        int iE2 = e(this.f, bArr, i2 + iE, i3 - iE);
        if (iE2 == -1) {
            return -1;
        }
        int i4 = iE + iE2;
        if (!this.f1332h && this.f1333i == null) {
            this.f1333i = new String(this.a, 30, this.e);
        }
        return i4;
    }

    public final d2 b() {
        int i2 = this.b;
        int i3 = this.f;
        if (i2 < i3) {
            return d2.a(this.f1333i, this.d, this.f1331g, true, Arrays.copyOf(this.a, i2), this.f1332h);
        }
        d2 d2VarA = d2.a(this.f1333i, this.d, this.f1331g, false, Arrays.copyOf(this.a, i3), this.f1332h);
        d();
        return d2VarA;
    }

    public final int c() {
        return this.f;
    }

    public final void d() {
        this.b = 0;
        this.e = -1;
        this.c = -1L;
        this.f1332h = false;
        this.f = 30;
        this.d = -1L;
        this.f1331g = -1;
        this.f1333i = null;
    }
}
