package j.d.a.c.f.e;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    ScheduledExecutorService a(int i2, ThreadFactory threadFactory, int i3);

    ExecutorService b(ThreadFactory threadFactory, int i2);
}
