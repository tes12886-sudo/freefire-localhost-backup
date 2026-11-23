package com.beetalk.sdk;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class p {
    public static boolean a = true;
    public static boolean b;
    public static Integer c;
    public static Integer d;
    public static Integer e;
    public static Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Integer f507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Integer f508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Integer f509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final List<String> f513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static c f514n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f515o;
    private static String p;
    private static String q;

    public interface a {
        public static final Integer a = 2;
    }

    public static final class b {
        public static boolean a;
        public static boolean b;
    }

    public enum c {
        PRODUCTION,
        TEST
    }

    public interface d {
        public static final Integer a = 2878;
        public static final Integer b = 2880;
        public static final Integer c = 2881;
        public static final Integer d = 2882;
        public static final Integer e = 2883;
        public static final Integer f = 2884;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Integer f516g = 2885;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Integer f517h = 2891;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Integer f518i = 2892;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final Integer f519j = 2893;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final Integer f520k = 2894;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final Integer f521l = 2895;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final Integer f522m = 2896;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Integer f523n = 2897;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final Integer f524o = 2898;
        public static final Integer p = 2899;
        public static final Integer q = 2900;
        public static final Integer r = 2901;
        public static final Integer s = 2902;
    }

    static {
        N();
        b = !N();
        c = 56221;
        d = 56227;
        e = 56228;
        f = 56230;
        f507g = 56231;
        f508h = 56300;
        f509i = 56301;
        f510j = 19;
        f511k = "gop";
        f512l = "5.131";
        f513m = new ArrayList();
        f514n = c.TEST;
        f515o = false;
    }

    public static String A() {
        return I() + "/oauth/logout";
    }

    public static String B() {
        return C() + "/api/msdk";
    }

    public static String C() {
        Context contextS;
        String str = q;
        if (str != null && str.length() > 0) {
            return q;
        }
        if (f514n == c.TEST) {
            return f515o ? "https://devmsdk.garena.com" : "https://testmsdk.garena.com";
        }
        g gVarY = g.y();
        String strT = gVarY != null ? gVarY.t() : null;
        if (TextUtils.isEmpty(strT) && (contextS = g.s()) != null) {
            strT = com.beetalk.sdk.x.d.e(contextS);
        }
        return TextUtils.isEmpty(strT) ? "https://msdk.garena.com" : String.format("https://%s.msdk.garena.com", strT);
    }

    public static String D() {
        return B() + "/pay/event/cancel";
    }

    public static String E() {
        return B() + "/pay/event/init";
    }

    public static String F() {
        return B() + "/info/rebates";
    }

    public static String G() {
        return B() + "/rebates/redeem";
    }

    public static String H() {
        return I() + "/oauth/guest/register";
    }

    public static String I() {
        Context contextS;
        String str = p;
        if (str != null && str.length() > 0) {
            return p;
        }
        if (f514n == c.TEST) {
            return f515o ? "https://devconnect.garena.com" : "https://testconnect.garena.com";
        }
        g gVarY = g.y();
        String strT = gVarY != null ? gVarY.t() : null;
        if (TextUtils.isEmpty(strT) && (contextS = g.s()) != null) {
            strT = com.beetalk.sdk.x.d.e(contextS);
        }
        return TextUtils.isEmpty(strT) ? "https://connect.garena.com" : String.format("https://%s.connect.garena.com", strT);
    }

    public static String J() {
        return I() + "/game/user/request/send";
    }

    public static String K() {
        return I() + "/oauth/token/inspect";
    }

    public static String L() {
        return I() + "/oauth/token/refresh";
    }

    public static String M() {
        return I() + "/oauth/user/info/get";
    }

    public static boolean N() {
        return f514n == c.TEST;
    }

    private static void O() {
        List<String> list = f513m;
        list.clear();
        list.add(h());
        list.add(L());
        list.add(K());
        list.add(M());
        list.add(x());
        list.add(z());
        list.add(y());
        list.add(J());
        list.add(l());
    }

    public static void P(boolean z) {
        b = !z;
    }

    public static void Q(String str) {
        q = str;
    }

    public static void R(String str) {
        p = str;
    }

    public static void S(c cVar) {
        f514n = cVar;
        O();
        a(cVar);
    }

    private static void a(c cVar) {
        boolean z = cVar == c.TEST;
        j.c.a.c.a.c.b = z;
        j.c.a.c.a.c.c = z;
    }

    public static String b() {
        return f514n == c.TEST ? "https://testconnect.garenanow.com/app/info/get" : "https://connect.garenanow.com/app/info/get";
    }

    public static String c() {
        return I() + "/bind/app/platform/create";
    }

    public static String d() {
        return I() + "/bind/app/platform/info/get";
    }

    public static String e() {
        return I() + "/oauth/token/facebook/exchange";
    }

    public static String f() {
        return I() + "/oauth/token/google/exchange";
    }

    public static String g() {
        return I() + "/oauth/token/line/exchange";
    }

    public static String h() {
        return I() + "/oauth/token";
    }

    public static String i() {
        return I() + "/oauth/token/exchange";
    }

    public static String j() {
        return I() + "/oauth/token/twitter/exchange";
    }

    public static String k() {
        return I() + "/oauth/token/vk/exchange/v2";
    }

    public static String l() {
        return I() + "/game/guest/bind";
    }

    public static String m() {
        return B() + "/info/pricing";
    }

    public static String n() {
        return B() + "/options/get";
    }

    public static long o() {
        return p() == c.TEST ? 600000L : 604800000L;
    }

    public static c p() {
        return f514n;
    }

    public static String q() {
        return B() + "/info/event/config";
    }

    public static String r() {
        return B() + "/info/event/pricing";
    }

    public static String s() {
        return "https://connect.garenanow.com/app/feedback";
    }

    public static String t() {
        return I() + "/oauth/garena?";
    }

    public static String u() {
        return I() + "/oauth/login?";
    }

    public static String v() {
        return B() + "/pay/google/commit";
    }

    public static String w() {
        return I() + "/oauth/guest/token/grant";
    }

    public static String x() {
        return I() + "/oauth/user/friends/get/v2";
    }

    public static String y() {
        return I() + "/oauth/user/friends/info/get/v2";
    }

    public static String z() {
        return I() + "/oauth/user/friends/inapp/get/v2";
    }
}
