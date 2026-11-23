package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class j9 extends m {
    final /* synthetic */ k9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j9(k9 k9Var, w5 w5Var) {
        super(w5Var);
        this.e = k9Var;
    }

    @Override // com.google.android.gms.measurement.internal.m
    public final void a() {
        this.e.n();
        this.e.a.d().w().a("Starting upload from DelayedRunnable");
        this.e.b.g();
    }
}
