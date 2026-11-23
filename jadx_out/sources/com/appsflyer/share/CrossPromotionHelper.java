package com.appsflyer.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.FF.voiceengine.FFVoiceConst;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.ai;
import com.appsflyer.internal.co;
import com.appsflyer.internal.cp;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CrossPromotionHelper {
    private static String AFKeystoreWrapper = "https://%simpression.%s";

    static class c implements Runnable {
        private final cp AFInAppEventType;
        private final WeakReference<Context> AFKeystoreWrapper;
        private final boolean valueOf;
        private final String values;

        c(String str, cp cpVar, Context context, boolean z) {
            this.values = str;
            this.AFInAppEventType = cpVar;
            this.AFKeystoreWrapper = new WeakReference<>(context);
            this.valueOf = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HttpURLConnection httpURLConnection;
            Throwable th;
            if (this.valueOf) {
                return;
            }
            try {
                httpURLConnection = (HttpURLConnection) new URL(this.values).openConnection();
                try {
                    httpURLConnection.setConnectTimeout(FFVoiceConst.FFVoice_RTC_SERVER_REGION.RTC_EXT_SERVER);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                        sb.append(this.values);
                        AFLogger.values(sb.toString(), false);
                    } else if (responseCode == 301 || responseCode == 302) {
                        StringBuilder sb2 = new StringBuilder("Cross promotion redirection success: ");
                        sb2.append(this.values);
                        AFLogger.values(sb2.toString(), false);
                        if (this.AFInAppEventType != null && this.AFKeystoreWrapper.get() != null) {
                            this.AFInAppEventType.AFInAppEventType = httpURLConnection.getHeaderField("Location");
                            cp cpVar = this.AFInAppEventType;
                            Context context = this.AFKeystoreWrapper.get();
                            if (cpVar.AFInAppEventType != null) {
                                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(cpVar.AFInAppEventType)).setFlags(268435456));
                            }
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder("call to ");
                        sb3.append(this.values);
                        sb3.append(" failed: ");
                        sb3.append(responseCode);
                        AFLogger.valueOf(sb3.toString());
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        AFLogger.values(th.getMessage(), th);
                    } finally {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                }
            } catch (Throwable th3) {
                httpURLConnection = null;
                th = th3;
            }
        }
    }

    private static LinkGenerator AFInAppEventType(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventParameterName = str3;
        linkGenerator.AFKeystoreWrapper = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }

    public static void logAndOpenStore(Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator linkGeneratorAFInAppEventType = AFInAppEventType(context, str, str2, map, String.format(co.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.values("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        new Thread(new c(linkGeneratorAFInAppEventType.generateLink(), new cp(), context, AppsFlyerLib.getInstance().isStopped())).start();
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.values("CustomerUserId not set, Promote Impression is disabled", true);
        } else {
            new Thread(new c(AFInAppEventType(context, str, str2, map, String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName())).generateLink(), null, null, AppsFlyerLib.getInstance().isStopped())).start();
        }
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            byte b = -1;
            int iHashCode = key.hashCode();
            if (iHashCode != 96801) {
                if (iHashCode == 120623625 && key.equals("impression")) {
                    b = 1;
                }
            } else if (key.equals("app")) {
                b = 0;
            }
            if (b == 0) {
                co.valueOf = value;
            } else if (b == 1) {
                AFKeystoreWrapper = value;
            }
        }
    }
}
