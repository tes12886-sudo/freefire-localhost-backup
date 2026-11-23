package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class l9 extends m7<String> implements RandomAccess, m9 {
    private static final l9 c;
    private final List<Object> b;

    static {
        l9 l9Var = new l9(10);
        c = l9Var;
        l9Var.zzb();
    }

    public l9() {
        this(10);
    }

    public l9(int i2) {
        this.b = new ArrayList(i2);
    }

    private l9(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }

    private static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof z7 ? ((z7) obj).s(g9.a) : g9.d((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.m9
    public final m9 a() {
        return zza() ? new ib(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        b();
        this.b.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        b();
        if (collection instanceof m9) {
            collection = ((m9) collection).e();
        }
        boolean zAddAll = this.b.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String get(int i2) {
        Object obj = this.b.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof z7) {
            z7 z7Var = (z7) obj;
            String strS = z7Var.s(g9.a);
            if (z7Var.l()) {
                this.b.set(i2, strS);
            }
            return strS;
        }
        byte[] bArr = (byte[]) obj;
        String strD = g9.d(bArr);
        if (g9.c(bArr)) {
            this.b.set(i2, strD);
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.m9
    public final List<?> e() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // com.google.android.gms.internal.measurement.m9
    public final void i(z7 z7Var) {
        b();
        this.b.add(z7Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.f9
    public final /* bridge */ /* synthetic */ f9 k(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.b);
        return new l9((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.m9
    public final Object o(int i2) {
        return this.b.get(i2);
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        b();
        Object objRemove = this.b.remove(i2);
        ((AbstractList) this).modCount++;
        return d(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        b();
        return d(this.b.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
