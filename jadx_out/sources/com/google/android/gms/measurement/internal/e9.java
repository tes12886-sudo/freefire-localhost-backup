package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.kd;

/* JADX INFO: loaded from: classes.dex */
final class e9 {
    protected long a;
    protected long b;
    private final m c;
    final /* synthetic */ g9 d;

    public e9(g9 g9Var) {
        this.d = g9Var;
        this.c = new d9(this, g9Var.a);
        long jC = g9Var.a.e().c();
        this.a = jC;
        this.b = jC;
    }

    final void a(long j2) {
        this.d.h();
        this.c.d();
        this.a = j2;
        this.b = j2;
    }

    final void b(long j2) {
        this.c.d();
    }

    final void c() {
        this.c.d();
        this.a = 0L;
        this.b = 0L;
    }

    public final boolean d(boolean z, boolean z2, long j2) {
        this.d.h();
        this.d.j();
        kd.a();
        if (!this.d.a.z().w(null, f3.o0) || this.d.a.k()) {
            this.d.a.A().f1218o.b(this.d.a.e().a());
        }
        long j3 = j2 - this.a;
        if (!z && j3 < 1000) {
            this.d.a.d().w().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j3));
            return false;
        }
        if (!z2) {
            j3 = j2 - this.b;
            this.b = j2;
        }
        this.d.a.d().w().b("Recording user engagement, ms", Long.valueOf(j3));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j3);
        r7.x(this.d.a.Q().s(!this.d.a.z().C()), bundle, true);
        f fVarZ = this.d.a.z();
        d3<Boolean> d3Var = f3.U;
        if (!fVarZ.w(null, d3Var) && z2) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.d.a.z().w(null, d3Var) || !z2) {
            this.d.a.F().X("auto", "_e", bundle);
        }
        this.a = j2;
        this.c.d();
        this.c.b(3600000L);
        return true;
    }
}
