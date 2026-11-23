package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFInAppEventType;

/* JADX INFO: loaded from: classes.dex */
public final class cc extends ce {
    public cc(Context context) {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE, context);
    }

    @Override // com.appsflyer.internal.j
    public final j valueOf(String str) {
        return super.valueOf(AFInAppEventParameterName(str));
    }
}
