package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class v7 implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ ja b;
    final /* synthetic */ r8 c;

    v7(r8 r8Var, AtomicReference atomicReference, ja jaVar) {
        this.c = r8Var;
        this.a = atomicReference;
        this.b = jaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.a) {
            try {
                try {
                    if (!this.c.a.A().t().h()) {
                        this.c.a.d().t().a("Analytics storage consent denied; will not get app instance id");
                        this.c.a.F().r(null);
                        this.c.a.A().f1210g.b(null);
                        this.a.set(null);
                        this.a.notify();
                        return;
                    }
                    i3 i3Var = this.c.d;
                    if (i3Var == null) {
                        this.c.a.d().o().a("Failed to get app instance id");
                        this.a.notify();
                        return;
                    }
                    com.google.android.gms.common.internal.q.k(this.b);
                    this.a.set(i3Var.Q(this.b));
                    String str = (String) this.a.get();
                    if (str != null) {
                        this.c.a.F().r(str);
                        this.c.a.A().f1210g.b(str);
                    }
                    this.c.D();
                    atomicReference = this.a;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.c.a.d().o().b("Failed to get app instance id", e);
                    atomicReference = this.a;
                }
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
