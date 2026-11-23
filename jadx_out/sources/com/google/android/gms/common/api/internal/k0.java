package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class k0 extends j.d.a.c.g.b.d {
    private final WeakReference a;

    k0(p0 p0Var) {
        this.a = new WeakReference(p0Var);
    }

    @Override // j.d.a.c.g.b.f
    public final void g0(j.d.a.c.g.b.l lVar) {
        p0 p0Var = (p0) this.a.get();
        if (p0Var == null) {
            return;
        }
        p0Var.a.q(new j0(this, p0Var, p0Var, lVar));
    }
}
