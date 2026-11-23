package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
abstract class w0 extends g1 {
    public final int d;
    public final Bundle e;
    final /* synthetic */ c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected w0(c cVar, int i2, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f = cVar;
        this.d = i2;
        this.e = bundle;
    }

    @Override // com.google.android.gms.common.internal.g1
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        ConnectionResult connectionResult;
        if (this.d != 0) {
            this.f.n0(1, null);
            Bundle bundle = this.e;
            connectionResult = new ConnectionResult(this.d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        } else {
            if (g()) {
                return;
            }
            this.f.n0(1, null);
            connectionResult = new ConnectionResult(8, null);
        }
        f(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.g1
    protected final void b() {
    }

    protected abstract void f(ConnectionResult connectionResult);

    protected abstract boolean g();
}
