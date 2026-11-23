package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class l2 extends s2 {
    final /* synthetic */ String e;
    final /* synthetic */ b1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ zzee f1071g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l2(zzee zzeeVar, String str, b1 b1Var) {
        super(zzeeVar, true);
        this.f1071g = zzeeVar;
        this.e = str;
        this.f = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var = this.f1071g.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.getMaxUserProperties(this.e, this.f);
    }

    @Override // com.google.android.gms.internal.measurement.s2
    protected final void b() {
        this.f.W(null);
    }
}
