package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
abstract class m9 extends l9 {
    private boolean c;

    m9(v9 v9Var) {
        super(v9Var);
        this.b.q();
    }

    final boolean i() {
        return this.c;
    }

    protected final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    protected abstract boolean k();

    public final void l() {
        if (this.c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        k();
        this.b.r();
        this.c = true;
    }
}
