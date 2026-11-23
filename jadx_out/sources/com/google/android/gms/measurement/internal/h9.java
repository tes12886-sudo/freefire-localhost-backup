package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class h9 implements Runnable {
    final /* synthetic */ ha a;
    final /* synthetic */ AppMeasurementDynamiteService b;

    h9(AppMeasurementDynamiteService appMeasurementDynamiteService, ha haVar) {
        this.b = appMeasurementDynamiteService;
        this.a = haVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.F().v(this.a);
    }
}
