package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class bu extends j {
    public boolean onConversionDataSuccess;
    private final boolean onInstallConversionDataLoadedNative;
    private final boolean onInstallConversionFailureNative;

    bu() {
        this(null, null, null, null, null, null);
    }

    public bu(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Context context) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        this.onInstallConversionDataLoadedNative = bool != null ? bool.booleanValue() : true;
        this.onInstallConversionFailureNative = bool2 != null ? bool2.booleanValue() : true;
    }

    public final boolean AFLogger$LogLevel() {
        return this.onInstallConversionFailureNative;
    }

    public String AFVersionDeclaration() {
        return o.AFInAppEventParameterName((Map<String, ?>) AFInAppEventParameterName()).toString();
    }

    public final boolean getLevel() {
        return this.onConversionDataSuccess;
    }

    public final boolean init() {
        return this.onInstallConversionDataLoadedNative;
    }
}
