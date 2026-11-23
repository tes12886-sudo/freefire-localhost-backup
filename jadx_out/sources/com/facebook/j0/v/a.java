package com.facebook.j0.v;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.FF.voiceengine.FFVoiceConst;
import com.facebook.internal.a0;
import com.facebook.internal.h0;
import com.facebook.internal.p;
import com.facebook.internal.t;
import com.facebook.internal.u;
import com.facebook.r;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l.s;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final String a;
    private static final ScheduledExecutorService b;
    private static volatile ScheduledFuture<?> c;
    private static final Object d;
    private static final AtomicInteger e;
    private static volatile h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static WeakReference<Activity> f673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f674l = new a();

    /* JADX INFO: renamed from: com.facebook.j0.v.a$a, reason: collision with other inner class name */
    static final class RunnableC0085a implements Runnable {
        public static final RunnableC0085a a = new RunnableC0085a();

        RunnableC0085a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                if (a.e(a.f674l) == null) {
                    a.f = h.f675g.b();
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class b implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ String b;

        /* JADX INFO: renamed from: com.facebook.j0.v.a$b$a, reason: collision with other inner class name */
        static final class RunnableC0086a implements Runnable {
            RunnableC0086a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (com.facebook.internal.m0.i.a.d(this)) {
                    return;
                }
                try {
                    a aVar = a.f674l;
                    if (a.e(aVar) == null) {
                        a.f = new h(Long.valueOf(b.this.a), null, null, 4, null);
                    }
                    if (a.f(aVar).get() <= 0) {
                        i.e(b.this.b, a.e(aVar), a.b(aVar));
                        h.f675g.a();
                        a.f = null;
                    }
                    synchronized (a.d(aVar)) {
                        a.c = null;
                        s sVar = s.a;
                    }
                } catch (Throwable th) {
                    com.facebook.internal.m0.i.a.b(th, this);
                }
            }
        }

        b(long j2, String str) {
            this.a = j2;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                a aVar = a.f674l;
                if (a.e(aVar) == null) {
                    a.f = new h(Long.valueOf(this.a), null, null, 4, null);
                }
                h hVarE = a.e(aVar);
                if (hVarE != null) {
                    hVarE.k(Long.valueOf(this.a));
                }
                if (a.f(aVar).get() <= 0) {
                    RunnableC0086a runnableC0086a = new RunnableC0086a();
                    synchronized (a.d(aVar)) {
                        a.c = a.h(aVar).schedule(runnableC0086a, aVar.r(), TimeUnit.SECONDS);
                        s sVar = s.a;
                    }
                }
                long jC = a.c(aVar);
                com.facebook.j0.v.d.e(this.b, jC > 0 ? (this.a - jC) / ((long) FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF) : 0L);
                h hVarE2 = a.e(aVar);
                if (hVarE2 != null) {
                    hVarE2.m();
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class c implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;

        c(long j2, String str, Context context) {
            this.a = j2;
            this.b = str;
            this.c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h hVarE;
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                a aVar = a.f674l;
                h hVarE2 = a.e(aVar);
                Long lE = hVarE2 != null ? hVarE2.e() : null;
                if (a.e(aVar) == null) {
                    a.f = new h(Long.valueOf(this.a), null, null, 4, null);
                    String str = this.b;
                    String strB = a.b(aVar);
                    Context context = this.c;
                    l.y.c.i.d(context, "appContext");
                    i.c(str, null, strB, context);
                } else if (lE != null) {
                    long jLongValue = this.a - lE.longValue();
                    if (jLongValue > aVar.r() * FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF) {
                        i.e(this.b, a.e(aVar), a.b(aVar));
                        String str2 = this.b;
                        String strB2 = a.b(aVar);
                        Context context2 = this.c;
                        l.y.c.i.d(context2, "appContext");
                        i.c(str2, null, strB2, context2);
                        a.f = new h(Long.valueOf(this.a), null, null, 4, null);
                    } else if (jLongValue > 1000 && (hVarE = a.e(aVar)) != null) {
                        hVarE.h();
                    }
                }
                h hVarE3 = a.e(aVar);
                if (hVarE3 != null) {
                    hVarE3.k(Long.valueOf(this.a));
                }
                h hVarE4 = a.e(aVar);
                if (hVarE4 != null) {
                    hVarE4.m();
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class d implements p.a {
        public static final d a = new d();

        d() {
        }

        @Override // com.facebook.internal.p.a
        public final void a(boolean z) {
            if (z) {
                com.facebook.j0.r.b.g();
            } else {
                com.facebook.j0.r.b.f();
            }
        }
    }

    public static final class e implements Application.ActivityLifecycleCallbacks {
        e() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.y.c.i.e(activity, "activity");
            a0.f.c(com.facebook.a0.APP_EVENTS, a.i(a.f674l), "onActivityCreated");
            com.facebook.j0.v.b.a();
            a.t(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            l.y.c.i.e(activity, "activity");
            a0.a aVar = a0.f;
            com.facebook.a0 a0Var = com.facebook.a0.APP_EVENTS;
            a aVar2 = a.f674l;
            aVar.c(a0Var, a.i(aVar2), "onActivityDestroyed");
            aVar2.u(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            l.y.c.i.e(activity, "activity");
            a0.a aVar = a0.f;
            com.facebook.a0 a0Var = com.facebook.a0.APP_EVENTS;
            a aVar2 = a.f674l;
            aVar.c(a0Var, a.i(aVar2), "onActivityPaused");
            com.facebook.j0.v.b.a();
            aVar2.v(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            l.y.c.i.e(activity, "activity");
            a0.f.c(com.facebook.a0.APP_EVENTS, a.i(a.f674l), "onActivityResumed");
            com.facebook.j0.v.b.a();
            a.w(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            l.y.c.i.e(activity, "activity");
            l.y.c.i.e(bundle, "outState");
            a0.f.c(com.facebook.a0.APP_EVENTS, a.i(a.f674l), "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            l.y.c.i.e(activity, "activity");
            a aVar = a.f674l;
            a.f672j = a.a(aVar) + 1;
            a0.f.c(com.facebook.a0.APP_EVENTS, a.i(aVar), "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            l.y.c.i.e(activity, "activity");
            a0.a aVar = a0.f;
            com.facebook.a0 a0Var = com.facebook.a0.APP_EVENTS;
            a aVar2 = a.f674l;
            aVar.c(a0Var, a.i(aVar2), "onActivityStopped");
            com.facebook.j0.g.b.g();
            a.f672j = a.a(aVar2) - 1;
        }
    }

    static {
        String canonicalName = a.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        a = canonicalName;
        b = Executors.newSingleThreadScheduledExecutor();
        d = new Object();
        e = new AtomicInteger(0);
        f669g = new AtomicBoolean(false);
    }

    private a() {
    }

    public static final /* synthetic */ int a(a aVar) {
        return f672j;
    }

    public static final /* synthetic */ String b(a aVar) {
        return f670h;
    }

    public static final /* synthetic */ long c(a aVar) {
        return f671i;
    }

    public static final /* synthetic */ Object d(a aVar) {
        return d;
    }

    public static final /* synthetic */ h e(a aVar) {
        return f;
    }

    public static final /* synthetic */ AtomicInteger f(a aVar) {
        return e;
    }

    public static final /* synthetic */ ScheduledExecutorService h(a aVar) {
        return b;
    }

    public static final /* synthetic */ String i(a aVar) {
        return a;
    }

    private final void o() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (d) {
            if (c != null && (scheduledFuture = c) != null) {
                scheduledFuture.cancel(false);
            }
            c = null;
            s sVar = s.a;
        }
    }

    public static final Activity p() {
        WeakReference<Activity> weakReference = f673k;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static final UUID q() {
        h hVar;
        if (f == null || (hVar = f) == null) {
            return null;
        }
        return hVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r() {
        t tVarJ = u.j(r.g());
        return tVarJ != null ? tVarJ.j() : com.facebook.j0.v.e.a();
    }

    public static final boolean s() {
        return f672j == 0;
    }

    public static final void t(Activity activity) {
        b.execute(RunnableC0085a.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(Activity activity) {
        com.facebook.j0.r.b.k(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(Activity activity) {
        AtomicInteger atomicInteger = e;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        o();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strT = h0.t(activity);
        com.facebook.j0.r.b.l(activity);
        b.execute(new b(jCurrentTimeMillis, strT));
    }

    public static final void w(Activity activity) {
        l.y.c.i.e(activity, "activity");
        f673k = new WeakReference<>(activity);
        e.incrementAndGet();
        f674l.o();
        long jCurrentTimeMillis = System.currentTimeMillis();
        f671i = jCurrentTimeMillis;
        String strT = h0.t(activity);
        com.facebook.j0.r.b.m(activity);
        com.facebook.j0.q.a.d(activity);
        com.facebook.j0.z.d.h(activity);
        com.facebook.j0.t.f.b();
        b.execute(new c(jCurrentTimeMillis, strT, activity.getApplicationContext()));
    }

    public static final void x(Application application, String str) {
        l.y.c.i.e(application, "application");
        if (f669g.compareAndSet(false, true)) {
            p.a(p.b.CodelessEvents, d.a);
            f670h = str;
            application.registerActivityLifecycleCallbacks(new e());
        }
    }
}
