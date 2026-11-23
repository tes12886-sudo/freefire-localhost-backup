package com.google.android.datatransport.h;

/* JADX INFO: loaded from: classes.dex */
abstract class m {

    public static abstract class a {
        public abstract m a();

        abstract a b(com.google.android.datatransport.b bVar);

        abstract a c(com.google.android.datatransport.c<?> cVar);

        abstract a d(com.google.android.datatransport.e<?, byte[]> eVar);

        public abstract a e(n nVar);

        public abstract a f(String str);
    }

    m() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract com.google.android.datatransport.b b();

    abstract com.google.android.datatransport.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    abstract com.google.android.datatransport.e<?, byte[]> e();

    public abstract n f();

    public abstract String g();
}
