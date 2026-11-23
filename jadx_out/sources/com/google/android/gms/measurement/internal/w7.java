package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class w7 implements Runnable {
    final /* synthetic */ ja a;
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 b;
    final /* synthetic */ r8 c;

    w7(r8 r8Var, ja jaVar, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.c = r8Var;
        this.a = jaVar;
        this.b = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strQ = null;
        try {
            try {
                if (this.c.a.A().t().h()) {
                    i3 i3Var = this.c.d;
                    if (i3Var == null) {
                        this.c.a.d().o().a("Failed to get app instance id");
                    } else {
                        com.google.android.gms.common.internal.q.k(this.a);
                        strQ = i3Var.Q(this.a);
                        if (strQ != null) {
                            this.c.a.F().r(strQ);
                            this.c.a.A().f1210g.b(strQ);
                        }
                        this.c.D();
                    }
                } else {
                    this.c.a.d().t().a("Analytics storage consent denied; will not get app instance id");
                    this.c.a.F().r(null);
                    this.c.a.A().f1210g.b(null);
                }
            } catch (RemoteException e) {
                this.c.a.d().o().b("Failed to get app instance id", e);
            }
        } finally {
            this.c.a.G().R(this.b, null);
        }
    }
}
