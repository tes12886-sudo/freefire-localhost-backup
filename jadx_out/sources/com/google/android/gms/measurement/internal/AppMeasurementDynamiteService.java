package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.bd;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.e1 {
    a5 a = null;
    private final Map<Integer, c6> b = new h.f.a();

    @EnsuresNonNull({"scion"})
    private final void m() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void o(com.google.android.gms.internal.measurement.i1 i1Var, String str) {
        m();
        this.a.G().R(i1Var, str);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void beginAdUnitExposure(String str, long j2) {
        m();
        this.a.g().i(str, j2);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m();
        this.a.F().B(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void clearMeasurementEnabled(long j2) {
        m();
        this.a.F().T(null);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void endAdUnitExposure(String str, long j2) {
        m();
        this.a.g().j(str, j2);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void generateEventId(com.google.android.gms.internal.measurement.i1 i1Var) {
        m();
        long jH0 = this.a.G().h0();
        m();
        this.a.G().S(i1Var, jH0);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getAppInstanceId(com.google.android.gms.internal.measurement.i1 i1Var) {
        m();
        this.a.f().r(new h6(this, i1Var));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.i1 i1Var) {
        m();
        o(i1Var, this.a.F().q());
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.i1 i1Var) {
        m();
        this.a.f().r(new fa(this, i1Var, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.i1 i1Var) {
        m();
        o(i1Var, this.a.F().F());
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.i1 i1Var) {
        m();
        o(i1Var, this.a.F().E());
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getGmpAppId(com.google.android.gms.internal.measurement.i1 i1Var) {
        m();
        o(i1Var, this.a.F().G());
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.i1 i1Var) {
        m();
        this.a.F().y(str);
        m();
        this.a.G().T(i1Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getTestFlag(com.google.android.gms.internal.measurement.i1 i1Var, int i2) {
        m();
        if (i2 == 0) {
            this.a.G().R(i1Var, this.a.F().P());
            return;
        }
        if (i2 == 1) {
            this.a.G().S(i1Var, this.a.F().Q().longValue());
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                this.a.G().T(i1Var, this.a.F().R().intValue());
                return;
            } else {
                if (i2 != 4) {
                    return;
                }
                this.a.G().V(i1Var, this.a.F().O().booleanValue());
                return;
            }
        }
        ca caVarG = this.a.G();
        double dDoubleValue = this.a.F().S().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            i1Var.W(bundle);
        } catch (RemoteException e) {
            caVarG.a.d().r().b("Error returning double value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.i1 i1Var) {
        m();
        this.a.f().r(new g8(this, i1Var, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void initForTests(Map map) {
        m();
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void initialize(j.d.a.c.e.a aVar, com.google.android.gms.internal.measurement.o1 o1Var, long j2) {
        a5 a5Var = this.a;
        if (a5Var != null) {
            a5Var.d().r().a("Attempting to initialize multiple times");
            return;
        }
        Context context = (Context) j.d.a.c.e.b.o(aVar);
        com.google.android.gms.common.internal.q.k(context);
        this.a = a5.h(context, o1Var, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.i1 i1Var) {
        m();
        this.a.f().r(new ga(this, i1Var));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        m();
        this.a.F().a0(str, str2, bundle, z, z2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.i1 i1Var, long j2) {
        m();
        com.google.android.gms.common.internal.q.g(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.a.f().r(new g7(this, i1Var, new t(str2, new r(bundle), "app", j2), str));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void logHealthData(int i2, String str, j.d.a.c.e.a aVar, j.d.a.c.e.a aVar2, j.d.a.c.e.a aVar3) {
        m();
        this.a.d().y(i2, true, false, str, aVar == null ? null : j.d.a.c.e.b.o(aVar), aVar2 == null ? null : j.d.a.c.e.b.o(aVar2), aVar3 != null ? j.d.a.c.e.b.o(aVar3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityCreated(j.d.a.c.e.a aVar, Bundle bundle, long j2) {
        m();
        c7 c7Var = this.a.F().c;
        if (c7Var != null) {
            this.a.F().N();
            c7Var.onActivityCreated((Activity) j.d.a.c.e.b.o(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityDestroyed(j.d.a.c.e.a aVar, long j2) {
        m();
        c7 c7Var = this.a.F().c;
        if (c7Var != null) {
            this.a.F().N();
            c7Var.onActivityDestroyed((Activity) j.d.a.c.e.b.o(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityPaused(j.d.a.c.e.a aVar, long j2) {
        m();
        c7 c7Var = this.a.F().c;
        if (c7Var != null) {
            this.a.F().N();
            c7Var.onActivityPaused((Activity) j.d.a.c.e.b.o(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityResumed(j.d.a.c.e.a aVar, long j2) {
        m();
        c7 c7Var = this.a.F().c;
        if (c7Var != null) {
            this.a.F().N();
            c7Var.onActivityResumed((Activity) j.d.a.c.e.b.o(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivitySaveInstanceState(j.d.a.c.e.a aVar, com.google.android.gms.internal.measurement.i1 i1Var, long j2) {
        m();
        c7 c7Var = this.a.F().c;
        Bundle bundle = new Bundle();
        if (c7Var != null) {
            this.a.F().N();
            c7Var.onActivitySaveInstanceState((Activity) j.d.a.c.e.b.o(aVar), bundle);
        }
        try {
            i1Var.W(bundle);
        } catch (RemoteException e) {
            this.a.d().r().b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityStarted(j.d.a.c.e.a aVar, long j2) {
        m();
        if (this.a.F().c != null) {
            this.a.F().N();
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void onActivityStopped(j.d.a.c.e.a aVar, long j2) {
        m();
        if (this.a.F().c != null) {
            this.a.F().N();
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.i1 i1Var, long j2) {
        m();
        i1Var.W(null);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.l1 l1Var) {
        c6 iaVar;
        m();
        synchronized (this.b) {
            iaVar = this.b.get(Integer.valueOf(l1Var.d()));
            if (iaVar == null) {
                iaVar = new ia(this, l1Var);
                this.b.put(Integer.valueOf(l1Var.d()), iaVar);
            }
        }
        this.a.F().w(iaVar);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void resetAnalyticsData(long j2) {
        m();
        this.a.F().s(j2);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setConditionalUserProperty(Bundle bundle, long j2) {
        m();
        if (bundle == null) {
            this.a.d().o().a("Conditional user property must not be null");
        } else {
            this.a.F().A(bundle, j2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setConsent(Bundle bundle, long j2) {
        m();
        d7 d7VarF = this.a.F();
        bd.a();
        if (!d7VarF.a.z().w(null, f3.A0) || TextUtils.isEmpty(d7VarF.a.b().q())) {
            d7VarF.U(bundle, 0, j2);
        } else {
            d7VarF.a.d().t().a("Using developer consent only; google app id found");
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setConsentThirdParty(Bundle bundle, long j2) {
        m();
        this.a.F().U(bundle, -20, j2);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setCurrentScreen(j.d.a.c.e.a aVar, String str, String str2, long j2) {
        m();
        this.a.Q().v((Activity) j.d.a.c.e.b.o(aVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setDataCollectionEnabled(boolean z) {
        m();
        d7 d7VarF = this.a.F();
        d7VarF.j();
        d7VarF.a.f().r(new g6(d7VarF, z));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setDefaultEventParameters(Bundle bundle) {
        m();
        final d7 d7VarF = this.a.F();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        d7VarF.a.f().r(new Runnable(d7VarF, bundle2) { // from class: com.google.android.gms.measurement.internal.e6
            private final d7 a;
            private final Bundle b;

            {
                this.a = d7VarF;
                this.b = bundle2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.H(this.b);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setEventInterceptor(com.google.android.gms.internal.measurement.l1 l1Var) {
        m();
        ha haVar = new ha(this, l1Var);
        if (this.a.f().o()) {
            this.a.F().v(haVar);
        } else {
            this.a.f().r(new h9(this, haVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.n1 n1Var) {
        m();
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setMeasurementEnabled(boolean z, long j2) {
        m();
        this.a.F().T(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setMinimumSessionDuration(long j2) {
        m();
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setSessionTimeoutDuration(long j2) {
        m();
        d7 d7VarF = this.a.F();
        d7VarF.a.f().r(new j6(d7VarF, j2));
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setUserId(String str, long j2) {
        m();
        if (this.a.z().w(null, f3.y0) && str != null && str.length() == 0) {
            this.a.d().r().a("User ID must be non-empty");
        } else {
            this.a.F().d0(null, "_id", str, true, j2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void setUserProperty(String str, String str2, j.d.a.c.e.a aVar, boolean z, long j2) {
        m();
        this.a.F().d0(str, str2, j.d.a.c.e.b.o(aVar), z, j2);
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.l1 l1Var) {
        c6 c6VarRemove;
        m();
        synchronized (this.b) {
            c6VarRemove = this.b.remove(Integer.valueOf(l1Var.d()));
        }
        if (c6VarRemove == null) {
            c6VarRemove = new ia(this, l1Var);
        }
        this.a.F().x(c6VarRemove);
    }
}
