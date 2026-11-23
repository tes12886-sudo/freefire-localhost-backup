package com.facebook.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class z<T> {
    private T a;
    private CountDownLatch b;

    static final class a<V> implements Callable {
        final /* synthetic */ Callable b;

        a(Callable callable) {
            this.b = callable;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void call() {
            try {
                z.this.a = this.b.call();
            } finally {
                CountDownLatch countDownLatch = z.this.b;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }
        }
    }

    public z(Callable<T> callable) {
        l.y.c.i.e(callable, "callable");
        this.b = new CountDownLatch(1);
        com.facebook.r.n().execute(new FutureTask(new a(callable)));
    }
}
