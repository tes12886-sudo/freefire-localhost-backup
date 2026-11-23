package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class CrashlyticsBackgroundWorker {
    private final Executor a;
    private Task<Void> b = com.google.android.gms.tasks.d.e(null);
    private final Object c = new Object();
    private final ThreadLocal<Boolean> d = new ThreadLocal<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CrashlyticsBackgroundWorker.this.d.set(Boolean.TRUE);
        }
    }

    class b implements Callable<Void> {
        final /* synthetic */ Runnable a;

        b(CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.a.run();
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class c<T> implements Continuation<Void, T> {
        final /* synthetic */ Callable a;

        c(CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, Callable callable) {
            this.a = callable;
        }

        @Override // com.google.android.gms.tasks.Continuation
        public T a(Task<Void> task) {
            return (T) this.a.call();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class d<T> implements Continuation<T, Void> {
        d(CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(Task<T> task) {
            return null;
        }
    }

    public CrashlyticsBackgroundWorker(Executor executor) {
        this.a = executor;
        executor.execute(new a());
    }

    private <T> Task<Void> d(Task<T> task) {
        return task.continueWith(this.a, new d(this));
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.d.get());
    }

    private <T> Continuation<Void, T> f(Callable<T> callable) {
        return new c(this, callable);
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.a;
    }

    Task<Void> g(Runnable runnable) {
        return h(new b(this, runnable));
    }

    public <T> Task<T> h(Callable<T> callable) {
        Task<T> taskContinueWith;
        synchronized (this.c) {
            taskContinueWith = this.b.continueWith(this.a, f(callable));
            this.b = d(taskContinueWith);
        }
        return taskContinueWith;
    }

    public <T> Task<T> i(Callable<Task<T>> callable) {
        Task<T> taskContinueWithTask;
        synchronized (this.c) {
            taskContinueWithTask = this.b.continueWithTask(this.a, f(callable));
            this.b = d(taskContinueWithTask);
        }
        return taskContinueWithTask;
    }
}
