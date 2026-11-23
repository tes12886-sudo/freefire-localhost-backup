package l;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class m<T> implements Serializable {
    public static final a a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }
    }

    public static final class b implements Serializable {
        public final Throwable a;

        public b(Throwable th) {
            l.y.c.i.e(th, "exception");
            this.a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && l.y.c.i.a(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.a + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }
}
