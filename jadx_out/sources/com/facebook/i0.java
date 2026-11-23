package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    private static final String a;
    private static final AtomicBoolean b;
    private static final AtomicBoolean c;
    private static final a d;
    private static final a e;
    private static final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static SharedPreferences f594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i0 f595j = new i0();

    private static final class a {
        private Boolean a;
        private long b;
        private boolean c;
        private String d;

        public a(boolean z, String str) {
            l.y.c.i.e(str, "key");
            this.c = z;
            this.d = str;
        }

        public final boolean a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final long c() {
            return this.b;
        }

        public final Boolean d() {
            return this.a;
        }

        public final boolean e() {
            Boolean bool = this.a;
            return bool != null ? bool.booleanValue() : this.c;
        }

        public final void f(long j2) {
            this.b = j2;
        }

        public final void g(Boolean bool) {
            this.a = bool;
        }
    }

    static final class b implements Runnable {
        final /* synthetic */ long a;

        b(long j2) {
            this.a = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.facebook.internal.t tVarO;
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                i0 i0Var = i0.f595j;
                if (i0.a(i0Var).e() && (tVarO = com.facebook.internal.u.o(r.g(), false)) != null && tVarO.b()) {
                    com.facebook.internal.b bVarE = com.facebook.internal.b.f597h.e(r.f());
                    String strH = (bVarE == null || bVarE.h() == null) ? null : bVarE.h();
                    if (strH != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", strH);
                        bundle.putString("fields", "auto_event_setup_enabled");
                        u uVarV = u.t.v(null, r.g(), null);
                        uVarV.H(true);
                        uVarV.G(bundle);
                        JSONObject jSONObjectC = uVarV.i().c();
                        if (jSONObjectC != null) {
                            i0.b(i0Var).g(Boolean.valueOf(jSONObjectC.optBoolean("auto_event_setup_enabled", false)));
                            i0.b(i0Var).f(this.a);
                            i0.d(i0Var, i0.b(i0Var));
                        }
                    }
                }
                i0.c(i0Var).set(false);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static {
        String name = i0.class.getName();
        l.y.c.i.d(name, "UserSettingsManager::class.java.name");
        a = name;
        b = new AtomicBoolean(false);
        c = new AtomicBoolean(false);
        d = new a(true, "com.facebook.sdk.AutoInitEnabled");
        e = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
        f = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
        f592g = new a(false, "auto_event_setup_enabled");
        f593h = new a(true, "com.facebook.sdk.MonitorEnabled");
    }

    private i0() {
    }

    public static final /* synthetic */ a a(i0 i0Var) {
        if (com.facebook.internal.m0.i.a.d(i0.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, i0.class);
            return null;
        }
    }

    public static final /* synthetic */ a b(i0 i0Var) {
        if (com.facebook.internal.m0.i.a.d(i0.class)) {
            return null;
        }
        try {
            return f592g;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, i0.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean c(i0 i0Var) {
        if (com.facebook.internal.m0.i.a.d(i0.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, i0.class);
            return null;
        }
    }

    public static final /* synthetic */ void d(i0 i0Var, a aVar) {
        if (com.facebook.internal.m0.i.a.d(i0.class)) {
            return;
        }
        try {
            i0Var.r(aVar);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, i0.class);
        }
    }

    public static final boolean e() {
        if (com.facebook.internal.m0.i.a.d(i0.class)) {
            return false;
        }
        try {
            f595j.j();
            return f.e();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, i0.class);
            return false;
        }
    }

    public static final boolean f() {
        if (com.facebook.internal.m0.i.a.d(i0.class)) {
            return false;
        }
        try {
            f595j.j();
            return d.e();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, i0.class);
            return false;
        }
    }

    public static final boolean g() {
        if (com.facebook.internal.m0.i.a.d(i0.class)) {
            return false;
        }
        try {
            f595j.j();
            return e.e();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, i0.class);
            return false;
        }
    }

    public static final boolean h() {
        if (com.facebook.internal.m0.i.a.d(i0.class)) {
            return false;
        }
        try {
            f595j.j();
            return f592g.e();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, i0.class);
            return false;
        }
    }

    private final void i() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            a aVar = f592g;
            p(aVar);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.d() == null || jCurrentTimeMillis - aVar.c() >= 604800000) {
                aVar.g(null);
                aVar.f(0L);
                if (c.compareAndSet(false, true)) {
                    r.n().execute(new b(jCurrentTimeMillis));
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void j() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            if (r.x() && b.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = r.f().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                l.y.c.i.d(sharedPreferences, "FacebookSdk.getApplicati…GS, Context.MODE_PRIVATE)");
                f594i = sharedPreferences;
                k(e, f, d);
                i();
                o();
                n();
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void k(a... aVarArr) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            for (a aVar : aVarArr) {
                if (aVar == f592g) {
                    i();
                } else if (aVar.d() == null) {
                    p(aVar);
                    if (aVar.d() == null) {
                        l(aVar);
                    }
                } else {
                    r(aVar);
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void l(a aVar) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            q();
            try {
                Context contextF = r.f();
                ApplicationInfo applicationInfo = contextF.getPackageManager().getApplicationInfo(contextF.getPackageName(), 128);
                if ((applicationInfo != null ? applicationInfo.metaData : null) == null || !applicationInfo.metaData.containsKey(aVar.b())) {
                    return;
                }
                aVar.g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b(), aVar.a())));
                return;
            } catch (PackageManager.NameNotFoundException e2) {
                com.facebook.internal.h0.e0(a, e2);
                return;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
        com.facebook.internal.m0.i.a.b(th, this);
    }

    public static final void m() {
        if (com.facebook.internal.m0.i.a.d(i0.class)) {
            return;
        }
        try {
            Context contextF = r.f();
            ApplicationInfo applicationInfo = contextF.getPackageManager().getApplicationInfo(contextF.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) == null || !applicationInfo.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            com.facebook.j0.m mVar = new com.facebook.j0.m(contextF);
            Bundle bundle = new Bundle();
            if (!com.facebook.internal.h0.Q()) {
                bundle.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(a, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            mVar.d("fb_auto_applink", bundle);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, i0.class);
        }
    }

    private final void n() {
        int i2;
        int i3;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            if (b.get() && r.x()) {
                Context contextF = r.f();
                int i4 = 0;
                int i5 = ((d.e() ? 1 : 0) << 0) | 0 | ((e.e() ? 1 : 0) << 1) | ((f.e() ? 1 : 0) << 2) | ((f593h.e() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f594i;
                if (sharedPreferences == null) {
                    l.y.c.i.q("userSettingPref");
                    throw null;
                }
                int i6 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i6 != i5) {
                    SharedPreferences sharedPreferences2 = f594i;
                    if (sharedPreferences2 == null) {
                        l.y.c.i.q("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i5).apply();
                    try {
                        ApplicationInfo applicationInfo = contextF.getPackageManager().getApplicationInfo(contextF.getPackageName(), 128);
                        if ((applicationInfo != null ? applicationInfo.metaData : null) != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            i3 = 0;
                            i2 = 0;
                            for (int i7 = 0; i7 < 4; i7++) {
                                try {
                                    i2 |= (applicationInfo.metaData.containsKey(strArr[i7]) ? 1 : 0) << i7;
                                    i3 |= (applicationInfo.metaData.getBoolean(strArr[i7], zArr[i7]) ? 1 : 0) << i7;
                                } catch (PackageManager.NameNotFoundException unused) {
                                    i4 = i3;
                                    i3 = i4;
                                    i4 = i2;
                                    com.facebook.j0.m mVar = new com.facebook.j0.m(contextF);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("usage", i4);
                                    bundle.putInt("initial", i3);
                                    bundle.putInt("previous", i6);
                                    bundle.putInt("current", i5);
                                    mVar.b(bundle);
                                }
                            }
                            i4 = i2;
                        } else {
                            i3 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i2 = 0;
                    }
                    com.facebook.j0.m mVar2 = new com.facebook.j0.m(contextF);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("usage", i4);
                    bundle2.putInt("initial", i3);
                    bundle2.putInt("previous", i6);
                    bundle2.putInt("current", i5);
                    mVar2.b(bundle2);
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void o() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            Context contextF = r.f();
            ApplicationInfo applicationInfo = contextF.getPackageManager().getApplicationInfo(contextF.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null) {
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w(a, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(a, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (e()) {
                    return;
                }
                Log.w(a, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void p(a aVar) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            q();
            try {
                SharedPreferences sharedPreferences = f594i;
                if (sharedPreferences == null) {
                    l.y.c.i.q("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(aVar.b(), "");
                String str = string != null ? string : "";
                l.y.c.i.d(str, "userSettingPref.getStrin…serSetting.key, \"\") ?: \"\"");
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.g(Boolean.valueOf(jSONObject.getBoolean("value")));
                    aVar.f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e2) {
                com.facebook.internal.h0.e0(a, e2);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void q() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            if (b.get()) {
            } else {
                throw new s("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void r(a aVar) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            q();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.d());
                jSONObject.put("last_timestamp", aVar.c());
                SharedPreferences sharedPreferences = f594i;
                if (sharedPreferences == null) {
                    l.y.c.i.q("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(aVar.b(), jSONObject.toString()).apply();
                n();
            } catch (Exception e2) {
                com.facebook.internal.h0.e0(a, e2);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
