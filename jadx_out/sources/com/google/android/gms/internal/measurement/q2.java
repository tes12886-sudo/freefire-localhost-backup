package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class q2 extends s2 {
    final /* synthetic */ Long e;
    final /* synthetic */ String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f1104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ Bundle f1105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f1106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f1107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ zzee f1108k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q2(zzee zzeeVar, Long l2, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzeeVar, true);
        this.f1108k = zzeeVar;
        this.e = l2;
        this.f = str;
        this.f1104g = str2;
        this.f1105h = bundle;
        this.f1106i = z;
        this.f1107j = z2;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        Long l2 = this.e;
        long jLongValue = l2 == null ? this.a : l2.longValue();
        f1 f1Var = this.f1108k.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.logEvent(this.f, this.f1104g, this.f1105h, this.f1106i, this.f1107j, jLongValue);
    }
}
