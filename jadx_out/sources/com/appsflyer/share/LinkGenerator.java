package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.ai;
import com.appsflyer.internal.co;
import com.appsflyer.internal.k;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class LinkGenerator {
    String AFInAppEventParameterName;
    private String AFInAppEventType;
    String AFKeystoreWrapper;
    private String AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private String getLevel;
    private String init;
    private String onDeepLinkingNative;
    private String onInstallConversionFailureNative;
    private String valueOf;
    private String values;
    private Map<String, String> onAttributionFailureNative = new HashMap();
    private Map<String, String> onInstallConversionDataLoadedNative = new HashMap();

    public LinkGenerator(String str) {
        this.valueOf = str;
    }

    private static String AFInAppEventParameterName(String str, String str2) {
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder("Illegal ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            AFLogger.valueOf(sb.toString(), e);
            return "";
        } catch (Throwable th) {
            AFLogger.valueOf(th);
            return "";
        }
    }

    private StringBuilder values() {
        StringBuilder sb = new StringBuilder();
        String str = this.AFInAppEventParameterName;
        sb.append((str == null || !str.startsWith("http")) ? String.format(co.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()) : this.AFInAppEventParameterName);
        if (this.AFKeystoreWrapper != null) {
            sb.append('/');
            sb.append(this.AFKeystoreWrapper);
        }
        this.onInstallConversionDataLoadedNative.put("pid", this.valueOf);
        sb.append('?');
        sb.append("pid=");
        sb.append(AFInAppEventParameterName(this.valueOf, "media source"));
        String str2 = this.getLevel;
        if (str2 != null) {
            this.onInstallConversionDataLoadedNative.put("af_referrer_uid", str2);
            sb.append('&');
            sb.append("af_referrer_uid=");
            sb.append(AFInAppEventParameterName(this.getLevel, "referrerUID"));
        }
        String str3 = this.values;
        if (str3 != null) {
            this.onInstallConversionDataLoadedNative.put(AFInAppEventParameterName.AF_CHANNEL, str3);
            sb.append('&');
            sb.append("af_channel=");
            sb.append(AFInAppEventParameterName(this.values, AppsFlyerProperties.CHANNEL));
        }
        String str4 = this.AppsFlyer2dXConversionCallback;
        if (str4 != null) {
            this.onInstallConversionDataLoadedNative.put("af_referrer_customer_id", str4);
            sb.append('&');
            sb.append("af_referrer_customer_id=");
            sb.append(AFInAppEventParameterName(this.AppsFlyer2dXConversionCallback, "referrerCustomerId"));
        }
        String str5 = this.AFInAppEventType;
        if (str5 != null) {
            this.onInstallConversionDataLoadedNative.put("c", str5);
            sb.append('&');
            sb.append("c=");
            sb.append(AFInAppEventParameterName(this.AFInAppEventType, "campaign"));
        }
        String str6 = this.AFLogger$LogLevel;
        if (str6 != null) {
            this.onInstallConversionDataLoadedNative.put("af_referrer_name", str6);
            sb.append('&');
            sb.append("af_referrer_name=");
            sb.append(AFInAppEventParameterName(this.AFLogger$LogLevel, "referrerName"));
        }
        String str7 = this.AFVersionDeclaration;
        if (str7 != null) {
            this.onInstallConversionDataLoadedNative.put("af_referrer_image_url", str7);
            sb.append('&');
            sb.append("af_referrer_image_url=");
            sb.append(AFInAppEventParameterName(this.AFVersionDeclaration, "referrerImageURL"));
        }
        if (this.onDeepLinkingNative != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.onDeepLinkingNative);
            sb2.append(this.onDeepLinkingNative.endsWith("/") ? "" : "/");
            String str8 = this.init;
            if (str8 != null) {
                sb2.append(str8);
            }
            this.onInstallConversionDataLoadedNative.put("af_dp", sb2.toString());
            sb.append('&');
            sb.append("af_dp=");
            sb.append(AFInAppEventParameterName(this.onDeepLinkingNative, "baseDeeplink"));
            if (this.init != null) {
                sb.append(this.onDeepLinkingNative.endsWith("/") ? "" : "%2F");
                sb.append(AFInAppEventParameterName(this.init, "deeplinkPath"));
            }
        }
        for (String str9 : this.onAttributionFailureNative.keySet()) {
            String string = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str9);
            sb3.append("=");
            sb3.append(AFInAppEventParameterName(this.onAttributionFailureNative.get(str9), str9));
            if (!string.contains(sb3.toString())) {
                sb.append('&');
                sb.append(str9);
                sb.append('=');
                sb.append(AFInAppEventParameterName(this.onAttributionFailureNative.get(str9), str9));
            }
        }
        return sb;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.onAttributionFailureNative.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.onAttributionFailureNative.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        return values().toString();
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        if (!this.onAttributionFailureNative.isEmpty()) {
            for (Map.Entry<String, String> entry : this.onAttributionFailureNative.entrySet()) {
                this.onInstallConversionDataLoadedNative.put(entry.getKey(), entry.getValue());
            }
        }
        values();
        String str = this.onInstallConversionFailureNative;
        Map<String, String> map = this.onInstallConversionDataLoadedNative;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.values("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, map, ai.valueOf(), context);
        createOneLinkHttpTask.AFInAppEventParameterName = responseListener;
        createOneLinkHttpTask.AFKeystoreWrapper = str;
        if (k.values == null) {
            k.values = new k();
        }
        k.values.AFKeystoreWrapper().execute(createOneLinkHttpTask);
    }

    public String getBrandDomain() {
        return this.onInstallConversionFailureNative;
    }

    public String getCampaign() {
        return this.AFInAppEventType;
    }

    public String getChannel() {
        return this.values;
    }

    public String getMediaSource() {
        return this.valueOf;
    }

    public Map<String, String> getParameters() {
        return this.onAttributionFailureNative;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.onDeepLinkingNative = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        String str4;
        if (str == null || str.length() <= 0) {
            str4 = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()), str3);
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            str4 = String.format("https://%s/%s", str2, str);
        }
        this.AFInAppEventParameterName = str4;
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.onInstallConversionFailureNative = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFInAppEventType = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.values = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.init = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.AppsFlyer2dXConversionCallback = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.AFVersionDeclaration = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.AFLogger$LogLevel = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.getLevel = str;
        return this;
    }
}
