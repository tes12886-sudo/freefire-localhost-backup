package com.facebook.j0;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.a0;
import com.facebook.internal.t;
import com.facebook.q;
import com.facebook.r;
import com.facebook.u;
import com.facebook.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final String a;
    private static final int b;
    private static volatile com.facebook.j0.d c;
    private static final ScheduledExecutorService d;
    private static ScheduledFuture<?> e;
    private static final Runnable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f641g = new e();

    static final class a implements Runnable {
        final /* synthetic */ com.facebook.j0.a a;
        final /* synthetic */ com.facebook.j0.c b;

        a(com.facebook.j0.a aVar, com.facebook.j0.c cVar) {
            this.a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                e eVar = e.f641g;
                e.a(eVar).a(this.a, this.b);
                if (g.b.c() != g.b.EXPLICIT_ONLY && e.a(eVar).d() > e.c(eVar)) {
                    e.l(j.EVENT_THRESHOLD);
                } else if (e.d(eVar) == null) {
                    e.g(eVar, e.e(eVar).schedule(e.b(eVar), 15, TimeUnit.SECONDS));
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class b implements u.b {
        final /* synthetic */ com.facebook.j0.a a;
        final /* synthetic */ u b;
        final /* synthetic */ o c;
        final /* synthetic */ l d;

        b(com.facebook.j0.a aVar, u uVar, o oVar, l lVar) {
            this.a = aVar;
            this.b = uVar;
            this.c = oVar;
            this.d = lVar;
        }

        @Override // com.facebook.u.b
        public final void b(x xVar) {
            l.y.c.i.e(xVar, "response");
            e.n(this.a, this.b, xVar, this.c, this.d);
        }
    }

    static final class c implements Runnable {
        final /* synthetic */ j a;

        c(j jVar) {
            this.a = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                e.l(this.a);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class d implements Runnable {
        public static final d a = new d();

        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                e.g(e.f641g, null);
                if (g.b.c() != g.b.EXPLICIT_ONLY) {
                    e.l(j.TIMER);
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.j0.e$e, reason: collision with other inner class name */
    static final class RunnableC0069e implements Runnable {
        final /* synthetic */ com.facebook.j0.a a;
        final /* synthetic */ o b;

        RunnableC0069e(com.facebook.j0.a aVar, o oVar) {
            this.a = aVar;
            this.b = oVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                com.facebook.j0.f.a(this.a, this.b);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class f implements Runnable {
        public static final f a = new f();

        f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                e eVar = e.f641g;
                com.facebook.j0.f.b(e.a(eVar));
                e.f(eVar, new com.facebook.j0.d());
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static {
        String name = e.class.getName();
        l.y.c.i.d(name, "AppEventQueue::class.java.name");
        a = name;
        b = 100;
        c = new com.facebook.j0.d();
        d = Executors.newSingleThreadScheduledExecutor();
        f = d.a;
    }

    private e() {
    }

    public static final /* synthetic */ com.facebook.j0.d a(e eVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
            return null;
        }
    }

    public static final /* synthetic */ Runnable b(e eVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
            return null;
        }
    }

    public static final /* synthetic */ int c(e eVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return 0;
        }
        try {
            return b;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
            return 0;
        }
    }

    public static final /* synthetic */ ScheduledFuture d(e eVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledExecutorService e(e eVar) {
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

    public static final /* synthetic */ void f(e eVar, com.facebook.j0.d dVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return;
        }
        try {
            c = dVar;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
        }
    }

    public static final /* synthetic */ void g(e eVar, ScheduledFuture scheduledFuture) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return;
        }
        try {
            e = scheduledFuture;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
        }
    }

    public static final void h(com.facebook.j0.a aVar, com.facebook.j0.c cVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return;
        }
        try {
            l.y.c.i.e(aVar, "accessTokenAppId");
            l.y.c.i.e(cVar, "appEvent");
            d.execute(new a(aVar, cVar));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
        }
    }

    public static final u i(com.facebook.j0.a aVar, o oVar, boolean z, l lVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return null;
        }
        try {
            l.y.c.i.e(aVar, "accessTokenAppId");
            l.y.c.i.e(oVar, "appEvents");
            l.y.c.i.e(lVar, "flushState");
            String strB = aVar.b();
            t tVarO = com.facebook.internal.u.o(strB, false);
            u.c cVar = u.t;
            l.y.c.o oVar2 = l.y.c.o.a;
            String str = String.format("%s/activities", Arrays.copyOf(new Object[]{strB}, 1));
            l.y.c.i.d(str, "java.lang.String.format(format, *args)");
            u uVarX = cVar.x(null, str, null, null);
            uVarX.D(true);
            Bundle bundleS = uVarX.s();
            if (bundleS == null) {
                bundleS = new Bundle();
            }
            bundleS.putString("access_token", aVar.a());
            String strC = m.b.c();
            if (strC != null) {
                bundleS.putString("device_token", strC);
            }
            String strI = h.f645j.i();
            if (strI != null) {
                bundleS.putString("install_referrer", strI);
            }
            uVarX.G(bundleS);
            int iE = oVar.e(uVarX, r.f(), tVarO != null ? tVarO.m() : false, z);
            if (iE == 0) {
                return null;
            }
            lVar.c(lVar.a() + iE);
            uVarX.C(new b(aVar, uVarX, oVar, lVar));
            return uVarX;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
            return null;
        }
    }

    public static final List<u> j(com.facebook.j0.d dVar, l lVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return null;
        }
        try {
            l.y.c.i.e(dVar, "appEventCollection");
            l.y.c.i.e(lVar, "flushResults");
            boolean zS = r.s(r.f());
            ArrayList arrayList = new ArrayList();
            for (com.facebook.j0.a aVar : dVar.f()) {
                o oVarC = dVar.c(aVar);
                if (oVarC == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                u uVarI = i(aVar, oVarC, zS, lVar);
                if (uVarI != null) {
                    arrayList.add(uVarI);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
            return null;
        }
    }

    public static final void k(j jVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return;
        }
        try {
            l.y.c.i.e(jVar, "reason");
            d.execute(new c(jVar));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
        }
    }

    public static final void l(j jVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return;
        }
        try {
            l.y.c.i.e(jVar, "reason");
            c.b(com.facebook.j0.f.c());
            try {
                l lVarP = p(jVar, c);
                if (lVarP != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", lVarP.a());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", lVarP.b());
                    h.q.a.a.b(r.f()).d(intent);
                }
            } catch (Exception e2) {
                Log.w(a, "Caught unexpected exception while flushing app events: ", e2);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
        }
    }

    public static final Set<com.facebook.j0.a> m() {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return null;
        }
        try {
            return c.f();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
            return null;
        }
    }

    public static final void n(com.facebook.j0.a aVar, u uVar, x xVar, o oVar, l lVar) {
        String string;
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return;
        }
        try {
            l.y.c.i.e(aVar, "accessTokenAppId");
            l.y.c.i.e(uVar, "request");
            l.y.c.i.e(xVar, "response");
            l.y.c.i.e(oVar, "appEvents");
            l.y.c.i.e(lVar, "flushState");
            q qVarB = xVar.b();
            String str = "Success";
            k kVar = k.SUCCESS;
            boolean z = true;
            if (qVarB != null) {
                if (qVarB.b() == -1) {
                    str = "Failed: No Connectivity";
                    kVar = k.NO_CONNECTIVITY;
                } else {
                    l.y.c.o oVar2 = l.y.c.o.a;
                    str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{xVar.toString(), qVarB.toString()}, 2));
                    l.y.c.i.d(str, "java.lang.String.format(format, *args)");
                    kVar = k.SERVER_ERROR;
                }
            }
            if (r.z(a0.APP_EVENTS)) {
                try {
                    string = new JSONArray((String) uVar.u()).toString(2);
                    l.y.c.i.d(string, "jsonArray.toString(2)");
                } catch (JSONException unused) {
                    string = "<Can't encode events for debug logging>";
                }
                com.facebook.internal.a0.f.d(a0.APP_EVENTS, a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(uVar.o()), str, string);
            }
            if (qVarB == null) {
                z = false;
            }
            oVar.b(z);
            k kVar2 = k.NO_CONNECTIVITY;
            if (kVar == kVar2) {
                r.n().execute(new RunnableC0069e(aVar, oVar));
            }
            if (kVar == k.SUCCESS || lVar.b() == kVar2) {
                return;
            }
            lVar.d(kVar);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
        }
    }

    public static final void o() {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return;
        }
        try {
            d.execute(f.a);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
        }
    }

    public static final l p(j jVar, com.facebook.j0.d dVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return null;
        }
        try {
            l.y.c.i.e(jVar, "reason");
            l.y.c.i.e(dVar, "appEventCollection");
            l lVar = new l();
            List<u> listJ = j(dVar, lVar);
            if (!(!listJ.isEmpty())) {
                return null;
            }
            com.facebook.internal.a0.f.d(a0.APP_EVENTS, a, "Flushing %d events due to %s.", Integer.valueOf(lVar.a()), jVar.toString());
            Iterator<u> it = listJ.iterator();
            while (it.hasNext()) {
                it.next().i();
            }
            return lVar;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
            return null;
        }
    }
}
