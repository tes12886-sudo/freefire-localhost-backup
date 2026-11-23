package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class s7 extends t7 {
    private int a = 0;
    private final int b;
    final /* synthetic */ z7 c;

    s7(z7 z7Var) {
        this.c = z7Var;
        this.b = z7Var.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // com.google.android.gms.internal.measurement.v7
    public final byte zza() {
        int i2 = this.a;
        if (i2 >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = i2 + 1;
        return this.c.c(i2);
    }
}
