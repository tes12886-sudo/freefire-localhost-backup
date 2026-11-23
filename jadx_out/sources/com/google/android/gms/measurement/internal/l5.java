package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class l5 implements Runnable {
    final /* synthetic */ ja a;
    final /* synthetic */ t5 b;

    l5(t5 t5Var, ja jaVar) {
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
        g gVarC = g.c(jaVar.v);
        g gVarE0 = v9Var.e0(jaVar.a);
        v9Var.d().w().c("Setting consent, package, consent", jaVar.a, gVarC);
        v9Var.d0(jaVar.a, gVarC);
        if (gVarC.i(gVarE0)) {
            v9Var.n(jaVar);
        }
    }
}
