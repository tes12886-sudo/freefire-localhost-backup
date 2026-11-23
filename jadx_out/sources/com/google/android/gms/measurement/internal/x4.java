package com.google.android.gms.measurement.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class x4 extends v5 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AtomicLong f1297l = new AtomicLong(Long.MIN_VALUE);
    private w4 c;
    private w4 d;
    private final PriorityBlockingQueue<v4<?>> e;
    private final BlockingQueue<v4<?>> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f1298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f1299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f1300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Semaphore f1301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f1302k;

    x4(a5 a5Var) {
        super(a5Var);
        this.f1300i = new Object();
        this.f1301j = new Semaphore(2);
        this.e = new PriorityBlockingQueue<>();
        this.f = new LinkedBlockingQueue();
        this.f1298g = new u4(this, "Thread death: Uncaught exception on worker thread");
        this.f1299h = new u4(this, "Thread death: Uncaught exception on network thread");
    }

    static /* synthetic */ w4 B(x4 x4Var, w4 w4Var) {
        x4Var.d = null;
        return null;
    }

    private final void D(v4<?> v4Var) {
        synchronized (this.f1300i) {
            this.e.add(v4Var);
            w4 w4Var = this.c;
            if (w4Var == null) {
                w4 w4Var2 = new w4(this, "Measurement Worker", this.e);
                this.c = w4Var2;
                w4Var2.setUncaughtExceptionHandler(this.f1298g);
                this.c.start();
            } else {
                w4Var.a();
            }
        }
    }

    static /* synthetic */ boolean w(x4 x4Var) {
        boolean z = x4Var.f1302k;
        return false;
    }

    static /* synthetic */ w4 z(x4 x4Var, w4 w4Var) {
        x4Var.c = null;
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.u5
    public final void g() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.u5
    public final void h() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5
    protected final boolean i() {
        return false;
    }

    public final boolean o() {
        return Thread.currentThread() == this.c;
    }

    public final <V> Future<V> p(Callable<V> callable) {
        l();
        com.google.android.gms.common.internal.q.k(callable);
        v4<?> v4Var = new v4<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                this.a.d().r().a("Callable skipped the worker queue.");
            }
            v4Var.run();
        } else {
            D(v4Var);
        }
        return v4Var;
    }

    public final <V> Future<V> q(Callable<V> callable) {
        l();
        com.google.android.gms.common.internal.q.k(callable);
        v4<?> v4Var = new v4<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            v4Var.run();
        } else {
            D(v4Var);
        }
        return v4Var;
    }

    public final void r(Runnable runnable) {
        l();
        com.google.android.gms.common.internal.q.k(runnable);
        D(new v4<>(this, runnable, false, "Task exception on worker thread"));
    }

    final <T> T s(AtomicReference<T> atomicReference, long j2, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.a.f().r(runnable);
            try {
                atomicReference.wait(j2);
            } catch (InterruptedException unused) {
                this.a.d().r().a(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            this.a.d().r().a(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return t;
    }

    public final void t(Runnable runnable) {
        l();
        com.google.android.gms.common.internal.q.k(runnable);
        D(new v4<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final void u(Runnable runnable) {
        l();
        com.google.android.gms.common.internal.q.k(runnable);
        v4<?> v4Var = new v4<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f1300i) {
            this.f.add(v4Var);
            w4 w4Var = this.d;
            if (w4Var == null) {
                w4 w4Var2 = new w4(this, "Measurement Network", this.f);
                this.d = w4Var2;
                w4Var2.setUncaughtExceptionHandler(this.f1299h);
                this.d.start();
            } else {
                w4Var.a();
            }
        }
    }
}
