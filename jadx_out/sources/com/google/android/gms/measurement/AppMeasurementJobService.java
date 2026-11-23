package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.w8;
import com.google.android.gms.measurement.internal.x8;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements w8 {
    private x8<AppMeasurementJobService> a;

    private final x8<AppMeasurementJobService> d() {
        if (this.a == null) {
            this.a = new x8<>(this);
        }
        return this.a;
    }

    @Override // com.google.android.gms.measurement.internal.w8
    public final boolean a(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.w8
    public final void b(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.w8
    @TargetApi(24)
    public final void c(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
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

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        d().g(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d().f(intent);
        return true;
    }
}
