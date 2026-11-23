package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class g0 implements h0 {
    private final v4 a;
    private final String b;

    public g0(v4 v4Var, String str) {
        this.a = v4Var;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.measurement.h0
    public final v4 a(q qVar) {
        v4 v4VarC = this.a.c();
        v4VarC.f(this.b, qVar);
        return v4VarC;
    }
}
