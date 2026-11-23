package l;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class l<A, B> implements Serializable {
    private final A a;
    private final B b;

    public l(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public final A a() {
        return this.a;
    }

    public final B b() {
        return this.b;
    }

    public final A c() {
        return this.a;
    }

    public final B d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return l.y.c.i.a(this.a, lVar.a) && l.y.c.i.a(this.b, lVar.b);
    }

    public int hashCode() {
        A a = this.a;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.b;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.a + ", " + this.b + ')';
    }
}
