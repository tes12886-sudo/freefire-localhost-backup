package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class m2 extends p2 {
    protected final d b;

    public m2(int i2, d dVar) {
        super(i2);
        com.google.android.gms.common.internal.q.l(dVar, "Null methods are not runnable.");
        this.b = dVar;
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void a(Status status) {
        try {
            this.b.x(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void b(Exception exc) {
        try {
            this.b.x(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void c(j1 j1Var) throws DeadObjectException {
        try {
            this.b.v(j1Var.v());
        } catch (RuntimeException e) {
            b(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final void d(w wVar, boolean z) {
        wVar.c(this.b, z);
    }
}
