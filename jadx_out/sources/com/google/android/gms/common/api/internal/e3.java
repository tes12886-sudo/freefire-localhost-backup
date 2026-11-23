package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class e3 implements p1 {
    final /* synthetic */ t a;

    /* synthetic */ e3(t tVar, d3 d3Var) {
        this.a = tVar;
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void a(Bundle bundle) {
        this.a.f989m.lock();
        try {
            t.x(this.a, bundle);
            this.a.f986j = ConnectionResult.e;
            t.y(this.a);
        } finally {
            this.a.f989m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void b(int i2, boolean z) {
        this.a.f989m.lock();
        try {
            t tVar = this.a;
            if (tVar.f988l || tVar.f987k == null || !tVar.f987k.n()) {
                this.a.f988l = false;
                t.w(this.a, i2, z);
            } else {
                this.a.f988l = true;
                this.a.e.j(i2);
            }
        } finally {
            this.a.f989m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void c(ConnectionResult connectionResult) {
        this.a.f989m.lock();
        try {
            this.a.f986j = connectionResult;
            t.y(this.a);
        } finally {
            this.a.f989m.unlock();
        }
    }
}
