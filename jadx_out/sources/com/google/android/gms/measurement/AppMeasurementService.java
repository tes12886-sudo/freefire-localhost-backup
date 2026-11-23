package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.w8;
import com.google.android.gms.measurement.internal.x8;
import h.o.a.a;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements w8 {
    private x8<AppMeasurementService> a;

    private final x8<AppMeasurementService> d() {
        if (this.a == null) {
            this.a = new x8<>(this);
        }
        return this.a;
    }

    @Override // com.google.android.gms.measurement.internal.w8
    public final boolean a(int i2) {
        return stopSelfResult(i2);
    }

    @Override // com.google.android.gms.measurement.internal.w8
    public final void b(Intent intent) {
        a.b(intent);
    }

    @Override // com.google.android.gms.measurement.internal.w8
    public final void c(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return d().e(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        d().a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        d().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        d().h(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        d().c(intent, i2, i3);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d().f(intent);
        return true;
    }
}
