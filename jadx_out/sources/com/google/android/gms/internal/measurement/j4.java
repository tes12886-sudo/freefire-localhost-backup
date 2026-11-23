package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j4 extends v8<k4, j4> implements ea {
    private j4() {
        super(k4.zzj);
    }

    /* synthetic */ j4(c4 c4Var) {
        super(k4.zzj);
    }

    public final j4 A(int i2, n4 n4Var) {
        if (this.c) {
            s();
            this.c = false;
        }
        k4.K((k4) this.b, i2, n4Var.p());
        return this;
    }

    public final j4 B(o4 o4Var) {
        if (this.c) {
            s();
            this.c = false;
        }
        k4.L((k4) this.b, o4Var);
        return this;
    }

    public final j4 C(n4 n4Var) {
        if (this.c) {
            s();
            this.c = false;
        }
        k4.L((k4) this.b, n4Var.p());
        return this;
    }

    public final j4 D(Iterable<? extends o4> iterable) {
        if (this.c) {
            s();
            this.c = false;
        }
        k4.M((k4) this.b, iterable);
        return this;
    }

    public final j4 E() {
        if (this.c) {
            s();
            this.c = false;
        }
        ((k4) this.b).zze = z8.p();
        return this;
    }

    public final j4 G(int i2) {
        if (this.c) {
            s();
            this.c = false;
        }
        k4.P((k4) this.b, i2);
        return this;
    }

    public final String H() {
        return ((k4) this.b).A();
    }

    public final j4 I(String str) {
        if (this.c) {
            s();
            this.c = false;
        }
        k4.Q((k4) this.b, str);
        return this;
    }

    public final long J() {
        return ((k4) this.b).C();
    }

    public final j4 K(long j2) {
        if (this.c) {
            s();
            this.c = false;
        }
        k4.R((k4) this.b, j2);
        return this;
    }

    public final long L() {
        return ((k4) this.b).E();
    }

    public final j4 M(long j2) {
        if (this.c) {
            s();
            this.c = false;
        }
        k4.S((k4) this.b, j2);
        return this;
    }

    public final List<o4> w() {
        return Collections.unmodifiableList(((k4) this.b).x());
    }

    public final int x() {
        return ((k4) this.b).y();
    }

    public final o4 y(int i2) {
        return ((k4) this.b).z(i2);
    }

    public final j4 z(int i2, o4 o4Var) {
        if (this.c) {
            s();
            this.c = false;
        }
        k4.K((k4) this.b, i2, o4Var);
        return this;
    }
}
