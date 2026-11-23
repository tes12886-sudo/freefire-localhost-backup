package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.se;

/* JADX INFO: loaded from: classes.dex */
final class m5 implements Runnable {
    final /* synthetic */ t a;
    final /* synthetic */ ja b;
    final /* synthetic */ t5 c;

    m5(t5 t5Var, t tVar, ja jaVar) {
        this.c = t5Var;
        this.a = tVar;
        this.b = jaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVarP1 = this.c.p1(this.a, this.b);
        se.a();
        if (this.c.a.S().w(null, f3.B0)) {
            this.c.c1(tVarP1, this.b);
        } else {
            this.c.u1(tVarP1, this.b);
        }
    }
}
