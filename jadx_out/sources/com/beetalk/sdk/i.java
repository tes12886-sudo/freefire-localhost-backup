package com.beetalk.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.beetalk.sdk.ndk.ShareRet;
import com.beetalk.sdk.plugin.PluginResult;

/* JADX INFO: loaded from: classes.dex */
public class i {
    private static volatile Activity a = null;
    private static volatile com.beetalk.sdk.t.c b = null;
    private static String c = "0";
    private static String d;

    class a implements com.beetalk.sdk.plugin.b {
        final /* synthetic */ g a;

        a(g gVar) {
            this.a = gVar;
        }

        @Override // com.beetalk.sdk.plugin.b
        public void onPluginResult(Object obj) {
            PluginResult pluginResult = (PluginResult) obj;
            ShareRet shareRet = new ShareRet();
            shareRet.platform = 3;
            shareRet.flag = pluginResult.flag;
            shareRet.desc = pluginResult.message;
            this.a.onPluginResult(shareRet);
        }
    }

    class b implements com.beetalk.sdk.plugin.b {
        final /* synthetic */ g a;

        b(g gVar) {
            this.a = gVar;
        }

        @Override // com.beetalk.sdk.plugin.b
        public void onPluginResult(Object obj) {
            PluginResult pluginResult = (PluginResult) obj;
            ShareRet shareRet = new ShareRet();
            shareRet.platform = 3;
            shareRet.flag = pluginResult.flag;
            shareRet.desc = pluginResult.message;
            this.a.onPluginResult(shareRet);
        }
    }

    class c implements com.beetalk.sdk.plugin.b<Object> {
        final /* synthetic */ g a;

        c(g gVar) {
            this.a = gVar;
        }

        @Override // com.beetalk.sdk.plugin.b
        public void onPluginResult(Object obj) {
            PluginResult pluginResult = (PluginResult) obj;
            ShareRet shareRet = new ShareRet();
            shareRet.platform = 1;
            shareRet.flag = pluginResult.flag;
            shareRet.desc = pluginResult.message;
            this.a.onPluginResult(shareRet);
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.beetalk.sdk.u.l.values().length];
            b = iArr;
            try {
                iArr[com.beetalk.sdk.u.l.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[com.beetalk.sdk.u.l.GARENA_WEB_ANDROID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[com.beetalk.sdk.u.l.GARENA_NATIVE_ANDROID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[com.beetalk.sdk.u.l.GUEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[com.beetalk.sdk.u.l.VK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[com.beetalk.sdk.u.l.LINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[com.beetalk.sdk.u.l.GOOGLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[com.beetalk.sdk.u.l.TWITTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[q.values().length];
            a = iArr2;
            try {
                iArr2[q.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[q.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[q.TOKEN_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[q.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[q.CLOSED_WITH_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[q.INSPECTION_WITH_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    class e implements com.beetalk.sdk.g.n {
        final /* synthetic */ com.beetalk.sdk.g.n a;
        final /* synthetic */ boolean b;

        e(com.beetalk.sdk.g.n nVar, boolean z) {
            this.a = nVar;
            this.b = z;
        }

        @Override // com.beetalk.sdk.g.n
        public void onSessionProcessed(com.beetalk.sdk.g gVar, Exception exc) {
            if (gVar != null) {
                switch (d.a[gVar.G().ordinal()]) {
                    case 5:
                    case 6:
                        if (com.garena.pay.android.b.f(gVar.z()) && this.b) {
                            i.F(gVar, this.a);
                            return;
                        }
                        break;
                }
            }
            this.a.onSessionProcessed(gVar, exc);
        }
    }

    class f extends com.beetalk.sdk.plugin.e.b.e.c {
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        f(String str, String str2) {
            this.c = str;
            this.d = str2;
            this.a = str;
            this.b = str2;
        }
    }

    public interface g extends com.beetalk.sdk.plugin.b<ShareRet> {
    }

    public static void A(Activity activity) {
        a = activity;
        Context applicationContext = activity.getApplicationContext();
        com.beetalk.sdk.g.J(applicationContext);
        com.beetalk.sdk.z.b.c(applicationContext);
        int iA = com.beetalk.sdk.b0.c.a(applicationContext);
        if (iA != -1) {
            com.vk.sdk.i.e(applicationContext, iA, p.f512l);
        }
        if (b == null) {
            b = new com.beetalk.sdk.t.c(a.getApplicationContext());
            b.c();
        }
    }

    public static void B(com.beetalk.sdk.g gVar) {
        Context contextS = com.beetalk.sdk.g.s();
        int iA = com.beetalk.sdk.b0.c.a(contextS);
        if (iA != -1) {
            com.vk.sdk.i.e(contextS, iA, p.f512l);
        }
        com.beetalk.sdk.g.h0(gVar);
        if (b == null) {
            b = new com.beetalk.sdk.t.c(com.beetalk.sdk.g.s());
            b.c();
        }
    }

    public static void C(com.beetalk.sdk.g gVar) {
        Context contextS = com.beetalk.sdk.g.s();
        int iA = com.beetalk.sdk.b0.c.a(contextS);
        if (iA != -1) {
            com.vk.sdk.i.e(contextS, iA, p.f512l);
        }
        com.beetalk.sdk.g.f0(gVar);
        if (b == null) {
            b = new com.beetalk.sdk.t.c(com.beetalk.sdk.g.s());
            b.c();
        }
    }

    public static void D(com.beetalk.sdk.g gVar) {
        Context contextS = com.beetalk.sdk.g.s();
        int iA = com.beetalk.sdk.b0.c.a(contextS);
        if (iA != -1) {
            com.vk.sdk.i.e(contextS, iA, p.f512l);
        }
        com.beetalk.sdk.g.g0(gVar);
        if (b == null) {
            b = new com.beetalk.sdk.t.c(com.beetalk.sdk.g.s());
            b.c();
        }
    }

    public static void E(Activity activity, com.beetalk.sdk.g.n nVar) {
        a = activity;
        com.beetalk.sdk.g.n nVarI = I(nVar);
        if (com.beetalk.sdk.x.d.n(activity)) {
            com.beetalk.sdk.g.U(a, true, nVarI);
            return;
        }
        com.beetalk.sdk.g gVarY = com.beetalk.sdk.g.y();
        if (gVarY != null) {
            gVarY.j0(q.CLOSED_WITH_ERROR);
            gVarY.i0(com.garena.pay.android.b.NETWORK_EXCEPTION.c().intValue());
            nVarI.onSessionProcessed(gVarY, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(com.beetalk.sdk.g gVar, com.beetalk.sdk.g.n nVar) {
        com.beetalk.sdk.x.a.c("ndk_login_auth_callback error %s", gVar.G().toString());
        com.beetalk.sdk.g.l lVar = new com.beetalk.sdk.g.l(a);
        lVar.c(gVar.u());
        lVar.d(gVar.B());
        lVar.b(gVar.t());
        lVar.f(gVar.F());
        lVar.e(gVar.E());
        com.beetalk.sdk.g.h0(lVar.a());
        com.beetalk.sdk.g.r(a, nVar);
    }

    public static void G(String str) {
        c = str;
    }

    public static void H(String str) {
        d = str;
    }

    static com.beetalk.sdk.g.n I(com.beetalk.sdk.g.n nVar) {
        com.beetalk.sdk.x.k.b(nVar, "Session Callback to be wrapped cannot be null");
        return J(nVar, true);
    }

    static com.beetalk.sdk.g.n J(com.beetalk.sdk.g.n nVar, boolean z) {
        com.beetalk.sdk.x.k.b(nVar, "Session Callback to be wrapped cannot be null");
        return new e(nVar, z);
    }

    static com.beetalk.sdk.g.n K(com.beetalk.sdk.g.n nVar) {
        com.beetalk.sdk.x.k.b(nVar, "Session Callback to be wrapped cannot be null");
        return J(nVar, false);
    }

    public static void a() {
        p.P(true);
    }

    public static String b() {
        return "4.0.19P2";
    }

    public static void c(Activity activity, com.beetalk.sdk.g.n nVar) {
        a = activity;
        com.beetalk.sdk.g.P(a, K(nVar));
    }

    public static void d(Activity activity, com.beetalk.sdk.g.n nVar) {
        a = activity;
        com.beetalk.sdk.g.R(a, K(nVar));
    }

    public static boolean e(Activity activity, int i2) {
        String str;
        if (i2 == 1) {
            return com.beetalk.sdk.x.d.p("com.garena.gas", activity) || com.beetalk.sdk.x.d.p("com.garena.gaslite", activity);
        }
        if (i2 == 3) {
            str = "com.facebook.katana";
        } else if (i2 == 5) {
            str = "com.vkontakte.android";
        } else {
            if (i2 != 6) {
                return false;
            }
            str = "jp.naver.line.android";
        }
        return com.beetalk.sdk.x.d.p(str, activity);
    }

    public static int f(Activity activity, int i2) {
        String str;
        if (i2 != 1) {
            if (i2 == 3) {
                str = "com.facebook.katana";
            } else if (i2 == 5) {
                str = "com.vkontakte.android";
            } else {
                if (i2 != 6) {
                    return 0;
                }
                str = "jp.naver.line.android";
            }
        } else {
            if (com.beetalk.sdk.x.d.p("com.garena.gas", activity)) {
                return com.beetalk.sdk.x.d.i(activity, "com.garena.gas");
            }
            str = "com.garena.gaslite";
        }
        return com.beetalk.sdk.x.d.i(activity, str);
    }

    public static void g(Activity activity, j.c.a.f.a aVar) {
        j.c.a.b.d(activity, aVar);
        j.c.a.b.a().e();
    }

    public static String h(Context context) {
        com.beetalk.sdk.g gVarX = com.beetalk.sdk.g.x();
        if (gVarX != null) {
            gVarX.e0(new com.beetalk.sdk.t.j(context));
            com.beetalk.sdk.g.h0(gVarX);
            new com.beetalk.sdk.t.j(context).l(gVarX.I());
        } else {
            com.beetalk.sdk.g.n();
        }
        com.beetalk.sdk.t.a.s().p();
        return com.beetalk.sdk.t.g.s().b();
    }

    public static void i(Activity activity, long j2, String str, String str2, String str3, com.beetalk.sdk.plugin.b<PluginResult> bVar) {
        com.beetalk.sdk.plugin.e.b.j.a.b bVar2 = new com.beetalk.sdk.plugin.e.b.j.a.b();
        bVar2.m(j2);
        bVar2.l(str);
        bVar2.j(str2);
        bVar2.i(str3);
        com.beetalk.sdk.plugin.c.k().m(activity, "facebook.game.message", bVar2.g(), bVar);
    }

    public static void j(Activity activity, j jVar, com.beetalk.sdk.plugin.b bVar) {
        if (com.beetalk.sdk.g.y().F() == com.beetalk.sdk.g.o.GARENA) {
            com.beetalk.sdk.plugin.c.k().m(activity, "gas.share.text", jVar, bVar);
        }
    }

    public static void k(Activity activity, com.beetalk.sdk.w.b bVar, com.beetalk.sdk.plugin.b bVar2) {
        com.beetalk.sdk.plugin.c.k().m(activity, "facebook.share.fallback", bVar, bVar2);
    }

    public static void l(Activity activity, int i2, String str, String str2, String str3, String str4, String str5, String str6, g gVar) {
        int i3 = Integer.parseInt(com.beetalk.sdk.g.y().t());
        int iIntValue = com.beetalk.sdk.g.y().D().intValue();
        if (iIntValue != 1) {
            if (iIntValue != 3) {
                com.beetalk.sdk.x.a.c("Unsupported Platform Chosen", new Object[0]);
                return;
            } else if (i2 == 1) {
                k(activity, new com.beetalk.sdk.w.b(str3, str4, str5, str2, str6), new a(gVar));
                return;
            } else {
                n(activity, str3, str5, str2, str6, new b(gVar));
                return;
            }
        }
        j.a aVar = new j.a(i3);
        aVar.e(Integer.valueOf(i2));
        aVar.c(str5);
        aVar.d(str);
        aVar.f(str3);
        aVar.g(str2);
        com.beetalk.sdk.plugin.c.k().m(activity, "gas.share.url", aVar.a(), new c(gVar));
    }

    public static void m(Activity activity, h hVar, com.beetalk.sdk.plugin.b bVar) {
        if (com.beetalk.sdk.g.y().F() == com.beetalk.sdk.g.o.GARENA) {
            com.beetalk.sdk.plugin.c.k().m(activity, "gas.share.photo", hVar, bVar);
        }
    }

    public static void n(Activity activity, String str, String str2, String str3, String str4, com.beetalk.sdk.plugin.b bVar) {
        com.beetalk.sdk.plugin.e.b.j.a.b bVar2 = new com.beetalk.sdk.plugin.e.b.j.a.b();
        bVar2.l(str);
        bVar2.j(str2);
        bVar2.h(str3);
        bVar2.k(str4);
        com.beetalk.sdk.plugin.c.k().m(activity, "facebook.message", bVar2.g(), bVar);
    }

    public static void o(Activity activity, String str, String str2, com.beetalk.sdk.plugin.b bVar) {
        com.beetalk.sdk.plugin.c.k().m(activity, "facebook.invite", new f(str, str2), bVar);
    }

    public static void p(p.c cVar) {
        p.S(cVar);
    }

    public static void q(Activity activity, com.beetalk.sdk.w.b bVar, com.beetalk.sdk.plugin.b<PluginResult> bVar2) {
        com.beetalk.sdk.plugin.c.k().m(activity, "facebook.share", bVar, bVar2);
    }

    public static void r(Activity activity, com.beetalk.sdk.b0.b bVar, com.beetalk.sdk.plugin.b<PluginResult> bVar2) {
        com.beetalk.sdk.plugin.c.k().m(activity, "vk.share", bVar, bVar2);
    }

    public static String t() {
        return c;
    }

    public static Integer u() {
        if (com.beetalk.sdk.g.y() != null) {
            return com.beetalk.sdk.g.y().H();
        }
        if (a != null) {
            return com.beetalk.sdk.x.d.g(a);
        }
        throw new com.beetalk.sdk.v.b("Please initialize the session before continuing");
    }

    public static String v() {
        return d;
    }

    public static String w() {
        return com.beetalk.sdk.t.a.s().c();
    }

    public static String x() {
        return com.beetalk.sdk.t.a.s().f();
    }

    public static boolean y(Activity activity) {
        com.beetalk.sdk.g.o oVar;
        com.beetalk.sdk.u.a aVarH = new com.beetalk.sdk.t.j(activity).h();
        if (aVarH != null && !TextUtils.isEmpty(aVarH.b())) {
            switch (d.b[aVarH.h().ordinal()]) {
                case 1:
                    oVar = com.beetalk.sdk.g.o.FACEBOOK;
                    break;
                case 2:
                case 3:
                    oVar = com.beetalk.sdk.g.o.GARENA;
                    break;
                case 4:
                    oVar = com.beetalk.sdk.g.o.GUEST;
                    break;
                case 5:
                    oVar = com.beetalk.sdk.g.o.VK;
                    break;
                case 6:
                    oVar = com.beetalk.sdk.g.o.LINE;
                    break;
                case 7:
                    oVar = com.beetalk.sdk.g.o.GOOGLE;
                    break;
                case 8:
                    oVar = com.beetalk.sdk.g.o.TWITTER;
                    break;
                default:
                    oVar = com.beetalk.sdk.g.o.REFRESH_TOKEN;
                    break;
            }
            com.beetalk.sdk.g.l lVar = new com.beetalk.sdk.g.l(activity);
            lVar.b(c);
            lVar.c("");
            lVar.d(com.beetalk.sdk.c.LEGACY_ENABLED);
            lVar.f(oVar);
            com.beetalk.sdk.g gVarA = lVar.a();
            if (gVarA.G() == q.TOKEN_AVAILABLE) {
                B(gVarA);
                return true;
            }
        }
        return false;
    }

    public static void z(Activity activity, int i2, int i3, Intent intent) {
        com.beetalk.sdk.g gVarY;
        if (i2 == p.f509i.intValue()) {
            if (com.beetalk.sdk.g.w() == null) {
                return;
            } else {
                gVarY = com.beetalk.sdk.g.w();
            }
        } else if (i2 == p.f508h.intValue()) {
            if (com.beetalk.sdk.g.x() == null) {
                return;
            } else {
                gVarY = com.beetalk.sdk.g.x();
            }
        } else {
            if (com.beetalk.sdk.g.y() == null) {
                com.beetalk.sdk.x.a.a("onActivityResult: no available session", new Object[0]);
                return;
            }
            gVarY = com.beetalk.sdk.g.y();
        }
        gVarY.W(activity, i2, i3, intent);
    }
}
