package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends o0 implements f1 {
    d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void beginAdUnitExposure(String str, long j2) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        parcelM.writeLong(j2);
        o(23, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        parcelM.writeString(str2);
        q0.d(parcelM, bundle);
        o(9, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void clearMeasurementEnabled(long j2) {
        Parcel parcelM = m();
        parcelM.writeLong(j2);
        o(43, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void endAdUnitExposure(String str, long j2) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        parcelM.writeLong(j2);
        o(24, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void generateEventId(i1 i1Var) {
        Parcel parcelM = m();
        q0.e(parcelM, i1Var);
        o(22, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getAppInstanceId(i1 i1Var) {
        Parcel parcelM = m();
        q0.e(parcelM, i1Var);
        o(20, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getCachedAppInstanceId(i1 i1Var) {
        Parcel parcelM = m();
        q0.e(parcelM, i1Var);
        o(19, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getConditionalUserProperties(String str, String str2, i1 i1Var) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        parcelM.writeString(str2);
        q0.e(parcelM, i1Var);
        o(10, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getCurrentScreenClass(i1 i1Var) {
        Parcel parcelM = m();
        q0.e(parcelM, i1Var);
        o(17, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getCurrentScreenName(i1 i1Var) {
        Parcel parcelM = m();
        q0.e(parcelM, i1Var);
        o(16, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getGmpAppId(i1 i1Var) {
        Parcel parcelM = m();
        q0.e(parcelM, i1Var);
        o(21, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getMaxUserProperties(String str, i1 i1Var) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        q0.e(parcelM, i1Var);
        o(6, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void getUserProperties(String str, String str2, boolean z, i1 i1Var) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        parcelM.writeString(str2);
        q0.b(parcelM, z);
        q0.e(parcelM, i1Var);
        o(5, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void initialize(j.d.a.c.e.a aVar, o1 o1Var, long j2) {
        Parcel parcelM = m();
        q0.e(parcelM, aVar);
        q0.d(parcelM, o1Var);
        parcelM.writeLong(j2);
        o(1, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        parcelM.writeString(str2);
        q0.d(parcelM, bundle);
        q0.b(parcelM, z);
        q0.b(parcelM, z2);
        parcelM.writeLong(j2);
        o(2, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void logHealthData(int i2, String str, j.d.a.c.e.a aVar, j.d.a.c.e.a aVar2, j.d.a.c.e.a aVar3) {
        Parcel parcelM = m();
        parcelM.writeInt(5);
        parcelM.writeString(str);
        q0.e(parcelM, aVar);
        q0.e(parcelM, aVar2);
        q0.e(parcelM, aVar3);
        o(33, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityCreated(j.d.a.c.e.a aVar, Bundle bundle, long j2) {
        Parcel parcelM = m();
        q0.e(parcelM, aVar);
        q0.d(parcelM, bundle);
        parcelM.writeLong(j2);
        o(27, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityDestroyed(j.d.a.c.e.a aVar, long j2) {
        Parcel parcelM = m();
        q0.e(parcelM, aVar);
        parcelM.writeLong(j2);
        o(28, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityPaused(j.d.a.c.e.a aVar, long j2) {
        Parcel parcelM = m();
        q0.e(parcelM, aVar);
        parcelM.writeLong(j2);
        o(29, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityResumed(j.d.a.c.e.a aVar, long j2) {
        Parcel parcelM = m();
        q0.e(parcelM, aVar);
        parcelM.writeLong(j2);
        o(30, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivitySaveInstanceState(j.d.a.c.e.a aVar, i1 i1Var, long j2) {
        Parcel parcelM = m();
        q0.e(parcelM, aVar);
        q0.e(parcelM, i1Var);
        parcelM.writeLong(j2);
        o(31, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityStarted(j.d.a.c.e.a aVar, long j2) {
        Parcel parcelM = m();
        q0.e(parcelM, aVar);
        parcelM.writeLong(j2);
        o(25, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void onActivityStopped(j.d.a.c.e.a aVar, long j2) {
        Parcel parcelM = m();
        q0.e(parcelM, aVar);
        parcelM.writeLong(j2);
        o(26, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void registerOnMeasurementEventListener(l1 l1Var) {
        Parcel parcelM = m();
        q0.e(parcelM, l1Var);
        o(35, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void resetAnalyticsData(long j2) {
        Parcel parcelM = m();
        parcelM.writeLong(j2);
        o(12, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setConditionalUserProperty(Bundle bundle, long j2) {
        Parcel parcelM = m();
        q0.d(parcelM, bundle);
        parcelM.writeLong(j2);
        o(8, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setConsentThirdParty(Bundle bundle, long j2) {
        Parcel parcelM = m();
        q0.d(parcelM, bundle);
        parcelM.writeLong(j2);
        o(45, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setCurrentScreen(j.d.a.c.e.a aVar, String str, String str2, long j2) {
        Parcel parcelM = m();
        q0.e(parcelM, aVar);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        parcelM.writeLong(j2);
        o(15, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcelM = m();
        q0.b(parcelM, z);
        o(39, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelM = m();
        q0.d(parcelM, bundle);
        o(42, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setMeasurementEnabled(boolean z, long j2) {
        Parcel parcelM = m();
        q0.b(parcelM, z);
        parcelM.writeLong(j2);
        o(11, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setSessionTimeoutDuration(long j2) {
        Parcel parcelM = m();
        parcelM.writeLong(j2);
        o(14, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setUserId(String str, long j2) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        parcelM.writeLong(j2);
        o(7, parcelM);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final void setUserProperty(String str, String str2, j.d.a.c.e.a aVar, boolean z, long j2) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        parcelM.writeString(str2);
        q0.e(parcelM, aVar);
        q0.b(parcelM, z);
        parcelM.writeLong(j2);
        o(4, parcelM);
    }
}
