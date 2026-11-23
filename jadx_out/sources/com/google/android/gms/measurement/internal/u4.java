package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class u4 implements Thread.UncaughtExceptionHandler {
    private final String a;
    final /* synthetic */ x4 b;

    public u4(x4 x4Var, String str) {
        this.b = x4Var;
        com.google.android.gms.common.internal.q.k(str);
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.a.d().o().b(this.a, th);
    }
}
