package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class o6 implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ d7 b;

    o6(d7 d7Var, Bundle bundle) {
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
        com.google.android.gms.common.internal.q.g(bundle.getString("name"));
        if (!d7Var.a.k()) {
            d7Var.a.d().w().a("Conditional property not cleared since app measurement is disabled");
        } else {
            try {
                d7Var.a.R().M(new b(bundle.getString("app_id"), bundle.getString("origin"), d7Var.a.z().w(null, f3.x0) ? new y9(bundle.getString("name"), 0L, null, "") : new y9(bundle.getString("name"), 0L, null, null), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), d7Var.a.G().J(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"), true, false)));
            } catch (IllegalArgumentException unused) {
            }
        }
    }
}
