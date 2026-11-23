package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class a7 implements Runnable {
    final /* synthetic */ g a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ d7 e;

    a7(d7 d7Var, g gVar, int i2, long j2, boolean z) {
        this.e = d7Var;
        this.a = gVar;
        this.b = i2;
        this.c = j2;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.W(this.a);
        d7.J(this.e, this.a, this.b, this.c, false, this.d);
    }
}
