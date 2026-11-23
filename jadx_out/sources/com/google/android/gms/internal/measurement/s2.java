package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
abstract class s2 implements Runnable {
    final long a;
    final long b;
    final boolean c;
    final /* synthetic */ zzee d;

    s2(zzee zzeeVar, boolean z) {
        this.d = zzeeVar;
        this.a = zzeeVar.b.a();
        this.b = zzeeVar.b.c();
        this.c = z;
    }

    abstract void a();

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.f1158g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            this.d.q(e, false, this.c);
            b();
        }
    }
}
