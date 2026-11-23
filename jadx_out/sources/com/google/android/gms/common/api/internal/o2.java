package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class o2 extends i2 {
    public final i.a c;

    public o2(i.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.p2
    public final /* bridge */ /* synthetic */ void d(w wVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final boolean f(j1 j1Var) {
        y1 y1Var = (y1) j1Var.x().get(this.c);
        if (y1Var == null) {
            return false;
        }
        y1Var.a.d();
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final com.google.android.gms.common.c[] g(j1 j1Var) {
        y1 y1Var = (y1) j1Var.x().get(this.c);
        if (y1Var == null) {
            return null;
        }
        return y1Var.a.b();
    }

    @Override // com.google.android.gms.common.api.internal.i2
    public final void h(j1 j1Var) {
        y1 y1Var = (y1) j1Var.x().remove(this.c);
        if (y1Var == null) {
            this.b.e(Boolean.FALSE);
        } else {
            y1Var.b.a(j1Var.v(), this.b);
            y1Var.a.a();
        }
    }
}
