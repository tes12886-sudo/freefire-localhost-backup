package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class g3 extends v8<h3, g3> implements ea {
    private g3() {
        super(h3.zzm);
    }

    /* synthetic */ g3(d3 d3Var) {
        super(h3.zzm);
    }

    public final g3 A(int i2, j3 j3Var) {
        if (this.c) {
            s();
            this.c = false;
        }
        h3.N((h3) this.b, i2, j3Var);
        return this;
    }

    public final String w() {
        return ((h3) this.b).z();
    }

    public final g3 x(String str) {
        if (this.c) {
            s();
            this.c = false;
        }
        h3.M((h3) this.b, str);
        return this;
    }

    public final int y() {
        return ((h3) this.b).B();
    }

    public final j3 z(int i2) {
        return ((h3) this.b).C(i2);
    }
}
