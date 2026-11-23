package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class p {
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.q.a("Firebase-Messaging-Trigger-Topics-Io"));
    }

    static ScheduledExecutorService b() {
        return new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.q.a("Firebase-Messaging-Init"));
    }

    static ExecutorService c() {
        j.d.a.c.f.g.o.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.q.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    static ExecutorService d() {
        return Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.q.a("Firebase-Messaging-Network-Io"));
    }

    static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.q.a("Firebase-Messaging-Task"));
    }

    static ScheduledExecutorService f() {
        return new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.q.a("Firebase-Messaging-Topics-Io"));
    }

    static Executor g() {
        return a("Firebase-Messaging-Trigger-Topics-Io");
    }
}
