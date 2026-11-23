package com.facebook.j0.z;

import android.os.Bundle;
import android.view.View;
import com.facebook.internal.h0;
import com.facebook.j0.m;
import com.facebook.r;
import com.facebook.u;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import l.d0.p;
import l.y.c.i;
import l.y.c.o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnClickListener {
    private final View.OnClickListener a;
    private final WeakReference<View> b;
    private final WeakReference<View> c;
    private final String d;
    public static final a f = new a(null);
    private static final Set<Integer> e = new HashSet();

    public static final class a {

        /* JADX INFO: renamed from: com.facebook.j0.z.f$a$a, reason: collision with other inner class name */
        static final class RunnableC0094a implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            RunnableC0094a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (com.facebook.internal.m0.i.a.d(this)) {
                    return;
                }
                try {
                    f.f.d(this.a, this.b, new float[0]);
                } catch (Throwable th) {
                    com.facebook.internal.m0.i.a.b(th, this);
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str, String str2, float[] fArr) {
            if (d.f(str)) {
                new m(r.f()).e(str, str2);
            } else if (d.e(str)) {
                f(str, str2, fArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean e(String str, String str2) {
            String strD = com.facebook.j0.z.b.d(str);
            if (strD == null) {
                return false;
            }
            if (!i.a(strD, "other")) {
                h0.y0(new RunnableC0094a(strD, str2));
            }
            return true;
        }

        private final void f(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float f : fArr) {
                    sb.append(f);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                u.c cVar = u.t;
                o oVar = o.a;
                String str3 = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{r.g()}, 1));
                i.d(str3, "java.lang.String.format(locale, format, *args)");
                u uVarX = cVar.x(null, str3, null, null);
                uVarX.G(bundle);
                uVarX.i();
            } catch (JSONException unused) {
            }
        }

        public final void c(View view, View view2, String str) {
            i.e(view, "hostView");
            i.e(view2, "rootView");
            i.e(str, "activityName");
            int iHashCode = view.hashCode();
            if (f.b().contains(Integer.valueOf(iHashCode))) {
                return;
            }
            com.facebook.j0.r.g.f.r(view, new f(view, view2, str, null));
            f.b().add(Integer.valueOf(iHashCode));
        }
    }

    static final class b implements Runnable {
        final /* synthetic */ JSONObject b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        b(JSONObject jSONObject, String str, String str2) {
            this.b = jSONObject;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] strArrO;
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                String strU = h0.u(r.f());
                if (strU == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = strU.toLowerCase();
                i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                float[] fArrA = com.facebook.j0.z.a.a(this.b, lowerCase);
                String strC = com.facebook.j0.z.a.c(this.c, f.a(f.this), lowerCase);
                if (fArrA == null || (strArrO = com.facebook.j0.w.d.o(com.facebook.j0.w.d.a.MTML_APP_EVENT_PREDICTION, new float[][]{fArrA}, new String[]{strC})) == null) {
                    return;
                }
                String str = strArrO[0];
                com.facebook.j0.z.b.a(this.d, str);
                if (!i.a(str, "other")) {
                    f.f.d(str, this.c, fArrA);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    private f(View view, View view2, String str) {
        this.a = com.facebook.j0.r.g.f.g(view);
        this.b = new WeakReference<>(view2);
        this.c = new WeakReference<>(view);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase();
        i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.d = p.t(lowerCase, "activity", "", false, 4, null);
    }

    public /* synthetic */ f(View view, View view2, String str, l.y.c.f fVar) {
        this(view, view2, str);
    }

    public static final /* synthetic */ String a(f fVar) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            return fVar.d;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    public static final /* synthetic */ Set b() {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    private final void c(String str, String str2, JSONObject jSONObject) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            h0.y0(new b(jSONObject, str2, str));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void d() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            View view = this.b.get();
            View view2 = this.c.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String strD = c.d(view2);
                String strB = com.facebook.j0.z.b.b(view2, strD);
                if (strB == null || f.e(strB, strD)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("view", c.b(view, view2));
                jSONObject.put("screenname", this.d);
                c(strB, strD, jSONObject);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            i.e(view, "view");
            View.OnClickListener onClickListener = this.a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            d();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
