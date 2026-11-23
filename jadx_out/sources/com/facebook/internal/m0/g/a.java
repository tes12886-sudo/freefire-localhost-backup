package com.facebook.internal.m0.g;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.internal.m0.f;
import com.facebook.r;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final int a = Process.myUid();
    private static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    private static String c = "";
    private static final Runnable d = RunnableC0060a.a;

    /* JADX INFO: renamed from: com.facebook.internal.m0.g.a$a, reason: collision with other inner class name */
    static final class RunnableC0060a implements Runnable {
        public static final RunnableC0060a a = new RunnableC0060a();

        RunnableC0060a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                Object systemService = r.f().getSystemService("activity");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                }
                a.a((ActivityManager) systemService);
            } catch (Exception unused) {
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    private a() {
    }

    public static final void a(ActivityManager activityManager) {
        if (com.facebook.internal.m0.i.a.d(a.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == a) {
                        Looper mainLooper = Looper.getMainLooper();
                        i.d(mainLooper, "Looper.getMainLooper()");
                        Thread thread = mainLooper.getThread();
                        i.d(thread, "Looper.getMainLooper().thread");
                        String strD = f.d(thread);
                        if (!i.a(strD, c) && f.g(thread)) {
                            c = strD;
                            com.facebook.internal.m0.b.a.a(processErrorStateInfo.shortMsg, strD).g();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    public static final void b() {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            b.scheduleAtFixedRate(d, 0L, 500, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }
}
