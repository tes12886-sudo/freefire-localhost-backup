package com.facebook.j0;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.a0;
import com.facebook.internal.h0;
import com.facebook.internal.i0;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.r;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.s;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final String c;
    private static ScheduledThreadPoolExecutor d;
    private static g.b e;
    private static final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f645j = new a(null);
    private final String a;
    private com.facebook.j0.a b;

    public static final class a {

        /* JADX INFO: renamed from: com.facebook.j0.h$a$a, reason: collision with other inner class name */
        public static final class C0070a implements x.a {
            C0070a() {
            }

            @Override // com.facebook.internal.x.a
            public void a(String str) {
                h.f645j.p(str);
            }
        }

        static final class b implements Runnable {
            final /* synthetic */ Context a;
            final /* synthetic */ h b;

            b(Context context, h hVar) {
                this.a = context;
                this.b = hVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (com.facebook.internal.m0.i.a.d(this)) {
                    return;
                }
                try {
                    Bundle bundle = new Bundle();
                    String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                    String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                    int i2 = 0;
                    for (int i3 = 0; i3 < 11; i3++) {
                        String str = strArr[i3];
                        String str2 = strArr2[i3];
                        try {
                            Class.forName(str);
                            bundle.putInt(str2, 1);
                            i2 |= 1 << i3;
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    SharedPreferences sharedPreferences = this.a.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                    if (sharedPreferences.getInt("kitsBitmask", 0) != i2) {
                        sharedPreferences.edit().putInt("kitsBitmask", i2).apply();
                        this.b.o("fb_sdk_initialize", null, bundle);
                    }
                } catch (Throwable th) {
                    com.facebook.internal.m0.i.a.b(th, this);
                }
            }
        }

        static final class c implements Runnable {
            public static final c a = new c();

            c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (com.facebook.internal.m0.i.a.d(this)) {
                    return;
                }
                try {
                    HashSet hashSet = new HashSet();
                    Iterator<com.facebook.j0.a> it = e.m().iterator();
                    while (it.hasNext()) {
                        hashSet.add(it.next().b());
                    }
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        u.o((String) it2.next(), true);
                    }
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
        public final void l() {
            synchronized (h.e()) {
                if (h.b() != null) {
                    return;
                }
                h.i(new ScheduledThreadPoolExecutor(1));
                s sVar = s.a;
                c cVar = c.a;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = h.b();
                if (scheduledThreadPoolExecutorB == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                scheduledThreadPoolExecutorB.scheduleAtFixedRate(cVar, 0L, 86400, TimeUnit.SECONDS);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m(com.facebook.j0.c cVar, com.facebook.j0.a aVar) {
            e.h(aVar, cVar);
            if (com.facebook.internal.p.g(com.facebook.internal.p.b.OnDevicePostInstallEventProcessing) && com.facebook.j0.x.a.b()) {
                com.facebook.j0.x.a.c(aVar.b(), cVar);
            }
            if (cVar.c() || h.f()) {
                return;
            }
            if (l.y.c.i.a(cVar.f(), "fb_mobile_activate_app")) {
                h.g(true);
            } else {
                a0.f.c(com.facebook.a0.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n(String str) {
            a0.f.c(com.facebook.a0.DEVELOPER_ERRORS, "AppEvents", str);
        }

        public final void d(Application application, String str) {
            l.y.c.i.e(application, "application");
            if (!r.x()) {
                throw new com.facebook.n("The Facebook sdk must be initialized before calling activateApp");
            }
            com.facebook.j0.b.d();
            p.g();
            if (str == null) {
                str = r.g();
            }
            r.C(application, str);
            com.facebook.j0.v.a.x(application, str);
        }

        public final void e() {
            if (h() != g.b.EXPLICIT_ONLY) {
                e.k(j.EAGER_FLUSHING_EVENT);
            }
        }

        public final Executor f() {
            if (h.b() == null) {
                l();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = h.b();
            if (scheduledThreadPoolExecutorB != null) {
                return scheduledThreadPoolExecutorB;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final String g(Context context) {
            l.y.c.i.e(context, "context");
            if (h.a() == null) {
                synchronized (h.e()) {
                    if (h.a() == null) {
                        h.h(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                        if (h.a() == null) {
                            h.h("XZ" + UUID.randomUUID().toString());
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", h.a()).apply();
                        }
                    }
                    s sVar = s.a;
                }
            }
            String strA = h.a();
            if (strA != null) {
                return strA;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final g.b h() {
            g.b bVarC;
            synchronized (h.e()) {
                bVarC = h.c();
            }
            return bVarC;
        }

        public final String i() {
            x.d(new C0070a());
            return r.f().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        public final String j() {
            String strD;
            synchronized (h.e()) {
                strD = h.d();
            }
            return strD;
        }

        public final void k(Context context, String str) {
            l.y.c.i.e(context, "context");
            if (r.j()) {
                h hVar = new h(context, str, (com.facebook.a) null);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = h.b();
                if (scheduledThreadPoolExecutorB == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                scheduledThreadPoolExecutorB.execute(new b(context, hVar));
            }
        }

        public final void o() {
            e.o();
        }

        public final void p(String str) {
            SharedPreferences sharedPreferences = r.f().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }
    }

    static {
        String canonicalName = h.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        l.y.c.i.d(canonicalName, "AppEventsLoggerImpl::cla…ents.AppEventsLoggerImpl\"");
        c = canonicalName;
        e = g.b.AUTO;
        f = new Object();
    }

    public h(Context context, String str, com.facebook.a aVar) {
        this(h0.t(context), str, aVar);
    }

    public h(String str, String str2, com.facebook.a aVar) {
        com.facebook.j0.a aVar2;
        l.y.c.i.e(str, "activityName");
        i0.o();
        this.a = str;
        aVar = aVar == null ? com.facebook.a.p.e() : aVar;
        if (aVar == null || aVar.p() || !(str2 == null || l.y.c.i.a(str2, aVar.c()))) {
            str2 = str2 == null ? h0.E(r.f()) : str2;
            if (str2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            aVar2 = new com.facebook.j0.a(null, str2);
        } else {
            aVar2 = new com.facebook.j0.a(aVar);
        }
        this.b = aVar2;
        f645j.l();
    }

    public static final /* synthetic */ String a() {
        if (com.facebook.internal.m0.i.a.d(h.class)) {
            return null;
        }
        try {
            return f642g;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (com.facebook.internal.m0.i.a.d(h.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ g.b c() {
        if (com.facebook.internal.m0.i.a.d(h.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (com.facebook.internal.m0.i.a.d(h.class)) {
            return null;
        }
        try {
            return f644i;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Object e() {
        if (com.facebook.internal.m0.i.a.d(h.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean f() {
        if (com.facebook.internal.m0.i.a.d(h.class)) {
            return false;
        }
        try {
            return f643h;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, h.class);
            return false;
        }
    }

    public static final /* synthetic */ void g(boolean z) {
        if (com.facebook.internal.m0.i.a.d(h.class)) {
            return;
        }
        try {
            f643h = z;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, h.class);
        }
    }

    public static final /* synthetic */ void h(String str) {
        if (com.facebook.internal.m0.i.a.d(h.class)) {
            return;
        }
        try {
            f642g = str;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, h.class);
        }
    }

    public static final /* synthetic */ void i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (com.facebook.internal.m0.i.a.d(h.class)) {
            return;
        }
        try {
            d = scheduledThreadPoolExecutor;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, h.class);
        }
    }

    public final void j() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            e.k(j.EXPLICIT);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void k(String str, double d2, Bundle bundle) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            m(str, Double.valueOf(d2), bundle, false, com.facebook.j0.v.a.q());
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void l(String str, Bundle bundle) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            m(str, null, bundle, false, com.facebook.j0.v.a.q());
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void m(String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        if (com.facebook.internal.m0.i.a.d(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            if (com.facebook.internal.s.f("app_events_killswitch", r.g(), false)) {
                a0.f.d(com.facebook.a0.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                f645j.m(new c(this.a, str, d2, bundle, z, com.facebook.j0.v.a.s(), uuid), this.b);
            } catch (com.facebook.n e2) {
                a0.f.d(com.facebook.a0.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
            } catch (JSONException e3) {
                a0.f.d(com.facebook.a0.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e3.toString());
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void n(String str, String str2) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            l(str, bundle);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void o(String str, Double d2, Bundle bundle) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            m(str, d2, bundle, true, com.facebook.j0.v.a.q());
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void p(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null || currency == null) {
                h0.f0(c, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, com.facebook.j0.v.a.q());
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void q(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                f645j.n("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                f645j.n("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, com.facebook.j0.v.a.q());
            f645j.e();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void r(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            q(bigDecimal, currency, bundle, true);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
