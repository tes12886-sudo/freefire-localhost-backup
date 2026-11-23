package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class s0 implements com.google.android.gms.common.api.e.b {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ q b;
    final /* synthetic */ x0 c;

    s0(x0 x0Var, AtomicReference atomicReference, q qVar) {
        this.c = x0Var;
        this.a = atomicReference;
        this.b = qVar;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void j(int i2) {
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void o(Bundle bundle) {
        x0 x0Var = this.c;
        com.google.android.gms.common.api.e eVar = (com.google.android.gms.common.api.e) this.a.get();
        com.google.android.gms.common.internal.q.k(eVar);
        x0Var.C(eVar, this.b, true);
    }
}
