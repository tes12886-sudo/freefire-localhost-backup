package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends x0 {
    private c a;
    private final int b;

    public h1(c cVar, int i2) {
        this.a = cVar;
        this.b = i2;
    }

    @Override // com.google.android.gms.common.internal.l
    public final void l1(int i2, IBinder iBinder, Bundle bundle) {
        q.l(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.S(i2, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // com.google.android.gms.common.internal.l
    public final void p0(int i2, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.l
    public final void v(int i2, IBinder iBinder, l1 l1Var) {
        c cVar = this.a;
        q.l(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        q.k(l1Var);
        c.h0(cVar, l1Var);
        l1(i2, iBinder, l1Var.a);
    }
}
