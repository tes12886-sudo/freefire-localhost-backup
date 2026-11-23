package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static boolean a(Context context, Throwable th) {
        try {
            q.k(context);
            q.k(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
