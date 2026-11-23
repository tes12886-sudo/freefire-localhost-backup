package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class e implements AnalyticsEventLogger {
    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void a(String str, Bundle bundle) {
        com.google.firebase.crashlytics.internal.a.f().b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}
