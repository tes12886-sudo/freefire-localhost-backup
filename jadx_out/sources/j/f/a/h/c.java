package j.f.a.h;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class c<T> extends AbstractList<T> implements RandomAccess, Serializable {
    private final List<T> a;
    List<T> b;

    c(List<T> list) {
        this.a = list;
        this.b = list;
    }

    private Object writeReplace() {
        return new ArrayList(this.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, T t) {
        if (this.b == this.a) {
            this.b = new ArrayList(this.a);
        }
        this.b.add(i2, t);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i2) {
        return this.b.get(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public T remove(int i2) {
        if (this.b == this.a) {
            this.b = new ArrayList(this.a);
        }
        return this.b.remove(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i2, T t) {
        if (this.b == this.a) {
            this.b = new ArrayList(this.a);
        }
        return this.b.set(i2, t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.b.size();
    }
}
