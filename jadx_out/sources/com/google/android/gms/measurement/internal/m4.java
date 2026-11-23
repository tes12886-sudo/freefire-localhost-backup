package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class m4 {
    private final l4 a;

    public m4(l4 l4Var) {
        com.google.android.gms.common.internal.q.k(l4Var);
        this.a = l4Var;
    }

    public final void a(Context context, Intent intent) {
        a5 a5VarH = a5.h(context, null, null);
        r3 r3VarD = a5VarH.d();
        if (intent == null) {
            r3VarD.r().a("Receiver called with null intent");
            return;
        }
        a5VarH.a();
        String action = intent.getAction();
        r3VarD.w().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                r3VarD.r().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            r3VarD.w().a("Starting wakeful intent.");
            this.a.a(context, className);
        }
    }
}
