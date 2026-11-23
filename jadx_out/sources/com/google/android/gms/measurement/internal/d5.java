package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class d5 implements Runnable {
    final /* synthetic */ b a;
    final /* synthetic */ t5 b;

    d5(t5 t5Var, b bVar) {
        this.b = t5Var;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.l();
        if (this.a.c.f() == null) {
            this.b.a.w(this.a);
        } else {
            this.b.a.u(this.a);
        }
    }
}
