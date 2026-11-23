package l;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class o<T> implements g<T>, Serializable {
    private l.y.b.a<? extends T> a;
    private volatile Object b;
    private final Object c;

    public o(l.y.b.a<? extends T> aVar, Object obj) {
        l.y.c.i.e(aVar, "initializer");
        this.a = aVar;
        this.b = q.a;
        this.c = obj == null ? this : obj;
    }

    public /* synthetic */ o(l.y.b.a aVar, Object obj, int i2, l.y.c.f fVar) {
        this(aVar, (i2 & 2) != 0 ? null : obj);
    }

    private final Object writeReplace() {
        return new c(getValue());
    }

    public boolean a() {
        return this.b != q.a;
    }

    @Override // l.g
    public T getValue() {
        T tA;
        T t = (T) this.b;
        q qVar = q.a;
        if (t != qVar) {
            return t;
        }
        synchronized (this.c) {
            tA = (T) this.b;
            if (tA == qVar) {
                l.y.b.a<? extends T> aVar = this.a;
                l.y.c.i.c(aVar);
                tA = aVar.a();
                this.b = tA;
                this.a = null;
            }
        }
        return tA;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
