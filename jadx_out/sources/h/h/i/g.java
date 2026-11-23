package h.h.i;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class g {

    private static class a implements ThreadFactory {
        private String a;
        private int b;

        /* JADX INFO: renamed from: h.h.i.g$a$a, reason: collision with other inner class name */
        private static class C0195a extends Thread {
            private final int a;

            C0195a(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.a = i2;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.a);
                super.run();
            }
        }

        a(String str, int i2) {
            this.a = str;
            this.b = i2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0195a(runnable, this.a, this.b);
        }
    }

    private static class b<T> implements Runnable {
        private Callable<T> a;
        private h.h.k.a<T> b;
        private Handler c;

        class a implements Runnable {
            final /* synthetic */ h.h.k.a a;
            final /* synthetic */ Object b;

            a(b bVar, h.h.k.a aVar, Object obj) {
                this.a = aVar;
                this.b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.a.accept(this.b);
            }
        }

        b(Handler handler, Callable<T> callable, h.h.k.a<T> aVar) {
            this.a = callable;
            this.b = aVar;
            this.c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.c.post(new a(this, this.b, tCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i2, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i3, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static <T> void b(Executor executor, Callable<T> callable, h.h.k.a<T> aVar) {
        executor.execute(new b(h.h.i.b.a(), callable, aVar));
    }

    static <T> T c(ExecutorService executorService, Callable<T> callable, int i2) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
