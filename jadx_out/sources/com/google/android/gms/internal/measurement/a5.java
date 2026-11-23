package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class a5 extends v8<b5, a5> implements ea {
    private a5() {
        super(b5.zzg);
    }

    /* synthetic */ a5(c4 c4Var) {
        super(b5.zzg);
    }

    public final a5 w(int i2) {
        if (this.c) {
            s();
            this.c = false;
        }
        b5.E((b5) this.b, i2);
        return this;
    }

    public final a5 x(Iterable<? extends Long> iterable) {
        if (this.c) {
            s();
            this.c = false;
        }
        b5.G((b5) this.b, iterable);
        return this;
    }
}
