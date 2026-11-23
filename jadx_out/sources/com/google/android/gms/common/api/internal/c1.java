package com.google.android.gms.common.api.internal;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    private static final ExecutorService a = j.d.a.c.f.d.m.a().b(2, new com.google.android.gms.common.util.q.b("GAC_Executor"), 2);

    public static ExecutorService a() {
        return a;
    }
}
