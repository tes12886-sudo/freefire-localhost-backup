package j.g.a.a.a.y;

import j.g.a.a.a.m;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final int a;
    private static final int b;
    private static final int c;

    class a implements ThreadFactory {
        final /* synthetic */ String a;
        final /* synthetic */ AtomicLong b;

        a(String str, AtomicLong atomicLong) {
            this.a = str;
            this.b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName(this.a + this.b.getAndIncrement());
            return threadNewThread;
        }
    }

    class b implements Runnable {
        final /* synthetic */ ExecutorService a;
        final /* synthetic */ long b;
        final /* synthetic */ TimeUnit c;
        final /* synthetic */ String d;

        b(ExecutorService executorService, long j2, TimeUnit timeUnit, String str) {
            this.a = executorService;
            this.b = j2;
            this.c = timeUnit;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.shutdown();
                if (this.a.awaitTermination(this.b, this.c)) {
                    return;
                }
                m.g().d("Twitter", this.d + " did not shutdown in the allocated time. Requesting immediate shutdown.");
                this.a.shutdownNow();
            } catch (InterruptedException unused) {
                m.g().d("Twitter", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.d));
                this.a.shutdownNow();
            }
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        a = iAvailableProcessors;
        b = iAvailableProcessors + 1;
        c = (iAvailableProcessors * 2) + 1;
    }

    static void a(String str, ExecutorService executorService) {
        b(str, executorService, 1L, TimeUnit.SECONDS);
    }

    static void b(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(executorService, j2, timeUnit, str), "Twitter Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(b, c, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), d(str));
        a(str, threadPoolExecutor);
        return threadPoolExecutor;
    }

    static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }
}
