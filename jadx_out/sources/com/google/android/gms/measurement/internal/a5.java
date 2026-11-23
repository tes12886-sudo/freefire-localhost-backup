package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.bd;
import com.google.android.gms.internal.measurement.yc;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a5 implements w5 {
    private static volatile a5 I;
    private long A;
    private volatile Boolean B;
    protected Boolean C;
    protected Boolean D;
    private volatile boolean E;
    private int F;
    final long H;
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final ta f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f1160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h4 f1161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r3 f1162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final x4 f1163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g9 f1164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ca f1165l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m3 f1166m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f1167n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r7 f1168o;
    private final d7 p;
    private final d2 q;
    private final h7 r;
    private final String s;
    private l3 t;
    private r8 u;
    private n v;
    private j3 w;
    private k4 x;
    private Boolean z;
    private boolean y = false;
    private final AtomicInteger G = new AtomicInteger(0);

    a5(d6 d6Var) {
        p3 p3VarR;
        String str;
        Bundle bundle;
        com.google.android.gms.common.internal.q.k(d6Var);
        Context context = d6Var.a;
        ta taVar = new ta(context);
        this.f = taVar;
        c3.a = taVar;
        this.a = context;
        this.b = d6Var.b;
        this.c = d6Var.c;
        this.d = d6Var.d;
        this.e = d6Var.f1180h;
        this.B = d6Var.e;
        this.s = d6Var.f1182j;
        this.E = true;
        com.google.android.gms.internal.measurement.o1 o1Var = d6Var.f1179g;
        if (o1Var != null && (bundle = o1Var.f1098g) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.C = (Boolean) obj;
            }
            Object obj2 = o1Var.f1098g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.D = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.p6.b(context);
        com.google.android.gms.common.util.e eVarD = com.google.android.gms.common.util.h.d();
        this.f1167n = eVarD;
        Long l2 = d6Var.f1181i;
        this.H = l2 != null ? l2.longValue() : eVarD.a();
        this.f1160g = new f(this);
        h4 h4Var = new h4(this);
        h4Var.m();
        this.f1161h = h4Var;
        r3 r3Var = new r3(this);
        r3Var.m();
        this.f1162i = r3Var;
        ca caVar = new ca(this);
        caVar.m();
        this.f1165l = caVar;
        m3 m3Var = new m3(this);
        m3Var.m();
        this.f1166m = m3Var;
        this.q = new d2(this);
        r7 r7Var = new r7(this);
        r7Var.k();
        this.f1168o = r7Var;
        d7 d7Var = new d7(this);
        d7Var.k();
        this.p = d7Var;
        g9 g9Var = new g9(this);
        g9Var.k();
        this.f1164k = g9Var;
        h7 h7Var = new h7(this);
        h7Var.m();
        this.r = h7Var;
        x4 x4Var = new x4(this);
        x4Var.m();
        this.f1163j = x4Var;
        com.google.android.gms.internal.measurement.o1 o1Var2 = d6Var.f1179g;
        boolean z = o1Var2 == null || o1Var2.b == 0;
        if (context.getApplicationContext() instanceof Application) {
            d7 d7VarF = F();
            if (d7VarF.a.a.getApplicationContext() instanceof Application) {
                Application application = (Application) d7VarF.a.a.getApplicationContext();
                if (d7VarF.c == null) {
                    d7VarF.c = new c7(d7VarF, null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(d7VarF.c);
                    application.registerActivityLifecycleCallbacks(d7VarF.c);
                    p3VarR = d7VarF.a.d().w();
                    str = "Registered activity lifecycle callback";
                }
            }
            x4Var.r(new z4(this, d6Var));
        }
        p3VarR = d().r();
        str = "Application context is not an Application";
        p3VarR.a(str);
        x4Var.r(new z4(this, d6Var));
    }

    public static a5 h(Context context, com.google.android.gms.internal.measurement.o1 o1Var, Long l2) {
        Bundle bundle;
        if (o1Var != null && (o1Var.e == null || o1Var.f == null)) {
            o1Var = new com.google.android.gms.internal.measurement.o1(o1Var.a, o1Var.b, o1Var.c, o1Var.d, null, null, o1Var.f1098g, null);
        }
        com.google.android.gms.common.internal.q.k(context);
        com.google.android.gms.common.internal.q.k(context.getApplicationContext());
        if (I == null) {
            synchronized (a5.class) {
                if (I == null) {
                    I = new a5(new d6(context, o1Var, l2));
                }
            }
        } else if (o1Var != null && (bundle = o1Var.f1098g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.q.k(I);
            I.B = Boolean.valueOf(o1Var.f1098g.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.q.k(I);
        return I;
    }

    static /* synthetic */ void t(a5 a5Var, d6 d6Var) {
        a5Var.f().h();
        a5Var.f1160g.l();
        n nVar = new n(a5Var);
        nVar.m();
        a5Var.v = nVar;
        j3 j3Var = new j3(a5Var, d6Var.f);
        j3Var.k();
        a5Var.w = j3Var;
        l3 l3Var = new l3(a5Var);
        l3Var.k();
        a5Var.t = l3Var;
        r8 r8Var = new r8(a5Var);
        r8Var.k();
        a5Var.u = r8Var;
        a5Var.f1165l.n();
        a5Var.f1161h.n();
        a5Var.x = new k4(a5Var);
        a5Var.w.l();
        p3 p3VarU = a5Var.d().u();
        a5Var.f1160g.p();
        p3VarU.b("App measurement initialized, version", 42004L);
        a5Var.d().u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strP = j3Var.p();
        if (TextUtils.isEmpty(a5Var.b)) {
            if (a5Var.G().H(strP)) {
                a5Var.d().u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                p3 p3VarU2 = a5Var.d().u();
                String strValueOf = String.valueOf(strP);
                p3VarU2.a(strValueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(strValueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "));
            }
        }
        a5Var.d().v().a("Debug-level message logging enabled");
        if (a5Var.F != a5Var.G.get()) {
            a5Var.d().o().c("Not all components initialized", Integer.valueOf(a5Var.F), Integer.valueOf(a5Var.G.get()));
        }
        a5Var.y = true;
    }

    static final void u() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void v(u5 u5Var) {
        if (u5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void w(f4 f4Var) {
        if (f4Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (f4Var.i()) {
            return;
        }
        String strValueOf = String.valueOf(f4Var.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    private static final void x(v5 v5Var) {
        if (v5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (v5Var.k()) {
            return;
        }
        String strValueOf = String.valueOf(v5Var.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    @Pure
    public final h4 A() {
        v(this.f1161h);
        return this.f1161h;
    }

    public final r3 B() {
        r3 r3Var = this.f1162i;
        if (r3Var == null || !r3Var.k()) {
            return null;
        }
        return this.f1162i;
    }

    @Pure
    public final g9 C() {
        w(this.f1164k);
        return this.f1164k;
    }

    @SideEffectFree
    public final k4 D() {
        return this.x;
    }

    @SideEffectFree
    final x4 E() {
        return this.f1163j;
    }

    @Pure
    public final d7 F() {
        w(this.p);
        return this.p;
    }

    @Pure
    public final ca G() {
        v(this.f1165l);
        return this.f1165l;
    }

    @Pure
    public final m3 H() {
        v(this.f1166m);
        return this.f1166m;
    }

    @Pure
    public final l3 I() {
        w(this.t);
        return this.t;
    }

    @Pure
    public final h7 J() {
        x(this.r);
        return this.r;
    }

    @Pure
    public final boolean K() {
        return TextUtils.isEmpty(this.b);
    }

    @Pure
    public final String L() {
        return this.b;
    }

    @Pure
    public final String M() {
        return this.c;
    }

    @Pure
    public final String N() {
        return this.d;
    }

    @Pure
    public final boolean O() {
        return this.e;
    }

    @Pure
    public final String P() {
        return this.s;
    }

    @Pure
    public final r7 Q() {
        w(this.f1168o);
        return this.f1168o;
    }

    @Pure
    public final r8 R() {
        w(this.u);
        return this.u;
    }

    @Pure
    public final n S() {
        x(this.v);
        return this.v;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    @Pure
    public final ta a() {
        return this.f;
    }

    @Pure
    public final j3 b() {
        w(this.w);
        return this.w;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    @Pure
    public final Context c() {
        return this.a;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    @Pure
    public final r3 d() {
        x(this.f1162i);
        return this.f1162i;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    @Pure
    public final com.google.android.gms.common.util.e e() {
        return this.f1167n;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    @Pure
    public final x4 f() {
        x(this.f1163j);
        return this.f1163j;
    }

    @Pure
    public final d2 g() {
        d2 d2Var = this.q;
        if (d2Var != null) {
            return d2Var;
        }
        throw new IllegalStateException("Component not created");
    }

    final void i(boolean z) {
        this.B = Boolean.valueOf(z);
    }

    public final boolean j() {
        return this.B != null && this.B.booleanValue();
    }

    public final boolean k() {
        return l() == 0;
    }

    public final int l() {
        f().h();
        if (this.f1160g.A()) {
            return 1;
        }
        Boolean bool = this.D;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        f().h();
        if (!this.E) {
            return 8;
        }
        Boolean boolR = A().r();
        if (boolR != null) {
            return boolR.booleanValue() ? 0 : 3;
        }
        f fVar = this.f1160g;
        ta taVar = fVar.a.f;
        Boolean boolY = fVar.y("firebase_analytics_collection_enabled");
        if (boolY != null) {
            return boolY.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.C;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (!this.f1160g.w(null, f3.T) || this.B == null || this.B.booleanValue()) ? 0 : 7;
    }

    public final void m(boolean z) {
        f().h();
        this.E = z;
    }

    public final boolean n() {
        f().h();
        return this.E;
    }

    final void o() {
        this.F++;
    }

    final void p() {
        this.G.incrementAndGet();
    }

    protected final boolean q() {
        if (!this.y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        f().h();
        Boolean bool = this.z;
        if (bool == null || this.A == 0 || (!bool.booleanValue() && Math.abs(this.f1167n.c() - this.A) > 1000)) {
            this.A = this.f1167n.c();
            boolean z = true;
            Boolean boolValueOf = Boolean.valueOf(G().E("android.permission.INTERNET") && G().E("android.permission.ACCESS_NETWORK_STATE") && (com.google.android.gms.common.o.c.a(this.a).f() || this.f1160g.H() || (ca.a0(this.a) && ca.D(this.a, false))));
            this.z = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!G().o(b().q(), b().r(), b().s()) && TextUtils.isEmpty(b().r())) {
                    z = false;
                }
                this.z = Boolean.valueOf(z);
            }
        }
        return this.z.booleanValue();
    }

    public final void r() {
        f().h();
        x(J());
        String strP = b().p();
        Pair<String, Boolean> pairO = A().o(strP);
        if (!this.f1160g.B() || ((Boolean) pairO.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairO.first)) {
            d().v().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        h7 h7VarJ = J();
        h7VarJ.l();
        ConnectivityManager connectivityManager = (ConnectivityManager) h7VarJ.a.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            d().r().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        ca caVarG = G();
        b().a.f1160g.p();
        URL urlZ = caVarG.Z(42004L, strP, (String) pairO.first, A().s.a() - 1);
        if (urlZ != null) {
            h7 h7VarJ2 = J();
            y4 y4Var = new y4(this);
            h7VarJ2.h();
            h7VarJ2.l();
            com.google.android.gms.common.internal.q.k(urlZ);
            com.google.android.gms.common.internal.q.k(y4Var);
            h7VarJ2.a.f().u(new f7(h7VarJ2, strP, urlZ, null, null, y4Var, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    final /* synthetic */ void s(String str, int i2, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> listQueryIntentActivities;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                A().r.b(true);
                if (bArr != null || bArr.length == 0) {
                    d().v().a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", "");
                    String strOptString2 = jSONObject.optString("gclid", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(strOptString)) {
                        d().v().a("Deferred Deep Link is empty.");
                        return;
                    }
                    ca caVarG = G();
                    a5 a5Var = caVarG.a;
                    if (!TextUtils.isEmpty(strOptString) && (listQueryIntentActivities = caVarG.a.a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0)) != null && !listQueryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", strOptString2);
                        bundle.putString("_cis", "ddp");
                        this.p.X("auto", "_cmp", bundle);
                        ca caVarG2 = G();
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = caVarG2.a.a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString("deeplink", strOptString);
                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                caVarG2.a.a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                return;
                            }
                            return;
                        } catch (RuntimeException e) {
                            caVarG2.a.d().o().b("Failed to persist Deferred Deep Link. exception", e);
                            return;
                        }
                    }
                    d().r().c("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                    return;
                } catch (JSONException e2) {
                    d().o().b("Failed to parse the Deferred Deep Link response. exception", e2);
                    return;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                A().r.b(true);
                if (bArr != null) {
                }
                d().v().a("Deferred Deep Link response empty.");
                return;
            }
        }
        d().r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
    }

    protected final void y(com.google.android.gms.internal.measurement.o1 o1Var) {
        g gVar;
        f().h();
        g gVarT = A().t();
        h4 h4VarA = A();
        a5 a5Var = h4VarA.a;
        h4VarA.h();
        int i2 = 100;
        int i3 = h4VarA.p().getInt("consent_source", 100);
        f fVar = this.f1160g;
        a5 a5Var2 = fVar.a;
        Boolean boolY = fVar.y("google_analytics_default_allow_ad_storage");
        f fVar2 = this.f1160g;
        a5 a5Var3 = fVar2.a;
        Boolean boolY2 = fVar2.y("google_analytics_default_allow_analytics_storage");
        if (!(boolY == null && boolY2 == null) && A().s(-10)) {
            gVar = new g(boolY, boolY2);
            i2 = -10;
        } else {
            if (TextUtils.isEmpty(b().q()) || !(i3 == 0 || i3 == 30 || i3 == 10 || i3 == 30 || i3 == 30 || i3 == 40)) {
                bd.a();
                if ((!this.f1160g.w(null, f3.A0) || TextUtils.isEmpty(b().q())) && o1Var != null && o1Var.f1098g != null && A().s(30)) {
                    gVar = g.b(o1Var.f1098g);
                    if (!gVar.equals(g.c)) {
                        i2 = 30;
                    }
                }
            } else {
                F().V(g.c, -10, this.H);
            }
            gVar = null;
        }
        if (gVar != null) {
            F().V(gVar, i2, this.H);
            gVarT = gVar;
        }
        F().W(gVarT);
        if (A().e.a() == 0) {
            d().w().b("Persisting first open", Long.valueOf(this.H));
            A().e.b(this.H);
        }
        F().f1190n.c();
        if (q()) {
            if (!TextUtils.isEmpty(b().q()) || !TextUtils.isEmpty(b().r())) {
                ca caVarG = G();
                String strQ = b().q();
                h4 h4VarA2 = A();
                h4VarA2.h();
                String string = h4VarA2.p().getString("gmp_app_id", null);
                String strR = b().r();
                h4 h4VarA3 = A();
                h4VarA3.h();
                if (caVarG.p(strQ, string, strR, h4VarA3.p().getString("admob_app_id", null))) {
                    d().u().a("Rechecking which service to use due to a GMP App Id change");
                    h4 h4VarA4 = A();
                    h4VarA4.h();
                    Boolean boolR = h4VarA4.r();
                    SharedPreferences.Editor editorEdit = h4VarA4.p().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolR != null) {
                        h4VarA4.q(boolR);
                    }
                    I().o();
                    this.u.t();
                    this.u.p();
                    A().e.b(this.H);
                    A().f1210g.b(null);
                }
                h4 h4VarA5 = A();
                String strQ2 = b().q();
                h4VarA5.h();
                SharedPreferences.Editor editorEdit2 = h4VarA5.p().edit();
                editorEdit2.putString("gmp_app_id", strQ2);
                editorEdit2.apply();
                h4 h4VarA6 = A();
                String strR2 = b().r();
                h4VarA6.h();
                SharedPreferences.Editor editorEdit3 = h4VarA6.p().edit();
                editorEdit3.putString("admob_app_id", strR2);
                editorEdit3.apply();
            }
            if (!A().t().h()) {
                A().f1210g.b(null);
            }
            F().r(A().f1210g.a());
            yc.a();
            if (this.f1160g.w(null, f3.n0)) {
                try {
                    G().a.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(A().t.a())) {
                        d().r().a("Remote config removed with active feature rollouts");
                        A().t.b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(b().q()) || !TextUtils.isEmpty(b().r())) {
                boolean zK = k();
                if (!A().v() && !this.f1160g.A()) {
                    A().u(!zK);
                }
                if (zK) {
                    F().u();
                }
                C().d.a();
                R().T(new AtomicReference<>());
                R().o(A().w.a());
            }
        } else if (k()) {
            if (!G().E("android.permission.INTERNET")) {
                d().o().a("App is missing INTERNET permission");
            }
            if (!G().E("android.permission.ACCESS_NETWORK_STATE")) {
                d().o().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!com.google.android.gms.common.o.c.a(this.a).f() && !this.f1160g.H()) {
                if (!ca.a0(this.a)) {
                    d().o().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!ca.D(this.a, false)) {
                    d().o().a("AppMeasurementService not registered/enabled");
                }
            }
            d().o().a("Uploading is not possible. App measurement disabled");
        }
        A().f1217n.b(true);
    }

    @Pure
    public final f z() {
        return this.f1160g;
    }
}
