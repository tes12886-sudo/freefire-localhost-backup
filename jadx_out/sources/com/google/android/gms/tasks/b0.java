package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class b0<TResult> extends Task<TResult> {
    private final Object a = new Object();
    private final x b = new x();

    @GuardedBy("mLock")
    private boolean c;
    private volatile boolean d;

    @GuardedBy("mLock")
    private Object e;

    @GuardedBy("mLock")
    private Exception f;

    b0() {
    }

    @GuardedBy("mLock")
    private final void f() {
        com.google.android.gms.common.internal.q.o(this.c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    private final void g() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @GuardedBy("mLock")
    private final void h() {
        if (this.c) {
            throw a.a(this);
        }
    }

    private final void i() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }

    public final void a(Exception exc) {
        com.google.android.gms.common.internal.q.l(exc, "Exception must not be null");
        synchronized (this.a) {
            h();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        n nVar = new n(c.a, onCanceledListener);
        this.b.a(nVar);
        a0.l(activity).m(nVar);
        i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnCanceledListener(OnCanceledListener onCanceledListener) {
        addOnCanceledListener(c.a, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        this.b.a(new n(executor, onCanceledListener));
        i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnCompleteListener(Activity activity, OnCompleteListener<TResult> onCompleteListener) {
        p pVar = new p(c.a, onCompleteListener);
        this.b.a(pVar);
        a0.l(activity).m(pVar);
        i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        this.b.a(new p(c.a, onCompleteListener));
        i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnCompleteListener(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.b.a(new p(executor, onCompleteListener));
        i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        r rVar = new r(c.a, onFailureListener);
        this.b.a(rVar);
        a0.l(activity).m(rVar);
        i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnFailureListener(OnFailureListener onFailureListener) {
        addOnFailureListener(c.a, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        this.b.a(new r(executor, onFailureListener));
        i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnSuccessListener(Activity activity, OnSuccessListener<? super TResult> onSuccessListener) {
        t tVar = new t(c.a, onSuccessListener);
        this.b.a(tVar);
        a0.l(activity).m(tVar);
        i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnSuccessListener(OnSuccessListener<? super TResult> onSuccessListener) {
        addOnSuccessListener(c.a, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> addOnSuccessListener(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.b.a(new t(executor, onSuccessListener));
        i();
        return this;
    }

    public final void b(Object obj) {
        synchronized (this.a) {
            h();
            this.c = true;
            this.e = obj;
        }
        this.b.b(this);
    }

    public final boolean c() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            this.b.b(this);
            return true;
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(c.a, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWith(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        b0 b0Var = new b0();
        this.b.a(new j(executor, continuation, b0Var));
        i();
        return b0Var;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        return continueWithTask(c.a, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        b0 b0Var = new b0();
        this.b.a(new l(executor, continuation, b0Var));
        i();
        return b0Var;
    }

    public final boolean d(Exception exc) {
        com.google.android.gms.common.internal.q.l(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = exc;
            this.b.b(this);
            return true;
        }
    }

    public final boolean e(Object obj) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = obj;
            this.b.b(this);
            return true;
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult getResult() {
        TResult tresult;
        synchronized (this.a) {
            f();
            g();
            Exception exc = this.f;
            if (exc != null) {
                throw new b(exc);
            }
            tresult = (TResult) this.e;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <X extends Throwable> TResult getResult(Class<X> cls) {
        TResult tresult;
        synchronized (this.a) {
            f();
            g();
            if (cls.isInstance(this.f)) {
                throw cls.cast(this.f);
            }
            Exception exc = this.f;
            if (exc != null) {
                throw new b(exc);
            }
            tresult = (TResult) this.e;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && !this.d && this.f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        Executor executor = c.a;
        b0 b0Var = new b0();
        this.b.a(new v(executor, successContinuation, b0Var));
        i();
        return b0Var;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        b0 b0Var = new b0();
        this.b.a(new v(executor, successContinuation, b0Var));
        i();
        return b0Var;
    }
}
