package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    private static final Object a = new Object();

    @GuardedBy("sLock")
    private static boolean b;
    private static int c;

    public static int a(Context context) {
        b(context);
        return c;
    }

    private static void b(Context context) {
        synchronized (a) {
            if (b) {
                return;
            }
            b = true;
            try {
                Bundle bundle = com.google.android.gms.common.o.c.a(context).c(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    return;
                }
                bundle.getString("com.google.app.id");
                c = bundle.getInt("com.google.android.gms.version");
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
        }
    }
}
