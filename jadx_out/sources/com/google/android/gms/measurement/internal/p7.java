package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class p7 implements Runnable {
    final /* synthetic */ k7 a;
    final /* synthetic */ long b;
    final /* synthetic */ r7 c;

    p7(r7 r7Var, k7 k7Var, long j2) {
        this.c = r7Var;
        this.a = k7Var;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.q(this.a, false, this.b);
        r7 r7Var = this.c;
        r7Var.e = null;
        r7Var.a.R().W(null);
    }
}
