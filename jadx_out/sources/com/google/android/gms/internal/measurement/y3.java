package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y3 extends v8<z3, y3> implements ea {
    private y3() {
        super(z3.zzn);
    }

    /* synthetic */ y3(u3 u3Var) {
        super(z3.zzn);
    }

    public final y3 A() {
        if (this.c) {
            s();
            this.c = false;
        }
        ((z3) this.b).zzj = z8.p();
        return this;
    }

    public final int w() {
        return ((z3) this.b).C();
    }

    public final x3 x(int i2) {
        return ((z3) this.b).D(i2);
    }

    public final y3 y(int i2, v3 v3Var) {
        if (this.c) {
            s();
            this.c = false;
        }
        z3.M((z3) this.b, i2, v3Var.p());
        return this;
    }

    public final List<f3> z() {
        return Collections.unmodifiableList(((z3) this.b).E());
    }
}
