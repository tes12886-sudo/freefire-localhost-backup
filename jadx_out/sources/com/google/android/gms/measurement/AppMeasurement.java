package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.o1;
import com.google.android.gms.measurement.internal.a5;
import com.google.android.gms.measurement.internal.x5;
import com.google.android.gms.measurement.internal.zzhx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AppMeasurement {
    private static volatile AppMeasurement c;
    private final a5 a;
    private final zzhx b;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            q.k(bundle);
            this.mAppId = (String) x5.b(bundle, "app_id", String.class, null);
            this.mOrigin = (String) x5.b(bundle, "origin", String.class, null);
            this.mName = (String) x5.b(bundle, "name", String.class, null);
            this.mValue = x5.b(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) x5.b(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) x5.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) x5.b(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) x5.b(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) x5.b(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) x5.b(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) x5.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) x5.b(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) x5.b(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) x5.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) x5.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) x5.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }

        final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                x5.a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    public AppMeasurement(a5 a5Var) {
        q.k(a5Var);
        this.a = a5Var;
        this.b = null;
    }

    public AppMeasurement(zzhx zzhxVar) {
        q.k(zzhxVar);
        this.b = zzhxVar;
        this.a = null;
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        zzhx zzhxVar;
        if (c == null) {
            synchronized (AppMeasurement.class) {
                if (c == null) {
                    try {
                        zzhxVar = (zzhx) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    } catch (ClassNotFoundException | Exception unused) {
                        zzhxVar = null;
                    }
                    if (zzhxVar != null) {
                        c = new AppMeasurement(zzhxVar);
                    } else {
                        c = new AppMeasurement(a5.h(context, new o1(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return c;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        zzhx zzhxVar = this.b;
        if (zzhxVar != null) {
            zzhxVar.c(str);
        } else {
            q.k(this.a);
            this.a.g().i(str, this.a.e().c());
        }
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzhx zzhxVar = this.b;
        if (zzhxVar != null) {
            zzhxVar.d(str, str2, bundle);
        } else {
            q.k(this.a);
            this.a.F().B(str, str2, bundle);
        }
    }

    @Keep
    public void endAdUnitExposure(String str) {
        zzhx zzhxVar = this.b;
        if (zzhxVar != null) {
            zzhxVar.m(str);
        } else {
            q.k(this.a);
            this.a.g().j(str, this.a.e().c());
        }
    }

    @Keep
    public long generateEventId() {
        zzhx zzhxVar = this.b;
        if (zzhxVar != null) {
            return zzhxVar.g();
        }
        q.k(this.a);
        return this.a.G().h0();
    }

    @Keep
    public String getAppInstanceId() {
        zzhx zzhxVar = this.b;
        if (zzhxVar != null) {
            return zzhxVar.a();
        }
        q.k(this.a);
        return this.a.F().q();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listC;
        zzhx zzhxVar = this.b;
        if (zzhxVar != null) {
            listC = zzhxVar.h(str, str2);
        } else {
            q.k(this.a);
            listC = this.a.F().C(str, str2);
        }
        ArrayList arrayList = new ArrayList(listC == null ? 0 : listC.size());
        Iterator<Bundle> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        zzhx zzhxVar = this.b;
        if (zzhxVar != null) {
            return zzhxVar.e();
        }
        q.k(this.a);
        return this.a.F().F();
    }

    @Keep
    public String getCurrentScreenName() {
        zzhx zzhxVar = this.b;
        if (zzhxVar != null) {
            return zzhxVar.i();
        }
        q.k(this.a);
        return this.a.F().E();
    }

    @Keep
    public String getGmpAppId() {
        zzhx zzhxVar = this.b;
        if (zzhxVar != null) {
            return zzhxVar.f();
        }
        q.k(this.a);
        return this.a.F().G();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        zzhx zzhxVar = this.b;
        if (zzhxVar != null) {
            return zzhxVar.k(str);
        }
        q.k(this.a);
        this.a.F().y(str);
        return 25;
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        zzhx zzhxVar = this.b;
        if (zzhxVar != null) {
            return zzhxVar.l(str, str2, z);
        }
        q.k(this.a);
        return this.a.F().D(str, str2, z);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        zzhx zzhxVar = this.b;
        if (zzhxVar != null) {
            zzhxVar.b(str, str2, bundle);
        } else {
            q.k(this.a);
            this.a.F().X(str, str2, bundle);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        q.k(conditionalUserProperty);
        zzhx zzhxVar = this.b;
        if (zzhxVar != null) {
            zzhxVar.j(conditionalUserProperty.a());
        } else {
            q.k(this.a);
            this.a.F().z(conditionalUserProperty.a());
        }
    }
}
