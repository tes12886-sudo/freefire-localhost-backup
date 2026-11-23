package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class c1 implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ d2 b;

    c1(d2 d2Var, long j2) {
        this.b = d2Var;
        this.a = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.q(this.a);
    }
}
