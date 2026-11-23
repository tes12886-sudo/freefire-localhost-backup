package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ar extends bu {
    private static String onAttributionFailure = "https://%sdlsdk.%s/v1.0/android/";
    public static long onInstallConversionDataLoadedNative;
    private int AppsFlyerConversionListener;
    private int AppsFlyerInAppPurchaseValidatorListener;
    private final JSONObject AppsFlyerLib;
    private final au onAppOpenAttribution;
    private final CountDownLatch onConversionDataFail;
    private final List<cl> onDeepLinking;
    public int onInstallConversionFailureNative;
    private boolean onValidateInApp;

    /* JADX INFO: renamed from: com.appsflyer.internal.ar$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[cl.a.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[cl.a.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[cl.a.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ar(Context context, au auVar) {
        super(null, onAttributionFailure, Boolean.FALSE, Boolean.TRUE, null, context);
        this.onDeepLinking = new ArrayList();
        this.onConversionDataFail = new CountDownLatch(1);
        this.AppsFlyerLib = new JSONObject();
        this.onAppOpenAttribution = auVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AFInAppEventParameterName(cl clVar) {
        if (AFInAppEventType(clVar)) {
            this.onDeepLinking.add(clVar);
            this.onConversionDataFail.countDown();
            StringBuilder sb = new StringBuilder("[DDL] Added non-organic ");
            sb.append(clVar.getClass().getSimpleName());
            AFLogger.AFInAppEventType(sb.toString());
            return;
        }
        int i2 = this.AppsFlyerInAppPurchaseValidatorListener + 1;
        this.AppsFlyerInAppPurchaseValidatorListener = i2;
        if (i2 == this.AppsFlyerConversionListener) {
            this.onConversionDataFail.countDown();
        }
    }

    static /* synthetic */ DeepLinkResult AFInAppEventType(ar arVar, Context context) throws JSONException, InterruptedException {
        DeepLink deepLinkAFKeystoreWrapper;
        while (true) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (arVar.onInstallConversionFailureNative == 1) {
                arVar.AppsFlyerLib.put("from_fg", jCurrentTimeMillis - arVar.onAppOpenAttribution.values.getLong("fg_ts", 0L));
            }
            HttpURLConnection httpURLConnectionAFInAppEventParameterName = new ah(arVar).AFInAppEventParameterName();
            JSONArray jSONArrayOptJSONArray = arVar.AppsFlyerLib.optJSONArray("net");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            jSONArrayOptJSONArray.put(arVar.onInstallConversionFailureNative - 1, jCurrentTimeMillis2 - jCurrentTimeMillis);
            arVar.AppsFlyerLib.put("net", jSONArrayOptJSONArray);
            if (httpURLConnectionAFInAppEventParameterName.getResponseCode() != 200) {
                StringBuilder sb = new StringBuilder("[DDL] Error occurred. Server response code = ");
                sb.append(httpURLConnectionAFInAppEventParameterName.getResponseCode());
                AFLogger.AFInAppEventType(sb.toString());
                return new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
            }
            ai.valueOf();
            JSONObject jSONObject = new JSONObject(ai.AFInAppEventParameterName(httpURLConnectionAFInAppEventParameterName));
            arVar.onValidateInApp = jSONObject.optBoolean("is_second_ping", true);
            if (jSONObject.optBoolean("found")) {
                deepLinkAFKeystoreWrapper = DeepLink.AFKeystoreWrapper(jSONObject.optJSONObject("click_event"));
                deepLinkAFKeystoreWrapper.values.put("is_deferred", true);
            } else {
                deepLinkAFKeystoreWrapper = null;
            }
            if (deepLinkAFKeystoreWrapper != null) {
                return new DeepLinkResult(deepLinkAFKeystoreWrapper, null);
            }
            if (arVar.onInstallConversionFailureNative > 1 || !arVar.values() || !arVar.onValidateInApp) {
                return new DeepLinkResult(null, null);
            }
            AFLogger.AFInAppEventType("[DDL] Waiting for referrers...");
            arVar.onConversionDataFail.await();
            arVar.AppsFlyerLib.put("rfr_wait", System.currentTimeMillis() - jCurrentTimeMillis2);
            if (arVar.AppsFlyerInAppPurchaseValidatorListener == arVar.AppsFlyerConversionListener) {
                return new DeepLinkResult(null, null);
            }
            arVar.AFInAppEventType(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0122  */
    public void AFInAppEventType(Context context) {
        HashMap map;
        String[] strArr;
        this.onInstallConversionFailureNative++;
        StringBuilder sb = new StringBuilder("[DDL] Preparing request ");
        sb.append(this.onInstallConversionFailureNative);
        AFLogger.AFInAppEventType(sb.toString());
        if (this.onInstallConversionFailureNative == 1) {
            ai aiVarValueOf = ai.valueOf();
            this.AFInAppEventType.put("is_first", Boolean.valueOf(ai.AFInAppEventType(context)));
            Map<String, Object> map2 = this.AFInAppEventType;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Locale.getDefault().getLanguage());
            sb2.append("-");
            sb2.append(Locale.getDefault().getCountry());
            map2.put("lang", sb2.toString());
            this.AFInAppEventType.put("os", Build.VERSION.RELEASE);
            this.AFInAppEventType.put("type", Build.MODEL);
            this.AFInAppEventType.put("request_id", aiVarValueOf.getAppsFlyerUID(context));
            l lVar = aiVarValueOf.onAppOpenAttributionNative;
            if (lVar != null && (strArr = lVar.valueOf) != null) {
                this.AFInAppEventType.put("sharing_filter", strArr);
            }
            Map<String, Object> mapValueOf = valueOf(ad.AFInAppEventType(context, new HashMap()));
            Map<String, Object> mapValueOf2 = valueOf(ad.values(context));
            if (mapValueOf != null) {
                this.AFInAppEventType.put("gaid", mapValueOf);
            }
            if (mapValueOf2 != null) {
                this.AFInAppEventType.put("oaid", mapValueOf2);
            }
        }
        Map<String, Object> map3 = this.AFInAppEventType;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        long jCurrentTimeMillis = System.currentTimeMillis();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map3.put("timestamp", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
        this.AFInAppEventType.put("request_count", Integer.valueOf(this.onInstallConversionFailureNative));
        ArrayList arrayList = new ArrayList();
        for (cl clVar : this.onDeepLinking) {
            if (clVar.valueOf == cl.a.FINISHED) {
                map = new HashMap();
                String str = (String) clVar.values.get("referrer");
                if (str != null) {
                    map.put("source", (String) clVar.values.get("source"));
                    map.put("value", str);
                } else {
                    map = null;
                }
            } else {
                map = null;
            }
            if (map != null) {
                arrayList.add(map);
            }
        }
        if (!arrayList.isEmpty()) {
            this.AFInAppEventType.put("referrers", arrayList);
        }
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
        Uri.Builder builderAppendPath = Uri.parse(String.format(this.onAppOpenAttributionNative, AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName())).buildUpon().appendPath(context.getPackageName());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.AFInAppEventType.get("timestamp"));
        sb3.append(string);
        valueOf(builderAppendPath.appendQueryParameter("af_sig", ah.valueOf(sb3.toString(), string)).appendQueryParameter("sdk_version", ai.valueOf).build().toString());
    }

    static /* synthetic */ void AFInAppEventType(ar arVar) {
        ArrayList<cl> arrayList = new ArrayList();
        for (cl clVar : ai.valueOf().init) {
            if (clVar != null && clVar.valueOf != cl.a.NOT_STARTED) {
                arrayList.add(clVar);
            }
        }
        arVar.AppsFlyerConversionListener = arrayList.size();
        for (final cl clVar2 : arrayList) {
            int i2 = AnonymousClass3.AFKeystoreWrapper[clVar2.valueOf.ordinal()];
            if (i2 == 1) {
                StringBuilder sb = new StringBuilder("[DDL] ");
                sb.append(clVar2.values.get("source"));
                sb.append(" referrer collected earlier");
                AFLogger.AFInAppEventType(sb.toString());
                arVar.AFInAppEventParameterName(clVar2);
            } else if (i2 == 2) {
                clVar2.addObserver(new Observer() { // from class: com.appsflyer.internal.ar.1
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb2 = new StringBuilder("[DDL] ");
                        sb2.append(clVar2.values.get("source"));
                        sb2.append(" referrer collected via observer");
                        AFLogger.AFInAppEventType(sb2.toString());
                        ar.this.AFInAppEventParameterName((cl) observable);
                    }
                });
            }
        }
    }

    private static boolean AFInAppEventType(cl clVar) {
        Long l2 = (Long) clVar.values.get("click_ts");
        return l2 != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l2.longValue()) < TimeUnit.DAYS.toMillis(1L);
    }

    private Map<String, Object> valueOf(final c.d.b bVar) {
        Boolean bool;
        boolean z = false;
        if (bVar != null && bVar.values != null && ((bool = bVar.AFKeystoreWrapper) == null || !bool.booleanValue())) {
            z = true;
        }
        if (z) {
            return new HashMap<String, Object>() { // from class: com.appsflyer.internal.ar.2
                {
                    put("type", "unhashed");
                    put("value", bVar.values);
                }
            };
        }
        return null;
    }

    private boolean values() {
        List list = (List) this.AFInAppEventType.get("referrers");
        return (list != null ? list.size() : 0) < this.AppsFlyerConversionListener && !this.AFInAppEventType.containsKey("referrers");
    }

    public final void valueOf(DeepLinkResult deepLinkResult) {
        try {
            this.AppsFlyerLib.put("status", deepLinkResult.getStatus().toString());
            this.AppsFlyerLib.put("timeout_value", onInstallConversionDataLoadedNative);
        } catch (JSONException unused) {
        }
        au auVar = this.onAppOpenAttribution;
        auVar.values.edit().putString("ddl", this.AppsFlyerLib.toString()).apply();
        ap.values(deepLinkResult);
    }
}
