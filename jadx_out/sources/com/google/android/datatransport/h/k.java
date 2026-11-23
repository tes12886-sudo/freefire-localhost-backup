package com.google.android.datatransport.h;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k implements com.google.android.datatransport.h.u.a.b<Executor> {

    private static final class a {
        private static final k a = new k();
    }

    public static k a() {
        return a.a;
    }

    public static Executor b() {
        Executor executorA = j.a();
        com.google.android.datatransport.h.u.a.d.c(executorA, "Cannot return null from a non-@Nullable @Provides method");
        return executorA;
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
