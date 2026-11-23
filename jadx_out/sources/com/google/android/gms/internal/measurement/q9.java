package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
abstract class q9 {
    private static final q9 a;
    private static final q9 b;

    static {
        n9 n9Var = null;
        a = new o9(n9Var);
        b = new p9(n9Var);
    }

    /* synthetic */ q9(n9 n9Var) {
    }

    static q9 c() {
        return a;
    }

    static q9 d() {
        return b;
    }

    abstract void a(Object obj, long j2);

    abstract <L> void b(Object obj, Object obj2, long j2);
}
