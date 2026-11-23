package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class c8 extends m {
    final /* synthetic */ r8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c8(r8 r8Var, w5 w5Var) {
        super(w5Var);
        this.e = r8Var;
    }

    @Override // com.google.android.gms.measurement.internal.m
    public final void a() {
        this.e.a.d().r().a("Tasks have been queued for a long time");
    }
}
