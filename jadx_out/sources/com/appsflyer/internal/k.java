package com.appsflyer.internal;

import android.net.TrafficStats;
import com.appsflyer.AFLogger;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static k values;
    ScheduledExecutorService AFInAppEventParameterName;
    final ThreadFactory AFInAppEventType = new ThreadFactory() { // from class: com.appsflyer.internal.k.4
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() { // from class: com.appsflyer.internal.k.4.5
                @Override // java.lang.Runnable
                public final void run() {
                    TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                    runnable.run();
                }
            });
        }
    };
    Executor AFKeystoreWrapper;
    ScheduledExecutorService valueOf;

    static void valueOf(ExecutorService executorService) {
        try {
            AFLogger.AFInAppEventParameterName("shut downing executor ...");
            executorService.shutdown();
            executorService.awaitTermination(10L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            AFLogger.AFInAppEventParameterName("InterruptedException!!!");
        } finally {
            if (!executorService.isTerminated()) {
                AFLogger.AFInAppEventParameterName("killing non-finished tasks");
            }
            executorService.shutdownNow();
        }
    }

    public final ScheduledThreadPoolExecutor AFInAppEventType() {
        ScheduledExecutorService scheduledExecutorService = this.valueOf;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.valueOf.isTerminated()) {
            this.valueOf = Executors.newScheduledThreadPool(2, this.AFInAppEventType);
        }
        return (ScheduledThreadPoolExecutor) this.valueOf;
    }

    public final Executor AFKeystoreWrapper() {
        Executor executor = this.AFKeystoreWrapper;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.AFKeystoreWrapper).isTerminated() || ((ThreadPoolExecutor) this.AFKeystoreWrapper).isTerminating()))) {
            this.AFKeystoreWrapper = Executors.newFixedThreadPool(2, this.AFInAppEventType);
        }
        return this.AFKeystoreWrapper;
    }
}
