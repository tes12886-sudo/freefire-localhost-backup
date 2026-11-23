package l.c0;

import java.util.Iterator;
import l.y.b.l;

/* JADX INFO: loaded from: classes.dex */
public final class j<T, R> implements c<R> {
    private final c<T> a;
    private final l<T, R> b;

    public static final class a implements Iterator<R>, l.y.c.q.a {
        private final Iterator<T> a;
        final /* synthetic */ j<T, R> b;

        a(j<T, R> jVar) {
            this.b = jVar;
            this.a = ((j) jVar).a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((j) this.b).b.c(this.a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(c<? extends T> cVar, l<? super T, ? extends R> lVar) {
        l.y.c.i.e(cVar, "sequence");
        l.y.c.i.e(lVar, "transformer");
        this.a = cVar;
        this.b = lVar;
    }

    @Override // l.c0.c
    public Iterator<R> iterator() {
        return new a(this);
    }
}
