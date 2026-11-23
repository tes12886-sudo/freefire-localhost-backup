package j.d.d;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class w<T> {

    class a extends w<T> {
        a() {
        }

        @Override // j.d.d.w
        public T b(j.d.d.b0.a aVar) {
            if (aVar.n0() != j.d.d.b0.b.NULL) {
                return (T) w.this.b(aVar);
            }
            aVar.j0();
            return null;
        }

        @Override // j.d.d.w
        public void d(j.d.d.b0.c cVar, T t) throws IOException {
            if (t == null) {
                cVar.b0();
            } else {
                w.this.d(cVar, t);
            }
        }
    }

    public final w<T> a() {
        return new a();
    }

    public abstract T b(j.d.d.b0.a aVar);

    public final k c(T t) {
        try {
            j.d.d.z.n.g gVar = new j.d.d.z.n.g();
            d(gVar, t);
            return gVar.r0();
        } catch (IOException e) {
            throw new l(e);
        }
    }

    public abstract void d(j.d.d.b0.c cVar, T t);
}
