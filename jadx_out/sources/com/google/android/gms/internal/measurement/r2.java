package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class r2 extends s2 {
    final /* synthetic */ String e;
    final /* synthetic */ String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f1118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f1119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ zzee f1120i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r2(zzee zzeeVar, String str, String str2, Object obj, boolean z) {
        super(zzeeVar, true);
        this.f1120i = zzeeVar;
        this.e = str;
        this.f = str2;
        this.f1118g = obj;
        this.f1119h = z;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var = this.f1120i.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.setUserProperty(this.e, this.f, j.d.a.c.e.b.c1(this.f1118g), this.f1119h, this.a);
    }
}
