package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class xa implements Iterator<Map.Entry> {
    private int a = -1;
    private boolean b;
    private Iterator<Map.Entry> c;
    final /* synthetic */ za d;

    /* synthetic */ xa(za zaVar, ra raVar) {
        this.d = zaVar;
    }

    private final Iterator<Map.Entry> a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a + 1 >= this.d.b.size()) {
            return !this.d.c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        this.b = true;
        int i2 = this.a + 1;
        this.a = i2;
        return (Map.Entry) (i2 < this.d.b.size() ? this.d.b.get(this.a) : a().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        this.d.m();
        if (this.a >= this.d.b.size()) {
            a().remove();
            return;
        }
        za zaVar = this.d;
        int i2 = this.a;
        this.a = i2 - 1;
        zaVar.k(i2);
    }
}
