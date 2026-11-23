package com.beetalk.sdk.t;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private static volatile h c;
    private final SharedPreferences a;
    private final SharedPreferences.Editor b;

    private h(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.garena.msdk.common_cache", 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    public static h a(Context context) {
        if (c == null) {
            synchronized (h.class) {
                if (c == null) {
                    c = new h(context.getApplicationContext());
                }
            }
        }
        return c;
    }

    public String b(String str, String str2) {
        return this.a.getString(str, str2);
    }

    public void c(String str, String str2) {
        this.b.putString(str, str2);
        this.b.apply();
    }
}
