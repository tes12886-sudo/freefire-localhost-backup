package com.google.android.gms.tasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static <TResult> TResult a(Task<TResult> task) throws InterruptedException {
        com.google.android.gms.common.internal.q.i();
        com.google.android.gms.common.internal.q.l(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) h(task);
        }
        f fVar = new f(null);
        i(task, fVar);
        fVar.a();
        return (TResult) h(task);
    }

    public static <TResult> TResult b(Task<TResult> task, long j2, TimeUnit timeUnit) throws TimeoutException {
        com.google.android.gms.common.internal.q.i();
        com.google.android.gms.common.internal.q.l(task, "Task must not be null");
        com.google.android.gms.common.internal.q.l(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (TResult) h(task);
        }
        f fVar = new f(null);
        i(task, fVar);
        if (fVar.b(j2, timeUnit)) {
            return (TResult) h(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> Task<TResult> c(Executor executor, Callable<TResult> callable) {
        com.google.android.gms.common.internal.q.l(executor, "Executor must not be null");
        com.google.android.gms.common.internal.q.l(callable, "Callback must not be null");
        b0 b0Var = new b0();
        executor.execute(new c0(b0Var, callable));
        return b0Var;
    }

    public static <TResult> Task<TResult> d(Exception exc) {
        b0 b0Var = new b0();
        b0Var.a(exc);
        return b0Var;
    }

    public static <TResult> Task<TResult> e(TResult tresult) {
        b0 b0Var = new b0();
        b0Var.b(tresult);
        return b0Var;
    }

    public static Task<Void> f(Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        b0 b0Var = new b0();
        h hVar = new h(collection.size(), b0Var);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            i(it2.next(), hVar);
        }
        return b0Var;
    }

    public static Task<Void> g(Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? e(null) : f(Arrays.asList(taskArr));
    }

    private static Object h(Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    private static void i(Task task, g gVar) {
        Executor executor = c.b;
        task.addOnSuccessListener(executor, gVar);
        task.addOnFailureListener(executor, gVar);
        task.addOnCanceledListener(executor, gVar);
    }
}
