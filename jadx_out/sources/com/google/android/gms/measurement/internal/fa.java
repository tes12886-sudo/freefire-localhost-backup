package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class fa implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMeasurementDynamiteService d;

    fa(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var, String str, String str2) {
        this.d = appMeasurementDynamiteService;
        this.a = i1Var;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.R().O(this.a, this.b, this.c);
    }
}
