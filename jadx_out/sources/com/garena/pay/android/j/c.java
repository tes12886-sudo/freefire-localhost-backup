package com.garena.pay.android.j;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static volatile c b;
    private Handler a = new Handler(Looper.getMainLooper());

    private c() {
    }

    public static c a() {
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    public void b(Runnable runnable) {
        this.a.post(runnable);
    }
}
