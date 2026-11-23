package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class as {
    static JSONObject valueOf(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            try {
                boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
                if (!jSONObject2.optBoolean("monitor", false) || z) {
                    aj.AFInAppEventParameterName().valueOf();
                    aj.AFInAppEventParameterName().values();
                } else {
                    aj.AFInAppEventParameterName().AFInAppEventType();
                }
                if (!jSONObject2.has("ol_id")) {
                    return jSONObject2;
                }
                String strOptString = jSONObject2.optString("ol_scheme", null);
                String strOptString2 = jSONObject2.optString("ol_domain", null);
                String strOptString3 = jSONObject2.optString("ol_ver", null);
                if (strOptString != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, strOptString);
                }
                if (strOptString2 != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, strOptString2);
                }
                if (strOptString3 == null) {
                    return jSONObject2;
                }
                AppsFlyerProperties.getInstance().set("onelinkVersion", strOptString3);
                return jSONObject2;
            } catch (Throwable th) {
                th = th;
                jSONObject = jSONObject2;
                AFLogger.valueOf(th.getMessage(), th);
                aj.AFInAppEventParameterName().valueOf();
                aj.AFInAppEventParameterName().values();
                return jSONObject;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
