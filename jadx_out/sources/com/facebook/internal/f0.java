package com.facebook.internal;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    private static final Collection<String> a;
    private static final Collection<String> b;
    private static final String c;

    static {
        l.y.c.i.d(f0.class.getName(), "ServerProtocol::class.java.name");
        a = h0.D0("service_disabled", "AndroidAuthKillSwitchException");
        b = h0.D0("access_denied", "OAuthAccessDeniedException");
        c = "CONNECTION_FAILURE";
    }

    private f0() {
    }

    public static final String a() {
        return "v12.0";
    }

    public static final String b() {
        l.y.c.o oVar = l.y.c.o.a;
        String str = String.format("m.%s", Arrays.copyOf(new Object[]{com.facebook.r.o()}, 1));
        l.y.c.i.d(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String c() {
        return c;
    }

    public static final Collection<String> d() {
        return a;
    }

    public static final Collection<String> e() {
        return b;
    }

    public static final String f() {
        l.y.c.o oVar = l.y.c.o.a;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{com.facebook.r.o()}, 1));
        l.y.c.i.d(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String g() {
        l.y.c.o oVar = l.y.c.o.a;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{com.facebook.r.q()}, 1));
        l.y.c.i.d(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String h(String str) {
        l.y.c.i.e(str, "subdomain");
        l.y.c.o oVar = l.y.c.o.a;
        String str2 = String.format("https://graph.%s", Arrays.copyOf(new Object[]{str}, 1));
        l.y.c.i.d(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    public static final String i() {
        l.y.c.o oVar = l.y.c.o.a;
        String str = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{com.facebook.r.q()}, 1));
        l.y.c.i.d(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String j() {
        l.y.c.o oVar = l.y.c.o.a;
        String str = String.format("m.%s", Arrays.copyOf(new Object[]{com.facebook.r.r()}, 1));
        l.y.c.i.d(str, "java.lang.String.format(format, *args)");
        return str;
    }
}
