package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class j2 extends s2 {
    final /* synthetic */ String e;
    final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ zzee f1063g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j2(zzee zzeeVar, boolean z, int i2, String str, Object obj, Object obj2, Object obj3) {
        super(zzeeVar, false);
        this.f1063g = zzeeVar;
        this.e = str;
        this.f = obj;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var = this.f1063g.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.logHealthData(5, this.e, j.d.a.c.e.b.c1(this.f), j.d.a.c.e.b.c1(null), j.d.a.c.e.b.c1(null));
    }
}
