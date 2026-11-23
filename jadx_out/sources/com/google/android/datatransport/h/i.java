package com.google.android.datatransport.h;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    public static abstract class a {
        public final a a(String str, int i2) {
            e().put(str, String.valueOf(i2));
            return this;
        }

        public final a b(String str, long j2) {
            e().put(str, String.valueOf(j2));
            return this;
        }

        public final a c(String str, String str2) {
            e().put(str, str2);
            return this;
        }

        public abstract i d();

        protected abstract Map<String, String> e();

        protected abstract a f(Map<String, String> map);

        public abstract a g(Integer num);

        public abstract a h(h hVar);

        public abstract a i(long j2);

        public abstract a j(String str);

        public abstract a k(long j2);
    }

    public static a a() {
        b.C0117b c0117b = new b.C0117b();
        c0117b.f(new HashMap());
        return c0117b;
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? "" : str2;
    }

    protected abstract Map<String, String> c();

    public abstract Integer d();

    public abstract h e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long h(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> i() {
        return Collections.unmodifiableMap(c());
    }

    public abstract String j();

    public abstract long k();

    public a l() {
        b.C0117b c0117b = new b.C0117b();
        c0117b.j(j());
        c0117b.g(d());
        c0117b.h(e());
        c0117b.i(f());
        c0117b.k(k());
        c0117b.f(new HashMap(c()));
        return c0117b;
    }
}
