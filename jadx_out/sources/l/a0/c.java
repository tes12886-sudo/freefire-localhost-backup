package l.a0;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<java.lang.Character>] */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public c(char c, char c2) {
        super(c, c2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (b() != cVar.b() || c() != cVar.c()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (b() * 31) + c();
    }

    public boolean isEmpty() {
        return l.y.c.i.g(b(), c()) > 0;
    }

    public String toString() {
        return b() + ".." + c();
    }
}
