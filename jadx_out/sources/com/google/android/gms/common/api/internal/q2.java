package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class q2 implements com.google.android.gms.common.api.e.c {
    public final int a;
    public final com.google.android.gms.common.api.e b;
    public final com.google.android.gms.common.api.e.c c;
    final /* synthetic */ r2 d;

    public q2(r2 r2Var, int i2, com.google.android.gms.common.api.e eVar, com.google.android.gms.common.api.e.c cVar) {
        this.d = r2Var;
        this.a = i2;
        this.b = eVar;
        this.c = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final void m(ConnectionResult connectionResult) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(String.valueOf(connectionResult))));
        this.d.s(connectionResult, this.a);
    }
}
