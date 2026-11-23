package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class r5 implements Runnable {
    final /* synthetic */ ja a;
    final /* synthetic */ t5 b;

    r5(t5 t5Var, ja jaVar) {
        this.b = t5Var;
        this.a = jaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.l();
        this.b.a.t(this.a);
    }
}
