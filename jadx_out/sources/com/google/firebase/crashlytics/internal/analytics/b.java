package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class b implements a, AnalyticsEventLogger {
    private final d a;
    private final int b;
    private final TimeUnit c;
    private final Object d = new Object();
    private CountDownLatch e;

    public b(d dVar, int i2, TimeUnit timeUnit) {
        this.a = dVar;
        this.b = i2;
        this.c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void a(String str, Bundle bundle) {
        synchronized (this.d) {
            com.google.firebase.crashlytics.internal.a.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.e = new CountDownLatch(1);
            this.a.a(str, bundle);
            com.google.firebase.crashlytics.internal.a.f().i("Awaiting app exception callback from Analytics...");
            try {
                if (this.e.await(this.b, this.c)) {
                    com.google.firebase.crashlytics.internal.a.f().i("App exception callback received from Analytics listener.");
                } else {
                    com.google.firebase.crashlytics.internal.a.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                com.google.firebase.crashlytics.internal.a.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.e = null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void n(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
