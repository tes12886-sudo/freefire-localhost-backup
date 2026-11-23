package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class bq extends bu {
    private static String onInstallConversionFailureNative;
    private final SharedPreferences onInstallConversionDataLoadedNative;

    static {
        StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(ai.values);
        onInstallConversionFailureNative = sb.toString();
    }

    public bq(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(onInstallConversionFailureNative, AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()));
        sb.append(context.getPackageName());
        super(null, sb.toString(), null, null, null, context);
        this.onInstallConversionDataLoadedNative = ai.values(context);
    }

    private void AFInAppEventParameterName(aa aaVar) {
        this.onInstallConversionDataLoadedNative.edit().putString("afUninstallToken", aaVar.AFKeystoreWrapper).putLong("afUninstallToken_received_time", aaVar.AFInAppEventParameterName).putBoolean("afUninstallToken_queued", aaVar.valueOf()).apply();
    }

    static /* synthetic */ void valueOf(bq bqVar) {
        bqVar.onInstallConversionDataLoadedNative.edit().putBoolean("sentRegisterRequestToAF", true).apply();
        AFLogger.AFInAppEventType("Successfully registered for Uninstall Tracking");
    }

    public static boolean values(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
            return ac.AFKeystoreWrapper(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.valueOf("An error occurred while trying to verify manifest declarations: ", th);
        }
    }

    public static boolean values(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("sentRegisterRequestToAF", false);
    }

    public void AFInAppEventType(String str) throws PackageManager.NameNotFoundException {
        Application application = this.valueOf;
        final ai aiVarValueOf = ai.valueOf();
        if (aiVarValueOf.AFInAppEventType()) {
            AFLogger.values("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        String strValueOf = ai.valueOf(AppsFlyerProperties.AF_KEY);
        if (strValueOf == null) {
            AFLogger.values("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = application.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(application.getPackageName(), 0);
            this.AFInAppEventType.put("app_version_code", Integer.toString(packageInfo.versionCode));
            this.AFInAppEventType.put("app_version_name", packageInfo.versionName);
            this.AFInAppEventType.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            long j2 = packageInfo.firstInstallTime;
            this.AFInAppEventType.put("installDate", ai.AFInAppEventParameterName(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), j2));
        } catch (Throwable th) {
            AFLogger.valueOf("Exception while collecting application version info.", th);
        }
        ai.AFKeystoreWrapper(application, (Map<String, ? super String>) this.AFInAppEventType);
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            this.AFInAppEventType.put("appUserId", string);
        }
        try {
            this.AFInAppEventType.put("model", Build.MODEL);
            this.AFInAppEventType.put("brand", Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.valueOf("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            this.AFInAppEventType.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        c.d.b bVarAFInAppEventParameterName = ad.AFInAppEventParameterName(application.getContentResolver());
        if (bVarAFInAppEventParameterName != null) {
            this.AFInAppEventType.put("amazon_aid", bVarAFInAppEventParameterName.values);
            this.AFInAppEventType.put("amazon_aid_limit", String.valueOf(bVarAFInAppEventParameterName.AFKeystoreWrapper));
        }
        String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string2 != null) {
            this.AFInAppEventType.put("advertiserId", string2);
        }
        this.AFInAppEventType.put("devkey", strValueOf);
        this.AFInAppEventType.put("uid", ak.AFInAppEventParameterName((WeakReference<Context>) new WeakReference(application)));
        this.AFInAppEventType.put("af_gcm_token", str);
        this.AFInAppEventType.put("launch_counter", Integer.toString(ai.AFInAppEventParameterName(this.onInstallConversionDataLoadedNative, "appsFlyerCount", false)));
        this.AFInAppEventType.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String strValueOf2 = aiVarValueOf.valueOf(application);
        if (strValueOf2 != null) {
            this.AFInAppEventType.put(AppsFlyerProperties.CHANNEL, strValueOf2);
        }
        new Thread(new Runnable() { // from class: com.appsflyer.internal.bq.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    bq bqVar = bq.this;
                    bqVar.onConversionDataSuccess = aiVarValueOf.isStopped();
                    HttpURLConnection httpURLConnectionAFInAppEventParameterName = new ah(bqVar).AFInAppEventParameterName();
                    if (httpURLConnectionAFInAppEventParameterName != null) {
                        if (httpURLConnectionAFInAppEventParameterName.getResponseCode() == 200) {
                            bq.valueOf(bq.this);
                        }
                        httpURLConnectionAFInAppEventParameterName.disconnect();
                    }
                } catch (Throwable th3) {
                    AFLogger.valueOf(th3.getMessage(), th3);
                }
            }
        }).start();
    }

    public aa values() {
        String string;
        String string2;
        String string3 = this.onInstallConversionDataLoadedNative.getString("afUninstallToken", null);
        long j2 = this.onInstallConversionDataLoadedNative.getLong("afUninstallToken_received_time", 0L);
        boolean z = this.onInstallConversionDataLoadedNative.getBoolean("afUninstallToken_queued", false);
        this.onInstallConversionDataLoadedNative.edit().putBoolean("afUninstallToken_queued", false).apply();
        if (string3 == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit = string2.split(",");
            string3 = strArrSplit[strArrSplit.length - 1];
        }
        if (j2 == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit2 = string.split(",");
            if (strArrSplit2.length >= 2) {
                try {
                    j2 = Long.parseLong(strArrSplit2[strArrSplit2.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (string3 != null) {
            return new aa(string3, j2, z);
        }
        return null;
    }

    public final void values(String str) {
        if (str != null) {
            AFLogger.valueOf("Firebase Refreshed Token = ".concat(String.valueOf(str)));
            aa aaVarValues = values();
            if (aaVarValues == null || !str.equals(aaVarValues.AFKeystoreWrapper)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z = ai.valueOf(this.onInstallConversionDataLoadedNative) && (aaVarValues == null || jCurrentTimeMillis - aaVarValues.AFInAppEventParameterName > TimeUnit.SECONDS.toMillis(2L));
                AFInAppEventParameterName(new aa(str, jCurrentTimeMillis, !z));
                if (z) {
                    AFInAppEventType(str);
                }
            }
        }
    }
}
