package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class n2 extends s2 {
    final /* synthetic */ boolean e;
    final /* synthetic */ zzee f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n2(zzee zzeeVar, boolean z) {
        super(zzeeVar, true);
        this.f = zzeeVar;
        this.e = z;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var = this.f.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.setDataCollectionEnabled(this.e);
    }
}
