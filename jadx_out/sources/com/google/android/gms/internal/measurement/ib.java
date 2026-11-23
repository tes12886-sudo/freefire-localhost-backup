package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class ib extends AbstractList<String> implements RandomAccess, m9 {
    private final m9 a;

    public ib(m9 m9Var) {
        this.a = m9Var;
    }

    @Override // com.google.android.gms.internal.measurement.m9
    public final m9 a() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.m9
    public final List<?> e() {
        return this.a.e();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return ((l9) this.a).get(i2);
    }

    @Override // com.google.android.gms.internal.measurement.m9
    public final void i(z7 z7Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new hb(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i2) {
        return new gb(this, i2);
    }

    @Override // com.google.android.gms.internal.measurement.m9
    public final Object o(int i2) {
        return this.a.o(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
