package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class o8 implements Runnable {
    final /* synthetic */ q8 a;

    o8(q8 q8Var) {
        this.a = q8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r8 r8Var = this.a.c;
        Context contextC = r8Var.a.c();
        this.a.c.a.a();
        r8.x(r8Var, new ComponentName(contextC, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
