package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class IdManager implements s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f1376g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f1377h = Pattern.quote("/");
    private final t a;
    private final Context b;
    private final String c;
    private final FirebaseInstallationsApi d;
    private final DataCollectionArbiter e;
    private String f;

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = firebaseInstallationsApi;
        this.e = dataCollectionArbiter;
        this.a = new t();
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        com.google.firebase.crashlytics.internal.a.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private String d() {
        try {
            return (String) a0.a(this.d.e());
        } catch (Exception e) {
            com.google.firebase.crashlytics.internal.a.f().l("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return f1376g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f1377h, "");
    }

    @Override // com.google.firebase.crashlytics.internal.common.s
    public synchronized String a() {
        String strL;
        String str = this.f;
        if (str != null) {
            return str;
        }
        com.google.firebase.crashlytics.internal.a.f().i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesR = k.r(this.b);
        String string = sharedPreferencesR.getString("firebase.installation.id", null);
        com.google.firebase.crashlytics.internal.a.f().i("Cached Firebase Installation ID: " + string);
        if (this.e.isAutomaticDataCollectionEnabled()) {
            String strD = d();
            com.google.firebase.crashlytics.internal.a.f().i("Fetched Firebase Installation ID: " + strD);
            if (strD == null) {
                strD = string == null ? c() : string;
            }
            strL = strD.equals(string) ? l(sharedPreferencesR) : b(strD, sharedPreferencesR);
        } else {
            strL = k(string) ? l(sharedPreferencesR) : b(c(), sharedPreferencesR);
        }
        this.f = strL;
        if (this.f == null) {
            com.google.firebase.crashlytics.internal.a.f().k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f = b(c(), sharedPreferencesR);
        }
        com.google.firebase.crashlytics.internal.a.f().i("Crashlytics installation ID: " + this.f);
        return this.f;
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.a.a(this.b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
