package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class d implements Iterator<q> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Iterator b;

    d(f fVar, Iterator it, Iterator it2) {
        this.a = it;
        this.b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a.hasNext()) {
            return true;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ q next() {
        if (this.a.hasNext()) {
            return new u(((Integer) this.a.next()).toString());
        }
        if (this.b.hasNext()) {
            return new u((String) this.b.next());
        }
        throw new NoSuchElementException();
    }
}
