package com.facebook.j0.z;

import android.app.Activity;
import com.facebook.internal.t;
import com.facebook.internal.u;
import com.facebook.r;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l.y.c.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d d = new d();
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static final Set<String> b = new LinkedHashSet();
    private static final Set<String> c = new LinkedHashSet();

    static final class a implements Runnable {
        public static final a a = new a();

        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                d dVar = d.d;
                if (d.a(dVar).get()) {
                    return;
                }
                d.a(dVar).set(true);
                d.b(dVar);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    private d() {
    }

    public static final /* synthetic */ AtomicBoolean a(d dVar) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return null;
        }
        try {
            return a;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(d dVar) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return;
        }
        try {
            dVar.d();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
        }
    }

    public static final synchronized void c() {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return;
        }
        try {
            r.n().execute(a.a);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
        }
    }

    private final void d() {
        String strL;
        File fileJ;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            t tVarO = u.o(r.g(), false);
            if (tVarO == null || (strL = tVarO.l()) == null) {
                return;
            }
            g(strL);
            if (((!b.isEmpty()) || (!c.isEmpty())) && (fileJ = com.facebook.j0.w.d.j(com.facebook.j0.w.d.a.MTML_APP_EVENT_PREDICTION)) != null) {
                com.facebook.j0.z.a.d(fileJ);
                Activity activityP = com.facebook.j0.v.a.p();
                if (activityP != null) {
                    h(activityP);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public static final boolean e(String str) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return false;
        }
        try {
            i.e(str, "event");
            return c.contains(str);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return false;
        }
    }

    public static final boolean f(String str) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return false;
        }
        try {
            i.e(str, "event");
            return b.contains(str);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return false;
        }
    }

    public static final void h(Activity activity) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return;
        }
        try {
            i.e(activity, "activity");
            try {
                if (a.get() && com.facebook.j0.z.a.f() && (!b.isEmpty() || !c.isEmpty())) {
                    e.e.a(activity);
                } else {
                    e.e.b(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
        }
    }

    public final void g(String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    Set<String> set = b;
                    String string = jSONArray.getString(i2);
                    i.d(string, "jsonArray.getString(i)");
                    set.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    Set<String> set2 = c;
                    String string2 = jSONArray2.getString(i3);
                    i.d(string2, "jsonArray.getString(i)");
                    set2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
