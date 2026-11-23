package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class m1 implements Runnable {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ n1 b;

    m1(n1 n1Var, ConnectionResult connectionResult) {
        this.b = n1Var;
        this.a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n1 n1Var = this.b;
        j1 j1Var = (j1) n1Var.f.f958l.get(n1Var.b);
        if (j1Var == null) {
            return;
        }
        if (!this.a.n()) {
            j1Var.H(this.a, null);
            return;
        }
        this.b.e = true;
        if (this.b.a.u()) {
            this.b.h();
            return;
        }
        try {
            n1 n1Var2 = this.b;
            n1Var2.a.f(null, n1Var2.a.e());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            this.b.a.h("Failed to get service from broker.");
            j1Var.H(new ConnectionResult(10), null);
        }
    }
}
