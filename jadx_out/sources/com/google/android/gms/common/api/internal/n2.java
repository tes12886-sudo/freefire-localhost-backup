package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends q1 {
    private final r b;
    private final TaskCompletionSource c;
    private final p d;

    public n2(int i2, r rVar, TaskCompletionSource taskCompletionSource, p pVar) {
        super(i2);
        this.c = taskCompletionSource;
        this.b = rVar;
        this.d = pVar;
        if (i2 == 2 && rVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void a(Status status) {
        this.c.d(this.d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void b(Exception exc) {
        this.c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void c(j1 j1Var) throws DeadObjectException {
        try {
            this.b.b(j1Var.v(), this.c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(p2.e(e2));
        } catch (RuntimeException e3) {
            this.c.d(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void d(w wVar, boolean z) {
        wVar.d(this.c, z);
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final boolean f(j1 j1Var) {
        return this.b.c();
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final com.google.android.gms.common.c[] g(j1 j1Var) {
        return this.b.e();
    }
}
