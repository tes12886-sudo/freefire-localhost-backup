package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class p5 implements Runnable {
    final /* synthetic */ y9 a;
    final /* synthetic */ ja b;
    final /* synthetic */ t5 c;

    p5(t5 t5Var, y9 y9Var, ja jaVar) {
        this.c = t5Var;
        this.a = y9Var;
        this.b = jaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.l();
        if (this.a.f() == null) {
            this.c.a.p(this.a, this.b);
        } else {
            this.c.a.o(this.a, this.b);
        }
    }
}
