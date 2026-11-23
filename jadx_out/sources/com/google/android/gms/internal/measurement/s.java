package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class s implements Iterator<q> {
    private int a = 0;
    final /* synthetic */ u b;

    s(u uVar) {
        this.b = uVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ q next() {
        if (this.a >= this.b.a.length()) {
            throw new NoSuchElementException();
        }
        int i2 = this.a;
        this.a = i2 + 1;
        return new u(String.valueOf(i2));
    }
}
