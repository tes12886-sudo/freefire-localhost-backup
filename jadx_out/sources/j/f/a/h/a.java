package j.f.a.h;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class a<T> extends AbstractList<T> implements RandomAccess, Serializable {
    private final ArrayList<T> a;

    a(List<T> list) {
        this.a = new ArrayList<>(list);
    }

    private Object writeReplace() {
        return Collections.unmodifiableList(this.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i2) {
        return this.a.get(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return this.a.toArray();
    }
}
