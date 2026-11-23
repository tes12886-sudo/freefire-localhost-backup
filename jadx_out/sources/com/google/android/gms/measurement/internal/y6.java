package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class y6 implements Runnable {
    final /* synthetic */ g a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ d7 f;

    y6(d7 d7Var, g gVar, long j2, int i2, long j3, boolean z) {
        this.f = d7Var;
        this.a = gVar;
        this.b = j2;
        this.c = i2;
        this.d = j3;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.W(this.a);
        this.f.t(this.b, false);
        d7.J(this.f, this.a, this.c, this.d, true, this.e);
    }
}
