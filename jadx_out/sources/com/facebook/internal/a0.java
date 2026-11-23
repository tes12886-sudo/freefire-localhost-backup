package com.facebook.internal;

import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    private final com.facebook.a0 a;
    private final String b;
    private StringBuilder c;
    private int d;
    public static final a f = new a(null);
    private static final HashMap<String, String> e = new HashMap<>();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        private final synchronized String g(String str) {
            String strT;
            strT = str;
            for (Map.Entry entry : a0.e.entrySet()) {
                strT = l.d0.p.t(strT, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return strT;
        }

        public final void a(com.facebook.a0 a0Var, int i2, String str, String str2) {
            l.y.c.i.e(a0Var, "behavior");
            l.y.c.i.e(str, "tag");
            l.y.c.i.e(str2, "string");
            if (com.facebook.r.z(a0Var)) {
                String strG = g(str2);
                if (!l.d0.p.x(str, "FacebookSDK.", false, 2, null)) {
                    str = "FacebookSDK." + str;
                }
                Log.println(i2, str, strG);
                if (a0Var == com.facebook.a0.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void b(com.facebook.a0 a0Var, int i2, String str, String str2, Object... objArr) {
            l.y.c.i.e(a0Var, "behavior");
            l.y.c.i.e(str, "tag");
            l.y.c.i.e(str2, "format");
            l.y.c.i.e(objArr, "args");
            if (com.facebook.r.z(a0Var)) {
                l.y.c.o oVar = l.y.c.o.a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str3 = String.format(str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                l.y.c.i.d(str3, "java.lang.String.format(format, *args)");
                a(a0Var, i2, str, str3);
            }
        }

        public final void c(com.facebook.a0 a0Var, String str, String str2) {
            l.y.c.i.e(a0Var, "behavior");
            l.y.c.i.e(str, "tag");
            l.y.c.i.e(str2, "string");
            a(a0Var, 3, str, str2);
        }

        public final void d(com.facebook.a0 a0Var, String str, String str2, Object... objArr) {
            l.y.c.i.e(a0Var, "behavior");
            l.y.c.i.e(str, "tag");
            l.y.c.i.e(str2, "format");
            l.y.c.i.e(objArr, "args");
            if (com.facebook.r.z(a0Var)) {
                l.y.c.o oVar = l.y.c.o.a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str3 = String.format(str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                l.y.c.i.d(str3, "java.lang.String.format(format, *args)");
                a(a0Var, 3, str, str3);
            }
        }

        public final synchronized void e(String str) {
            l.y.c.i.e(str, "accessToken");
            if (!com.facebook.r.z(com.facebook.a0.INCLUDE_ACCESS_TOKENS)) {
                f(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void f(String str, String str2) {
            l.y.c.i.e(str, "original");
            l.y.c.i.e(str2, "replace");
            a0.e.put(str, str2);
        }
    }

    public a0(com.facebook.a0 a0Var, String str) {
        l.y.c.i.e(a0Var, "behavior");
        l.y.c.i.e(str, "tag");
        this.d = 3;
        i0.n(str, "tag");
        this.a = a0Var;
        this.b = "FacebookSDK." + str;
        this.c = new StringBuilder();
    }

    private final boolean g() {
        return com.facebook.r.z(this.a);
    }

    public final void b(String str) {
        l.y.c.i.e(str, "string");
        if (g()) {
            this.c.append(str);
        }
    }

    public final void c(String str, Object... objArr) {
        l.y.c.i.e(str, "format");
        l.y.c.i.e(objArr, "args");
        if (g()) {
            StringBuilder sb = this.c;
            l.y.c.o oVar = l.y.c.o.a;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            l.y.c.i.d(str2, "java.lang.String.format(format, *args)");
            sb.append(str2);
        }
    }

    public final void d(String str, Object obj) {
        l.y.c.i.e(str, "key");
        l.y.c.i.e(obj, "value");
        c("  %s:\t%s\n", str, obj);
    }

    public final void e() {
        String string = this.c.toString();
        l.y.c.i.d(string, "contents.toString()");
        f(string);
        this.c = new StringBuilder();
    }

    public final void f(String str) {
        l.y.c.i.e(str, "string");
        f.a(this.a, this.d, this.b, str);
    }
}
