package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.w8;

/* JADX INFO: loaded from: classes.dex */
public final class x8<T extends Context & w8> {
    private final T a;

    public x8(T t) {
        com.google.android.gms.common.internal.q.k(t);
        this.a = t;
    }

    private final r3 k() {
        return a5.h(this.a, null, null).d();
    }

    public final void a() {
        a5 a5VarH = a5.h(this.a, null, null);
        r3 r3VarD = a5VarH.d();
        a5VarH.a();
        r3VarD.w().a("Local AppMeasurementService is starting up");
    }

    public final void b() {
        a5 a5VarH = a5.h(this.a, null, null);
        r3 r3VarD = a5VarH.d();
        a5VarH.a();
        r3VarD.w().a("Local AppMeasurementService is shutting down");
    }

    public final int c(final Intent intent, int i2, final int i3) {
        a5 a5VarH = a5.h(this.a, null, null);
        final r3 r3VarD = a5VarH.d();
        if (intent == null) {
            r3VarD.r().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a5VarH.a();
        r3VarD.w().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i3), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            d(new Runnable(this, i3, r3VarD, intent) { // from class: com.google.android.gms.measurement.internal.t8
                private final x8 a;
                private final int b;
                private final r3 c;
                private final Intent d;

                {
                    this.a = this;
                    this.b = i3;
                    this.c = r3VarD;
                    this.d = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.j(this.b, this.c, this.d);
                }
            });
        }
        return 2;
    }

    public final void d(Runnable runnable) {
        v9 v9VarF = v9.F(this.a);
        v9VarF.f().r(new v8(this, v9VarF, runnable));
    }

    public final IBinder e(Intent intent) {
        if (intent == null) {
            k().o().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new t5(v9.F(this.a), null);
        }
        k().r().b("onBind received unknown action", action);
        return null;
    }

    public final boolean f(Intent intent) {
        if (intent == null) {
            k().o().a("onUnbind called with null intent");
            return true;
        }
        k().w().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @TargetApi(24)
    public final boolean g(final JobParameters jobParameters) {
        a5 a5VarH = a5.h(this.a, null, null);
        final r3 r3VarD = a5VarH.d();
        String string = jobParameters.getExtras().getString("action");
        a5VarH.a();
        r3VarD.w().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        d(new Runnable(this, r3VarD, jobParameters) { // from class: com.google.android.gms.measurement.internal.u8
            private final x8 a;
            private final r3 b;
            private final JobParameters c;

            {
                this.a = this;
                this.b = r3VarD;
                this.c = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.i(this.b, this.c);
            }
        });
        return true;
    }

    public final void h(Intent intent) {
        if (intent == null) {
            k().o().a("onRebind called with null intent");
        } else {
            k().w().b("onRebind called. action", intent.getAction());
        }
    }

    final /* synthetic */ void i(r3 r3Var, JobParameters jobParameters) {
        r3Var.w().a("AppMeasurementJobService processed last upload request.");
        this.a.c(jobParameters, false);
    }

    final /* synthetic */ void j(int i2, r3 r3Var, Intent intent) {
        if (this.a.a(i2)) {
            r3Var.w().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
            k().w().a("Completed wakeful intent.");
            this.a.b(intent);
        }
    }
}
