package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class p8 implements Runnable {
    final /* synthetic */ q8 a;

    p8(q8 q8Var) {
        this.a = q8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r8.y(this.a.c, null);
        this.a.c.F();
    }
}
