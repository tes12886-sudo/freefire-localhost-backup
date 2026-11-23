package j.d.a.c.f.d;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class l implements j {
    /* synthetic */ l(k kVar) {
    }

    @Override // j.d.a.c.f.d.j
    public final ExecutorService a(ThreadFactory threadFactory, int i2) {
        return b(1, threadFactory, 1);
    }

    @Override // j.d.a.c.f.d.j
    public final ExecutorService b(int i2, ThreadFactory threadFactory, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
