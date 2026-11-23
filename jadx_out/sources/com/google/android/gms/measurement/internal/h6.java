package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class h6 implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 a;
    final /* synthetic */ AppMeasurementDynamiteService b;

    h6(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.b = appMeasurementDynamiteService;
        this.a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.R().U(this.a);
    }
}
