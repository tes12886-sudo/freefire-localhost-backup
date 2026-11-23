package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class u7 extends y7 {
    private final int d;

    u7(byte[] bArr, int i2, int i3) {
        super(bArr);
        z7.u(0, i3, bArr.length);
        this.d = i3;
    }

    @Override // com.google.android.gms.internal.measurement.y7, com.google.android.gms.internal.measurement.z7
    public final byte b(int i2) {
        int i3 = this.d;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.c[i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(i3);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.y7, com.google.android.gms.internal.measurement.z7
    final byte c(int i2) {
        return this.c[i2];
    }

    @Override // com.google.android.gms.internal.measurement.y7, com.google.android.gms.internal.measurement.z7
    public final int d() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.measurement.y7
    protected final int v() {
        return 0;
    }
}
