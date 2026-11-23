package l.t;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements Iterator<Character>, l.y.c.q.a {
    public abstract char a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
