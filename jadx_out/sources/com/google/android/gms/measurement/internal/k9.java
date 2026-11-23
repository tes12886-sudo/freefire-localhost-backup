package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes.dex */
public final class k9 extends m9 {
    private final AlarmManager d;
    private m e;
    private Integer f;

    protected k9(v9 v9Var) {
        super(v9Var);
        this.d = (AlarmManager) this.a.c().getSystemService("alarm");
    }

    private final m o() {
        if (this.e == null) {
            this.e = new j9(this, this.b.s());
        }
        return this.e;
    }

    @TargetApi(24)
    private final void p() {
        JobScheduler jobScheduler = (JobScheduler) this.a.c().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(q());
        }
    }

    private final int q() {
        if (this.f == null) {
            String strValueOf = String.valueOf(this.a.c().getPackageName());
            this.f = Integer.valueOf((strValueOf.length() != 0 ? "measurement".concat(strValueOf) : new String("measurement")).hashCode());
        }
        return this.f.intValue();
    }

    private final PendingIntent r() {
        Context contextC = this.a.c();
        return com.google.android.gms.internal.measurement.u0.a(contextC, 0, new Intent().setClassName(contextC, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.u0.a);
    }

    @Override // com.google.android.gms.measurement.internal.m9
    protected final boolean k() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        p();
        return false;
    }

    public final void m(long j2) {
        j();
        this.a.a();
        Context contextC = this.a.c();
        if (!ca.a0(contextC)) {
            this.a.d().v().a("Receiver not registered/enabled");
        }
        if (!ca.D(contextC, false)) {
            this.a.d().v().a("Service not registered/enabled");
        }
        n();
        this.a.d().w().b("Scheduling upload, millis", Long.valueOf(j2));
        long jC = this.a.e().c() + j2;
        this.a.z();
        if (j2 < Math.max(0L, f3.x.b(null).longValue()) && !o().c()) {
            o().b(j2);
        }
        this.a.a();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.d;
            if (alarmManager != null) {
                this.a.z();
                alarmManager.setInexactRepeating(2, jC, Math.max(f3.s.b(null).longValue(), j2), r());
                return;
            }
            return;
        }
        Context contextC2 = this.a.c();
        ComponentName componentName = new ComponentName(contextC2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iQ = q();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.v0.a(contextC2, new JobInfo.Builder(iQ, componentName).setMinimumLatency(j2).setOverrideDeadline(j2 + j2).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void n() {
        j();
        this.a.d().w().a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        o().d();
        if (Build.VERSION.SDK_INT >= 24) {
            p();
        }
    }
}
