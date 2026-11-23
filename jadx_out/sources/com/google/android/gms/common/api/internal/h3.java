package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class h3 implements Runnable {
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b;
    final /* synthetic */ i3 c;

    h3(i3 i3Var, LifecycleCallback lifecycleCallback, String str) {
        this.c = i3Var;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i3 i3Var = this.c;
        if (i3Var.b > 0) {
            this.a.f(i3Var.c != null ? i3Var.c.getBundle(this.b) : null);
        }
        if (this.c.b >= 2) {
            this.a.j();
        }
        if (this.c.b >= 3) {
            this.a.h();
        }
        if (this.c.b >= 4) {
            this.a.k();
        }
        if (this.c.b >= 5) {
            this.a.g();
        }
    }
}
