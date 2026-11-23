package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
abstract class v5 extends u5 {
    private boolean b;

    v5(a5 a5Var) {
        super(a5Var);
        this.a.o();
    }

    protected abstract boolean i();

    protected void j() {
    }

    final boolean k() {
        return this.b;
    }

    protected final void l() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (i()) {
            return;
        }
        this.a.p();
        this.b = true;
    }

    public final void n() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.a.p();
        this.b = true;
    }
}
