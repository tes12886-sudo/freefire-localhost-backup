package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class z7 implements Runnable {
    final /* synthetic */ ja a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ r8 c;

    z7(r8 r8Var, ja jaVar, Bundle bundle) {
        this.c = r8Var;
        this.a = jaVar;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i3 i3Var = this.c.d;
        if (i3Var == null) {
            this.c.a.d().o().a("Failed to send default event parameters to service");
            return;
        }
        try {
            com.google.android.gms.common.internal.q.k(this.a);
            i3Var.f1(this.b, this.a);
        } catch (RemoteException e) {
            this.c.a.d().o().b("Failed to send default event parameters to service", e);
        }
    }
}
