package com.google.android.datatransport.h.u.a;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<T>] */
/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements k.a.a<T> {
    private static final Object c = new Object();
    private volatile k.a.a<T> a;
    private volatile Object b = c;

    private a(k.a.a<T> aVar) {
        this.a = aVar;
    }

    public static <P extends k.a.a<T>, T> k.a.a<T> a(P p) {
        d.b(p);
        return p instanceof a ? p : new a(p);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // k.a.a
    public T get() {
        T t = (T) this.b;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.b;
                if (t == obj) {
                    t = this.a.get();
                    b(this.b, t);
                    this.b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
