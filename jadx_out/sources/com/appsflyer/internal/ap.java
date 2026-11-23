package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class ap {
    public static void AFInAppEventParameterName(String str, DeepLinkResult.Error error) {
        if (i.values().valueOf == null) {
            AFKeystoreWrapper(str);
        } else {
            AFLogger.AFInAppEventType("[DDL] Error occurred: ".concat(String.valueOf(str)));
            values(new DeepLinkResult(null, error));
        }
    }

    public static void AFInAppEventParameterName(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (i.values().valueOf == null) {
            AFKeystoreWrapper(map);
            return;
        }
        try {
            try {
                DeepLink deepLinkAFKeystoreWrapper = DeepLink.AFKeystoreWrapper(map);
                deepLinkAFKeystoreWrapper.values.put("is_deferred", false);
                deepLinkResult = new DeepLinkResult(deepLinkAFKeystoreWrapper, null);
            } catch (JSONException e) {
                AFLogger.values("[DDL] Error occurred", e);
                deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            }
            values(deepLinkResult);
        } catch (Throwable th) {
            values(new DeepLinkResult(null, null));
            throw th;
        }
    }

    private static void AFKeystoreWrapper(String str) {
        if (ai.AFInAppEventType != null) {
            try {
                AFLogger.AFInAppEventType("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                ai.AFInAppEventType.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.valueOf(th.getLocalizedMessage(), th);
            }
        }
    }

    private static void AFKeystoreWrapper(Map<String, String> map) {
        if (ai.AFInAppEventType != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.AFInAppEventType(sb.toString());
                ai.AFInAppEventType.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.valueOf(th.getLocalizedMessage(), th);
            }
        }
    }

    static void values(DeepLinkResult deepLinkResult) {
        if (i.values().valueOf == null) {
            AFLogger.AFInAppEventType("[DDL] skipping, no callback registered");
            return;
        }
        StringBuilder sb = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
        sb.append(deepLinkResult.toString());
        AFLogger.AFInAppEventType(sb.toString());
        try {
            i.values().valueOf.onDeepLinking(deepLinkResult);
        } catch (Throwable th) {
            AFLogger.valueOf(th.getLocalizedMessage(), th);
        }
    }
}
