package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class k5 implements Runnable {
    final /* synthetic */ ja a;
    final /* synthetic */ t5 b;

    k5(t5 t5Var, ja jaVar) {
        this.b = t5Var;
        this.a = jaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.l();
        v9 v9Var = this.b.a;
        ja jaVar = this.a;
        v9Var.f().h();
        v9Var.c0();
        com.google.android.gms.common.internal.q.g(jaVar.a);
        v9Var.y(jaVar);
    }
}
