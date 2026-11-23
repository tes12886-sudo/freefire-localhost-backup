package com.facebook.j0.r;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.FF.voiceengine.FFVoiceConst;
import com.facebook.internal.a0;
import com.facebook.internal.h0;
import com.facebook.internal.y;
import com.facebook.r;
import com.facebook.u;
import com.facebook.x;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import l.y.c.i;
import l.y.c.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final String e;
    public static final a f = new a(null);
    private final Handler a;
    private final WeakReference<Activity> b;
    private Timer c;
    private String d;

    public static final class a {

        /* JADX INFO: renamed from: com.facebook.j0.r.e$a$a, reason: collision with other inner class name */
        static final class C0076a implements u.b {
            public static final C0076a a = new C0076a();

            C0076a() {
            }

            @Override // com.facebook.u.b
            public final void b(x xVar) {
                i.e(xVar, "it");
                a0.f.c(com.facebook.a0.APP_EVENTS, e.d(), "App index sent to FB!");
            }
        }

        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final u a(String str, com.facebook.a aVar, String str2, String str3) {
            i.e(str3, "requestType");
            if (str == null) {
                return null;
            }
            u.c cVar = u.t;
            o oVar = o.a;
            String str4 = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            i.d(str4, "java.lang.String.format(locale, format, *args)");
            u uVarX = cVar.x(aVar, str4, null, null);
            Bundle bundleS = uVarX.s();
            if (bundleS == null) {
                bundleS = new Bundle();
            }
            bundleS.putString("tree", str);
            bundleS.putString("app_version", com.facebook.j0.v.b.d());
            bundleS.putString("platform", "android");
            bundleS.putString("request_type", str3);
            if (i.a(str3, "app_indexing")) {
                bundleS.putString("device_session_id", com.facebook.j0.r.b.h());
            }
            uVarX.G(bundleS);
            uVarX.C(C0076a.a);
            return uVarX;
        }
    }

    private static final class b implements Callable<String> {
        private final WeakReference<View> a;

        public b(View view) {
            i.e(view, "rootView");
            this.a = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = this.a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            i.d(strEncodeToString, "Base64.encodeToString(ou…eArray(), Base64.NO_WRAP)");
            return strEncodeToString;
        }
    }

    static final class c implements Runnable {
        final /* synthetic */ TimerTask b;

        c(TimerTask timerTask) {
            this.b = timerTask;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                try {
                    Timer timerB = e.b(e.this);
                    if (timerB != null) {
                        timerB.cancel();
                    }
                    e.h(e.this, null);
                    Timer timer = new Timer();
                    timer.scheduleAtFixedRate(this.b, 0L, FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF);
                    e.g(e.this, timer);
                } catch (Exception e) {
                    Log.e(e.d(), "Error scheduling indexing job", e);
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    public static final class d extends TimerTask {
        d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) e.a(e.this).get();
                View viewE = com.facebook.j0.v.b.e(activity);
                if (activity != null && viewE != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    i.d(simpleName, "activity.javaClass.simpleName");
                    if (com.facebook.j0.r.b.i()) {
                        if (y.b()) {
                            com.facebook.j0.r.g.e.a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(viewE));
                        e.e(e.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e) {
                            Log.e(e.d(), "Failed to take screenshot.", e);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(com.facebook.j0.r.g.f.d(viewE));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused) {
                            Log.e(e.d(), "Failed to create JSONObject");
                        }
                        String string = jSONObject.toString();
                        i.d(string, "viewTree.toString()");
                        e.f(e.this, string);
                    }
                }
            } catch (Exception e2) {
                Log.e(e.d(), "UI Component tree indexing failure!", e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.j0.r.e$e, reason: collision with other inner class name */
    static final class RunnableC0077e implements Runnable {
        final /* synthetic */ String b;

        RunnableC0077e(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                String strJ0 = h0.j0(this.b);
                com.facebook.a aVarE = com.facebook.a.p.e();
                if (strJ0 == null || !i.a(strJ0, e.c(e.this))) {
                    e.this.i(e.f.a(this.b, aVarE, r.g(), "app_indexing"), strJ0);
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static {
        String canonicalName = e.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        i.d(canonicalName, "ViewIndexer::class.java.canonicalName ?: \"\"");
        e = canonicalName;
    }

    public e(Activity activity) {
        i.e(activity, "activity");
        this.b = new WeakReference<>(activity);
        this.d = null;
        this.a = new Handler(Looper.getMainLooper());
    }

    public static final /* synthetic */ WeakReference a(e eVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return null;
        }
        try {
            return eVar.b;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
            return null;
        }
    }

    public static final /* synthetic */ Timer b(e eVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return null;
        }
        try {
            return eVar.c;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
            return null;
        }
    }

    public static final /* synthetic */ String c(e eVar) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return null;
        }
        try {
            return eVar.d;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
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

    public static final /* synthetic */ Handler e(e eVar) {
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

    public static final /* synthetic */ void f(e eVar, String str) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return;
        }
        try {
            eVar.k(str);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
        }
    }

    public static final /* synthetic */ void g(e eVar, Timer timer) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return;
        }
        try {
            eVar.c = timer;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
        }
    }

    public static final /* synthetic */ void h(e eVar, String str) {
        if (com.facebook.internal.m0.i.a.d(e.class)) {
            return;
        }
        try {
            eVar.d = str;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, e.class);
        }
    }

    private final void k(String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            r.n().execute(new RunnableC0077e(str));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void i(u uVar, String str) {
        if (com.facebook.internal.m0.i.a.d(this) || uVar == null) {
            return;
        }
        try {
            x xVarI = uVar.i();
            try {
                JSONObject jSONObjectC = xVarI.c();
                if (jSONObjectC == null) {
                    Log.e(e, "Error sending UI component tree to Facebook: " + xVarI.b());
                    return;
                }
                if (i.a("true", jSONObjectC.optString("success"))) {
                    a0.f.c(com.facebook.a0.APP_EVENTS, e, "Successfully send UI component tree to server");
                    this.d = str;
                }
                if (jSONObjectC.has("is_app_indexing_enabled")) {
                    com.facebook.j0.r.b.n(jSONObjectC.getBoolean("is_app_indexing_enabled"));
                }
            } catch (JSONException e2) {
                Log.e(e, "Error decoding server response.", e2);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void j() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            try {
                r.n().execute(new c(new d()));
            } catch (RejectedExecutionException e2) {
                Log.e(e, "Error scheduling indexing job", e2);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void l() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            if (this.b.get() != null) {
                try {
                    Timer timer = this.c;
                    if (timer != null) {
                        timer.cancel();
                    }
                    this.c = null;
                } catch (Exception e2) {
                    Log.e(e, "Error unscheduling indexing job", e2);
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
