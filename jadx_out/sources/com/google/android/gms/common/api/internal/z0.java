package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
abstract class z0 {
    private final y0 a;

    protected z0(y0 y0Var) {
        this.a = y0Var;
    }

    protected abstract void a();

    public final void b(b1 b1Var) {
        b1Var.a.lock();
        try {
            if (b1Var.f946k == this.a) {
                a();
            }
        } finally {
            b1Var.a.unlock();
        }
    }
}
