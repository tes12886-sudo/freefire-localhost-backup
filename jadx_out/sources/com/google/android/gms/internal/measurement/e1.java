package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 extends p0 implements f1 {
    public e1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static f1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof f1 ? (f1) iInterfaceQueryLocalInterface : new d1(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.p0
    protected final boolean j(int i2, Parcel parcel, Parcel parcel2, int i3) {
        i1 g1Var;
        i1 g1Var2 = null;
        i1 g1Var3 = null;
        i1 g1Var4 = null;
        l1 j1Var = null;
        l1 j1Var2 = null;
        l1 j1Var3 = null;
        i1 g1Var5 = null;
        i1 g1Var6 = null;
        i1 g1Var7 = null;
        i1 g1Var8 = null;
        i1 g1Var9 = null;
        i1 g1Var10 = null;
        n1 m1Var = null;
        i1 g1Var11 = null;
        i1 g1Var12 = null;
        i1 g1Var13 = null;
        i1 g1Var14 = null;
        switch (i2) {
            case 1:
                initialize(j.d.a.c.e.a.AbstractBinderC0233a.m(parcel.readStrongBinder()), (o1) q0.c(parcel, o1.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) q0.c(parcel, Bundle.CREATOR), q0.a(parcel), q0.a(parcel), parcel.readLong());
                break;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) q0.c(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    g1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var = iInterfaceQueryLocalInterface instanceof i1 ? (i1) iInterfaceQueryLocalInterface : new g1(strongBinder);
                }
                logEventAndBundle(string, string2, bundle, g1Var, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), j.d.a.c.e.a.AbstractBinderC0233a.m(parcel.readStrongBinder()), q0.a(parcel), parcel.readLong());
                break;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean zA = q0.a(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var2 = iInterfaceQueryLocalInterface2 instanceof i1 ? (i1) iInterfaceQueryLocalInterface2 : new g1(strongBinder2);
                }
                getUserProperties(string3, string4, zA, g1Var2);
                break;
            case 6:
                String string5 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var14 = iInterfaceQueryLocalInterface3 instanceof i1 ? (i1) iInterfaceQueryLocalInterface3 : new g1(strongBinder3);
                }
                getMaxUserProperties(string5, g1Var14);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) q0.c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) q0.c(parcel, Bundle.CREATOR));
                break;
            case 10:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var13 = iInterfaceQueryLocalInterface4 instanceof i1 ? (i1) iInterfaceQueryLocalInterface4 : new g1(strongBinder4);
                }
                getConditionalUserProperties(string6, string7, g1Var13);
                break;
            case 11:
                setMeasurementEnabled(q0.a(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(j.d.a.c.e.a.AbstractBinderC0233a.m(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var12 = iInterfaceQueryLocalInterface5 instanceof i1 ? (i1) iInterfaceQueryLocalInterface5 : new g1(strongBinder5);
                }
                getCurrentScreenName(g1Var12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var11 = iInterfaceQueryLocalInterface6 instanceof i1 ? (i1) iInterfaceQueryLocalInterface6 : new g1(strongBinder6);
                }
                getCurrentScreenClass(g1Var11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    m1Var = iInterfaceQueryLocalInterface7 instanceof n1 ? (n1) iInterfaceQueryLocalInterface7 : new m1(strongBinder7);
                }
                setInstanceIdProvider(m1Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var10 = iInterfaceQueryLocalInterface8 instanceof i1 ? (i1) iInterfaceQueryLocalInterface8 : new g1(strongBinder8);
                }
                getCachedAppInstanceId(g1Var10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var9 = iInterfaceQueryLocalInterface9 instanceof i1 ? (i1) iInterfaceQueryLocalInterface9 : new g1(strongBinder9);
                }
                getAppInstanceId(g1Var9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var8 = iInterfaceQueryLocalInterface10 instanceof i1 ? (i1) iInterfaceQueryLocalInterface10 : new g1(strongBinder10);
                }
                getGmpAppId(g1Var8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var7 = iInterfaceQueryLocalInterface11 instanceof i1 ? (i1) iInterfaceQueryLocalInterface11 : new g1(strongBinder11);
                }
                generateEventId(g1Var7);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(j.d.a.c.e.a.AbstractBinderC0233a.m(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(j.d.a.c.e.a.AbstractBinderC0233a.m(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(j.d.a.c.e.a.AbstractBinderC0233a.m(parcel.readStrongBinder()), (Bundle) q0.c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(j.d.a.c.e.a.AbstractBinderC0233a.m(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(j.d.a.c.e.a.AbstractBinderC0233a.m(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(j.d.a.c.e.a.AbstractBinderC0233a.m(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                j.d.a.c.e.a aVarM = j.d.a.c.e.a.AbstractBinderC0233a.m(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var6 = iInterfaceQueryLocalInterface12 instanceof i1 ? (i1) iInterfaceQueryLocalInterface12 : new g1(strongBinder12);
                }
                onActivitySaveInstanceState(aVarM, g1Var6, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) q0.c(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var5 = iInterfaceQueryLocalInterface13 instanceof i1 ? (i1) iInterfaceQueryLocalInterface13 : new g1(strongBinder13);
                }
                performAction(bundle2, g1Var5, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), j.d.a.c.e.a.AbstractBinderC0233a.m(parcel.readStrongBinder()), j.d.a.c.e.a.AbstractBinderC0233a.m(parcel.readStrongBinder()), j.d.a.c.e.a.AbstractBinderC0233a.m(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    j1Var3 = iInterfaceQueryLocalInterface14 instanceof l1 ? (l1) iInterfaceQueryLocalInterface14 : new j1(strongBinder14);
                }
                setEventInterceptor(j1Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    j1Var2 = iInterfaceQueryLocalInterface15 instanceof l1 ? (l1) iInterfaceQueryLocalInterface15 : new j1(strongBinder15);
                }
                registerOnMeasurementEventListener(j1Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    j1Var = iInterfaceQueryLocalInterface16 instanceof l1 ? (l1) iInterfaceQueryLocalInterface16 : new j1(strongBinder16);
                }
                unregisterOnMeasurementEventListener(j1Var);
                break;
            case 37:
                initForTests(q0.f(parcel));
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var4 = iInterfaceQueryLocalInterface17 instanceof i1 ? (i1) iInterfaceQueryLocalInterface17 : new g1(strongBinder17);
                }
                getTestFlag(g1Var4, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(q0.a(parcel));
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var3 = iInterfaceQueryLocalInterface18 instanceof i1 ? (i1) iInterfaceQueryLocalInterface18 : new g1(strongBinder18);
                }
                isDataCollectionEnabled(g1Var3);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) q0.c(parcel, Bundle.CREATOR));
                break;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                break;
            case 44:
                setConsent((Bundle) q0.c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 45:
                setConsentThirdParty((Bundle) q0.c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
