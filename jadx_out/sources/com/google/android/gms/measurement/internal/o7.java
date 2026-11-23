package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class o7 implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ r7 b;

    o7(r7 r7Var, long j2) {
        this.b = r7Var;
        this.a = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.g().k(this.a);
        this.b.e = null;
    }
}
