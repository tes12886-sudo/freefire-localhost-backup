package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class g0 extends z0 {
    final /* synthetic */ com.google.android.gms.common.internal.c.InterfaceC0123c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g0(h0 h0Var, y0 y0Var, com.google.android.gms.common.internal.c.InterfaceC0123c interfaceC0123c) {
        super(y0Var);
        this.b = interfaceC0123c;
    }

    @Override // com.google.android.gms.common.api.internal.z0
    @GuardedBy("mLock")
    public final void a() {
        this.b.a(new ConnectionResult(16, null));
    }
}
