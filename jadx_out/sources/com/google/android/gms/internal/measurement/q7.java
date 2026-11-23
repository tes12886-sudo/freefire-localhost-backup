package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class q7 extends m7<Boolean> implements RandomAccess, f9, ka {
    private static final q7 d;
    private boolean[] b;
    private int c;

    static {
        q7 q7Var = new q7(new boolean[0], 0);
        d = q7Var;
        q7Var.zzb();
    }

    q7() {
        this(new boolean[10], 0);
    }

    private q7(boolean[] zArr, int i2) {
        this.b = zArr;
        this.c = i2;
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
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i2 < 0 || i2 > (i3 = this.c)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        boolean[] zArr = this.b;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.b, i2, zArr2, i2 + 1, this.c - i2);
            this.b = zArr2;
        }
        this.b[i2] = zBooleanValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        b();
        g9.a(collection);
        if (!(collection instanceof q7)) {
            return super.addAll(collection);
        }
        q7 q7Var = (q7) collection;
        int i2 = q7Var.c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.c;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.b;
        if (i4 > zArr.length) {
            this.b = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(q7Var.b, 0, this.b, this.c, q7Var.c);
        this.c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(boolean z) {
        b();
        int i2 = this.c;
        boolean[] zArr = this.b;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.b = zArr2;
        }
        boolean[] zArr3 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        zArr3[i3] = z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7)) {
            return super.equals(obj);
        }
        q7 q7Var = (q7) obj;
        if (this.c != q7Var.c) {
            return false;
        }
        boolean[] zArr = q7Var.b;
        for (int i2 = 0; i2 < this.c; i2++) {
            if (this.b[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        d(i2);
        return Boolean.valueOf(this.b[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iF = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            iF = (iF * 31) + g9.f(this.b[i2]);
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.b[i3] == zBooleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.f9
    public final /* bridge */ /* synthetic */ f9 k(int i2) {
        if (i2 >= this.c) {
            return new q7(Arrays.copyOf(this.b, i2), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        b();
        d(i2);
        boolean[] zArr = this.b;
        boolean z = zArr[i2];
        int i3 = this.c;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.b;
        System.arraycopy(zArr, i3, zArr, i2, this.c - i3);
        this.c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        d(i2);
        boolean[] zArr = this.b;
        boolean z = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
