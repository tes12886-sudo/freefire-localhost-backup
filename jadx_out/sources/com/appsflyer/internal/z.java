package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {
    private static String AFKeystoreWrapper = "https://%ssdk-services.%s/validate-android-signature";
    private static String valueOf;
    private WeakReference<Context> AFInAppEventParameterName;
    private String AFInAppEventType;
    private String AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private String getLevel;
    private Map<String, String> init;
    private String values;

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(ai.valueOf);
        sb.append("/androidevent?buildnumber=6.4.0&app_id=");
        valueOf = sb.toString();
    }

    z(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.AFInAppEventParameterName = new WeakReference<>(context);
        this.AFInAppEventType = str;
        this.values = str2;
        this.AppsFlyer2dXConversionCallback = str4;
        this.AFLogger$LogLevel = str5;
        this.getLevel = str6;
        this.init = map;
        this.AFVersionDeclaration = str3;
    }

    static /* synthetic */ void AFInAppEventType(z zVar, Map map, Map map2, WeakReference weakReference) {
        if (weakReference.get() != null) {
            ab.AFKeystoreWrapper((Context) weakReference.get()).valueOf();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()));
            sb.append(((Context) weakReference.get()).getPackageName());
            String string = sb.toString();
            String string2 = ai.values((Context) weakReference.get()).getString("referrer", "");
            j ccVar = new cc((Context) weakReference.get());
            ccVar.AppsFlyer2dXConversionCallback = zVar.AFInAppEventType;
            ccVar.AFVersionDeclaration = string2;
            ai aiVarValueOf = ai.valueOf();
            Map<String, Object> mapValueOf = aiVarValueOf.valueOf(ccVar);
            mapValueOf.put("price", zVar.AFLogger$LogLevel);
            mapValueOf.put("currency", zVar.getLevel);
            mapValueOf.put("receipt_data", map);
            if (map2 != null) {
                mapValueOf.put("extra_prms", map2);
            }
            mapValueOf.putAll(aiVarValueOf.values());
            aj.AFInAppEventParameterName().AFInAppEventType("server_request", string, new JSONObject(mapValueOf).toString());
            HttpURLConnection httpURLConnectionValueOf = null;
            try {
                httpURLConnectionValueOf = valueOf((ce) ccVar.AFInAppEventType(mapValueOf).valueOf(string));
                int responseCode = httpURLConnectionValueOf != null ? httpURLConnectionValueOf.getResponseCode() : -1;
                String strAFInAppEventParameterName = ai.AFInAppEventParameterName(httpURLConnectionValueOf);
                aj.AFInAppEventParameterName().AFInAppEventType("server_response", string, String.valueOf(responseCode), strAFInAppEventParameterName);
                StringBuilder sb2 = new StringBuilder("Validate-WH response - ");
                sb2.append(responseCode);
                sb2.append(": ");
                sb2.append(new JSONObject(strAFInAppEventParameterName).toString());
                AFLogger.valueOf(sb2.toString());
                if (httpURLConnectionValueOf != null) {
                    httpURLConnectionValueOf.disconnect();
                }
            } catch (Throwable th) {
                try {
                    AFLogger.valueOf(th.getMessage(), th);
                } finally {
                    if (httpURLConnectionValueOf != null) {
                        httpURLConnectionValueOf.disconnect();
                    }
                }
            }
        }
    }

    private static HttpURLConnection valueOf(ce ceVar) {
        StringBuilder sb = new StringBuilder("Calling ");
        sb.append(ceVar.onAppOpenAttributionNative);
        AFLogger.AFInAppEventType(sb.toString());
        ceVar.onConversionDataSuccess = AppsFlyerLib.getInstance().isStopped();
        return new ah(ceVar).AFInAppEventParameterName();
    }

    private static void values(boolean z, String str, String str2, String str3, String str4) {
        if (ai.AFKeystoreWrapper != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.AFInAppEventType(sb.toString());
            if (z) {
                AFLogger.AFInAppEventType("Validate in app purchase success: ".concat(String.valueOf(str4)));
                ai.AFKeystoreWrapper.onValidateInApp();
                return;
            }
            AFLogger.AFInAppEventType("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = ai.AFKeystoreWrapper;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.AFInAppEventType;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            Context context = this.AFInAppEventParameterName.get();
            if (context == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("public-key", this.values);
            map.put("sig-data", this.AppsFlyer2dXConversionCallback);
            map.put("signature", this.AFVersionDeclaration);
            final HashMap map2 = new HashMap(map);
            new Thread(new Runnable() { // from class: com.appsflyer.internal.z.3
                @Override // java.lang.Runnable
                public final void run() {
                    z zVar = z.this;
                    z.AFInAppEventType(zVar, map2, zVar.init, z.this.AFInAppEventParameterName);
                }
            }).start();
            map.put("dev_key", this.AFInAppEventType);
            map.put("app_id", context.getPackageName());
            map.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            String string = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string != null) {
                map.put("advertiserId", string);
            }
            String string2 = new JSONObject(map).toString();
            String str2 = String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName());
            aj.AFInAppEventParameterName().AFInAppEventType("server_request", str2, string2);
            HttpURLConnection httpURLConnectionValueOf = valueOf((ce) new cd().AFInAppEventType(map).valueOf(str2));
            int responseCode = httpURLConnectionValueOf != null ? httpURLConnectionValueOf.getResponseCode() : -1;
            ai.valueOf();
            String strAFInAppEventParameterName = ai.AFInAppEventParameterName(httpURLConnectionValueOf);
            aj.AFInAppEventParameterName().AFInAppEventType("server_response", str2, String.valueOf(responseCode), strAFInAppEventParameterName);
            JSONObject jSONObject = new JSONObject(strAFInAppEventParameterName);
            jSONObject.put("code", responseCode);
            if (responseCode == 200) {
                StringBuilder sb = new StringBuilder("Validate response 200 ok: ");
                sb.append(jSONObject.toString());
                AFLogger.valueOf(sb.toString());
                values(jSONObject.optBoolean("result"), this.AppsFlyer2dXConversionCallback, this.AFLogger$LogLevel, this.getLevel, jSONObject.toString());
            } else {
                AFLogger.valueOf("Failed Validate request");
                values(false, this.AppsFlyer2dXConversionCallback, this.AFLogger$LogLevel, this.getLevel, jSONObject.toString());
            }
            if (httpURLConnectionValueOf != null) {
                httpURLConnectionValueOf.disconnect();
            }
        } catch (Throwable th) {
            try {
                if (ai.AFKeystoreWrapper != null) {
                    AFLogger.valueOf("Failed Validate request + ex", th);
                    values(false, this.AppsFlyer2dXConversionCallback, this.AFLogger$LogLevel, this.getLevel, th.getMessage());
                }
                AFLogger.valueOf(th.getMessage(), th);
            } finally {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
            }
        }
    }
}
