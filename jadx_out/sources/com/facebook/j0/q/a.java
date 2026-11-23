package com.facebook.j0.q;

import android.app.Activity;
import com.facebook.internal.h0;
import com.facebook.internal.t;
import com.facebook.internal.u;
import com.facebook.r;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final String a = "com.facebook.j0.q.a";
    private static boolean b;
    public static final a c = new a();

    /* JADX INFO: renamed from: com.facebook.j0.q.a$a, reason: collision with other inner class name */
    static final class RunnableC0072a implements Runnable {
        public static final RunnableC0072a a = new RunnableC0072a();

        RunnableC0072a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                if (com.facebook.internal.b.f597h.h(r.f())) {
                    return;
                }
                a aVar = a.c;
                a.b(aVar);
                a.a(aVar, true);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    private a() {
    }

    public static final /* synthetic */ void a(a aVar, boolean z) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            b = z;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    public static final /* synthetic */ void b(a aVar) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            aVar.e();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    public static final void c() {
        try {
            if (com.facebook.internal.m0.i.a.d(a.class)) {
                return;
            }
            try {
                r.n().execute(RunnableC0072a.a);
            } catch (Exception e) {
                h0.e0(a, e);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    public static final void d(Activity activity) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            i.e(activity, "activity");
            try {
                if (b && !c.e.c().isEmpty()) {
                    d.f.e(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    private final void e() {
        String strG;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            t tVarO = u.o(r.g(), false);
            if (tVarO == null || (strG = tVarO.g()) == null) {
                return;
            }
            c.e.d(strG);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
