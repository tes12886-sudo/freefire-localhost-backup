package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class au {
    public final Map<String, Object> AFKeystoreWrapper = new ConcurrentHashMap();
    public final Application valueOf;
    public final SharedPreferences values;

    public au(Context context) {
        Application application = (Application) context.getApplicationContext();
        this.valueOf = application;
        this.values = ai.values(application);
    }

    public final boolean valueOf() {
        ai.valueOf();
        return ai.AFInAppEventParameterName(this.values, "appsFlyerCount", false) == 0;
    }
}
