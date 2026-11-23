package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class ia implements c6 {
    public final com.google.android.gms.internal.measurement.l1 a;
    final /* synthetic */ AppMeasurementDynamiteService b;

    ia(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.l1 l1Var) {
        this.b = appMeasurementDynamiteService;
        this.a = l1Var;
    }

    @Override // com.google.android.gms.measurement.internal.c6
    public final void a(String str, String str2, Bundle bundle, long j2) {
        try {
            this.a.Z(str, str2, bundle, j2);
        } catch (RemoteException e) {
            a5 a5Var = this.b.a;
            if (a5Var != null) {
                a5Var.d().r().b("Event listener threw exception", e);
            }
        }
    }
}
