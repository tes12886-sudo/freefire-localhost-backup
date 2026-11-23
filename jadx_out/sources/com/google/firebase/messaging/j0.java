package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class j0 {
    public static boolean A(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return a();
    }

    public static boolean B(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return C(intent.getExtras());
    }

    public static boolean C(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            FirebaseApp.getInstance();
            Context applicationContext = FirebaseApp.getInstance().getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    static com.google.firebase.messaging.d1.a b(com.google.firebase.messaging.d1.a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        com.google.firebase.messaging.d1.a.C0153a c0153aP = com.google.firebase.messaging.d1.a.p();
        c0153aP.m(p(extras));
        c0153aP.e(bVar);
        c0153aP.f(f(extras));
        c0153aP.i(m());
        c0153aP.k(com.google.firebase.messaging.d1.a.d.ANDROID);
        c0153aP.h(k(extras));
        String strH = h(extras);
        if (strH != null) {
            c0153aP.g(strH);
        }
        String strO = o(extras);
        if (strO != null) {
            c0153aP.l(strO);
        }
        String strC = c(extras);
        if (strC != null) {
            c0153aP.c(strC);
        }
        String strI = i(extras);
        if (strI != null) {
            c0153aP.b(strI);
        }
        String strE = e(extras);
        if (strE != null) {
            c0153aP.d(strE);
        }
        long jN = n(extras);
        if (jN > 0) {
            c0153aP.j(jN);
        }
        return c0153aP.a();
    }

    static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) com.google.android.gms.tasks.d.a(com.google.firebase.installations.g.m(FirebaseApp.getInstance()).e());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    static String j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    static com.google.firebase.messaging.d1.a.c k(Bundle bundle) {
        return (bundle == null || !k0.t(bundle)) ? com.google.firebase.messaging.d1.a.c.DATA_MESSAGE : com.google.firebase.messaging.d1.a.c.DISPLAY_NOTIFICATION;
    }

    static String l(Bundle bundle) {
        return true != k0.t(bundle) ? "data" : "display";
    }

    static String m() {
        return FirebaseApp.getInstance().getApplicationContext().getPackageName();
    }

    static long n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            try {
                return Long.parseLong(gcmSenderId);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        try {
            if (!applicationId.startsWith("1:")) {
                return Long.parseLong(applicationId);
            }
            String[] strArrSplit = applicationId.split(":");
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException e3) {
            Log.w("FirebaseMessaging", "error parsing app ID", e3);
            return 0L;
        }
    }

    static String o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static int p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(strValueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }

    static String q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    private static boolean r(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    public static void s(Intent intent) {
        x("_nd", intent.getExtras());
    }

    public static void t(Intent intent) {
        x("_nf", intent.getExtras());
    }

    public static void u(Bundle bundle) {
        z(bundle);
        x("_no", bundle);
    }

    public static void v(Intent intent) {
        if (B(intent)) {
            x("_nr", intent.getExtras());
        }
        if (A(intent)) {
            w(com.google.firebase.messaging.d1.a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.getTransportFactory());
        }
    }

    private static void w(com.google.firebase.messaging.d1.a.b bVar, Intent intent, TransportFactory transportFactory) {
        if (transportFactory == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        com.google.firebase.messaging.d1.a aVarB = b(bVar, intent);
        if (aVarB == null) {
            return;
        }
        try {
            com.google.android.datatransport.f fVarA = transportFactory.a("FCM_CLIENT_EVENT_LOGGING", com.google.firebase.messaging.d1.b.class, com.google.android.datatransport.b.b("proto"), i0.a);
            com.google.firebase.messaging.d1.b.a aVarB2 = com.google.firebase.messaging.d1.b.b();
            aVarB2.b(aVarB);
            fVarA.a(com.google.android.datatransport.c.d(aVarB2.a()));
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
        }
    }

    static void x(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = new Bundle();
        String strD = d(bundle);
        if (strD != null) {
            bundle2.putString("_nmid", strD);
        }
        String strE = e(bundle);
        if (strE != null) {
            bundle2.putString("_nmn", strE);
        }
        String strI = i(bundle);
        if (!TextUtils.isEmpty(strI)) {
            bundle2.putString("label", strI);
        }
        String strG = g(bundle);
        if (!TextUtils.isEmpty(strG)) {
            bundle2.putString("message_channel", strG);
        }
        String strO = o(bundle);
        if (strO != null) {
            bundle2.putString("_nt", strO);
        }
        String strJ = j(bundle);
        if (strJ != null) {
            try {
                bundle2.putInt("_nmt", Integer.parseInt(strJ));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        String strQ = q(bundle);
        if (strQ != null) {
            try {
                bundle2.putInt("_ndt", Integer.parseInt(strQ));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        String strL = l(bundle);
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle2.putString("_nmc", strL);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf = String.valueOf(bundle2);
            StringBuilder sb = new StringBuilder(str.length() + 37 + String.valueOf(strValueOf).length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(strValueOf);
            Log.d("FirebaseMessaging", sb.toString());
        }
        com.google.firebase.analytics.a.a aVar = (com.google.firebase.analytics.a.a) FirebaseApp.getInstance().get(com.google.firebase.analytics.a.a.class);
        if (aVar != null) {
            aVar.c("fcm", str, bundle2);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    static void y(boolean z) {
        FirebaseApp.getInstance().getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    private static void z(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        com.google.firebase.analytics.a.a aVar = (com.google.firebase.analytics.a.a) FirebaseApp.getInstance().get(com.google.firebase.analytics.a.a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (aVar == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        aVar.a("fcm", "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", "Firebase");
        bundle2.putString("medium", "notification");
        bundle2.putString("campaign", string);
        aVar.c("fcm", "_cmp", bundle2);
    }
}
