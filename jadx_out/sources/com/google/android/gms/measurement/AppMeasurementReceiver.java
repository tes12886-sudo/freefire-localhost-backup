package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.l4;
import com.google.android.gms.measurement.internal.m4;
import h.o.a.a;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends a implements l4 {
    private m4 c;

    @Override // com.google.android.gms.measurement.internal.l4
    public void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new m4(this);
        }
        this.c.a(context, intent);
    }
}
