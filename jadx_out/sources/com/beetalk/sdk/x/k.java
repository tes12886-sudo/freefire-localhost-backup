package com.beetalk.sdk.x;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static <T> void a(T t, T t2, String str) {
        if (String.valueOf(t).equals(String.valueOf(t2))) {
            return;
        }
        throw new IllegalArgumentException("Argument " + str + " is not equal to expected value");
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + str + "' cannot be null");
    }
}
