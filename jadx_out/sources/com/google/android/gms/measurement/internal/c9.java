package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class c9 {
    private b9 a;
    final /* synthetic */ g9 b;

    c9(g9 g9Var) {
        this.b = g9Var;
    }

    final void a() {
        this.b.h();
        if (this.a != null) {
            this.b.c.removeCallbacks(this.a);
        }
        if (this.b.a.z().w(null, f3.s0)) {
            this.b.a.A().q.b(false);
        }
    }

    final void b(long j2) {
        this.a = new b9(this, this.b.a.e().a(), j2);
        this.b.c.postDelayed(this.a, 2000L);
    }
}
