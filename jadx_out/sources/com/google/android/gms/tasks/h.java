package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class h<T> implements g<T> {
    private final Object a = new Object();
    private final int b;
    private final b0 c;

    @GuardedBy("mLock")
    private int d;

    @GuardedBy("mLock")
    private int e;

    @GuardedBy("mLock")
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("mLock")
    private Exception f1304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f1305h;

    public h(int i2, b0 b0Var) {
        this.b = i2;
        this.c = b0Var;
    }

    @GuardedBy("mLock")
    private final void a() {
        if (this.d + this.e + this.f == this.b) {
            if (this.f1304g == null) {
                if (this.f1305h) {
                    this.c.c();
                    return;
                } else {
                    this.c.b(null);
                    return;
                }
            }
            this.c.a(new ExecutionException(this.e + " out of " + this.b + " underlying tasks failed", this.f1304g));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.a) {
            this.f++;
            this.f1305h = true;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.f1304g = exc;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t) {
        synchronized (this.a) {
            this.d++;
            a();
        }
    }
}
