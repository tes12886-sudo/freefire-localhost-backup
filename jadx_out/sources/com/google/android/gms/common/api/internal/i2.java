package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
abstract class i2 extends q1 {
    protected final TaskCompletionSource b;

    public i2(int i2, TaskCompletionSource taskCompletionSource) {
        super(i2);
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void a(Status status) {
        this.b.d(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void b(Exception exc) {
        this.b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void c(j1 j1Var) throws DeadObjectException {
        try {
            h(j1Var);
        } catch (DeadObjectException e) {
            a(p2.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(p2.e(e2));
        } catch (RuntimeException e3) {
            this.b.d(e3);
        }
    }

    protected abstract void h(j1 j1Var);
}
