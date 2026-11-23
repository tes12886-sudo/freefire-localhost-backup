package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends w0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ c f1023g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(c cVar, int i2, Bundle bundle) {
        super(cVar, i2, null);
        this.f1023g = cVar;
    }

    @Override // com.google.android.gms.common.internal.w0
    protected final void f(ConnectionResult connectionResult) {
        if (this.f1023g.y() && c.m0(this.f1023g)) {
            c.i0(this.f1023g, 16);
        } else {
            this.f1023g.f1009o.a(connectionResult);
            this.f1023g.Q(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.internal.w0
    protected final boolean g() {
        this.f1023g.f1009o.a(ConnectionResult.e);
        return true;
    }
}
