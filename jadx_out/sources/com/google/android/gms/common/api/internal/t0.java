package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
final class t0 implements com.google.android.gms.common.api.e.c {
    final /* synthetic */ q a;

    t0(x0 x0Var, q qVar) {
        this.a = qVar;
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final void m(ConnectionResult connectionResult) {
        this.a.j(new Status(8));
    }
}
