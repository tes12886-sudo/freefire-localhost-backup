package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class g9 extends f4 {
    private Handler c;
    protected final f9 d;
    protected final e9 e;
    protected final c9 f;

    g9(a5 a5Var) {
        super(a5Var);
        this.d = new f9(this);
        this.e = new e9(this);
        this.f = new c9(this);
    }

    static /* synthetic */ void o(g9 g9Var, long j2) {
        g9Var.h();
        g9Var.s();
        g9Var.a.d().w().b("Activity resumed, time", Long.valueOf(j2));
        f fVarZ = g9Var.a.z();
        d3<Boolean> d3Var = f3.s0;
        if (fVarZ.w(null, d3Var)) {
            if (g9Var.a.z().C() || g9Var.a.A().q.a()) {
                g9Var.e.a(j2);
            }
            g9Var.f.a();
        } else {
            g9Var.f.a();
            if (g9Var.a.z().C()) {
                g9Var.e.a(j2);
            }
        }
        f9 f9Var = g9Var.d;
        f9Var.a.h();
        if (f9Var.a.a.k()) {
            if (!f9Var.a.a.z().w(null, d3Var)) {
                f9Var.a.a.A().q.b(false);
            }
            f9Var.b(f9Var.a.a.e().a(), false);
        }
    }

    static /* synthetic */ void p(g9 g9Var, long j2) {
        g9Var.h();
        g9Var.s();
        g9Var.a.d().w().b("Activity paused, time", Long.valueOf(j2));
        g9Var.f.b(j2);
        if (g9Var.a.z().C()) {
            g9Var.e.b(j2);
        }
        f9 f9Var = g9Var.d;
        if (f9Var.a.a.z().w(null, f3.s0)) {
            return;
        }
        f9Var.a.a.A().q.b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        h();
        if (this.c == null) {
            this.c = new com.google.android.gms.internal.measurement.a1(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.f4
    protected final boolean m() {
        return false;
    }
}
