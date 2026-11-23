package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class s1 extends s2 {
    final /* synthetic */ String e;
    final /* synthetic */ String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ b1 f1130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ zzee f1131h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s1(zzee zzeeVar, String str, String str2, b1 b1Var) {
        super(zzeeVar, true);
        this.f1131h = zzeeVar;
        this.e = str;
        this.f = str2;
        this.f1130g = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var = this.f1131h.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.getConditionalUserProperties(this.e, this.f, this.f1130g);
    }

    @Override // com.google.android.gms.internal.measurement.s2
    protected final void b() {
        this.f1130g.W(null);
    }
}
