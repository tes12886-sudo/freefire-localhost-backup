package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class j6 implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ d7 b;

    j6(d7 d7Var, long j2) {
        this.b = d7Var;
        this.a = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.A().f1214k.b(this.a);
        this.b.a.d().v().b("Session timeout duration set", Long.valueOf(this.a));
    }
}
