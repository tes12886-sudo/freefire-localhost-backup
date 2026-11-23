package j.e.b;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class c<R> {
    private static final c<?> d = new c<>(d.SUCCESS, null, b.c);
    private final d a;
    private final R b;
    private final b c;

    private c(d dVar, R r, b bVar) {
        this.a = dVar;
        this.b = r;
        this.c = bVar;
    }

    public static <T> c<T> a(d dVar, b bVar) {
        return new c<>(dVar, null, bVar);
    }

    public static <T> c<T> b(T t) {
        return t == null ? (c<T>) d : new c<>(d.SUCCESS, t, b.c);
    }

    public b c() {
        return this.c;
    }

    public d d() {
        return this.a;
    }

    public R e() {
        R r = this.b;
        if (r != null) {
            return r;
        }
        throw new NoSuchElementException("response data is null. Please check result by isSuccess before.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a != cVar.a) {
            return false;
        }
        R r = this.b;
        if (r == null ? cVar.b == null : r.equals(cVar.b)) {
            return this.c.equals(cVar.c);
        }
        return false;
    }

    public boolean f() {
        return this.a == d.SUCCESS;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        R r = this.b;
        return ((iHashCode + (r != null ? r.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "LineApiResponse{errorData=" + this.c + ", responseCode=" + this.a + ", responseData=" + this.b + '}';
    }
}
