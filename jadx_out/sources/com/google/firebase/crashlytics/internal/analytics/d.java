package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class d implements AnalyticsEventLogger {
    private final com.google.firebase.analytics.a.a a;

    public d(com.google.firebase.analytics.a.a aVar) {
        this.a = aVar;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void a(String str, Bundle bundle) {
        this.a.c("clx", str, bundle);
    }
}
