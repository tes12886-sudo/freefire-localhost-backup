package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
final class y0 {
    private final Context a;
    private final x0 b;

    /* JADX WARN: Multi-variable type inference failed */
    y0(Context context, l0 l0Var) {
        this.a = context;
        this.b = new x0(this, null, 0 == true ? 1 : 0);
    }

    y0(Context context, m mVar, t0 t0Var) {
        this.a = context;
        this.b = new x0(this, mVar, t0Var, null);
    }

    final l0 b() {
        x0.a(this.b);
        return null;
    }

    final m c() {
        return this.b.a;
    }

    final void d() {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.b.c(this.a, intentFilter);
    }
}
