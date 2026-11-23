package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class e implements Iterator<q> {
    private int a = 0;
    final /* synthetic */ f b;

    e(f fVar) {
        this.b = fVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.t();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ q next() {
        if (this.a < this.b.t()) {
            f fVar = this.b;
            int i2 = this.a;
            this.a = i2 + 1;
            return fVar.v(i2);
        }
        int i3 = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i3);
        throw new NoSuchElementException(sb.toString());
    }
}
