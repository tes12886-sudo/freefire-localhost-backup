package j.d.a.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public final class g0<T> implements h0, e0 {
    private static final Object c = new Object();
    private volatile h0<T> a;
    private volatile Object b = c;

    private g0(h0<T> h0Var) {
        this.a = h0Var;
    }

    public static <P extends h0<T>, T> h0<T> b(P p) {
        s.c(p);
        return p instanceof g0 ? p : new g0(p);
    }

    public static <P extends h0<T>, T> e0<T> c(P p) {
        if (p instanceof e0) {
            return (e0) p;
        }
        s.c(p);
        return new g0(p);
    }

    @Override // j.d.a.d.a.b.h0
    public final T a() {
        T tA = (T) this.b;
        Object obj = c;
        if (tA == obj) {
            synchronized (this) {
                tA = (T) this.b;
                if (tA == obj) {
                    tA = this.a.a();
                    Object obj2 = this.b;
                    if (obj2 != obj && obj2 != tA) {
                        String strValueOf = String.valueOf(obj2);
                        String strValueOf2 = String.valueOf(tA);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 118 + String.valueOf(strValueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(strValueOf);
                        sb.append(" & ");
                        sb.append(strValueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.b = tA;
                    this.a = null;
                }
            }
        }
        return tA;
    }
}
