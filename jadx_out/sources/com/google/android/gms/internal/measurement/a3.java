package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
final class a3 extends s2 {
    final /* synthetic */ Activity e;
    final /* synthetic */ b1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ c3 f1048g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a3(c3 c3Var, Activity activity, b1 b1Var) {
        super(c3Var.a, true);
        this.f1048g = c3Var;
        this.e = activity;
        this.f = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var = this.f1048g.a.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.onActivitySaveInstanceState(j.d.a.c.e.b.c1(this.e), this.f, this.b);
    }
}
