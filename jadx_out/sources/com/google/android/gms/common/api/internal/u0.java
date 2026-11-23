package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
final class u0 implements com.google.android.gms.common.api.k {
    final /* synthetic */ q a;
    final /* synthetic */ boolean b;
    final /* synthetic */ com.google.android.gms.common.api.e c;
    final /* synthetic */ x0 d;

    u0(x0 x0Var, q qVar, boolean z, com.google.android.gms.common.api.e eVar) {
        this.d = x0Var;
        this.a = qVar;
        this.b = z;
        this.c = eVar;
    }

    @Override // com.google.android.gms.common.api.k
    public final /* bridge */ /* synthetic */ void a(com.google.android.gms.common.api.j jVar) {
        Status status = (Status) jVar;
        com.google.android.gms.auth.api.signin.internal.c.b(this.d.f).i();
        if (status.n() && this.d.s()) {
            x0 x0Var = this.d;
            x0Var.g();
            x0Var.f();
        }
        this.a.j(status);
        if (this.b) {
            this.c.g();
        }
    }
}
