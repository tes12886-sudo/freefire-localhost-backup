package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class a3 implements com.google.android.gms.common.api.e.b, com.google.android.gms.common.api.e.c {
    public final com.google.android.gms.common.api.a a;
    private final boolean b;
    private b3 c;

    public a3(com.google.android.gms.common.api.a aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    private final b3 b() {
        com.google.android.gms.common.internal.q.l(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.c;
    }

    public final void a(b3 b3Var) {
        this.c = b3Var;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void j(int i2) {
        b().j(i2);
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final void m(ConnectionResult connectionResult) {
        b().c1(connectionResult, this.a, this.b);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void o(Bundle bundle) {
        b().o(bundle);
    }
}
