package com.beetalk.sdk.z;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static volatile a b;
    private ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();

    public static a a() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public void b(Runnable runnable) {
        this.a.execute(runnable);
    }
}
