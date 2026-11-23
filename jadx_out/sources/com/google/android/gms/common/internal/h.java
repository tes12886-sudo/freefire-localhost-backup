package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    private static int a = 4225;
    private static final Object b = new Object();
    private static t1 c;
    static HandlerThread d;
    private static boolean e;

    public static int a() {
        return a;
    }

    public static h b(Context context) {
        synchronized (b) {
            if (c == null) {
                c = new t1(context.getApplicationContext(), e ? c().getLooper() : context.getMainLooper());
            }
        }
        return c;
    }

    public static HandlerThread c() {
        synchronized (b) {
            HandlerThread handlerThread = d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            d = handlerThread2;
            handlerThread2.start();
            return d;
        }
    }

    protected abstract void d(p1 p1Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i2, ServiceConnection serviceConnection, String str3, boolean z) {
        d(new p1(str, str2, i2, z), serviceConnection, str3);
    }

    protected abstract boolean f(p1 p1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
