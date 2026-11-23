package com.google.android.datatransport.h.u.a;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<T>] */
/* JADX INFO: loaded from: classes.dex */
public final class c<T> implements b<T> {
    private final T a;

    private c(T t) {
        this.a = t;
    }

    public static <T> b<T> a(T t) {
        d.c(t, "instance cannot be null");
        return new c(t);
    }

    @Override // k.a.a
    public T get() {
        return this.a;
    }
}
