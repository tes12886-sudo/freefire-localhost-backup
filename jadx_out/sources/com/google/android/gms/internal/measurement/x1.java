package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class x1 extends s2 {
    final /* synthetic */ zzee e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x1(zzee zzeeVar) {
        super(zzeeVar, true);
        this.e = zzeeVar;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var = this.e.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.resetAnalyticsData(this.a);
    }
}
