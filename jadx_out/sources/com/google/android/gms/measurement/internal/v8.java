package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class v8 implements Runnable {
    final /* synthetic */ v9 a;
    final /* synthetic */ Runnable b;

    v8(x8 x8Var, v9 v9Var, Runnable runnable) {
        this.a = v9Var;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.l();
        this.a.k(this.b);
        this.a.g();
    }
}
