package j.g.a.a.a;

import j.g.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class k<T extends a> {

    @j.d.d.y.c("auth_token")
    private final T a;

    @j.d.d.y.c("id")
    private final long b;

    public k(T t, long j2) {
        if (t == null) {
            throw new IllegalArgumentException("AuthToken must not be null.");
        }
        this.a = t;
        this.b = j2;
    }

    public T a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.b != kVar.b) {
            return false;
        }
        T t = this.a;
        T t2 = kVar.a;
        if (t != null) {
            return t.equals(t2);
        }
        return t2 == null;
    }

    public int hashCode() {
        T t = this.a;
        int iHashCode = t != null ? t.hashCode() : 0;
        long j2 = this.b;
        return (iHashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
