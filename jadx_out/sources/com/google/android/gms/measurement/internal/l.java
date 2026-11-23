package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class l implements Runnable {
    final /* synthetic */ w5 a;
    final /* synthetic */ m b;

    l(m mVar, w5 w5Var) {
        this.b = mVar;
        this.a = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
        if (ta.a()) {
            this.a.f().r(this);
            return;
        }
        boolean zC = this.b.c();
        m.e(this.b, 0L);
        if (zC) {
            this.b.a();
        }
    }
}
