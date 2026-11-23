package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class t7 implements Runnable {
    final /* synthetic */ ja a;
    final /* synthetic */ boolean b;
    final /* synthetic */ y9 c;
    final /* synthetic */ r8 d;

    t7(r8 r8Var, ja jaVar, boolean z, y9 y9Var) {
        this.d = r8Var;
        this.a = jaVar;
        this.b = z;
        this.c = y9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i3 i3Var = this.d.d;
        if (i3Var == null) {
            this.d.a.d().o().a("Discarding data. Failed to set user property");
            return;
        }
        com.google.android.gms.common.internal.q.k(this.a);
        this.d.K(i3Var, this.b ? null : this.c, this.a);
        this.d.D();
    }
}
