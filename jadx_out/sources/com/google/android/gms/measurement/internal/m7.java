package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class m7 implements Runnable {
    final /* synthetic */ k7 a;
    final /* synthetic */ k7 b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ r7 e;

    m7(r7 r7Var, k7 k7Var, k7 k7Var2, long j2, boolean z) {
        this.e = r7Var;
        this.a = k7Var;
        this.b = k7Var2;
        this.c = j2;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.p(this.a, this.b, this.c, this.d, null);
    }
}
