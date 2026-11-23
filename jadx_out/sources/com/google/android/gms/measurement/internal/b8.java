package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class b8 implements Runnable {
    final /* synthetic */ t a;
    final /* synthetic */ String b;
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 c;
    final /* synthetic */ r8 d;

    b8(r8 r8Var, t tVar, String str, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.d = r8Var;
        this.a = tVar;
        this.b = str;
        this.c = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrM1 = null;
        try {
            try {
                i3 i3Var = this.d.d;
                if (i3Var == null) {
                    this.d.a.d().o().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArrM1 = i3Var.m1(this.a, this.b);
                    this.d.D();
                }
            } catch (RemoteException e) {
                this.d.a.d().o().b("Failed to send event to the service to bundle", e);
            }
        } finally {
            this.d.a.G().U(this.c, bArrM1);
        }
    }
}
