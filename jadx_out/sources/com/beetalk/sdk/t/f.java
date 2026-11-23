package com.beetalk.sdk.t;

import android.content.Context;
import android.content.SharedPreferences;
import com.beetalk.sdk.p;

/* JADX INFO: loaded from: classes.dex */
public class f {
    private static volatile f b;
    private final SharedPreferences a;

    private f(Context context) {
        this.a = context.getSharedPreferences("com.garena.android.msdk.PendingPayCachePreference", 0);
    }

    public static f a(Context context) {
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f(context);
                }
            }
        }
        return b;
    }

    private long c(Context context, String str) {
        return a(context).a.getLong(str, 0L);
    }

    public long b(Context context) {
        if (p.p() == p.c.TEST) {
            return 50000L;
        }
        return a(context).a.getLong("KEY_PENDING_COMMIT_REQUEST_INTERVAL", 86400000L);
    }

    public boolean d(Context context, String str) {
        return System.currentTimeMillis() - c(context, str) > b(context);
    }

    public void e(Context context, String str) {
        SharedPreferences.Editor editorEdit = a(context).a.edit();
        editorEdit.putLong(str, System.currentTimeMillis());
        editorEdit.apply();
    }
}
