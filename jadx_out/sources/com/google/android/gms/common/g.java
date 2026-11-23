package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.c1;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.o;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class g {

    @Deprecated
    public static final int a = 12451000;
    private static boolean c;
    static boolean d;
    static final AtomicBoolean b = new AtomicBoolean();
    private static final AtomicBoolean e = new AtomicBoolean();

    @Deprecated
    public static void a(Context context) {
        if (b.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException unused) {
        }
    }

    @Deprecated
    public static void b(Context context, int i2) throws e, d {
        int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i2);
        if (iIsGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iIsGooglePlayServicesAvailable);
            if (errorResolutionIntent != null) {
                throw new e(iIsGooglePlayServicesAvailable, "Google Play Services not available", errorResolutionIntent);
            }
            throw new d(iIsGooglePlayServicesAvailable);
        }
    }

    @Deprecated
    public static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static int d(Context context) {
        com.google.android.gms.common.internal.q.n(true);
        return com.google.android.gms.common.util.d.a(context, context.getPackageName());
    }

    @Deprecated
    public static String e(int i2) {
        return ConnectionResult.q(i2);
    }

    public static Context f(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources g(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean h(Context context) {
        try {
            if (!d) {
                try {
                    PackageInfo packageInfoE = com.google.android.gms.common.o.c.a(context).e("com.google.android.gms", 64);
                    h.a(context);
                    if (packageInfoE == null || h.e(packageInfoE, false) || !h.e(packageInfoE, true)) {
                        c = false;
                    } else {
                        c = true;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
                }
                d = true;
            }
            return c || !com.google.android.gms.common.util.i.b();
        } catch (Throwable th) {
            d = true;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x00ca, please report this as an issue */
    @Deprecated
    public static int i(Context context, int i2) {
        String strValueOf;
        String str;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(i.a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !e.get()) {
            int iA = c1.a(context);
            if (iA == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (iA != a) {
                throw new GooglePlayServicesIncorrectManifestValueException(iA);
            }
        }
        boolean z = (com.google.android.gms.common.util.i.d(context) || com.google.android.gms.common.util.i.f(context)) ? false : true;
        com.google.android.gms.common.internal.q.a(i2 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo(GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE, 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                strValueOf = String.valueOf(packageName);
                str = " requires the Google Play Store, but it is missing.";
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            h.a(context);
            if (!h.e(packageInfo2, true)) {
                strValueOf = String.valueOf(packageName);
                str = " requires Google Play services, but their signature is invalid.";
            } else {
                if (!z) {
                    if (z) {
                    }
                    if (com.google.android.gms.common.util.r.a(packageInfo2.versionCode) < com.google.android.gms.common.util.r.a(i2)) {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        return 3;
                    }
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i2 + " but found " + packageInfo2.versionCode);
                    return 2;
                }
                com.google.android.gms.common.internal.q.k(packageInfo);
                if (!h.e(packageInfo, true)) {
                    strValueOf = String.valueOf(packageName);
                    str = " requires Google Play Store, but its signature is invalid.";
                } else {
                    if (z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        if (com.google.android.gms.common.util.r.a(packageInfo2.versionCode) < com.google.android.gms.common.util.r.a(i2)) {
                            applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e2) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                    return 1;
                                }
                            }
                            if (applicationInfo.enabled) {
                                return 3;
                            }
                            return 0;
                        }
                        Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i2 + " but found " + packageInfo2.versionCode);
                        return 2;
                    }
                    strValueOf = String.valueOf(packageName);
                    str = " requires Google Play Store, but its signature doesn't match that of Google Play services.";
                }
            }
            Log.w("GooglePlayServicesUtil", strValueOf.concat(str));
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    public static boolean j(Context context, int i2) {
        return o.a(context, i2);
    }

    @Deprecated
    public static boolean k(Context context, int i2) {
        if (i2 == 18) {
            return true;
        }
        if (i2 == 1) {
            return p(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean l(Context context, int i2) {
        if (i2 == 9) {
            return p(context, GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE);
        }
        return false;
    }

    @TargetApi(18)
    public static boolean m(Context context) {
        if (!l.c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        com.google.android.gms.common.internal.q.k(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean n(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 9;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean o(Context context, int i2, String str) {
        return o.b(context, i2, str);
    }

    @TargetApi(21)
    static boolean p(Context context, String str) {
        boolean zEquals = str.equals("com.google.android.gms");
        if (l.f()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (zEquals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !m(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
