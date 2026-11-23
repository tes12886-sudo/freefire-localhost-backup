package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class b2 implements Runnable {
    final /* synthetic */ j.d.a.c.g.b.l a;
    final /* synthetic */ d2 b;

    b2(d2 d2Var, j.d.a.c.g.b.l lVar) {
        this.b = d2Var;
        this.a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d2.r1(this.b, this.a);
    }
}
