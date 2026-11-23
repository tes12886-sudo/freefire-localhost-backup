package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
final class u1 extends s2 {
    final /* synthetic */ Activity e;
    final /* synthetic */ String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f1144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ zzee f1145h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u1(zzee zzeeVar, Activity activity, String str, String str2) {
        super(zzeeVar, true);
        this.f1145h = zzeeVar;
        this.e = activity;
        this.f = str;
        this.f1144g = str2;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var = this.f1145h.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.setCurrentScreen(j.d.a.c.e.b.c1(this.e), this.f, this.f1144g, this.a);
    }
}
