package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class y7 extends x7 {
    protected final byte[] c;

    y7(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public byte b(int i2) {
        return this.c[i2];
    }

    @Override // com.google.android.gms.internal.measurement.z7
    byte c(int i2) {
        return this.c[i2];
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public int d() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z7) || d() != ((z7) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return obj.equals(this);
        }
        y7 y7Var = (y7) obj;
        int iT = t();
        int iT2 = y7Var.t();
        if (iT != 0 && iT2 != 0 && iT != iT2) {
            return false;
        }
        int iD = d();
        if (iD > y7Var.d()) {
            int iD2 = d();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(iD);
            sb.append(iD2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (iD > y7Var.d()) {
            int iD3 = y7Var.d();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(iD);
            sb2.append(", ");
            sb2.append(iD3);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(y7Var instanceof y7)) {
            return y7Var.f(0, iD).equals(f(0, iD));
        }
        byte[] bArr = this.c;
        byte[] bArr2 = y7Var.c;
        y7Var.v();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iD) {
            if (bArr[i2] != bArr2[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final z7 f(int i2, int i3) {
        int iU = z7.u(0, i3, d());
        return iU == 0 ? z7.b : new u7(this.c, 0, iU);
    }

    @Override // com.google.android.gms.internal.measurement.z7
    final void h(r7 r7Var) {
        ((e8) r7Var).E(this.c, 0, d());
    }

    @Override // com.google.android.gms.internal.measurement.z7
    protected final String j(Charset charset) {
        return new String(this.c, 0, d(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final boolean l() {
        return sb.b(this.c, 0, d());
    }

    @Override // com.google.android.gms.internal.measurement.z7
    protected final int n(int i2, int i3, int i4) {
        return g9.h(i2, this.c, 0, i4);
    }

    protected int v() {
        return 0;
    }
}
