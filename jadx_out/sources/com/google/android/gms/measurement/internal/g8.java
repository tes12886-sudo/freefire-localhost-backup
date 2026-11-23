package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class g8 implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ AppMeasurementDynamiteService e;

    g8(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var, String str, String str2, boolean z) {
        this.e = appMeasurementDynamiteService;
        this.a = i1Var;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a.R().Q(this.a, this.b, this.c, this.d);
    }
}
