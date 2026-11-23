package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    private static final String a = "com.facebook.r";
    private static Executor c;
    private static volatile String d;
    private static volatile String e;
    private static volatile String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile Boolean f728g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile boolean f730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Context f732k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f736o;
    public static boolean p;
    public static boolean q;
    private static boolean v;
    public static final r w = new r();
    private static final HashSet<a0> b = l.t.h0.c(a0.DEVELOPER_ERRORS);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static AtomicLong f729h = new AtomicLong(65536);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f733l = 64206;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ReentrantLock f734m = new ReentrantLock();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String f735n = com.facebook.internal.f0.a();
    private static final AtomicBoolean r = new AtomicBoolean(false);
    private static volatile String s = "instagram.com";
    private static volatile String t = "facebook.com";
    private static a u = c.a;

    public interface a {
        u a(com.facebook.a aVar, String str, JSONObject jSONObject, u.b bVar);
    }

    public interface b {
        void a();
    }

    static final class c implements a {
        public static final c a = new c();

        c() {
        }

        @Override // com.facebook.r.a
        public final u a(com.facebook.a aVar, String str, JSONObject jSONObject, u.b bVar) {
            return u.t.x(aVar, str, jSONObject, bVar);
        }
    }

    static final class d implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        d(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                r rVar = r.w;
                Context context = this.a;
                l.y.c.i.d(context, "applicationContext");
                rVar.B(context, this.b);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class e<V> implements Callable {
        public static final e a = new e();

        e() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File call() {
            return r.a(r.w).getCacheDir();
        }
    }

    static final class f implements com.facebook.internal.p.a {
        public static final f a = new f();

        f() {
        }

        @Override // com.facebook.internal.p.a
        public final void a(boolean z) {
            if (z) {
                com.facebook.internal.m0.e.a();
            }
        }
    }

    static final class g implements com.facebook.internal.p.a {
        public static final g a = new g();

        g() {
        }

        @Override // com.facebook.internal.p.a
        public final void a(boolean z) {
            if (z) {
                com.facebook.j0.i.a();
            }
        }
    }

    static final class h implements com.facebook.internal.p.a {
        public static final h a = new h();

        h() {
        }

        @Override // com.facebook.internal.p.a
        public final void a(boolean z) {
            if (z) {
                r.f736o = true;
            }
        }
    }

    static final class i implements com.facebook.internal.p.a {
        public static final i a = new i();

        i() {
        }

        @Override // com.facebook.internal.p.a
        public final void a(boolean z) {
            if (z) {
                r.p = true;
            }
        }
    }

    static final class j implements com.facebook.internal.p.a {
        public static final j a = new j();

        j() {
        }

        @Override // com.facebook.internal.p.a
        public final void a(boolean z) {
            if (z) {
                r.q = true;
            }
        }
    }

    static final class k<V> implements Callable {
        final /* synthetic */ b a;

        k(b bVar) {
            this.a = bVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void call() {
            com.facebook.d.f575g.e().h();
            d0.e.a().d();
            if (com.facebook.a.p.g()) {
                b0.b bVar = b0.f572i;
                if (bVar.b() == null) {
                    bVar.a();
                }
            }
            b bVar2 = this.a;
            if (bVar2 != null) {
                bVar2.a();
            }
            com.facebook.j0.g.a aVar = com.facebook.j0.g.b;
            aVar.e(r.f(), r.b(r.w));
            i0.m();
            Context applicationContext = r.f().getApplicationContext();
            l.y.c.i.d(applicationContext, "getApplicationContext().applicationContext");
            aVar.f(applicationContext).a();
            return null;
        }
    }

    private r() {
    }

    public static final void A(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return;
            }
            if (d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String strSubstring = (String) obj;
                    Locale locale = Locale.ROOT;
                    l.y.c.i.d(locale, "Locale.ROOT");
                    String lowerCase = strSubstring.toLowerCase(locale);
                    l.y.c.i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (l.d0.p.x(lowerCase, "fb", false, 2, null)) {
                        strSubstring = strSubstring.substring(2);
                        l.y.c.i.d(strSubstring, "(this as java.lang.String).substring(startIndex)");
                    }
                    d = strSubstring;
                } else if (obj instanceof Number) {
                    throw new n("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (e == null) {
                e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f == null) {
                f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f733l == 64206) {
                f733l = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f728g == null) {
                f728g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(Context context, String str) {
        try {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                com.facebook.internal.b bVarE = com.facebook.internal.b.f597h.e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String str2 = str + "ping";
                long j2 = sharedPreferences.getLong(str2, 0L);
                try {
                    JSONObject jSONObjectA = com.facebook.j0.v.c.a(com.facebook.j0.v.c.a.MOBILE_INSTALL_EVENT, bVarE, com.facebook.j0.g.b.b(context), s(context), context);
                    l.y.c.o oVar = l.y.c.o.a;
                    String str3 = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                    l.y.c.i.d(str3, "java.lang.String.format(format, *args)");
                    u uVarA = u.a(null, str3, jSONObjectA, null);
                    if (j2 == 0 && uVarA.i().b() == null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putLong(str2, System.currentTimeMillis());
                        editorEdit.apply();
                    }
                } catch (JSONException e2) {
                    throw new n("An error occurred while publishing install.", e2);
                }
            } catch (Exception e3) {
                com.facebook.internal.h0.e0("Facebook-publish", e3);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public static final void C(Context context, String str) {
        if (com.facebook.internal.m0.i.a.d(r.class)) {
            return;
        }
        try {
            l.y.c.i.e(context, "context");
            l.y.c.i.e(str, "applicationId");
            n().execute(new d(context.getApplicationContext(), str));
            if (com.facebook.internal.p.g(com.facebook.internal.p.b.OnDeviceEventProcessing) && com.facebook.j0.x.a.b()) {
                com.facebook.j0.x.a.d(str, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, r.class);
        }
    }

    public static final synchronized void D(Context context) {
        l.y.c.i.e(context, "applicationContext");
        E(context, null);
    }

    public static final synchronized void E(Context context, b bVar) {
        l.y.c.i.e(context, "applicationContext");
        AtomicBoolean atomicBoolean = r;
        if (atomicBoolean.get()) {
            if (bVar != null) {
                bVar.a();
            }
            return;
        }
        com.facebook.internal.i0.g(context, false);
        com.facebook.internal.i0.i(context, false);
        Context applicationContext = context.getApplicationContext();
        l.y.c.i.d(applicationContext, "applicationContext.applicationContext");
        f732k = applicationContext;
        com.facebook.j0.g.b.b(context);
        Context context2 = f732k;
        if (context2 == null) {
            l.y.c.i.q("applicationContext");
            throw null;
        }
        A(context2);
        if (com.facebook.internal.h0.Y(d)) {
            throw new n("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        atomicBoolean.set(true);
        if (i()) {
            d();
        }
        Context context3 = f732k;
        if (context3 == null) {
            l.y.c.i.q("applicationContext");
            throw null;
        }
        if ((context3 instanceof Application) && i0.g()) {
            Context context4 = f732k;
            if (context4 == null) {
                l.y.c.i.q("applicationContext");
                throw null;
            }
            if (context4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            com.facebook.j0.v.a.x((Application) context4, d);
        }
        com.facebook.internal.u.k();
        com.facebook.internal.c0.G();
        com.facebook.internal.c.a aVar = com.facebook.internal.c.d;
        Context context5 = f732k;
        if (context5 == null) {
            l.y.c.i.q("applicationContext");
            throw null;
        }
        aVar.a(context5);
        new com.facebook.internal.z(e.a);
        com.facebook.internal.p.a(com.facebook.internal.p.b.Instrument, f.a);
        com.facebook.internal.p.a(com.facebook.internal.p.b.AppEvents, g.a);
        com.facebook.internal.p.a(com.facebook.internal.p.b.ChromeCustomTabsPrefetching, h.a);
        com.facebook.internal.p.a(com.facebook.internal.p.b.IgnoreAppSwitchToLoggedOut, i.a);
        com.facebook.internal.p.a(com.facebook.internal.p.b.BypassAppSwitch, j.a);
        n().execute(new FutureTask(new k(bVar)));
    }

    public static final /* synthetic */ Context a(r rVar) {
        Context context = f732k;
        if (context != null) {
            return context;
        }
        l.y.c.i.q("applicationContext");
        throw null;
    }

    public static final /* synthetic */ String b(r rVar) {
        return d;
    }

    public static final void d() {
        v = true;
    }

    public static final boolean e() {
        return i0.e();
    }

    public static final Context f() {
        com.facebook.internal.i0.o();
        Context context = f732k;
        if (context != null) {
            return context;
        }
        l.y.c.i.q("applicationContext");
        throw null;
    }

    public static final String g() {
        com.facebook.internal.i0.o();
        String str = d;
        if (str != null) {
            return str;
        }
        throw new n("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String h() {
        com.facebook.internal.i0.o();
        return e;
    }

    public static final boolean i() {
        return i0.f();
    }

    public static final boolean j() {
        return i0.g();
    }

    public static final int k() {
        com.facebook.internal.i0.o();
        return f733l;
    }

    public static final String l() {
        com.facebook.internal.i0.o();
        return f;
    }

    public static final boolean m() {
        return i0.h();
    }

    public static final Executor n() {
        ReentrantLock reentrantLock = f734m;
        reentrantLock.lock();
        try {
            if (c == null) {
                c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            l.s sVar = l.s.a;
            reentrantLock.unlock();
            Executor executor = c;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String o() {
        return t;
    }

    public static final String p() {
        String str = a;
        l.y.c.o oVar = l.y.c.o.a;
        String str2 = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f735n}, 1));
        l.y.c.i.d(str2, "java.lang.String.format(format, *args)");
        com.facebook.internal.h0.f0(str, str2);
        return f735n;
    }

    public static final String q() {
        com.facebook.a aVarE = com.facebook.a.p.e();
        return com.facebook.internal.h0.B(aVarE != null ? aVarE.i() : null);
    }

    public static final String r() {
        return s;
    }

    public static final boolean s(Context context) {
        l.y.c.i.e(context, "context");
        com.facebook.internal.i0.o();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final long t() {
        com.facebook.internal.i0.o();
        return f729h.get();
    }

    public static final String u() {
        return "12.2.0";
    }

    public static final boolean v() {
        return f730i;
    }

    public static final synchronized boolean w() {
        return v;
    }

    public static final boolean x() {
        return r.get();
    }

    public static final boolean y() {
        return f731j;
    }

    public static final boolean z(a0 a0Var) {
        boolean z;
        l.y.c.i.e(a0Var, "behavior");
        HashSet<a0> hashSet = b;
        synchronized (hashSet) {
            z = v() && hashSet.contains(a0Var);
        }
        return z;
    }
}
