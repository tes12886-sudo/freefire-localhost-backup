package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

/* JADX INFO: loaded from: classes.dex */
public final class al {
    private static String AFInAppEventParameterName;
    private static String AFKeystoreWrapper;

    static void AFInAppEventParameterName(String str) {
        AFKeystoreWrapper = str;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (i2 == 0 || i2 == str.length() - 1) {
                sb.append(str.charAt(i2));
            } else {
                sb.append("*");
            }
        }
        AFInAppEventParameterName = sb.toString();
    }

    public static void values(String str) {
        if (AFKeystoreWrapper == null) {
            AFInAppEventParameterName(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
        }
        String str2 = AFKeystoreWrapper;
        if (str2 != null) {
            AFLogger.valueOf(str.replace(str2, AFInAppEventParameterName));
        }
    }
}
