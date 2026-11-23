package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class g3 implements p1 {
    final /* synthetic */ t a;

    /* synthetic */ g3(t tVar, f3 f3Var) {
        this.a = tVar;
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void a(Bundle bundle) {
        this.a.f989m.lock();
        try {
            this.a.f987k = ConnectionResult.e;
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
            if (tVar.f988l) {
                tVar.f988l = false;
                t.w(this.a, i2, z);
            } else {
                tVar.f988l = true;
                this.a.d.j(i2);
            }
        } finally {
            this.a.f989m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void c(ConnectionResult connectionResult) {
        this.a.f989m.lock();
        try {
            this.a.f987k = connectionResult;
            t.y(this.a);
        } finally {
            this.a.f989m.unlock();
        }
    }
}
