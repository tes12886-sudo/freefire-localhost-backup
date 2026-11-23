package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class v6<T> implements Serializable {
    v6() {
    }

    public static <T> v6<T> c() {
        return t6.a;
    }

    public static <T> v6<T> d(T t) {
        return new x6(t);
    }

    public abstract boolean a();

    public abstract T b();
}
