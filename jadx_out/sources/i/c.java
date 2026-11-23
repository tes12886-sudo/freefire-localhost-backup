package i;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class c {
    private static final c d = new c();
    private final ExecutorService a;
    private final ScheduledExecutorService b;
    private final Executor c;

    private static class b implements Executor {
        private ThreadLocal<Integer> a;

        private b() {
            this.a = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            ThreadLocal<Integer> threadLocal = this.a;
            if (iIntValue == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Integer.valueOf(iIntValue));
            }
            return iIntValue;
        }

        private int b() {
            Integer num = this.a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    c.a().execute(runnable);
                }
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    private c() {
        this.a = !c() ? Executors.newCachedThreadPool() : i.b.b();
        this.b = Executors.newSingleThreadScheduledExecutor();
        this.c = new b();
    }

    public static ExecutorService a() {
        return d.a;
    }

    static Executor b() {
        return d.c;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }

    static ScheduledExecutorService d() {
        return d.b;
    }
}
