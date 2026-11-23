package com.beetalk.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements Serializable {
    private c a;
    private transient com.beetalk.sdk.e b;
    private transient Activity c;
    private transient com.beetalk.sdk.a d;
    private transient d e;

    class a implements com.beetalk.sdk.a {
        final /* synthetic */ Activity a;

        a(b bVar, Activity activity) {
            this.a = activity;
        }

        @Override // com.beetalk.sdk.a
        public Activity a() {
            return this.a;
        }

        @Override // com.beetalk.sdk.a
        public void startActivityForResult(Intent intent, int i2) {
            this.a.startActivityForResult(intent, i2);
        }
    }

    /* JADX INFO: renamed from: com.beetalk.sdk.b$b, reason: collision with other inner class name */
    class C0028b implements com.beetalk.sdk.a {
        C0028b() {
        }

        @Override // com.beetalk.sdk.a
        public Activity a() {
            return b.this.a.g().a();
        }

        @Override // com.beetalk.sdk.a
        public void startActivityForResult(Intent intent, int i2) {
            b.this.a.g().startActivityForResult(intent, i2);
        }
    }

    public static class c implements Serializable {
        private final transient com.beetalk.sdk.a a;
        private String b;
        private int c;
        private String d;
        private String e;
        private g.o f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.beetalk.sdk.u.a f483g;

        public c(com.beetalk.sdk.a aVar, String str, int i2, boolean z, String str2, String str3) {
            this.a = aVar;
            this.b = str;
            this.c = i2;
            this.d = str2;
            this.e = str3;
        }

        public String a() {
            return this.d;
        }

        public String b() {
            return this.e;
        }

        public String c() {
            return this.b;
        }

        public com.beetalk.sdk.u.a d() {
            return this.f483g;
        }

        public int e() {
            return this.c;
        }

        public g.o f() {
            return this.f;
        }

        public com.beetalk.sdk.a g() {
            return this.a;
        }

        public void h(com.beetalk.sdk.u.a aVar) {
            this.f483g = aVar;
        }

        public void i(ArrayList<String> arrayList) {
        }

        public void j(String str) {
        }

        public void k(g.o oVar) {
            this.f = oVar;
        }
    }

    interface d {
        void a(e eVar);
    }

    public static class e implements Serializable {
        final a a;
        final com.beetalk.sdk.u.a b;
        final int c;
        final String d;

        enum a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");

            a(String str) {
            }
        }

        public e(c cVar, a aVar, com.beetalk.sdk.u.a aVar2, String str, int i2, String str2, int i3) {
            this.a = aVar;
            this.b = aVar2;
            this.c = i2;
            this.d = str2;
        }

        static e a(c cVar, int i2) {
            return b(cVar, "", "", i2);
        }

        static e b(c cVar, String str, String str2, int i2) {
            return new e(cVar, a.ERROR, null, TextUtils.join(": ", new String[]{str, str2}), i2, null, 0);
        }

        static e c(c cVar, com.beetalk.sdk.u.a aVar, String str, int i2) {
            return new e(cVar, a.SUCCESS, aVar, null, 0, str, i2);
        }

        public static boolean d(a aVar) {
            return aVar != a.SUCCESS;
        }
    }

    private void c(c cVar) {
        if (cVar == null) {
            com.beetalk.sdk.x.a.a("request is null", new Object[0]);
            return;
        }
        com.beetalk.sdk.x.a.a("commenceAuth()", new Object[0]);
        if (this.a != null) {
            throw new RuntimeException("Attempted to authorize while a request is pending.");
        }
        this.a = cVar;
        j(cVar);
        p();
    }

    private void d() {
        k(e.a(this.a, com.garena.pay.android.b.APP_NOT_INSTALLED.c().intValue()));
    }

    private void j(c cVar) {
        com.beetalk.sdk.e rVar;
        g.o oVarF = cVar.f();
        if (oVarF == g.o.FACEBOOK) {
            com.beetalk.sdk.x.a.a("add facebook auth handler", new Object[0]);
            rVar = new f(this);
        } else if (oVarF == g.o.GARENA) {
            com.beetalk.sdk.x.a.a("add garena auth handler", new Object[0]);
            rVar = new k(this);
        } else if (oVarF == g.o.GUEST) {
            com.beetalk.sdk.x.a.a("add guest auth handler", new Object[0]);
            rVar = new m(this);
        } else if (oVarF == g.o.REFRESH_TOKEN) {
            com.beetalk.sdk.x.a.a("add refresh token handler", new Object[0]);
            rVar = new o(this);
        } else if (oVarF == g.o.VK) {
            com.beetalk.sdk.x.a.a("add vk auth handler", new Object[0]);
            rVar = new s(this);
        } else if (oVarF == g.o.LINE) {
            com.beetalk.sdk.x.a.a("add line auth handler", new Object[0]);
            rVar = new n(this);
        } else if (oVarF == g.o.GOOGLE) {
            com.beetalk.sdk.x.a.a("add google auth handler", new Object[0]);
            rVar = new l(this);
        } else {
            if (oVarF != g.o.TWITTER) {
                return;
            }
            com.beetalk.sdk.x.a.a("Add Twitter auth handler", new Object[0]);
            rVar = new r(this);
        }
        this.b = rVar;
    }

    void b() {
        com.beetalk.sdk.e eVar = this.b;
        if (eVar != null) {
            eVar.c();
        }
    }

    public com.beetalk.sdk.a e() {
        com.beetalk.sdk.a aVar = this.d;
        if (aVar != null) {
            return aVar;
        }
        if (this.a != null) {
            return new C0028b();
        }
        return null;
    }

    public Context f() {
        return this.c;
    }

    public com.beetalk.sdk.e g() {
        return this.b;
    }

    boolean h() {
        return this.a != null;
    }

    public c i() {
        return this.a;
    }

    public void k(e eVar) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(eVar);
        }
        this.a = null;
        this.b = null;
    }

    public boolean l(int i2, int i3, Intent intent) {
        c cVar = this.a;
        if (cVar == null) {
            return false;
        }
        com.beetalk.sdk.x.a.a("PendingRequest %s", cVar.toString());
        return g().d(i2, i3, intent, this.a);
    }

    public void m(Activity activity) {
        this.c = activity;
        this.d = new a(this, activity);
        c cVar = this.a;
        if (cVar != null) {
            j(cVar);
        }
    }

    public void n(d dVar) {
        this.e = dVar;
    }

    void o(c cVar) {
        if (h()) {
            return;
        }
        c(cVar);
    }

    protected void p() {
        com.beetalk.sdk.x.a.a("try one handler", new Object[0]);
        com.beetalk.sdk.e eVar = this.b;
        if (eVar == null || eVar.e(this.a)) {
            com.beetalk.sdk.x.a.a("handler started, return", new Object[0]);
        } else if (this.a != null) {
            com.beetalk.sdk.x.a.a("all handlers fail, auth fail", new Object[0]);
            d();
        }
    }
}
