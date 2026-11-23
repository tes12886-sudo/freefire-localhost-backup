package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class i2 extends s2 {
    final /* synthetic */ String e;
    final /* synthetic */ String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f1060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ b1 f1061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ zzee f1062i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i2(zzee zzeeVar, String str, String str2, boolean z, b1 b1Var) {
        super(zzeeVar, true);
        this.f1062i = zzeeVar;
        this.e = str;
        this.f = str2;
        this.f1060g = z;
        this.f1061h = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var = this.f1062i.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.getUserProperties(this.e, this.f, this.f1060g, this.f1061h);
    }

    @Override // com.google.android.gms.internal.measurement.s2
    protected final void b() {
        this.f1061h.W(null);
    }
}
