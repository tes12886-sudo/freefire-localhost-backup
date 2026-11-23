package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzhx;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.g;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    private final zzee zzb;
    private ExecutorService zzc;

    public enum a {
        GRANTED,
        DENIED
    }

    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    public FirebaseAnalytics(zzee zzeeVar) {
        q.k(zzeeVar);
        this.zzb = zzeeVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                if (zza == null) {
                    zza = new FirebaseAnalytics(zzee.t(context, null, null, null, null));
                }
            }
        }
        return zza;
    }

    @Keep
    public static zzhx getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzee zzeeVarT = zzee.t(context, null, null, null, bundle);
        if (zzeeVarT == null) {
            return null;
        }
        return new d(zzeeVarT);
    }

    public Task<String> getAppInstanceId() {
        ExecutorService executorService;
        try {
            synchronized (FirebaseAnalytics.class) {
                if (this.zzc == null) {
                    this.zzc = new com.google.firebase.analytics.b(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                executorService = this.zzc;
            }
            return com.google.android.gms.tasks.d.c(executorService, new c(this));
        } catch (RuntimeException e) {
            this.zzb.c(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return com.google.android.gms.tasks.d.d(e);
        }
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) com.google.android.gms.tasks.d.b(g.l().e(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public void logEvent(String str, Bundle bundle) {
        this.zzb.x(str, bundle);
    }

    public void resetAnalyticsData() {
        this.zzb.H();
    }

    public void setAnalyticsCollectionEnabled(boolean z) {
        this.zzb.F(Boolean.valueOf(z));
    }

    public void setConsent(Map<b, a> map) {
        Bundle bundle = new Bundle();
        a aVar = map.get(b.AD_STORAGE);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        this.zzb.G(bundle);
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.zzb.E(activity, str, str2);
    }

    public void setDefaultEventParameters(Bundle bundle) {
        this.zzb.g(bundle);
    }

    public void setSessionTimeoutDuration(long j2) {
        this.zzb.I(j2);
    }

    public void setUserId(String str) {
        this.zzb.D(str);
    }

    public void setUserProperty(String str, String str2) {
        this.zzb.z(null, str, str2, false);
    }
}
