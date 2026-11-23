package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class n8 implements Runnable {
    final /* synthetic */ i3 a;
    final /* synthetic */ q8 b;

    n8(q8 q8Var, i3 i3Var) {
        this.b = q8Var;
        this.a = i3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            q8.d(this.b, false);
            if (!this.b.c.H()) {
                this.b.c.a.d().v().a("Connected to remote service");
                this.b.c.s(this.a);
            }
        }
    }
}
