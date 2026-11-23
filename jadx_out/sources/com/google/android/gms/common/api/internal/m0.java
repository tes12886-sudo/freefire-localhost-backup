package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class m0 implements com.google.android.gms.common.api.e.b, com.google.android.gms.common.api.e.c {
    final /* synthetic */ p0 a;

    /* synthetic */ m0(p0 p0Var, l0 l0Var) {
        this.a = p0Var;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void j(int i2) {
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final void m(ConnectionResult connectionResult) {
        this.a.b.lock();
        try {
            if (this.a.p(connectionResult)) {
                this.a.h();
                this.a.m();
            } else {
                this.a.k(connectionResult);
            }
        } finally {
            this.a.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void o(Bundle bundle) {
        com.google.android.gms.common.internal.q.k(this.a.r);
        j.d.a.c.g.g gVar = this.a.f978k;
        com.google.android.gms.common.internal.q.k(gVar);
        gVar.j(new k0(this.a));
    }
}
