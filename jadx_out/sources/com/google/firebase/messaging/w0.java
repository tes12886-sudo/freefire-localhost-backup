package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class w0 {
    private static final long a = TimeUnit.MINUTES.toMillis(1);
    private static final Object b = new Object();

    @GuardedBy("WakeLockHolder.syncObject")
    private static j.d.a.c.h.a c;

    @GuardedBy("WakeLockHolder.syncObject")
    private static void a(Context context) {
        if (c == null) {
            j.d.a.c.h.a aVar = new j.d.a.c.h.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            c = aVar;
            aVar.c(true);
        }
    }

    static void b(Intent intent) {
        synchronized (b) {
            if (c != null && c(intent)) {
                d(intent, false);
                c.b();
            }
        }
    }

    static boolean c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    private static void d(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    static ComponentName e(Context context, Intent intent) {
        synchronized (b) {
            a(context);
            boolean zC = c(intent);
            d(intent, true);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!zC) {
                c.a(a);
            }
            return componentNameStartService;
        }
    }
}
