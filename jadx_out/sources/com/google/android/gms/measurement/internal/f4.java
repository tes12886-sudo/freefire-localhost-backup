package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
abstract class f4 extends e3 {
    private boolean b;

    f4(a5 a5Var) {
        super(a5Var);
        this.a.o();
    }

    final boolean i() {
        return this.b;
    }

    protected final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (m()) {
            return;
        }
        this.a.p();
        this.b = true;
    }

    public final void l() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        n();
        this.a.p();
        this.b = true;
    }

    protected abstract boolean m();

    protected void n() {
    }
}
