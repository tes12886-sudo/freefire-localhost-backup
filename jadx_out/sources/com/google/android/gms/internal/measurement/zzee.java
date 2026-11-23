package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzee {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile zzee f1157i;
    private final String a;
    protected final com.google.android.gms.common.util.e b;
    protected final ExecutorService c;
    private final com.google.android.gms.measurement.a.a d;
    private final List<Pair<com.google.android.gms.measurement.internal.c6, t2>> e;
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile f1 f1159h;

    protected zzee(Context context, String str, String str2, String str3, Bundle bundle) {
        this.a = (str == null || !s(str2, str3)) ? "FA" : str;
        this.b = com.google.android.gms.common.util.h.d();
        this.c = z0.a().a(new k2(this), 1);
        this.d = new com.google.android.gms.measurement.a.a(this);
        this.e = new ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.j7.a(context, "google_app_id", com.google.android.gms.measurement.internal.t4.a(context)) != null && !o()) {
                this.f1158g = true;
                Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!s(str2, str3)) {
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        p(new z1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new c3(this));
        }
    }

    protected static final boolean o() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(s2 s2Var) {
        this.c.execute(s2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(Exception exc, boolean z, boolean z2) {
        this.f1158g |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            c(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.a, "Error with data collection. Data lost.", exc);
    }

    private final void r(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        p(new q2(this, l2, str, str2, bundle, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(String str, String str2) {
        return (str2 == null || str == null || o()) ? false : true;
    }

    public static zzee t(Context context, String str, String str2, String str3, Bundle bundle) {
        com.google.android.gms.common.internal.q.k(context);
        if (f1157i == null) {
            synchronized (zzee.class) {
                if (f1157i == null) {
                    f1157i = new zzee(context, str, str2, str3, bundle);
                }
            }
        }
        return f1157i;
    }

    public final void A(Bundle bundle) {
        p(new q1(this, bundle));
    }

    public final void B(String str, String str2, Bundle bundle) {
        p(new r1(this, str, str2, bundle));
    }

    public final List<Bundle> C(String str, String str2) {
        b1 b1Var = new b1();
        p(new s1(this, str, str2, b1Var));
        List<Bundle> list = (List) b1.c1(b1Var.o(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final void D(String str) {
        p(new t1(this, str));
    }

    public final void E(Activity activity, String str, String str2) {
        p(new u1(this, activity, str, str2));
    }

    public final void F(Boolean bool) {
        p(new v1(this, bool));
    }

    public final void G(Bundle bundle) {
        p(new w1(this, bundle));
    }

    public final void H() {
        p(new x1(this));
    }

    public final void I(long j2) {
        p(new y1(this, j2));
    }

    public final void J(String str) {
        p(new a2(this, str));
    }

    public final void K(String str) {
        p(new b2(this, str));
    }

    public final String L() {
        b1 b1Var = new b1();
        p(new d2(this, b1Var));
        return b1Var.m(500L);
    }

    public final String M() {
        b1 b1Var = new b1();
        p(new e2(this, b1Var));
        return b1Var.m(50L);
    }

    public final long N() {
        b1 b1Var = new b1();
        p(new f2(this, b1Var));
        Long l2 = (Long) b1.c1(b1Var.o(500L), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.b.a()).nextLong();
        int i2 = this.f + 1;
        this.f = i2;
        return jNextLong + ((long) i2);
    }

    public final String O() {
        b1 b1Var = new b1();
        p(new g2(this, b1Var));
        return b1Var.m(500L);
    }

    public final String a() {
        b1 b1Var = new b1();
        p(new h2(this, b1Var));
        return b1Var.m(500L);
    }

    public final Map<String, Object> b(String str, String str2, boolean z) {
        b1 b1Var = new b1();
        p(new i2(this, str, str2, z, b1Var));
        Bundle bundleO = b1Var.o(5000L);
        if (bundleO == null || bundleO.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleO.size());
        for (String str3 : bundleO.keySet()) {
            Object obj = bundleO.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void c(int i2, String str, Object obj, Object obj2, Object obj3) {
        p(new j2(this, false, 5, str, obj, null, null));
    }

    public final int d(String str) {
        b1 b1Var = new b1();
        p(new l2(this, str, b1Var));
        Integer num = (Integer) b1.c1(b1Var.o(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String e() {
        b1 b1Var = new b1();
        p(new m2(this, b1Var));
        return b1Var.m(120000L);
    }

    public final void f(boolean z) {
        p(new n2(this, z));
    }

    public final void g(Bundle bundle) {
        p(new o2(this, bundle));
    }

    public final com.google.android.gms.measurement.a.a u() {
        return this.d;
    }

    protected final f1 v(Context context, boolean z) {
        try {
            return e1.asInterface(DynamiteModule.d(context, DynamiteModule.c, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e) {
            q(e, true, false);
            return null;
        }
    }

    public final void w(com.google.android.gms.measurement.internal.c6 c6Var) {
        com.google.android.gms.common.internal.q.k(c6Var);
        synchronized (this.e) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                if (c6Var.equals(this.e.get(i2).first)) {
                    Log.w(this.a, "OnEventListener already registered.");
                    return;
                }
            }
            t2 t2Var = new t2(c6Var);
            this.e.add(new Pair<>(c6Var, t2Var));
            if (this.f1159h != null) {
                try {
                    this.f1159h.registerOnMeasurementEventListener(t2Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            p(new p2(this, t2Var));
        }
    }

    public final void x(String str, Bundle bundle) {
        r(null, str, bundle, false, true, null);
    }

    public final void y(String str, String str2, Bundle bundle) {
        r(str, str2, bundle, true, true, null);
    }

    public final void z(String str, String str2, Object obj, boolean z) {
        p(new r2(this, str, str2, obj, z));
    }
}
