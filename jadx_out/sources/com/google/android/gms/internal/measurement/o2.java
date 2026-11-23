package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class o2 extends s2 {
    final /* synthetic */ Bundle e;
    final /* synthetic */ zzee f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o2(zzee zzeeVar, Bundle bundle) {
        super(zzeeVar, true);
        this.f = zzeeVar;
        this.e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        f1 f1Var = this.f.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.setDefaultEventParameters(this.e);
    }
}
