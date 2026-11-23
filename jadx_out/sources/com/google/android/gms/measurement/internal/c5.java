package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class c5 implements Runnable {
    final /* synthetic */ b a;
    final /* synthetic */ ja b;
    final /* synthetic */ t5 c;

    c5(t5 t5Var, b bVar, ja jaVar) {
        this.c = t5Var;
        this.a = bVar;
        this.b = jaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.l();
        if (this.a.c.f() == null) {
            this.c.a.x(this.a, this.b);
        } else {
            this.c.a.v(this.a, this.b);
        }
    }
}
