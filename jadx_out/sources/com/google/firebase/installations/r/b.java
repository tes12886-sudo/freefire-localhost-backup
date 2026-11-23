package com.google.firebase.installations.r;

/* JADX INFO: loaded from: classes.dex */
public class b implements a {
    private static b a;

    private b() {
    }

    public static b b() {
        if (a == null) {
            a = new b();
        }
        return a;
    }

    @Override // com.google.firebase.installations.r.a
    public long a() {
        return System.currentTimeMillis();
    }
}
