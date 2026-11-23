package com.google.firebase.installations.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static abstract class a {
        public abstract f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j2);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        com.google.firebase.installations.q.b.C0151b c0151b = new com.google.firebase.installations.q.b.C0151b();
        c0151b.d(0L);
        return c0151b;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
