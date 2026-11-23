package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class i8 extends m7<Double> implements RandomAccess, f9, ka {
    private static final i8 d;
    private double[] b;
    private int c;

    static {
        i8 i8Var = new i8(new double[0], 0);
        d = i8Var;
        i8Var.zzb();
    }

    i8() {
        this(new double[10], 0);
    }

    private i8(double[] dArr, int i2) {
        this.b = dArr;
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
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        if (i2 < 0 || i2 > (i3 = this.c)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        double[] dArr = this.b;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.b, i2, dArr2, i2 + 1, this.c - i2);
            this.b = dArr2;
        }
        this.b[i2] = dDoubleValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        b();
        g9.a(collection);
        if (!(collection instanceof i8)) {
            return super.addAll(collection);
        }
        i8 i8Var = (i8) collection;
        int i2 = i8Var.c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.c;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.b;
        if (i4 > dArr.length) {
            this.b = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(i8Var.b, 0, this.b, this.c, i8Var.c);
        this.c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(double d2) {
        b();
        int i2 = this.c;
        double[] dArr = this.b;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.b = dArr2;
        }
        double[] dArr3 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        dArr3[i3] = d2;
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
        if (!(obj instanceof i8)) {
            return super.equals(obj);
        }
        i8 i8Var = (i8) obj;
        if (this.c != i8Var.c) {
            return false;
        }
        double[] dArr = i8Var.b;
        for (int i2 = 0; i2 < this.c; i2++) {
            if (Double.doubleToLongBits(this.b[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        d(i2);
        return Double.valueOf(this.b[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iE = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            iE = (iE * 31) + g9.e(Double.doubleToLongBits(this.b[i2]));
        }
        return iE;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.b[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.f9
    public final /* bridge */ /* synthetic */ f9 k(int i2) {
        if (i2 >= this.c) {
            return new i8(Arrays.copyOf(this.b, i2), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        b();
        d(i2);
        double[] dArr = this.b;
        double d2 = dArr[i2];
        int i3 = this.c;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.b;
        System.arraycopy(dArr, i3, dArr, i2, this.c - i3);
        this.c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        d(i2);
        double[] dArr = this.b;
        double d2 = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
