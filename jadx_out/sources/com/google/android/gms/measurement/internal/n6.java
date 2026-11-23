package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class n6 implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ d7 b;

    n6(d7 d7Var, Bundle bundle) {
        this.b = d7Var;
        this.a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d7 d7Var = this.b;
        Bundle bundle = this.a;
        d7Var.h();
        d7Var.j();
        com.google.android.gms.common.internal.q.k(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        com.google.android.gms.common.internal.q.g(string);
        com.google.android.gms.common.internal.q.g(string2);
        com.google.android.gms.common.internal.q.k(bundle.get("value"));
        if (!d7Var.a.k()) {
            d7Var.a.d().w().a("Conditional property not set since app measurement is disabled");
            return;
        }
        y9 y9Var = new y9(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            t tVarJ = d7Var.a.G().J(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, false);
            d7Var.a.R().M(new b(bundle.getString("app_id"), string2, y9Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), d7Var.a.G().J(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, false), bundle.getLong("trigger_timeout"), tVarJ, bundle.getLong("time_to_live"), d7Var.a.G().J(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
