package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class t0 {
    private static WeakReference<t0> d;
    private final SharedPreferences a;
    private q0 b;
    private final Executor c;

    private t0(SharedPreferences sharedPreferences, Executor executor) {
        this.c = executor;
        this.a = sharedPreferences;
    }

    public static synchronized t0 b(Context context, Executor executor) {
        WeakReference<t0> weakReference = d;
        t0 t0Var = weakReference != null ? weakReference.get() : null;
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
        t0Var2.d();
        d = new WeakReference<>(t0Var2);
        return t0Var2;
    }

    private synchronized void d() {
        this.b = q0.d(this.a, "topic_operation_queue", ",", this.c);
    }

    synchronized boolean a(s0 s0Var) {
        return this.b.a(s0Var.e());
    }

    synchronized s0 c() {
        return s0.a(this.b.f());
    }

    synchronized boolean e(s0 s0Var) {
        return this.b.g(s0Var.e());
    }
}
