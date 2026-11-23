package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class v1 extends s2 {
    final /* synthetic */ Boolean e;
    final /* synthetic */ zzee f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v1(zzee zzeeVar, Boolean bool) {
        super(zzeeVar, true);
        this.f = zzeeVar;
        this.e = bool;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        if (this.e != null) {
            f1 f1Var = this.f.f1159h;
            com.google.android.gms.common.internal.q.k(f1Var);
            f1Var.setMeasurementEnabled(this.e.booleanValue(), this.a);
        } else {
            f1 f1Var2 = this.f.f1159h;
            com.google.android.gms.common.internal.q.k(f1Var2);
            f1Var2.clearMeasurementEnabled(this.a);
        }
    }
}
