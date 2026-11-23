package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.kd;
import com.google.android.gms.internal.measurement.yc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class d7 extends f4 {
    protected c7 c;
    private b6 d;
    private final Set<c6> e;
    private boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference<String> f1183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f1184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f1185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicLong f1187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f1188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final la f1190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f1191o;
    private final ba p;

    protected d7(a5 a5Var) {
        super(a5Var);
        this.e = new CopyOnWriteArraySet();
        this.f1184h = new Object();
        this.f1191o = true;
        this.p = new s6(this);
        this.f1183g = new AtomicReference<>();
        this.f1185i = new g(null, null);
        this.f1186j = 100;
        this.f1188l = -1L;
        this.f1189m = 100;
        this.f1187k = new AtomicLong(0L);
        this.f1190n = new la(a5Var);
    }

    static /* synthetic */ void J(d7 d7Var, g gVar, int i2, long j2, boolean z, boolean z2) {
        d7Var.h();
        d7Var.j();
        if (j2 <= d7Var.f1188l && g.m(d7Var.f1189m, i2)) {
            d7Var.a.d().u().b("Dropped out-of-date consent setting, proposed settings", gVar);
            return;
        }
        h4 h4VarA = d7Var.a.A();
        a5 a5Var = h4VarA.a;
        h4VarA.h();
        if (!h4VarA.s(i2)) {
            d7Var.a.d().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i2));
            return;
        }
        SharedPreferences.Editor editorEdit = h4VarA.p().edit();
        editorEdit.putString("consent_settings", gVar.d());
        editorEdit.putInt("consent_source", i2);
        editorEdit.apply();
        d7Var.f1188l = j2;
        d7Var.f1189m = i2;
        d7Var.a.R().J(z);
        if (z2) {
            d7Var.a.R().T(new AtomicReference<>());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(Boolean bool, boolean z) {
        h();
        j();
        this.a.d().v().b("Setting app measurement enabled (FE)", bool);
        this.a.A().q(bool);
        if (z) {
            h4 h4VarA = this.a.A();
            a5 a5Var = h4VarA.a;
            h4VarA.h();
            SharedPreferences.Editor editorEdit = h4VarA.p().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.a.n() || !(bool == null || bool.booleanValue())) {
            M();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        Long lValueOf;
        h();
        String strA = this.a.A().f1216m.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(true != "true".equals(strA) ? 0L : 1L);
            }
            p("app", "_npa", lValueOf, this.a.e().a());
        }
        if (!this.a.k() || !this.f1191o) {
            this.a.d().v().a("Updating Scion state (FE)");
            this.a.R().I();
            return;
        }
        this.a.d().v().a("Recording app launch after enabling measurement for the first time (FE)");
        u();
        kd.a();
        if (this.a.z().w(null, f3.o0)) {
            this.a.C().d.a();
        }
        this.a.f().r(new i6(this));
    }

    public final void A(Bundle bundle, long j2) {
        com.google.android.gms.common.internal.q.k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.a.d().r().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        com.google.android.gms.common.internal.q.k(bundle2);
        x5.b(bundle2, "app_id", String.class, null);
        x5.b(bundle2, "origin", String.class, null);
        x5.b(bundle2, "name", String.class, null);
        x5.b(bundle2, "value", Object.class, null);
        x5.b(bundle2, "trigger_event_name", String.class, null);
        x5.b(bundle2, "trigger_timeout", Long.class, 0L);
        x5.b(bundle2, "timed_out_event_name", String.class, null);
        x5.b(bundle2, "timed_out_event_params", Bundle.class, null);
        x5.b(bundle2, "triggered_event_name", String.class, null);
        x5.b(bundle2, "triggered_event_params", Bundle.class, null);
        x5.b(bundle2, "time_to_live", Long.class, 0L);
        x5.b(bundle2, "expired_event_name", String.class, null);
        x5.b(bundle2, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.q.g(bundle2.getString("name"));
        com.google.android.gms.common.internal.q.g(bundle2.getString("origin"));
        com.google.android.gms.common.internal.q.k(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j2);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.a.G().q0(string) != 0) {
            this.a.d().o().b("Invalid conditional user property name", this.a.H().r(string));
            return;
        }
        if (this.a.G().x(string, obj) != 0) {
            this.a.d().o().c("Invalid conditional user property value", this.a.H().r(string), obj);
            return;
        }
        Object objY = this.a.G().y(string, obj);
        if (objY == null) {
            this.a.d().o().c("Unable to normalize conditional user property value", this.a.H().r(string), obj);
            return;
        }
        x5.a(bundle2, objY);
        long j3 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            this.a.z();
            if (j3 > 15552000000L || j3 < 1) {
                this.a.d().o().c("Invalid conditional user property timeout", this.a.H().r(string), Long.valueOf(j3));
                return;
            }
        }
        long j4 = bundle2.getLong("time_to_live");
        this.a.z();
        if (j4 > 15552000000L || j4 < 1) {
            this.a.d().o().c("Invalid conditional user property time to live", this.a.H().r(string), Long.valueOf(j4));
        } else {
            this.a.f().r(new n6(this, bundle2));
        }
    }

    public final void B(String str, String str2, Bundle bundle) {
        long jA = this.a.e().a();
        com.google.android.gms.common.internal.q.g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.a.f().r(new o6(this, bundle2));
    }

    public final ArrayList<Bundle> C(String str, String str2) {
        if (this.a.f().o()) {
            this.a.d().o().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        this.a.a();
        if (ta.a()) {
            this.a.d().o().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.f().s(atomicReference, 5000L, "get conditional user properties", new q6(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return ca.Y(list);
        }
        this.a.d().o().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    public final Map<String, Object> D(String str, String str2, boolean z) {
        p3 p3VarO;
        String str3;
        if (!this.a.f().o()) {
            this.a.a();
            if (ta.a()) {
                p3VarO = this.a.d().o();
                str3 = "Cannot get user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                this.a.f().s(atomicReference, 5000L, "get user properties", new r6(this, atomicReference, null, str, str2, z));
                List<y9> list = (List) atomicReference.get();
                if (list != null) {
                    h.f.a aVar = new h.f.a(list.size());
                    for (y9 y9Var : list) {
                        Object objF = y9Var.f();
                        if (objF != null) {
                            aVar.put(y9Var.b, objF);
                        }
                    }
                    return aVar;
                }
                this.a.d().o().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            }
            return Collections.emptyMap();
        }
        p3VarO = this.a.d().o();
        str3 = "Cannot get user properties from analytics worker thread";
        p3VarO.a(str3);
        return Collections.emptyMap();
    }

    public final String E() {
        k7 k7VarW = this.a.Q().w();
        if (k7VarW != null) {
            return k7VarW.a;
        }
        return null;
    }

    public final String F() {
        k7 k7VarW = this.a.Q().w();
        if (k7VarW != null) {
            return k7VarW.b;
        }
        return null;
    }

    public final String G() {
        if (this.a.L() != null) {
            return this.a.L();
        }
        try {
            return j7.a(this.a.c(), "google_app_id", this.a.P());
        } catch (IllegalStateException e) {
            this.a.d().o().b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    final /* synthetic */ void H(Bundle bundle) {
        if (bundle == null) {
            this.a.A().w.b(new Bundle());
            return;
        }
        Bundle bundleA = this.a.A().w.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.a.G().t0(obj)) {
                    this.a.G().A(this.p, null, 27, null, null, 0, this.a.z().w(null, f3.w0));
                }
                this.a.d().t().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (ca.F(str)) {
                this.a.d().t().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                bundleA.remove(str);
            } else {
                ca caVarG = this.a.G();
                this.a.z();
                if (caVarG.u0("param", str, 100, obj)) {
                    this.a.G().z(bundleA, str, obj);
                }
            }
        }
        this.a.G();
        int iM = this.a.z().m();
        if (bundleA.size() > iM) {
            int i2 = 0;
            for (String str2 : new TreeSet(bundleA.keySet())) {
                i2++;
                if (i2 > iM) {
                    bundleA.remove(str2);
                }
            }
            this.a.G().A(this.p, null, 26, null, null, 0, this.a.z().w(null, f3.w0));
            this.a.d().t().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.a.A().w.b(bundleA);
        this.a.R().o(bundleA);
    }

    public final void N() {
        if (!(this.a.c().getApplicationContext() instanceof Application) || this.c == null) {
            return;
        }
        ((Application) this.a.c().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
    }

    public final Boolean O() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.a.f().s(atomicReference, 15000L, "boolean test flag value", new p6(this, atomicReference));
    }

    public final String P() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.a.f().s(atomicReference, 15000L, "String test flag value", new t6(this, atomicReference));
    }

    public final Long Q() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.a.f().s(atomicReference, 15000L, "long test flag value", new u6(this, atomicReference));
    }

    public final Integer R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.a.f().s(atomicReference, 15000L, "int test flag value", new v6(this, atomicReference));
    }

    public final Double S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.a.f().s(atomicReference, 15000L, "double test flag value", new w6(this, atomicReference));
    }

    public final void T(Boolean bool) {
        j();
        this.a.f().r(new x6(this, bool));
    }

    public final void U(Bundle bundle, int i2, long j2) {
        j();
        String strA = g.a(bundle);
        if (strA != null) {
            this.a.d().t().b("Ignoring invalid consent setting", strA);
            this.a.d().t().a("Valid consent values are 'granted', 'denied'");
        }
        V(g.b(bundle), i2, j2);
    }

    public final void V(g gVar, int i2, long j2) {
        boolean z;
        boolean z2;
        g gVar2;
        boolean z3;
        j();
        if (i2 != -10 && gVar.e() == null && gVar.g() == null) {
            this.a.d().t().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f1184h) {
            z = true;
            z2 = false;
            if (g.m(i2, this.f1186j)) {
                boolean zI = gVar.i(this.f1185i);
                if (gVar.h() && !this.f1185i.h()) {
                    z2 = true;
                }
                g gVarL = gVar.l(this.f1185i);
                this.f1185i = gVarL;
                this.f1186j = i2;
                gVar2 = gVarL;
                z3 = z2;
                z2 = zI;
            } else {
                gVar2 = gVar;
                z3 = false;
                z = false;
            }
        }
        if (!z) {
            this.a.d().u().b("Ignoring lower-priority consent settings, proposed settings", gVar2);
            return;
        }
        long andIncrement = this.f1187k.getAndIncrement();
        if (z2) {
            this.f1183g.set(null);
            this.a.f().t(new y6(this, gVar2, j2, i2, andIncrement, z3));
        } else if (i2 == 30 || i2 == -10) {
            this.a.f().t(new z6(this, gVar2, i2, andIncrement, z3));
        } else {
            this.a.f().r(new a7(this, gVar2, i2, andIncrement, z3));
        }
    }

    final void W(g gVar) {
        h();
        boolean z = (gVar.h() && gVar.f()) || this.a.R().v();
        if (z != this.a.n()) {
            this.a.m(z);
            h4 h4VarA = this.a.A();
            a5 a5Var = h4VarA.a;
            h4VarA.h();
            Boolean boolValueOf = h4VarA.p().contains("measurement_enabled_from_api") ? Boolean.valueOf(h4VarA.p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                L(Boolean.valueOf(z), false);
            }
        }
    }

    public final void X(String str, String str2, Bundle bundle) {
        a0(str, str2, bundle, true, true, this.a.e().a());
    }

    final void Y(String str, String str2, long j2, Bundle bundle) {
        h();
        Z(str, str2, j2, bundle, true, this.d == null || ca.F(str2), false, null);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x011d  */
    protected final void Z(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        Bundle[] bundleArr;
        Object[] array;
        int i2;
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.k(bundle);
        h();
        j();
        if (!this.a.k()) {
            this.a.d().v().a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> listV = this.a.b().v();
        if (listV != null && !listV.contains(str2)) {
            this.a.d().v().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f) {
            this.f = true;
            try {
                try {
                    (!this.a.O() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.a.c().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.a.c());
                } catch (Exception e) {
                    this.a.d().r().b("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                this.a.d().u().a("Tag Manager is not found and thus will not be used");
            }
        }
        if (this.a.z().w(null, f3.c0) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.a.a();
            p("auto", "_lgclid", bundle.getString("gclid"), this.a.e().a());
        }
        this.a.a();
        if (z && ca.M(str2)) {
            this.a.G().v(bundle, this.a.A().w.a());
        }
        if (z3) {
            this.a.a();
            if (!"_iap".equals(str2)) {
                ca caVarG = this.a.G();
                if (!caVarG.l0("event", str2)) {
                    i2 = 2;
                } else if (caVarG.n0("event", y5.a, y5.b, str2)) {
                    caVarG.a.z();
                    if (caVarG.o0("event", 40, str2)) {
                        i2 = 0;
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 13;
                }
                if (i2 != 0) {
                    this.a.d().q().b("Invalid public event name. Event will not be logged (FE)", this.a.H().p(str2));
                    ca caVarG2 = this.a.G();
                    this.a.z();
                    this.a.G().A(this.p, null, i2, "_ev", caVarG2.q(str2, 40, true), str2 != null ? str2.length() : 0, this.a.z().w(null, f3.w0));
                    return;
                }
            }
        }
        this.a.a();
        k7 k7VarS = this.a.Q().s(false);
        if (k7VarS != null && !bundle.containsKey("_sc")) {
            k7VarS.d = true;
        }
        r7.x(k7VarS, bundle, z && z3);
        boolean zEquals = "am".equals(str);
        boolean zF = ca.F(str2);
        if (!z || this.d == null || zF) {
            z4 = zEquals;
        } else {
            if (!zEquals) {
                this.a.d().v().c("Passing event to registered event handler (FE)", this.a.H().p(str2), this.a.H().s(bundle));
                com.google.android.gms.common.internal.q.k(this.d);
                this.d.a(str, str2, bundle, j2);
                return;
            }
            z4 = true;
        }
        if (this.a.q()) {
            int iP0 = this.a.G().p0(str2);
            if (iP0 != 0) {
                this.a.d().q().b("Invalid event name. Event will not be logged (FE)", this.a.H().p(str2));
                ca caVarG3 = this.a.G();
                this.a.z();
                this.a.G().A(this.p, str3, iP0, "_ev", caVarG3.q(str2, 40, true), str2 != null ? str2.length() : 0, this.a.z().w(null, f3.w0));
                return;
            }
            Bundle bundleT = this.a.G().t(str3, str2, bundle, com.google.android.gms.common.util.f.c("_o", "_sn", "_sc", "_si"), z3);
            com.google.android.gms.common.internal.q.k(bundleT);
            if (bundleT.containsKey("_sc") && bundleT.containsKey("_si")) {
                bundleT.getString("_sn");
                bundleT.getString("_sc");
                bundleT.getLong("_si");
            }
            this.a.a();
            if (this.a.Q().s(false) != null && "_ae".equals(str2)) {
                e9 e9Var = this.a.C().e;
                long jC = e9Var.d.a.e().c();
                long j3 = jC - e9Var.b;
                e9Var.b = jC;
                if (j3 > 0) {
                    this.a.G().Q(bundleT, j3);
                }
            }
            yc.a();
            if (this.a.z().w(null, f3.n0)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    ca caVarG4 = this.a.G();
                    String string = bundleT.getString("_ffr");
                    if (com.google.android.gms.common.util.n.a(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    boolean zG = ca.G(string, caVarG4.a.A().t.a());
                    a5 a5Var = caVarG4.a;
                    if (zG) {
                        a5Var.d().v().a("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    a5Var.A().t.b(string);
                } else if ("_ae".equals(str2)) {
                    String strA = this.a.G().a.A().t.a();
                    if (!TextUtils.isEmpty(strA)) {
                        bundleT.putString("_ffr", strA);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleT);
            if (this.a.A().f1218o.a() > 0 && this.a.A().w(j2) && this.a.A().q.a()) {
                this.a.d().w().a("Current session is expired, remove the session number, ID, and engagement time");
                p("auto", "_sid", null, this.a.e().a());
                p("auto", "_sno", null, this.a.e().a());
                p("auto", "_se", null, this.a.e().a());
            }
            if (bundleT.getLong("extend_session", 0L) == 1) {
                this.a.d().w().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.a.C().d.b(j2, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleT.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str4 = (String) arrayList2.get(i3);
                if (str4 != null) {
                    this.a.G();
                    Object obj = bundleT.get(str4);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else {
                        if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            array = arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        bundleArr = (Bundle[]) array;
                    }
                    if (bundleArr != null) {
                        bundleT.putParcelableArray(str4, bundleArr);
                    }
                }
            }
            int i4 = 0;
            while (i4 < arrayList.size()) {
                Bundle bundleI = (Bundle) arrayList.get(i4);
                String str5 = i4 != 0 ? "_ep" : str2;
                bundleI.putString("_o", str);
                if (z2) {
                    bundleI = this.a.G().I(bundleI);
                }
                Bundle bundle2 = bundleI;
                this.a.R().L(new t(str5, new r(bundle2), str, j2), str3);
                if (!z4) {
                    Iterator<c6> it = this.e.iterator();
                    while (it.hasNext()) {
                        it.next().a(str, str2, new Bundle(bundle2), j2);
                    }
                }
                i4++;
            }
            this.a.a();
            if (this.a.Q().s(false) == null || !"_ae".equals(str2)) {
                return;
            }
            this.a.C().e.d(true, true, this.a.e().c());
        }
    }

    public final void a0(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (this.a.z().w(null, f3.s0) && ca.G(str2, "screen_view")) {
            this.a.Q().u(bundle2, j2);
            return;
        }
        b0(str3, str2, j2, bundle2, z2, !z2 || this.d == null || ca.F(str2), !z, null);
    }

    protected final void b0(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i2];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelable);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        this.a.f().r(new k6(this, str, str2, j2, bundle2, z, z2, z3, str3));
    }

    public final void c0(String str, String str2, Object obj, boolean z) {
        d0("auto", str2, obj, true, this.a.e().a());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    public final void d0(String str, String str2, Object obj, boolean z, long j2) {
        int iQ0;
        String str3 = str == null ? "app" : str;
        if (z) {
            iQ0 = this.a.G().q0(str2);
        } else {
            ca caVarG = this.a.G();
            if (!caVarG.l0("user property", str2)) {
                iQ0 = 6;
            } else if (caVarG.n0("user property", a6.a, null, str2)) {
                caVarG.a.z();
                if (caVarG.o0("user property", 24, str2)) {
                    iQ0 = 0;
                } else {
                    iQ0 = 6;
                }
            } else {
                iQ0 = 15;
            }
        }
        if (iQ0 != 0) {
            ca caVarG2 = this.a.G();
            this.a.z();
            this.a.G().A(this.p, null, iQ0, "_ev", caVarG2.q(str2, 24, true), str2 != null ? str2.length() : 0, this.a.z().w(null, f3.w0));
        } else {
            if (obj == null) {
                o(str3, str2, j2, null);
                return;
            }
            int iX = this.a.G().x(str2, obj);
            if (iX != 0) {
                ca caVarG3 = this.a.G();
                this.a.z();
                this.a.G().A(this.p, null, iX, "_ev", caVarG3.q(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0, this.a.z().w(null, f3.w0));
            } else {
                Object objY = this.a.G().y(str2, obj);
                if (objY != null) {
                    o(str3, str2, j2, objY);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.f4
    protected final boolean m() {
        return false;
    }

    final void o(String str, String str2, long j2, Object obj) {
        this.a.f().r(new l6(this, str, str2, obj, j2));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    final void p(String str, String str2, Object obj, long j2) {
        String str3;
        Object obj2;
        g4 g4Var;
        String str4;
        Object obj3;
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.g(str2);
        h();
        j();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str5 = (String) obj;
                if (!TextUtils.isEmpty(str5)) {
                    String lowerCase = str5.toLowerCase(Locale.ENGLISH);
                    str4 = "false";
                    Long lValueOf = Long.valueOf(true != "false".equals(lowerCase) ? 0L : 1L);
                    g4Var = this.a.A().f1216m;
                    long jLongValue = lValueOf.longValue();
                    obj3 = lValueOf;
                    if (jLongValue == 1) {
                        str4 = "true";
                        obj3 = lValueOf;
                    }
                } else if (obj == null) {
                    g4Var = this.a.A().f1216m;
                    str4 = "unset";
                    obj3 = obj;
                } else {
                    str3 = str2;
                    obj2 = obj;
                }
            } else if (obj == null) {
                g4Var = this.a.A().f1216m;
                str4 = "unset";
                obj3 = obj;
            } else {
                str3 = str2;
                obj2 = obj;
            }
            g4Var.b(str4);
            obj2 = obj3;
            str3 = "_npa";
        } else {
            str3 = str2;
            obj2 = obj;
        }
        if (!this.a.k()) {
            this.a.d().w().a("User property not set since app measurement is disabled");
        } else if (this.a.q()) {
            this.a.R().R(new y9(str3, j2, obj2, str));
        }
    }

    public final String q() {
        return this.f1183g.get();
    }

    final void r(String str) {
        this.f1183g.set(str);
    }

    public final void s(long j2) {
        this.f1183g.set(null);
        this.a.f().r(new m6(this, j2));
    }

    final void t(long j2, boolean z) {
        h();
        j();
        this.a.d().v().a("Resetting analytics data (FE)");
        g9 g9VarC = this.a.C();
        g9VarC.h();
        f9 f9Var = g9VarC.d;
        g9VarC.e.c();
        boolean zK = this.a.k();
        h4 h4VarA = this.a.A();
        h4VarA.e.b(j2);
        if (!TextUtils.isEmpty(h4VarA.a.A().t.a())) {
            h4VarA.t.b(null);
        }
        kd.a();
        f fVarZ = h4VarA.a.z();
        d3<Boolean> d3Var = f3.o0;
        if (fVarZ.w(null, d3Var)) {
            h4VarA.f1218o.b(0L);
        }
        if (!h4VarA.a.z().A()) {
            h4VarA.u(!zK);
        }
        h4VarA.u.b(null);
        h4VarA.v.b(0L);
        h4VarA.w.b(null);
        if (z) {
            this.a.R().S();
        }
        kd.a();
        if (this.a.z().w(null, d3Var)) {
            this.a.C().d.a();
        }
        this.f1191o = !zK;
    }

    public final void u() {
        h();
        j();
        if (this.a.q()) {
            if (this.a.z().w(null, f3.b0)) {
                f fVarZ = this.a.z();
                fVarZ.a.a();
                Boolean boolY = fVarZ.y("google_analytics_deferred_deep_link_enabled");
                if (boolY != null && boolY.booleanValue()) {
                    this.a.d().v().a("Deferred Deep Link feature enabled.");
                    this.a.f().r(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.f6
                        private final d7 a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            d7 d7Var = this.a;
                            d7Var.h();
                            if (d7Var.a.A().r.a()) {
                                d7Var.a.d().v().a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jA = d7Var.a.A().s.a();
                            d7Var.a.A().s.b(1 + jA);
                            d7Var.a.z();
                            if (jA < 5) {
                                d7Var.a.r();
                            } else {
                                d7Var.a.d().r().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                d7Var.a.A().r.b(true);
                            }
                        }
                    });
                }
            }
            this.a.R().V();
            this.f1191o = false;
            h4 h4VarA = this.a.A();
            h4VarA.h();
            String string = h4VarA.p().getString("previous_os_version", null);
            h4VarA.a.S().l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = h4VarA.p().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.a.S().l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            X("auto", "_ou", bundle);
        }
    }

    public final void v(b6 b6Var) {
        b6 b6Var2;
        h();
        j();
        if (b6Var != null && b6Var != (b6Var2 = this.d)) {
            com.google.android.gms.common.internal.q.o(b6Var2 == null, "EventInterceptor already set.");
        }
        this.d = b6Var;
    }

    public final void w(c6 c6Var) {
        j();
        com.google.android.gms.common.internal.q.k(c6Var);
        if (this.e.add(c6Var)) {
            return;
        }
        this.a.d().r().a("OnEventListener already registered");
    }

    public final void x(c6 c6Var) {
        j();
        com.google.android.gms.common.internal.q.k(c6Var);
        if (this.e.remove(c6Var)) {
            return;
        }
        this.a.d().r().a("OnEventListener had not been registered");
    }

    public final int y(String str) {
        com.google.android.gms.common.internal.q.g(str);
        this.a.z();
        return 25;
    }

    public final void z(Bundle bundle) {
        A(bundle, this.a.e().a());
    }
}
