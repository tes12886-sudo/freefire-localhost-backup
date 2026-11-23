package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class y7 implements Runnable {
    final /* synthetic */ k7 a;
    final /* synthetic */ r8 b;

    y7(r8 r8Var, k7 k7Var) {
        this.b = r8Var;
        this.a = k7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j2;
        String str;
        String str2;
        String packageName;
        i3 i3Var = this.b.d;
        if (i3Var == null) {
            this.b.a.d().o().a("Failed to send current screen to service");
            return;
        }
        try {
            k7 k7Var = this.a;
            if (k7Var == null) {
                j2 = 0;
                str = null;
                str2 = null;
                packageName = this.b.a.c().getPackageName();
            } else {
                j2 = k7Var.c;
                str = k7Var.a;
                str2 = k7Var.b;
                packageName = this.b.a.c().getPackageName();
            }
            i3Var.v0(j2, str, str2, packageName);
            this.b.D();
        } catch (RemoteException e) {
            this.b.a.d().o().b("Failed to send current screen to the service", e);
        }
    }
}
