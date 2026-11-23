package com.google.android.datatransport.runtime.backends;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static abstract class a {
        public abstract f a();

        public abstract a b(Iterable<com.google.android.datatransport.h.i> iterable);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new com.google.android.datatransport.runtime.backends.a.b();
    }

    public abstract Iterable<com.google.android.datatransport.h.i> b();

    public abstract byte[] c();
}
