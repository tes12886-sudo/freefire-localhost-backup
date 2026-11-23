package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class cf extends cl {
    cf(String str, Runnable runnable) {
        super(str, runnable);
    }

    final void valueOf(Context context, ax<Map<String, Object>> axVar) {
        ai.valueOf();
        if (ai.AFInAppEventParameterName(ai.values(context), "appsFlyerCount", false) > 0 || !axVar.AFInAppEventParameterName()) {
            return;
        }
        new Thread(axVar.valueOf).start();
        AFInAppEventType();
    }
}
