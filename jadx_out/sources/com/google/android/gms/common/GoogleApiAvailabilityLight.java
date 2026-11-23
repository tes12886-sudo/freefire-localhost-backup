package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.v1;

/* JADX INFO: loaded from: classes.dex */
public class GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final String TRACKING_SOURCE_DIALOG = "d";
    static final String TRACKING_SOURCE_NOTIFICATION = "n";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = g.a;
    private static final GoogleApiAvailabilityLight zza = new GoogleApiAvailabilityLight();

    GoogleApiAvailabilityLight() {
    }

    public static GoogleApiAvailabilityLight getInstance() {
        return zza;
    }

    public void cancelAvailabilityErrorNotifications(Context context) {
        g.a(context);
    }

    public int getApkVersion(Context context) {
        return g.c(context);
    }

    public int getClientVersion(Context context) {
        return g.d(context);
    }

    @Deprecated
    public Intent getErrorResolutionIntent(int i2) {
        return getErrorResolutionIntent(null, i2, null);
    }

    public Intent getErrorResolutionIntent(Context context, int i2, String str) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            return v1.c("com.google.android.gms");
        }
        if (context != null && com.google.android.gms.common.util.i.d(context)) {
            return v1.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(com.google.android.gms.common.o.c.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return v1.b("com.google.android.gms", sb.toString());
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i2, int i3) {
        return getErrorResolutionPendingIntent(context, i2, i3, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i2, int i3, String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i2, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i3, errorResolutionIntent, j.d.a.c.f.f.d.a | 134217728);
    }

    public String getErrorString(int i2) {
        return g.e(i2);
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public int isGooglePlayServicesAvailable(Context context, int i2) {
        int i3 = g.i(context, i2);
        if (g.k(context, i3)) {
            return 18;
        }
        return i3;
    }

    public boolean isPlayServicesPossiblyUpdating(Context context, int i2) {
        return g.k(context, i2);
    }

    public boolean isPlayStorePossiblyUpdating(Context context, int i2) {
        return g.l(context, i2);
    }

    public boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        return g.p(context, str);
    }

    public boolean isUserResolvableError(int i2) {
        return g.n(i2);
    }

    public void verifyGooglePlayServicesIsAvailable(Context context, int i2) throws e, d {
        g.b(context, i2);
    }
}
