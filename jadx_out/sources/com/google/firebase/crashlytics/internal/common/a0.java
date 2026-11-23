package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    private static final ExecutorService a = q.c("awaitEvenIfOnMainThread task continuation executor");

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements Continuation<T, Void> {
        final /* synthetic */ TaskCompletionSource a;

        a(TaskCompletionSource taskCompletionSource) {
            this.a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(Task<T> task) {
            if (task.isSuccessful()) {
                this.a.e(task.getResult());
                return null;
            }
            this.a.d(task.getException());
            return null;
        }
    }

    class b implements Runnable {
        final /* synthetic */ Callable a;
        final /* synthetic */ TaskCompletionSource b;

        /* JADX INFO: Add missing generic type declarations: [T] */
        class a<T> implements Continuation<T, Void> {
            a() {
            }

            @Override // com.google.android.gms.tasks.Continuation
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void a(Task<T> task) {
                if (task.isSuccessful()) {
                    b.this.b.c(task.getResult());
                    return null;
                }
                b.this.b.b(task.getException());
                return null;
            }
        }

        b(Callable callable, TaskCompletionSource taskCompletionSource) {
            this.a = callable;
            this.b = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((Task) this.a.call()).continueWith(new a());
            } catch (Exception e) {
                this.b.b(e);
            }
        }
    }

    public static <T> T a(Task<T> task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(a, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.e
            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task2) {
                return a0.c(countDownLatch, task2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    public static <T> Task<T> b(Executor executor, Callable<Task<T>> callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new b(callable, taskCompletionSource));
        return taskCompletionSource.a();
    }

    static /* synthetic */ Object c(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    public static <T> Task<T> d(Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a aVar = new a(taskCompletionSource);
        task.continueWith(aVar);
        task2.continueWith(aVar);
        return taskCompletionSource.a();
    }
}
