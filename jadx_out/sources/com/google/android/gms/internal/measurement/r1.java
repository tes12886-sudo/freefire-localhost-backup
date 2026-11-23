package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class r1 extends s2 {
    final /* synthetic */ String e;
    final /* synthetic */ String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Bundle f1116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ zzee f1117h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r1(zzee zzeeVar, String str, String str2, Bundle bundle) {
        super(zzeeVar, true);
        this.f1117h = zzeeVar;
        this.e = str;
        this.f = str2;
        this.f1116g = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var = this.f1117h.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.clearConditionalUserProperty(this.e, this.f, this.f1116g);
    }
}
