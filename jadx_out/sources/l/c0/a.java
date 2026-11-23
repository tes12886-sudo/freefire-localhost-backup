package l.c0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements c<T>, b<T> {
    private final c<T> a;
    private final int b;

    /* JADX INFO: renamed from: l.c0.a$a, reason: collision with other inner class name */
    public static final class C0255a implements Iterator<T>, l.y.c.q.a {
        private final Iterator<T> a;
        private int b;

        C0255a(a<T> aVar) {
            this.a = ((a) aVar).a.iterator();
            this.b = ((a) aVar).b;
        }

        private final void a() {
            while (this.b > 0 && this.a.hasNext()) {
                this.a.next();
                this.b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(c<? extends T> cVar, int i2) {
        l.y.c.i.e(cVar, "sequence");
        this.a = cVar;
        this.b = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
    }

    @Override // l.c0.b
    public c<T> a(int i2) {
        int i3 = this.b + i2;
        return i3 < 0 ? new a(this, i2) : new a(this.a, i3);
    }

    @Override // l.c0.c
    public Iterator<T> iterator() {
        return new C0255a(this);
    }
}
