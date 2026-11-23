package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class g2 extends s2 {
    final /* synthetic */ b1 e;
    final /* synthetic */ zzee f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g2(zzee zzeeVar, b1 b1Var) {
        super(zzeeVar, true);
        this.f = zzeeVar;
        this.e = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var = this.f.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.getCurrentScreenName(this.e);
    }

    @Override // com.google.android.gms.internal.measurement.s2
    protected final void b() {
        this.e.W(null);
    }
}
