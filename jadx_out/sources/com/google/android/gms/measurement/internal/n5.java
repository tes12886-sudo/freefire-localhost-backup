package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class n5 implements Runnable {
    final /* synthetic */ t a;
    final /* synthetic */ String b;
    final /* synthetic */ t5 c;

    n5(t5 t5Var, t tVar, String str) {
        this.c = t5Var;
        this.a = tVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.l();
        this.c.a.g0(this.a, this.b);
    }
}
