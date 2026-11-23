package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class ga implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 a;
    final /* synthetic */ AppMeasurementDynamiteService b;

    ga(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.b = appMeasurementDynamiteService;
        this.a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.G().V(this.a, this.b.a.j());
    }
}
