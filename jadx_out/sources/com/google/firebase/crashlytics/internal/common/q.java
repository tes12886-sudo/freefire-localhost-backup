package com.google.firebase.crashlytics.internal.common;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    class a implements ThreadFactory {
        final /* synthetic */ String a;
        final /* synthetic */ AtomicLong b;

        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.q$a$a, reason: collision with other inner class name */
        class C0131a extends g {
            final /* synthetic */ Runnable a;

            C0131a(a aVar, Runnable runnable) {
                this.a = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.g
            public void a() {
                this.a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.a = str;
            this.b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0131a(this, runnable));
            threadNewThread.setName(this.a + this.b.getAndIncrement());
            return threadNewThread;
        }
    }

    class b extends g {
        final /* synthetic */ String a;
        final /* synthetic */ ExecutorService b;
        final /* synthetic */ long c;
        final /* synthetic */ TimeUnit d;

        b(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
            this.a = str;
            this.b = executorService;
            this.c = j2;
            this.d = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.g
        public void a() {
            try {
                com.google.firebase.crashlytics.internal.a.f().b("Executing shutdown hook for " + this.a);
                this.b.shutdown();
                if (this.b.awaitTermination(this.c, this.d)) {
                    return;
                }
                com.google.firebase.crashlytics.internal.a.f().b(this.a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.b.shutdownNow();
            } catch (InterruptedException unused) {
                com.google.firebase.crashlytics.internal.a.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.a));
                this.b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j2, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService executorServiceE = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
