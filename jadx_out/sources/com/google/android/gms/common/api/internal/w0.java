package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class w0 extends zabw {
    private final WeakReference a;

    w0(x0 x0Var) {
        this.a = new WeakReference(x0Var);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void a() {
        x0 x0Var = (x0) this.a.get();
        if (x0Var == null) {
            return;
        }
        x0.y(x0Var);
    }
}
