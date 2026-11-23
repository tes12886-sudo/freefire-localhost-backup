package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class a9 extends m7<Integer> implements RandomAccess, d9, ka {
    private static final a9 d;
    private int[] b;
    private int c;

    static {
        a9 a9Var = new a9(new int[0], 0);
        d = a9Var;
        a9Var.zzb();
    }

    a9() {
        this(new int[10], 0);
    }

    private a9(int[] iArr, int i2) {
        this.b = iArr;
        this.c = i2;
    }

    public static a9 c() {
        return d;
    }

    private final void h(int i2) {
        if (i2 < 0 || i2 >= this.c) {
            throw new IndexOutOfBoundsException(j(i2));
        }
    }

    private final String j(int i2) {
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
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i2 < 0 || i2 > (i3 = this.c)) {
            throw new IndexOutOfBoundsException(j(i2));
        }
        int[] iArr = this.b;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.b, i2, iArr2, i2 + 1, this.c - i2);
            this.b = iArr2;
        }
        this.b[i2] = iIntValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        b();
        g9.a(collection);
        if (!(collection instanceof a9)) {
            return super.addAll(collection);
        }
        a9 a9Var = (a9) collection;
        int i2 = a9Var.c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.c;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.b;
        if (i4 > iArr.length) {
            this.b = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(a9Var.b, 0, this.b, this.c, a9Var.c);
        this.c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i2) {
        h(i2);
        return this.b[i2];
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9)) {
            return super.equals(obj);
        }
        a9 a9Var = (a9) obj;
        if (this.c != a9Var.c) {
            return false;
        }
        int[] iArr = a9Var.b;
        for (int i2 = 0; i2 < this.c; i2++) {
            if (this.b[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i2) {
        b();
        int i3 = this.c;
        int[] iArr = this.b;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.b = iArr2;
        }
        int[] iArr3 = this.b;
        int i4 = this.c;
        this.c = i4 + 1;
        iArr3[i4] = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        h(i2);
        return Integer.valueOf(this.b[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.c; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.b[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.f9
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final d9 k(int i2) {
        if (i2 >= this.c) {
            return new a9(Arrays.copyOf(this.b, i2), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        b();
        h(i2);
        int[] iArr = this.b;
        int i3 = iArr[i2];
        int i4 = this.c;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.b;
        System.arraycopy(iArr, i3, iArr, i2, this.c - i3);
        this.c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        h(i2);
        int[] iArr = this.b;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
