package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import com.FF.voiceengine.FFVoiceConst;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.garena.unity.webview.UnityWebViewActivityProxy;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bv implements Runnable {
    private static String AFInAppEventType = "https://%sgcdsdk.%s/install_data/v4.0/";
    private static final List<String> valueOf = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final Application AFInAppEventParameterName;
    final ScheduledExecutorService AFKeystoreWrapper;
    private final int AFVersionDeclaration;
    private final AtomicInteger AppsFlyer2dXConversionCallback;
    private final ai getLevel;
    private final String values;

    bv(ai aiVar, Application application, String str) {
        if (k.values == null) {
            k.values = new k();
        }
        this.AFKeystoreWrapper = k.values.AFInAppEventType();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.getLevel = aiVar;
        this.AFInAppEventParameterName = application;
        this.values = str;
        this.AFVersionDeclaration = 0;
    }

    private bv(bv bvVar) {
        if (k.values == null) {
            k.values = new k();
        }
        this.AFKeystoreWrapper = k.values.AFInAppEventType();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.getLevel = bvVar.getLevel;
        this.AFInAppEventParameterName = bvVar.AFInAppEventParameterName;
        this.values = bvVar.values;
        this.AFVersionDeclaration = bvVar.AFVersionDeclaration + 1;
    }

    static void AFInAppEventType(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
        sb.append(map.toString());
        AFLogger.AFInAppEventType(sb.toString());
        ai.AFInAppEventType.onConversionDataSuccess(map);
    }

    public static void valueOf(String str) {
        if (ai.AFInAppEventType != null) {
            AFLogger.AFInAppEventType("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            ai.AFInAppEventType.onConversionDataFail(str);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strConcat;
        String string;
        String str = this.values;
        if (str == null || str.length() == 0) {
            AFLogger.AFInAppEventType("[GCD-E05] AppsFlyer dev key is missing");
            valueOf("AppsFlyer dev key is missing");
            return;
        }
        if (this.getLevel.isStopped()) {
            AFLogger.AFInAppEventType("[GCD-E03] 'isStopTracking' enabled");
            valueOf("'isStopTracking' enabled");
            return;
        }
        this.AppsFlyer2dXConversionCallback.incrementAndGet();
        HttpURLConnection httpURLConnection = null;
        try {
            Application application = this.AFInAppEventParameterName;
            if (application == null) {
                AFLogger.AFInAppEventType("[GCD-E06] Context null");
                valueOf("Context null");
                this.AppsFlyer2dXConversionCallback.decrementAndGet();
                return;
            }
            ai aiVar = this.getLevel;
            String strValues = aiVar.values(application, aiVar.valueOf(application));
            if (strValues == null) {
                strConcat = "";
            } else if (valueOf.contains(strValues.toLowerCase())) {
                AFLogger.values(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", strValues));
                strConcat = "";
            } else {
                strConcat = "-".concat(String.valueOf(strValues));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()));
            sb.append(this.AFInAppEventParameterName.getPackageName());
            sb.append(strConcat);
            sb.append("?devkey=");
            sb.append(this.values);
            sb.append("&device_id=");
            sb.append(ak.AFInAppEventParameterName((WeakReference<Context>) new WeakReference(this.AFInAppEventParameterName)));
            String string2 = sb.toString();
            aj.AFInAppEventParameterName().AFInAppEventType("server_request", string2, "");
            al.values("[GCD-B01] URL: ".concat(String.valueOf(string2)));
            long jCurrentTimeMillis = System.currentTimeMillis();
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(string2).openConnection();
            try {
                httpURLConnection2.setRequestMethod("GET");
                httpURLConnection2.setConnectTimeout(FFVoiceConst.FFVoice_RTC_SERVER_REGION.RTC_EXT_SERVER);
                httpURLConnection2.setRequestProperty("Connection", UnityWebViewActivityProxy.IntentActions.CLOSE);
                httpURLConnection2.connect();
                int responseCode = httpURLConnection2.getResponseCode();
                String strAFInAppEventParameterName = ai.AFInAppEventParameterName(httpURLConnection2);
                aj.AFInAppEventParameterName().AFInAppEventType("server_response", string2, String.valueOf(responseCode), strAFInAppEventParameterName);
                if (responseCode == 200 || responseCode == 404) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("net", System.currentTimeMillis() - jCurrentTimeMillis);
                    jSONObject.put("retries", this.AFVersionDeclaration);
                    this.getLevel.AFLogger$LogLevel.values.edit().putString("gcd", jSONObject.toString()).apply();
                    al.values("Attribution data: ".concat(String.valueOf(strAFInAppEventParameterName)));
                    if (strAFInAppEventParameterName.length() > 0) {
                        Map<String, Object> mapAFKeystoreWrapper = bo.AFKeystoreWrapper(strAFInAppEventParameterName);
                        Boolean bool = (Boolean) mapAFKeystoreWrapper.get("iscache");
                        if (responseCode == 404) {
                            mapAFKeystoreWrapper.remove("error_reason");
                            mapAFKeystoreWrapper.remove("status_code");
                            mapAFKeystoreWrapper.put("af_status", "Organic");
                            mapAFKeystoreWrapper.put("af_message", "organic install");
                        }
                        if (bool != null && !bool.booleanValue()) {
                            this.getLevel.valueOf(this.AFInAppEventParameterName, "appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                        }
                        if (mapAFKeystoreWrapper.containsKey("af_siteid")) {
                            if (mapAFKeystoreWrapper.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                StringBuilder sb2 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                sb2.append(mapAFKeystoreWrapper.get(AFInAppEventParameterName.AF_CHANNEL));
                                string = sb2.toString();
                            } else {
                                string = String.format("[CrossPromotion] App was installed via %s's Cross Promotion", mapAFKeystoreWrapper.get("af_siteid"));
                            }
                            AFLogger.AFInAppEventType(string);
                        }
                        if (mapAFKeystoreWrapper.containsKey("af_siteid")) {
                            StringBuilder sb3 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                            sb3.append(mapAFKeystoreWrapper.get(AFInAppEventParameterName.AF_CHANNEL));
                            AFLogger.AFInAppEventType(sb3.toString());
                        }
                        mapAFKeystoreWrapper.put("is_first_launch", Boolean.FALSE);
                        String string3 = new JSONObject(mapAFKeystoreWrapper).toString();
                        if (string3 != null) {
                            ai.values(this.AFInAppEventParameterName, "attributionId", string3);
                        } else {
                            ai.values(this.AFInAppEventParameterName, "attributionId", strAFInAppEventParameterName);
                        }
                        if (ai.AFInAppEventType != null && this.AppsFlyer2dXConversionCallback.intValue() <= 1) {
                            try {
                                Map<String, Object> mapAFInAppEventType = bo.AFInAppEventType(this.AFInAppEventParameterName);
                                if (!ai.values(this.AFInAppEventParameterName).getBoolean("sixtyDayConversionData", false)) {
                                    mapAFInAppEventType.put("is_first_launch", Boolean.TRUE);
                                }
                                mapAFKeystoreWrapper = mapAFInAppEventType;
                            } catch (bp e) {
                                AFLogger.valueOf("Exception while trying to fetch attribution data. ", e);
                            }
                            StringBuilder sb4 = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
                            sb4.append(mapAFKeystoreWrapper.toString());
                            AFLogger.AFInAppEventType(sb4.toString());
                            ai.AFInAppEventType.onConversionDataSuccess(mapAFKeystoreWrapper);
                        }
                    }
                } else if ((responseCode == 403 || responseCode >= 500) && this.AFVersionDeclaration < 2) {
                    bv bvVar = new bv(this);
                    ai.AFInAppEventParameterName(bvVar.AFKeystoreWrapper, bvVar, 10L, TimeUnit.MILLISECONDS);
                } else {
                    valueOf("Error connection to server: ".concat(String.valueOf(responseCode)));
                }
                this.AppsFlyer2dXConversionCallback.decrementAndGet();
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    if (this.AFVersionDeclaration < 2) {
                        bv bvVar2 = new bv(this);
                        ai.AFInAppEventParameterName(bvVar2.AFKeystoreWrapper, bvVar2, 10L, TimeUnit.MILLISECONDS);
                    } else {
                        valueOf(th.getMessage());
                    }
                    AFLogger.valueOf(th.getMessage(), th);
                    this.AppsFlyer2dXConversionCallback.decrementAndGet();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    this.AppsFlyer2dXConversionCallback.decrementAndGet();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th2;
                }
            }
            this.AFKeystoreWrapper.shutdown();
            AFLogger.AFInAppEventType("[GCD-A03] Server retrieving attempt finished");
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
