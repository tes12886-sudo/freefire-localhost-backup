package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    AppsFlyerRequestListener AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    Map<String, Object> AFKeystoreWrapper;
    String AFLogger$LogLevel;
    String AFVersionDeclaration;
    public String AppsFlyer2dXConversionCallback;
    String getLevel;
    byte[] init;
    public String onAppOpenAttributionNative;
    public int onAttributionFailureNative;
    boolean onDeepLinkingNative;
    private final boolean onInstallConversionDataLoadedNative;
    public Application valueOf;
    String values;

    public j() {
        this(null, null, null, null);
    }

    public j(String str, String str2, Boolean bool, Context context) {
        this.AFInAppEventType = new HashMap();
        this.AFLogger$LogLevel = str;
        this.onAppOpenAttributionNative = str2;
        this.onInstallConversionDataLoadedNative = bool != null ? bool.booleanValue() : true;
        if (context != null) {
            this.valueOf = (Application) context.getApplicationContext();
        }
    }

    protected final String AFInAppEventParameterName(String str) throws PackageManager.NameNotFoundException {
        String strValueOf = ai.valueOf().valueOf(this.valueOf);
        return strValueOf != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, strValueOf).build().toString() : str;
    }

    public final Map<String, Object> AFInAppEventParameterName() {
        return this.AFInAppEventType;
    }

    protected final j AFInAppEventType(Map<String, ?> map) {
        this.AFInAppEventType.putAll(map);
        return this;
    }

    public final boolean AFInAppEventType() {
        return this.onInstallConversionDataLoadedNative;
    }

    public final boolean AFKeystoreWrapper() {
        return this.onDeepLinkingNative;
    }

    public j valueOf(String str) {
        this.onAppOpenAttributionNative = str;
        return this;
    }

    final byte[] valueOf() {
        return this.init;
    }
}
