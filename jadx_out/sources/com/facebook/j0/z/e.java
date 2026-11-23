package com.facebook.j0.z;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {
    private final WeakReference<Activity> a;
    private final Handler b;
    private final AtomicBoolean c;
    public static final a e = new a(null);
    private static final Map<Integer, e> d = new HashMap();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final void a(Activity activity) {
            i.e(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapB = e.b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object eVar = mapB.get(numValueOf);
            if (eVar == null) {
                eVar = new e(activity, null);
                mapB.put(numValueOf, eVar);
            }
            e.c((e) eVar);
        }

        public final void b(Activity activity) {
            i.e(activity, "activity");
            int iHashCode = activity.hashCode();
            e eVar = (e) e.b().get(Integer.valueOf(iHashCode));
            if (eVar != null) {
                e.b().remove(Integer.valueOf(iHashCode));
                e.d(eVar);
            }
        }
    }

    static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                View viewE = com.facebook.j0.v.b.e((Activity) e.a(e.this).get());
                Activity activity = (Activity) e.a(e.this).get();
                if (viewE != null && activity != null) {
                    for (View view : c.a(viewE)) {
                        if (!com.facebook.j0.r.g.d.g(view)) {
                            String strD = c.d(view);
                            if ((strD.length() > 0) && strD.length() <= 300) {
                                f.a aVar = f.f;
                                String localClassName = activity.getLocalClassName();
                                i.d(localClassName, "activity.localClassName");
                                aVar.c(view, viewE, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    private e(Activity activity) {
        this.a = new WeakReference<>(activity);
        this.b = new Handler(Looper.getMainLooper());
        this.c = new AtomicBoolean(false);
    }

    public /* synthetic */ e(Activity activity, l.y.c.f fVar) {
        this(activity);
    }

    public static final /* synthetic */ WeakReference a(e eVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return null;
        }
        try {
            return eVar.a;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
            return null;
        }
    }

    public static final /* synthetic */ Map b() {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(e eVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return;
        }
        try {
            eVar.f();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
        }
    }

    public static final /* synthetic */ void d(e eVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return;
        }
        try {
            eVar.g();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
        }
    }

    private final void e() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            b bVar = new b();
            Thread threadCurrentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            i.d(mainLooper, "Looper.getMainLooper()");
            if (threadCurrentThread == mainLooper.getThread()) {
                bVar.run();
            } else {
                this.b.post(bVar);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void f() {
        View viewE;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            if (this.c.getAndSet(true) || (viewE = com.facebook.j0.v.b.e(this.a.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
            i.d(viewTreeObserver, "observer");
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                e();
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void g() {
        View viewE;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            if (this.c.getAndSet(false) && (viewE = com.facebook.j0.v.b.e(this.a.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
                i.d(viewTreeObserver, "observer");
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            e();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
