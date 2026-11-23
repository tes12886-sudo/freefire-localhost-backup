package com.google.android.gms.internal.measurement;

import com.appff.haptic.base.Utils;

/* JADX INFO: loaded from: classes.dex */
final class e8 extends g8 {
    private final byte[] d;
    private final int e;
    private int f;

    e8(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.d = bArr;
        this.f = 0;
        this.e = i3;
    }

    public final void E(byte[] bArr, int i2, int i3) {
        try {
            System.arraycopy(bArr, 0, this.d, this.f, i3);
            this.f += i3;
        } catch (IndexOutOfBoundsException e) {
            throw new f8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i3)), e);
        }
    }

    public final void F(String str) throws f8 {
        int i2 = this.f;
        try {
            int iA = g8.A(str.length() * 3);
            int iA2 = g8.A(str.length());
            if (iA2 != iA) {
                r(sb.c(str));
                byte[] bArr = this.d;
                int i3 = this.f;
                this.f = sb.d(str, bArr, i3, this.e - i3);
                return;
            }
            int i4 = i2 + iA2;
            this.f = i4;
            int iD = sb.d(str, this.d, i4, this.e - i4);
            this.f = i2;
            r((iD - i2) - iA2);
            this.f = iD;
        } catch (rb e) {
            this.f = i2;
            d(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new f8(e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void g(int i2, int i3) {
        r((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void h(int i2, int i3) throws f8 {
        r(i2 << 3);
        q(i3);
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void i(int i2, int i3) {
        r(i2 << 3);
        r(i3);
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void j(int i2, int i3) throws f8 {
        r((i2 << 3) | 5);
        s(i3);
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void k(int i2, long j2) throws f8 {
        r(i2 << 3);
        t(j2);
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void l(int i2, long j2) throws f8 {
        r((i2 << 3) | 1);
        u(j2);
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void m(int i2, boolean z) throws f8 {
        r(i2 << 3);
        p(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void n(int i2, String str) throws f8 {
        r((i2 << 3) | 2);
        F(str);
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void o(int i2, z7 z7Var) {
        r((i2 << 3) | 2);
        r(z7Var.d());
        z7Var.h(this);
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void p(byte b) throws f8 {
        try {
            byte[] bArr = this.d;
            int i2 = this.f;
            this.f = i2 + 1;
            bArr[i2] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new f8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void q(int i2) throws f8 {
        if (i2 >= 0) {
            r(i2);
        } else {
            t(i2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void r(int i2) {
        if (g8.c) {
            int i3 = n7.a;
        }
        while ((i2 & (-128)) != 0) {
            try {
                byte[] bArr = this.d;
                int i4 = this.f;
                this.f = i4 + 1;
                bArr[i4] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new f8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }
        byte[] bArr2 = this.d;
        int i5 = this.f;
        this.f = i5 + 1;
        bArr2[i5] = (byte) i2;
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void s(int i2) throws f8 {
        try {
            byte[] bArr = this.d;
            int i3 = this.f;
            int i4 = i3 + 1;
            this.f = i4;
            bArr[i3] = (byte) (i2 & Utils.MAX_STRENGTH_VALUE);
            int i5 = i4 + 1;
            this.f = i5;
            bArr[i4] = (byte) ((i2 >> 8) & Utils.MAX_STRENGTH_VALUE);
            int i6 = i5 + 1;
            this.f = i6;
            bArr[i5] = (byte) ((i2 >> 16) & Utils.MAX_STRENGTH_VALUE);
            this.f = i6 + 1;
            bArr[i6] = (byte) ((i2 >> 24) & Utils.MAX_STRENGTH_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new f8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void t(long j2) throws f8 {
        if (g8.c && this.e - this.f >= 10) {
            while ((j2 & (-128)) != 0) {
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = i2 + 1;
                nb.u(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr2 = this.d;
            int i3 = this.f;
            this.f = i3 + 1;
            nb.u(bArr2, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.d;
                int i4 = this.f;
                this.f = i4 + 1;
                bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new f8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }
        byte[] bArr4 = this.d;
        int i5 = this.f;
        this.f = i5 + 1;
        bArr4[i5] = (byte) j2;
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void u(long j2) throws f8 {
        try {
            byte[] bArr = this.d;
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            bArr[i2] = (byte) (((int) j2) & Utils.MAX_STRENGTH_VALUE);
            int i4 = i3 + 1;
            this.f = i4;
            bArr[i3] = (byte) (((int) (j2 >> 8)) & Utils.MAX_STRENGTH_VALUE);
            int i5 = i4 + 1;
            this.f = i5;
            bArr[i4] = (byte) (((int) (j2 >> 16)) & Utils.MAX_STRENGTH_VALUE);
            int i6 = i5 + 1;
            this.f = i6;
            bArr[i5] = (byte) (((int) (j2 >> 24)) & Utils.MAX_STRENGTH_VALUE);
            int i7 = i6 + 1;
            this.f = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & Utils.MAX_STRENGTH_VALUE);
            int i8 = i7 + 1;
            this.f = i8;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & Utils.MAX_STRENGTH_VALUE);
            int i9 = i8 + 1;
            this.f = i9;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & Utils.MAX_STRENGTH_VALUE);
            this.f = i9 + 1;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & Utils.MAX_STRENGTH_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new f8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final void v(byte[] bArr, int i2, int i3) {
        E(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final int w() {
        return this.e - this.f;
    }
}
