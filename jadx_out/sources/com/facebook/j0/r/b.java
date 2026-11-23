package com.facebook.j0.r;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.internal.h0;
import com.facebook.internal.t;
import com.facebook.r;
import com.facebook.u;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import l.y.c.i;
import l.y.c.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static SensorManager b;
    private static e c;
    private static String d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f648h = new b();
    private static final f a = new f();
    private static final AtomicBoolean e = new AtomicBoolean(true);
    private static final AtomicBoolean f = new AtomicBoolean(false);

    static final class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                u.c cVar = u.t;
                o oVar = o.a;
                boolean z = true;
                String str = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{this.a}, 1));
                i.d(str, "java.lang.String.format(locale, format, *args)");
                u uVarX = cVar.x(null, str, null, null);
                Bundle bundleS = uVarX.s();
                if (bundleS == null) {
                    bundleS = new Bundle();
                }
                com.facebook.internal.b bVarE = com.facebook.internal.b.f597h.e(r.f());
                JSONArray jSONArray = new JSONArray();
                String str2 = Build.MODEL;
                if (str2 == null) {
                    str2 = "";
                }
                jSONArray.put(str2);
                if ((bVarE != null ? bVarE.h() : null) != null) {
                    jSONArray.put(bVarE.h());
                } else {
                    jSONArray.put("");
                }
                jSONArray.put("0");
                jSONArray.put(com.facebook.j0.v.b.f() ? "1" : "0");
                Locale localeY = h0.y();
                jSONArray.put(localeY.getLanguage() + "_" + localeY.getCountry());
                String string = jSONArray.toString();
                i.d(string, "extInfoArray.toString()");
                bundleS.putString("device_session_id", b.h());
                bundleS.putString("extinfo", string);
                uVarX.G(bundleS);
                JSONObject jSONObjectC = uVarX.i().c();
                b bVar = b.f648h;
                AtomicBoolean atomicBooleanB = b.b(bVar);
                if (jSONObjectC == null || !jSONObjectC.optBoolean("is_app_indexing_enabled", false)) {
                    z = false;
                }
                atomicBooleanB.set(z);
                if (b.b(bVar).get()) {
                    e eVarA = b.a(bVar);
                    if (eVarA != null) {
                        eVarA.j();
                    }
                } else {
                    b.d(bVar, null);
                }
                b.c(bVar, false);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.j0.r.b$b, reason: collision with other inner class name */
    static final class C0074b implements f.a {
        final /* synthetic */ t a;
        final /* synthetic */ String b;

        C0074b(t tVar, String str) {
            this.a = tVar;
            this.b = str;
        }

        @Override // com.facebook.j0.r.f.a
        public final void a() {
            t tVar = this.a;
            boolean z = tVar != null && tVar.b();
            boolean z2 = r.m();
            if (z && z2) {
                b.e(this.b);
            }
        }
    }

    private b() {
    }

    public static final /* synthetic */ e a(b bVar) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean b(b bVar) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(b bVar, boolean z) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return;
        }
        try {
            f647g = z;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
        }
    }

    public static final /* synthetic */ void d(b bVar, String str) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return;
        }
        try {
            d = str;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
        }
    }

    public static final void e(String str) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return;
        }
        try {
            if (f647g) {
                return;
            }
            f647g = true;
            r.n().execute(new a(str));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
        }
    }

    public static final void f() {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return;
        }
        try {
            e.set(false);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
        }
    }

    public static final void g() {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return;
        }
        try {
            e.set(true);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
        }
    }

    public static final String h() {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return null;
        }
        try {
            if (d == null) {
                d = UUID.randomUUID().toString();
            }
            String str = d;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
            return null;
        }
    }

    public static final boolean i() {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return false;
        }
        try {
            return f.get();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
            return false;
        }
    }

    public static final boolean j() {
        com.facebook.internal.m0.i.a.d(b.class);
        return false;
    }

    public static final void k(Activity activity) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return;
        }
        try {
            i.e(activity, "activity");
            c.f650h.a().f(activity);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
        }
    }

    public static final void l(Activity activity) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return;
        }
        try {
            i.e(activity, "activity");
            if (e.get()) {
                c.f650h.a().h(activity);
                e eVar = c;
                if (eVar != null) {
                    eVar.l();
                }
                SensorManager sensorManager = b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(a);
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
        }
    }

    public static final void m(Activity activity) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return;
        }
        try {
            i.e(activity, "activity");
            if (e.get()) {
                c.f650h.a().e(activity);
                Context applicationContext = activity.getApplicationContext();
                String strG = r.g();
                t tVarJ = com.facebook.internal.u.j(strG);
                if ((tVarJ != null && tVarJ.b()) || j()) {
                    SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                    b = sensorManager;
                    if (sensorManager == null) {
                        return;
                    }
                    if (sensorManager == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    c = new e(activity);
                    f fVar = a;
                    fVar.a(new C0074b(tVarJ, strG));
                    SensorManager sensorManager2 = b;
                    if (sensorManager2 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    sensorManager2.registerListener(fVar, defaultSensor, 2);
                    if (tVarJ != null && tVarJ.b()) {
                        e eVar = c;
                        if (eVar == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        eVar.j();
                    }
                }
                if (!j() || f.get()) {
                    return;
                }
                e(strG);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
        }
    }

    public static final void n(boolean z) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return;
        }
        try {
            f.set(z);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
        }
    }
}
