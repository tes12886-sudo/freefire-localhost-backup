package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class s8 extends m7<Float> implements RandomAccess, f9, ka {
    private static final s8 d;
    private float[] b;
    private int c;

    static {
        s8 s8Var = new s8(new float[0], 0);
        d = s8Var;
        s8Var.zzb();
    }

    s8() {
        this(new float[10], 0);
    }

    private s8(float[] fArr, int i2) {
        this.b = fArr;
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
        float fFloatValue = ((Float) obj).floatValue();
        b();
        if (i2 < 0 || i2 > (i3 = this.c)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        float[] fArr = this.b;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[((i3 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.b, i2, fArr2, i2 + 1, this.c - i2);
            this.b = fArr2;
        }
        this.b[i2] = fFloatValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        b();
        g9.a(collection);
        if (!(collection instanceof s8)) {
            return super.addAll(collection);
        }
        s8 s8Var = (s8) collection;
        int i2 = s8Var.c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.c;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.b;
        if (i4 > fArr.length) {
            this.b = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(s8Var.b, 0, this.b, this.c, s8Var.c);
        this.c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(float f) {
        b();
        int i2 = this.c;
        float[] fArr = this.b;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.b = fArr2;
        }
        float[] fArr3 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        fArr3[i3] = f;
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
        if (!(obj instanceof s8)) {
            return super.equals(obj);
        }
        s8 s8Var = (s8) obj;
        if (this.c != s8Var.c) {
            return false;
        }
        float[] fArr = s8Var.b;
        for (int i2 = 0; i2 < this.c; i2++) {
            if (Float.floatToIntBits(this.b[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        d(i2);
        return Float.valueOf(this.b[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.b[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.b[i3] == fFloatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.f9
    public final /* bridge */ /* synthetic */ f9 k(int i2) {
        if (i2 >= this.c) {
            return new s8(Arrays.copyOf(this.b, i2), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.m7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        b();
        d(i2);
        float[] fArr = this.b;
        float f = fArr[i2];
        int i3 = this.c;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.b;
        System.arraycopy(fArr, i3, fArr, i2, this.c - i3);
        this.c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        b();
        d(i2);
        float[] fArr = this.b;
        float f = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
