package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class y3 implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ z3 b;

    y3(z3 z3Var, boolean z) {
        this.b = z3Var;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.A(this.a);
    }
}
