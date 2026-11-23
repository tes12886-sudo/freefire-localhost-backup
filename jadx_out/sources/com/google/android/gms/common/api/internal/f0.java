package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class f0 extends z0 {
    final /* synthetic */ ConnectionResult b;
    final /* synthetic */ h0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0(h0 h0Var, y0 y0Var, ConnectionResult connectionResult) {
        super(y0Var);
        this.c = h0Var;
        this.b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.z0
    @GuardedBy("mLock")
    public final void a() {
        this.c.c.k(this.b);
    }
}
