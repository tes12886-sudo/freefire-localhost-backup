package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class x6 implements Runnable {
    final /* synthetic */ Boolean a;
    final /* synthetic */ d7 b;

    x6(d7 d7Var, Boolean bool) {
        this.b = d7Var;
        this.a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.L(this.a, true);
    }
}
