package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
final class v2 extends s2 {
    final /* synthetic */ Activity e;
    final /* synthetic */ c3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v2(c3 c3Var, Activity activity) {
        super(c3Var.a, true);
        this.f = c3Var;
        this.e = activity;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var = this.f.a.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.onActivityStarted(j.d.a.c.e.b.c1(this.e), this.b);
    }
}
