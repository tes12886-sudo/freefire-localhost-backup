package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
final class v2 implements Runnable {
    private final t2 a;
    final /* synthetic */ w2 b;

    v2(w2 w2Var, t2 t2Var) {
        this.b = w2Var;
        this.a = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.b) {
            ConnectionResult connectionResultB = this.a.b();
            if (connectionResultB.l()) {
                w2 w2Var = this.b;
                LifecycleFragment lifecycleFragment = w2Var.a;
                Activity activityB = w2Var.b();
                PendingIntent pendingIntentJ = connectionResultB.j();
                com.google.android.gms.common.internal.q.k(pendingIntentJ);
                lifecycleFragment.startActivityForResult(GoogleApiActivity.a(activityB, pendingIntentJ, this.a.a(), false), 1);
                return;
            }
            w2 w2Var2 = this.b;
            if (w2Var2.e.getErrorResolutionIntent(w2Var2.b(), connectionResultB.f(), null) != null) {
                w2 w2Var3 = this.b;
                w2Var3.e.zag(w2Var3.b(), this.b.a, connectionResultB.f(), 2, this.b);
            } else {
                if (connectionResultB.f() != 18) {
                    this.b.l(connectionResultB, this.a.a());
                    return;
                }
                w2 w2Var4 = this.b;
                Dialog dialogZab = w2Var4.e.zab(w2Var4.b(), this.b);
                w2 w2Var5 = this.b;
                w2Var5.e.zac(w2Var5.b().getApplicationContext(), new u2(this, dialogZab));
            }
        }
    }
}
