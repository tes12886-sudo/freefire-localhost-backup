package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class j3 implements Runnable {
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b;
    final /* synthetic */ k3 c;

    j3(k3 k3Var, LifecycleCallback lifecycleCallback, String str) {
        this.c = k3Var;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k3 k3Var = this.c;
        if (k3Var.i0 > 0) {
            this.a.f(k3Var.j0 != null ? k3Var.j0.getBundle(this.b) : null);
        }
        if (this.c.i0 >= 2) {
            this.a.j();
        }
        if (this.c.i0 >= 3) {
            this.a.h();
        }
        if (this.c.i0 >= 4) {
            this.a.k();
        }
        if (this.c.i0 >= 5) {
            this.a.g();
        }
    }
}
