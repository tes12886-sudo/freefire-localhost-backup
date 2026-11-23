package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class u2 extends s2 {
    final /* synthetic */ Bundle e;
    final /* synthetic */ Activity f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ c3 f1146g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u2(c3 c3Var, Bundle bundle, Activity activity) {
        super(c3Var.a, true);
        this.f1146g = c3Var;
        this.e = bundle;
        this.f = activity;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        Bundle bundle;
        if (this.e != null) {
            bundle = new Bundle();
            if (this.e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        f1 f1Var = this.f1146g.a.f1159h;
        com.google.android.gms.common.internal.q.k(f1Var);
        f1Var.onActivityCreated(j.d.a.c.e.b.c1(this.f), bundle, this.b);
    }
}
