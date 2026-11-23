package com.beetalk.sdk.x;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class g {
    static String a = "SG";
    static String b = "en";

    public static String a() {
        String country = Locale.getDefault() != null ? Locale.getDefault().getCountry() : a;
        if (country != null && country.length() > 2) {
            country = country.substring(0, 2);
        }
        return (country == null || country.length() != 2) ? a : country.toUpperCase();
    }

    public static String b(Context context) {
        String strC = h.b().c(context);
        return TextUtils.isEmpty(strC) ? a() : strC;
    }

    public static String c() {
        String language = Locale.getDefault() != null ? Locale.getDefault().getLanguage() : b;
        if (language != null && language.length() > 2) {
            language = language.substring(0, 2);
        }
        return (language == null || language.length() != 2) ? a : language.toLowerCase();
    }

    public static Locale d() {
        return com.beetalk.sdk.g.s() != null ? e(com.beetalk.sdk.g.s()) : new Locale(c(), a());
    }

    public static Locale e(Context context) {
        return new Locale(c(), b(context));
    }

    public static String f(Locale locale) {
        String string = locale.toString();
        return locale.getLanguage().equals("in") ? string.replace("in", "id") : string;
    }

    public static String g(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase() : "";
    }
}
