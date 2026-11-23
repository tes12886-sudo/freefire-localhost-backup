package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class h8 implements Runnable {
    final /* synthetic */ ja a;
    final /* synthetic */ boolean b;
    final /* synthetic */ b c;
    final /* synthetic */ r8 d;

    h8(r8 r8Var, boolean z, ja jaVar, boolean z2, b bVar, b bVar2) {
        this.d = r8Var;
        this.a = jaVar;
        this.b = z2;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i3 i3Var = this.d.d;
        if (i3Var == null) {
            this.d.a.d().o().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        com.google.android.gms.common.internal.q.k(this.a);
        this.d.K(i3Var, this.b ? null : this.c, this.a);
        this.d.D();
    }
}
