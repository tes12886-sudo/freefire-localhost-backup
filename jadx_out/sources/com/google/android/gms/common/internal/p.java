package com.google.android.gms.common.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public class p {
    private static final r0 a = new o0();

    public interface a<R extends com.google.android.gms.common.api.j, T> {
        T a(R r);
    }

    public static <R extends com.google.android.gms.common.api.j, T> Task<T> a(com.google.android.gms.common.api.f<R> fVar, a<R, T> aVar) {
        r0 r0Var = a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        fVar.b(new p0(fVar, taskCompletionSource, aVar, r0Var));
        return taskCompletionSource.a();
    }

    public static <R extends com.google.android.gms.common.api.j> Task<Void> b(com.google.android.gms.common.api.f<R> fVar) {
        return a(fVar, new q0());
    }
}
