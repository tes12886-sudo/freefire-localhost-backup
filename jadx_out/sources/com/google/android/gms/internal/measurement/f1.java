package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface f1 extends IInterface {
    void beginAdUnitExposure(String str, long j2);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j2);

    void endAdUnitExposure(String str, long j2);

    void generateEventId(i1 i1Var);

    void getAppInstanceId(i1 i1Var);

    void getCachedAppInstanceId(i1 i1Var);

    void getConditionalUserProperties(String str, String str2, i1 i1Var);

    void getCurrentScreenClass(i1 i1Var);

    void getCurrentScreenName(i1 i1Var);

    void getGmpAppId(i1 i1Var);

    void getMaxUserProperties(String str, i1 i1Var);

    void getTestFlag(i1 i1Var, int i2);

    void getUserProperties(String str, String str2, boolean z, i1 i1Var);

    void initForTests(Map map);

    void initialize(j.d.a.c.e.a aVar, o1 o1Var, long j2);

    void isDataCollectionEnabled(i1 i1Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2);

    void logEventAndBundle(String str, String str2, Bundle bundle, i1 i1Var, long j2);

    void logHealthData(int i2, String str, j.d.a.c.e.a aVar, j.d.a.c.e.a aVar2, j.d.a.c.e.a aVar3);

    void onActivityCreated(j.d.a.c.e.a aVar, Bundle bundle, long j2);

    void onActivityDestroyed(j.d.a.c.e.a aVar, long j2);

    void onActivityPaused(j.d.a.c.e.a aVar, long j2);

    void onActivityResumed(j.d.a.c.e.a aVar, long j2);

    void onActivitySaveInstanceState(j.d.a.c.e.a aVar, i1 i1Var, long j2);

    void onActivityStarted(j.d.a.c.e.a aVar, long j2);

    void onActivityStopped(j.d.a.c.e.a aVar, long j2);

    void performAction(Bundle bundle, i1 i1Var, long j2);

    void registerOnMeasurementEventListener(l1 l1Var);

    void resetAnalyticsData(long j2);

    void setConditionalUserProperty(Bundle bundle, long j2);

    void setConsent(Bundle bundle, long j2);

    void setConsentThirdParty(Bundle bundle, long j2);

    void setCurrentScreen(j.d.a.c.e.a aVar, String str, String str2, long j2);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(l1 l1Var);

    void setInstanceIdProvider(n1 n1Var);

    void setMeasurementEnabled(boolean z, long j2);

    void setMinimumSessionDuration(long j2);

    void setSessionTimeoutDuration(long j2);

    void setUserId(String str, long j2);

    void setUserProperty(String str, String str2, j.d.a.c.e.a aVar, boolean z, long j2);

    void unregisterOnMeasurementEventListener(l1 l1Var);
}
