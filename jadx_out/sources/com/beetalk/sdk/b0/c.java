package com.beetalk.sdk.b0;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static int a(Context context) {
        int identifier = context.getResources().getIdentifier("com_vk_sdk_AppId", "integer", context.getPackageName());
        if (identifier <= 0) {
            return -1;
        }
        return context.getResources().getInteger(identifier);
    }
}
