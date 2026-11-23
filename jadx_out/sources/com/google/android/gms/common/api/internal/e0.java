package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class e0 implements com.google.android.gms.common.internal.c.InterfaceC0123c {
    private final WeakReference a;
    private final com.google.android.gms.common.api.a b;
    private final boolean c;

    public e0(p0 p0Var, com.google.android.gms.common.api.a aVar, boolean z) {
        this.a = new WeakReference(p0Var);
        this.b = aVar;
        this.c = z;
    }

    @Override // com.google.android.gms.common.internal.c.InterfaceC0123c
    public final void a(ConnectionResult connectionResult) {
        p0 p0Var = (p0) this.a.get();
        if (p0Var == null) {
            return;
        }
        com.google.android.gms.common.internal.q.o(Looper.myLooper() == p0Var.a.f949n.l(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        p0Var.b.lock();
        try {
            if (p0Var.n(0)) {
                if (!connectionResult.n()) {
                    p0Var.l(connectionResult, this.b, this.c);
                }
                if (p0Var.o()) {
                    p0Var.m();
                }
            }
        } finally {
            p0Var.b.unlock();
        }
    }
}
