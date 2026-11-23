package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class o9 implements Runnable {
    final /* synthetic */ w9 a;
    final /* synthetic */ v9 b;

    o9(v9 v9Var, w9 w9Var) {
        this.b = v9Var;
        this.a = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v9.B(this.b, this.a);
        this.b.R();
    }
}
