package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class n1 implements com.google.android.gms.common.internal.c.InterfaceC0123c, c2 {
    private final com.google.android.gms.common.api.a.f a;
    private final b b;
    private com.google.android.gms.common.internal.j c = null;
    private Set d = null;
    private boolean e = false;
    final /* synthetic */ g f;

    public n1(g gVar, com.google.android.gms.common.api.a.f fVar, b bVar) {
        this.f = gVar;
        this.a = fVar;
        this.b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        com.google.android.gms.common.internal.j jVar;
        if (!this.e || (jVar = this.c) == null) {
            return;
        }
        this.a.f(jVar, this.d);
    }

    @Override // com.google.android.gms.common.internal.c.InterfaceC0123c
    public final void a(ConnectionResult connectionResult) {
        this.f.p.post(new m1(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.c2
    public final void b(com.google.android.gms.common.internal.j jVar, Set set) {
        if (jVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new ConnectionResult(4));
        } else {
            this.c = jVar;
            this.d = set;
            h();
        }
    }

    @Override // com.google.android.gms.common.api.internal.c2
    public final void c(ConnectionResult connectionResult) {
        j1 j1Var = (j1) this.f.f958l.get(this.b);
        if (j1Var != null) {
            j1Var.I(connectionResult);
        }
    }
}
