package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class r9 extends m7<Long> implements RandomAccess, e9, ka {
    private static final r9 d;
    private long[] b;
    private int c;

    static {
        r9 r9Var = new r9(new long[0], 0);
        d = r9Var;
        r9Var.zzb();
    }

    r9() {
        this(new long[10], 0);
    }

    private r9(long[] jArr, int i2) {
        this.b = jArr;
        this.c = i2;
    }

    public static r9 c() {
        return d;
    }

    private final void f(int i2) {
        if (i2 < 0 || i2 >= this.c) {
            throw new IndexOutOfBoundsException(h(i2));
        }
    }

    private final String h(int i2) {
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
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i2 < 0 || i2 > (i3 = this.c)) {
            throw new IndexOutOfBoundsException(h(i2));
        }
        long[] jArr = this.b;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.b, i2, jArr2, i2 + 1, this.c - i2);
            this.b = jArr2;
        }
        this.b[i2] = jLongValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        b();
        g9.a(collection);
        if (!(collection instanceof r9)) {
            return super.addAll(collection);
        }
        r9 r9Var = (r9) collection;
        int i2 = r9Var.c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.c;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.b;
        if (i4 > jArr.length) {
            this.b = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(r9Var.b, 0, this.b, this.c, r9Var.c);
        this.c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j2) {
        b();
        int i2 = this.c;
        long[] jArr = this.b;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.b = jArr2;
        }
        long[] jArr3 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        jArr3[i3] = j2;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9)) {
            return super.equals(obj);
        }
        r9 r9Var = (r9) obj;
        if (this.c != r9Var.c) {
            return false;
        }
        long[] jArr = r9Var.b;
        for (int i2 = 0; i2 < this.c; i2++) {
            if (this.b[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.f9
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final e9 k(int i2) {
        if (i2 >= this.c) {
            return new r9(Arrays.copyOf(this.b, i2), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        f(i2);
        return Long.valueOf(this.b[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iE = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            iE = (iE * 31) + g9.e(this.b[i2]);
        }
        return iE;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.b[i3] == jLongValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.e9
    public final long p(int i2) {
        f(i2);
        return this.b[i2];
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        b();
        f(i2);
        long[] jArr = this.b;
        long j2 = jArr[i2];
        int i3 = this.c;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.b;
        System.arraycopy(jArr, i3, jArr, i2, this.c - i3);
        this.c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        f(i2);
        long[] jArr = this.b;
        long j2 = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
