package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bo {
    static Map<String, Object> AFInAppEventType(Context context) throws bp {
        String string = ai.values(context).getString("attributionId", null);
        if (string == null || string.length() <= 0) {
            throw new bp();
        }
        return AFKeystoreWrapper(string);
    }

    static Map<String, Object> AFKeystoreWrapper(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!next.equals("is_cache")) {
                    map.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
                }
            }
            return map;
        } catch (JSONException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return null;
        }
    }

    public static void values(ai aiVar, j jVar, String str, Context context, SharedPreferences sharedPreferences, Integer num, Throwable th) {
        if (jVar.AFKeystoreWrapper()) {
            if (ai.AFInAppEventType == null) {
                AFLogger.AFInAppEventType("[GCD-E01] AppsFlyerConversionListener is null - skip gcd");
                return;
            }
            StringBuilder sb = new StringBuilder("[GCD-A01] Loading conversion data. Counter: ");
            sb.append(jVar.onAttributionFailureNative);
            AFLogger.AFInAppEventType(sb.toString());
            long j2 = sharedPreferences.getLong("appsflyerConversionDataCacheExpiration", 0L);
            if (j2 != 0 && System.currentTimeMillis() - j2 > 5184000000L) {
                AFLogger.AFInAppEventType("[GCD-E02] Cached conversion data expired");
                ai.valueOf(context, "sixtyDayConversionData");
                ai.values(context, "attributionId", null);
                aiVar.valueOf(context, "appsflyerConversionDataCacheExpiration", 0L);
            }
            if (sharedPreferences.getString("attributionId", null) == null) {
                if (th != null) {
                    StringBuilder sb2 = new StringBuilder("Launch exception: ");
                    sb2.append(th.getMessage());
                    bv.valueOf(sb2.toString());
                    return;
                } else if (num.intValue() != 200) {
                    bv.valueOf("Launch status code: ".concat(String.valueOf(num)));
                    return;
                } else {
                    bv bvVar = new bv(aiVar, (Application) context.getApplicationContext(), str);
                    ai.AFInAppEventParameterName(bvVar.AFKeystoreWrapper, bvVar, 10L, TimeUnit.MILLISECONDS);
                    return;
                }
            }
            if (ai.AFInAppEventParameterName(sharedPreferences, "appsFlyerCount", false) <= 1) {
                return;
            }
            try {
                Map<String, Object> mapAFInAppEventType = AFInAppEventType(context);
                if (mapAFInAppEventType == null) {
                    return;
                }
                try {
                    if (!mapAFInAppEventType.containsKey("is_first_launch")) {
                        mapAFInAppEventType.put("is_first_launch", Boolean.FALSE);
                    }
                    bv.AFInAppEventType(mapAFInAppEventType);
                } catch (Throwable th2) {
                    AFLogger.valueOf(th2.getLocalizedMessage(), th2);
                }
            } catch (bp e) {
                AFLogger.valueOf(e.getMessage(), e);
            }
        }
    }
}
