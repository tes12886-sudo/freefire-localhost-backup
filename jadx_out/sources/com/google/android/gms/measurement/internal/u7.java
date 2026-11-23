package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class u7 implements Runnable {
    final /* synthetic */ ja a;
    final /* synthetic */ r8 b;

    u7(r8 r8Var, ja jaVar) {
        this.b = r8Var;
        this.a = jaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i3 i3Var = this.b.d;
        if (i3Var == null) {
            this.b.a.d().o().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            com.google.android.gms.common.internal.q.k(this.a);
            i3Var.X0(this.a);
        } catch (RemoteException e) {
            this.b.a.d().o().b("Failed to reset data on the service: remote exception", e);
        }
        this.b.D();
    }
}
