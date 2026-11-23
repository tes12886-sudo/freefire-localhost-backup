package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class z8 implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ g9 b;

    z8(g9 g9Var, long j2) {
        this.b = g9Var;
        this.a = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g9.p(this.b, this.a);
    }
}
