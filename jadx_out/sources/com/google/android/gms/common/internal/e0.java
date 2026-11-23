package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    @GuardedBy("sCache")
    private static final h.f.g a = new h.f.g();

    @GuardedBy("sCache")
    private static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return com.google.android.gms.common.o.c.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(j.d.a.c.c.b.f1947g);
    }

    public static String c(Context context, int i2) {
        int i3;
        Resources resources = context.getResources();
        if (i2 == 1) {
            i3 = j.d.a.c.c.b.d;
        } else if (i2 != 2) {
            i3 = i2 != 3 ? R.string.ok : j.d.a.c.c.b.a;
        } else {
            i3 = j.d.a.c.c.b.f1950j;
        }
        return resources.getString(i3);
    }

    public static String d(Context context, int i2) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i2 == 1) {
            return resources.getString(j.d.a.c.c.b.e, strA);
        }
        if (i2 == 2) {
            return com.google.android.gms.common.util.i.d(context) ? resources.getString(j.d.a.c.c.b.f1954n) : resources.getString(j.d.a.c.c.b.f1951k, strA);
        }
        if (i2 == 3) {
            return resources.getString(j.d.a.c.c.b.b, strA);
        }
        if (i2 == 5) {
            return h(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i2 == 7) {
            return h(context, "common_google_play_services_network_error_text", strA);
        }
        if (i2 == 9) {
            return resources.getString(j.d.a.c.c.b.f1949i, strA);
        }
        if (i2 == 20) {
            return h(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i2) {
            case 16:
                return h(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(j.d.a.c.c.b.f1953m, strA);
            default:
                return resources.getString(com.google.android.gms.common.i.a, strA);
        }
    }

    public static String e(Context context, int i2) {
        return (i2 == 6 || i2 == 19) ? h(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i2);
    }

    public static String f(Context context, int i2) {
        String strI = i2 == 6 ? i(context, "common_google_play_services_resolution_required_title") : g(context, i2);
        return strI == null ? context.getResources().getString(j.d.a.c.c.b.f1948h) : strI;
    }

    public static String g(Context context, int i2) {
        String str;
        Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(j.d.a.c.c.b.f);
            case 2:
                return resources.getString(j.d.a.c.c.b.f1952l);
            case 3:
                return resources.getString(j.d.a.c.c.b.c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                str = "Unexpected error code " + i2;
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strI = i(context, str);
        if (strI == null) {
            strI = resources.getString(com.google.android.gms.common.i.a);
        }
        return String.format(resources.getConfiguration().locale, strI, str2);
    }

    private static String i(Context context, String str) {
        h.f.g gVar = a;
        synchronized (gVar) {
            Locale localeC = h.h.h.c.a(context.getResources().getConfiguration()).c(0);
            if (!localeC.equals(b)) {
                gVar.clear();
                b = localeC;
            }
            String str2 = (String) gVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources resourcesG = com.google.android.gms.common.f.g(context);
            if (resourcesG == null) {
                return null;
            }
            int identifier = resourcesG.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = resourcesG.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                gVar.put(str, string);
                return string;
            }
            Log.w("GoogleApiAvailability", "Got empty resource: " + str);
            return null;
        }
    }
}
