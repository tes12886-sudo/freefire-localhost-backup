package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class z4 implements Runnable {
    final /* synthetic */ d6 a;
    final /* synthetic */ a5 b;

    z4(a5 a5Var, d6 d6Var) {
        this.b = a5Var;
        this.a = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a5.t(this.b, this.a);
        this.b.y(this.a.f1179g);
    }
}
