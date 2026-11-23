package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class g6 implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ d7 b;

    g6(d7 d7Var, boolean z) {
        this.b = d7Var;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zK = this.b.a.k();
        boolean zJ = this.b.a.j();
        this.b.a.i(this.a);
        if (zJ == this.a) {
            this.b.a.d().w().b("Default data collection state already set to", Boolean.valueOf(this.a));
        }
        if (this.b.a.k() == zK || this.b.a.k() != this.b.a.j()) {
            this.b.a.d().t().c("Default data collection is different than actual status", Boolean.valueOf(this.a), Boolean.valueOf(zK));
        }
        this.b.M();
    }
}
