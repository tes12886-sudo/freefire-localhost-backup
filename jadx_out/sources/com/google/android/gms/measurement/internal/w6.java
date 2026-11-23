package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class w6 implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ d7 b;

    w6(d7 d7Var, AtomicReference atomicReference) {
        this.b = d7Var;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(Double.valueOf(this.b.a.z().v(this.b.a.b().p(), f3.O)));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
