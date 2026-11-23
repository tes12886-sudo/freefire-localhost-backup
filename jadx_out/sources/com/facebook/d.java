package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f575g = new a(null);
    private com.facebook.a a;
    private final AtomicBoolean b;
    private Date c;
    private final h.q.a.a d;
    private final com.facebook.c e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final u c(com.facebook.a aVar, u.b bVar) {
            e eVarF = f(aVar);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", eVarF.b());
            bundle.putString("client_id", aVar.c());
            return new u(aVar, eVarF.a(), bundle, y.GET, bVar, null, 32, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final u d(com.facebook.a aVar, u.b bVar) {
            return new u(aVar, "me/permissions", new Bundle(), y.GET, bVar, null, 32, null);
        }

        private final e f(com.facebook.a aVar) {
            String strI = aVar.i();
            if (strI == null) {
                strI = "facebook";
            }
            return (strI.hashCode() == 28903346 && strI.equals("instagram")) ? new c() : new b();
        }

        public final d e() {
            d dVar;
            d dVar2 = d.f;
            if (dVar2 != null) {
                return dVar2;
            }
            synchronized (this) {
                dVar = d.f;
                if (dVar == null) {
                    h.q.a.a aVarB = h.q.a.a.b(r.f());
                    l.y.c.i.d(aVarB, "LocalBroadcastManager.ge…tance(applicationContext)");
                    d dVar3 = new d(aVarB, new com.facebook.c());
                    d.f = dVar3;
                    dVar = dVar3;
                }
            }
            return dVar;
        }
    }

    public static final class b implements e {
        private final String a = "oauth/access_token";
        private final String b = "fb_extend_sso_token";

        @Override // com.facebook.d.e
        public String a() {
            return this.a;
        }

        @Override // com.facebook.d.e
        public String b() {
            return this.b;
        }
    }

    public static final class c implements e {
        private final String a = "refresh_access_token";
        private final String b = "ig_refresh_token";

        @Override // com.facebook.d.e
        public String a() {
            return this.a;
        }

        @Override // com.facebook.d.e
        public String b() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: com.facebook.d$d, reason: collision with other inner class name */
    private static final class C0054d {
        private String a;
        private int b;
        private int c;
        private Long d;
        private String e;

        public final String a() {
            return this.a;
        }

        public final Long b() {
            return this.d;
        }

        public final int c() {
            return this.b;
        }

        public final int d() {
            return this.c;
        }

        public final String e() {
            return this.e;
        }

        public final void f(String str) {
            this.a = str;
        }

        public final void g(Long l2) {
            this.d = l2;
        }

        public final void h(int i2) {
            this.b = i2;
        }

        public final void i(int i2) {
            this.c = i2;
        }

        public final void j(String str) {
            this.e = str;
        }
    }

    public interface e {
        String a();

        String b();
    }

    static final class f implements Runnable {
        final /* synthetic */ com.facebook.a.InterfaceC0053a b;

        f(com.facebook.a.InterfaceC0053a interfaceC0053a) {
            this.b = interfaceC0053a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                d.this.j(this.b);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class g implements w.a {
        final /* synthetic */ C0054d b;
        final /* synthetic */ com.facebook.a c;
        final /* synthetic */ com.facebook.a.InterfaceC0053a d;
        final /* synthetic */ AtomicBoolean e;
        final /* synthetic */ Set f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set f576g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Set f577h;

        g(C0054d c0054d, com.facebook.a aVar, com.facebook.a.InterfaceC0053a interfaceC0053a, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.b = c0054d;
            this.c = aVar;
            this.d = interfaceC0053a;
            this.e = atomicBoolean;
            this.f = set;
            this.f576g = set2;
            this.f577h = set3;
        }

        @Override // com.facebook.w.a
        public final void a(w wVar) throws Throwable {
            l.y.c.i.e(wVar, "it");
            String strA = this.b.a();
            int iC = this.b.c();
            Long lB = this.b.b();
            String strE = this.b.e();
            com.facebook.a aVar = null;
            try {
                a aVar2 = d.f575g;
                if (aVar2.e().g() != null) {
                    com.facebook.a aVarG = aVar2.e().g();
                    if ((aVarG != null ? aVarG.n() : null) == this.c.n()) {
                        if (!this.e.get() && strA == null && iC == 0) {
                            com.facebook.a.InterfaceC0053a interfaceC0053a = this.d;
                            if (interfaceC0053a != null) {
                                interfaceC0053a.a(new n("Failed to refresh access token"));
                            }
                            d.this.b.set(false);
                            return;
                        }
                        Date dateH = this.c.h();
                        if (this.b.c() != 0) {
                            dateH = new Date(((long) this.b.c()) * 1000);
                        } else if (this.b.d() != 0) {
                            dateH = new Date((((long) this.b.d()) * 1000) + new Date().getTime());
                        }
                        Date date = dateH;
                        if (strA == null) {
                            strA = this.c.m();
                        }
                        String str = strA;
                        String strC = this.c.c();
                        String strN = this.c.n();
                        Set<String> setK = this.e.get() ? this.f : this.c.k();
                        Set<String> setF = this.e.get() ? this.f576g : this.c.f();
                        Set<String> setG = this.e.get() ? this.f577h : this.c.g();
                        com.facebook.e eVarL = this.c.l();
                        Date date2 = new Date();
                        Date date3 = lB != null ? new Date(lB.longValue() * 1000) : this.c.e();
                        if (strE == null) {
                            strE = this.c.i();
                        }
                        com.facebook.a aVar3 = new com.facebook.a(str, strC, strN, setK, setF, setG, eVarL, date, date2, date3, strE);
                        try {
                            aVar2.e().l(aVar3);
                            d.this.b.set(false);
                            com.facebook.a.InterfaceC0053a interfaceC0053a2 = this.d;
                            if (interfaceC0053a2 != null) {
                                interfaceC0053a2.b(aVar3);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            aVar = aVar3;
                            d.this.b.set(false);
                            com.facebook.a.InterfaceC0053a interfaceC0053a3 = this.d;
                            if (interfaceC0053a3 != null && aVar != null) {
                                interfaceC0053a3.b(aVar);
                            }
                            throw th;
                        }
                    }
                }
                com.facebook.a.InterfaceC0053a interfaceC0053a4 = this.d;
                if (interfaceC0053a4 != null) {
                    interfaceC0053a4.a(new n("No current access token to refresh"));
                }
                d.this.b.set(false);
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    static final class h implements u.b {
        final /* synthetic */ AtomicBoolean a;
        final /* synthetic */ Set b;
        final /* synthetic */ Set c;
        final /* synthetic */ Set d;

        h(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.a = atomicBoolean;
            this.b = set;
            this.c = set2;
            this.d = set3;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x008e  */
        /* JADX WARN: Instruction removed from duplicated block: B:36:0x008e, please report this as an issue */
        @Override // com.facebook.u.b
        public final void b(x xVar) {
            JSONArray jSONArrayOptJSONArray;
            Set set;
            l.y.c.i.e(xVar, "response");
            JSONObject jSONObjectD = xVar.d();
            if (jSONObjectD == null || (jSONArrayOptJSONArray = jSONObjectD.optJSONArray("data")) == null) {
                return;
            }
            this.a.set(true);
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("permission");
                    String strOptString2 = jSONObjectOptJSONObject.optString("status");
                    if (!com.facebook.internal.h0.Y(strOptString) && !com.facebook.internal.h0.Y(strOptString2)) {
                        l.y.c.i.d(strOptString2, "status");
                        Locale locale = Locale.US;
                        l.y.c.i.d(locale, "Locale.US");
                        if (strOptString2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase = strOptString2.toLowerCase(locale);
                        l.y.c.i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        if (lowerCase != null) {
                            int iHashCode = lowerCase.hashCode();
                            if (iHashCode != -1309235419) {
                                if (iHashCode != 280295099) {
                                    if (iHashCode == 568196142 && lowerCase.equals("declined")) {
                                        set = this.c;
                                        set.add(strOptString);
                                    } else {
                                        Log.w("AccessTokenManager", "Unexpected status: " + lowerCase);
                                    }
                                } else if (lowerCase.equals("granted")) {
                                    set = this.b;
                                    set.add(strOptString);
                                } else {
                                    Log.w("AccessTokenManager", "Unexpected status: " + lowerCase);
                                }
                            } else if (lowerCase.equals("expired")) {
                                set = this.d;
                                set.add(strOptString);
                            } else {
                                Log.w("AccessTokenManager", "Unexpected status: " + lowerCase);
                            }
                        } else {
                            Log.w("AccessTokenManager", "Unexpected status: " + lowerCase);
                        }
                    }
                }
            }
        }
    }

    static final class i implements u.b {
        final /* synthetic */ C0054d a;

        i(C0054d c0054d) {
            this.a = c0054d;
        }

        @Override // com.facebook.u.b
        public final void b(x xVar) {
            l.y.c.i.e(xVar, "response");
            JSONObject jSONObjectD = xVar.d();
            if (jSONObjectD != null) {
                this.a.f(jSONObjectD.optString("access_token"));
                this.a.h(jSONObjectD.optInt("expires_at"));
                this.a.i(jSONObjectD.optInt("expires_in"));
                this.a.g(Long.valueOf(jSONObjectD.optLong("data_access_expiration_time")));
                this.a.j(jSONObjectD.optString("graph_domain", null));
            }
        }
    }

    public d(h.q.a.a aVar, com.facebook.c cVar) {
        l.y.c.i.e(aVar, "localBroadcastManager");
        l.y.c.i.e(cVar, "accessTokenCache");
        this.d = aVar;
        this.e = cVar;
        this.b = new AtomicBoolean(false);
        this.c = new Date(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(com.facebook.a.InterfaceC0053a interfaceC0053a) {
        com.facebook.a aVarG = g();
        if (aVarG == null) {
            if (interfaceC0053a != null) {
                interfaceC0053a.a(new n("No current access token to refresh"));
                return;
            }
            return;
        }
        if (!this.b.compareAndSet(false, true)) {
            if (interfaceC0053a != null) {
                interfaceC0053a.a(new n("Refresh already in progress"));
                return;
            }
            return;
        }
        this.c = new Date();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C0054d c0054d = new C0054d();
        a aVar = f575g;
        w wVar = new w(aVar.d(aVarG, new h(atomicBoolean, hashSet, hashSet2, hashSet3)), aVar.c(aVarG, new i(c0054d)));
        wVar.d(new g(c0054d, aVarG, interfaceC0053a, atomicBoolean, hashSet, hashSet2, hashSet3));
        wVar.l();
    }

    private final void k(com.facebook.a aVar, com.facebook.a aVar2) {
        Intent intent = new Intent(r.f(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.d.d(intent);
    }

    private final void m(com.facebook.a aVar, boolean z) {
        com.facebook.a aVar2 = this.a;
        this.a = aVar;
        this.b.set(false);
        this.c = new Date(0L);
        if (z) {
            com.facebook.c cVar = this.e;
            if (aVar != null) {
                cVar.g(aVar);
            } else {
                cVar.a();
                com.facebook.internal.h0.h(r.f());
            }
        }
        if (com.facebook.internal.h0.c(aVar2, aVar)) {
            return;
        }
        k(aVar2, aVar);
        n();
    }

    private final void n() {
        Context contextF = r.f();
        com.facebook.a.c cVar = com.facebook.a.p;
        com.facebook.a aVarE = cVar.e();
        AlarmManager alarmManager = (AlarmManager) contextF.getSystemService("alarm");
        if (cVar.g()) {
            if ((aVarE != null ? aVarE.h() : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextF, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, aVarE.h().getTime(), Build.VERSION.SDK_INT >= 23 ? PendingIntent.getBroadcast(contextF, 0, intent, 67108864) : PendingIntent.getBroadcast(contextF, 0, intent, 0));
            } catch (Exception unused) {
            }
        }
    }

    private final boolean o() {
        com.facebook.a aVarG = g();
        if (aVarG == null) {
            return false;
        }
        long time = new Date().getTime();
        return aVarG.l().a() && time - this.c.getTime() > ((long) 3600000) && time - aVarG.j().getTime() > ((long) 86400000);
    }

    public final void e() {
        k(g(), g());
    }

    public final void f() {
        if (o()) {
            i(null);
        }
    }

    public final com.facebook.a g() {
        return this.a;
    }

    public final boolean h() {
        com.facebook.a aVarF = this.e.f();
        if (aVarF == null) {
            return false;
        }
        m(aVarF, false);
        return true;
    }

    public final void i(com.facebook.a.InterfaceC0053a interfaceC0053a) {
        if (l.y.c.i.a(Looper.getMainLooper(), Looper.myLooper())) {
            j(interfaceC0053a);
        } else {
            new Handler(Looper.getMainLooper()).post(new f(interfaceC0053a));
        }
    }

    public final void l(com.facebook.a aVar) {
        m(aVar, true);
    }
}
