package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
abstract class m {
    private static volatile Handler d;
    private final w5 a;
    private final Runnable b;
    private volatile long c;

    m(w5 w5Var) {
        com.google.android.gms.common.internal.q.k(w5Var);
        this.a = w5Var;
        this.b = new l(this, w5Var);
    }

    static /* synthetic */ long e(m mVar, long j2) {
        mVar.c = 0L;
        return 0L;
    }

    private final Handler f() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (m.class) {
            if (d == null) {
                d = new com.google.android.gms.internal.measurement.a1(this.a.c().getMainLooper());
            }
            handler = d;
        }
        return handler;
    }

    public abstract void a();

    public final void b(long j2) {
        d();
        if (j2 >= 0) {
            this.c = this.a.e().a();
            if (f().postDelayed(this.b, j2)) {
                return;
            }
            this.a.d().o().b("Failed to schedule delayed post. time", Long.valueOf(j2));
        }
    }

    public final boolean c() {
        return this.c != 0;
    }

    final void d() {
        this.c = 0L;
        f().removeCallbacks(this.b);
    }
}
