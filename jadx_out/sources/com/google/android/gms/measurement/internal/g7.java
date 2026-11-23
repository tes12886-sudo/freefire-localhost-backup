package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class g7 implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 a;
    final /* synthetic */ t b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMeasurementDynamiteService d;

    g7(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var, t tVar, String str) {
        this.d = appMeasurementDynamiteService;
        this.a = i1Var;
        this.b = tVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.R().u(this.a, this.b, this.c);
    }
}
