package l.t;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class z implements Iterator<Integer>, l.y.c.q.a {
    public abstract int a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
