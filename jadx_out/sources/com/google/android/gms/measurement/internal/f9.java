package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.yc;

/* JADX INFO: loaded from: classes.dex */
final class f9 {
    final /* synthetic */ g9 a;

    f9(g9 g9Var) {
        this.a = g9Var;
    }

    final void a() {
        this.a.h();
        if (this.a.a.A().w(this.a.a.e().a())) {
            this.a.a.A().f1215l.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.a.d().w().a("Detected application was in foreground");
                c(this.a.a.e().a(), false);
            }
        }
    }

    final void b(long j2, boolean z) {
        this.a.h();
        this.a.s();
        if (this.a.a.A().w(j2)) {
            this.a.a.A().f1215l.b(true);
        }
        this.a.a.A().f1218o.b(j2);
        if (this.a.a.A().f1215l.a()) {
            c(j2, z);
        }
    }

    final void c(long j2, boolean z) {
        this.a.h();
        if (this.a.a.k()) {
            this.a.a.A().f1218o.b(j2);
            this.a.a.d().w().b("Session started, time", Long.valueOf(this.a.a.e().c()));
            Long lValueOf = Long.valueOf(j2 / 1000);
            this.a.a.F().p("auto", "_sid", lValueOf, j2);
            this.a.a.A().f1215l.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            if (this.a.a.z().w(null, f3.i0) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.a.a.F().Y("auto", "_s", j2, bundle);
            yc.a();
            if (this.a.a.z().w(null, f3.n0)) {
                String strA = this.a.a.A().t.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strA);
                this.a.a.F().Y("auto", "_ssr", j2, bundle2);
            }
        }
    }
}
