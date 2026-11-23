package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class kb extends mb {
    kb(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.mb
    public final void a(Object obj, long j2, byte b) {
        if (nb.f1088i) {
            nb.d(obj, j2, b);
        } else {
            nb.e(obj, j2, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.mb
    public final boolean b(Object obj, long j2) {
        return nb.f1088i ? nb.A(obj, j2) : nb.B(obj, j2);
    }

    @Override // com.google.android.gms.internal.measurement.mb
    public final void c(Object obj, long j2, boolean z) {
        if (nb.f1088i) {
            nb.d(obj, j2, z ? (byte) 1 : (byte) 0);
        } else {
            nb.e(obj, j2, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.mb
    public final float d(Object obj, long j2) {
        return Float.intBitsToFloat(k(obj, j2));
    }

    @Override // com.google.android.gms.internal.measurement.mb
    public final void e(Object obj, long j2, float f) {
        l(obj, j2, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.mb
    public final double f(Object obj, long j2) {
        return Double.longBitsToDouble(m(obj, j2));
    }

    @Override // com.google.android.gms.internal.measurement.mb
    public final void g(Object obj, long j2, double d) {
        n(obj, j2, Double.doubleToLongBits(d));
    }
}
