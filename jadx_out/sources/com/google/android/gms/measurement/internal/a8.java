package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class a8 extends m {
    final /* synthetic */ r8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a8(r8 r8Var, w5 w5Var) {
        super(w5Var);
        this.e = r8Var;
    }

    @Override // com.google.android.gms.measurement.internal.m
    public final void a() {
        r8 r8Var = this.e;
        r8Var.h();
        if (r8Var.H()) {
            r8Var.a.d().w().a("Inactivity, disconnecting from the service");
            r8Var.t();
        }
    }
}
