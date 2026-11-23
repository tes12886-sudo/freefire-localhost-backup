package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class ma<E> extends m7<E> implements RandomAccess {
    private static final ma<Object> d;
    private E[] b;
    private int c;

    static {
        ma<Object> maVar = new ma<>(new Object[0], 0);
        d = maVar;
        maVar.zzb();
    }

    private ma(E[] eArr, int i2) {
        this.b = eArr;
        this.c = i2;
    }

    public static <E> ma<E> c() {
        return (ma<E>) d;
    }

    private final void d(int i2) {
        if (i2 < 0 || i2 >= this.c) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    private final String f(int i2) {
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, E e) {
        int i3;
        b();
        if (i2 < 0 || i2 > (i3 = this.c)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        E[] eArr = this.b;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = (E[]) new Object[((i3 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i2);
            System.arraycopy(this.b, i2, eArr2, i2 + 1, this.c - i2);
            this.b = eArr2;
        }
        this.b[i2] = e;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        b();
        int i2 = this.c;
        E[] eArr = this.b;
        if (i2 == eArr.length) {
            this.b = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        eArr2[i3] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        d(i2);
        return this.b[i2];
    }

    @Override // com.google.android.gms.internal.measurement.f9
    public final /* bridge */ /* synthetic */ f9 k(int i2) {
        if (i2 >= this.c) {
            return new ma(Arrays.copyOf(this.b, i2), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.List
    public final E remove(int i2) {
        b();
        d(i2);
        E[] eArr = this.b;
        E e = eArr[i2];
        int i3 = this.c;
        if (i2 < i3 - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (i3 - i2) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i2, E e) {
        b();
        d(i2);
        E[] eArr = this.b;
        E e2 = eArr[i2];
        eArr[i2] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
