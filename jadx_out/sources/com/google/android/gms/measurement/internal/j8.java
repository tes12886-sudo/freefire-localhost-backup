package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class j8 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ ja c;
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 d;
    final /* synthetic */ r8 e;

    j8(r8 r8Var, String str, String str2, ja jaVar, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.e = r8Var;
        this.a = str;
        this.b = str2;
        this.c = jaVar;
        this.d = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                i3 i3Var = this.e.d;
                if (i3Var == null) {
                    this.e.a.d().o().c("Failed to get conditional properties; not connected to service", this.a, this.b);
                } else {
                    com.google.android.gms.common.internal.q.k(this.c);
                    arrayList = ca.Y(i3Var.q(this.a, this.b, this.c));
                    this.e.D();
                }
            } catch (RemoteException e) {
                this.e.a.d().o().d("Failed to get conditional properties; remote exception", this.a, this.b, e);
            }
        } finally {
            this.e.a.G().X(this.d, arrayList);
        }
    }
}
