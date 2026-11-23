package j.g.a.a.a.z;

import j.d.d.w;
import j.d.d.x;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g implements x {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends w<T> {
        final /* synthetic */ w a;
        final /* synthetic */ j.d.d.a0.a b;

        a(g gVar, w wVar, j.d.d.a0.a aVar) {
            this.a = wVar;
            this.b = aVar;
        }

        @Override // j.d.d.w
        public T b(j.d.d.b0.a aVar) {
            T t = (T) this.a.b(aVar);
            if (List.class.isAssignableFrom(this.b.getRawType())) {
                return t == null ? (T) Collections.EMPTY_LIST : (T) Collections.unmodifiableList((List) t);
            }
            return t;
        }

        @Override // j.d.d.w
        public void d(j.d.d.b0.c cVar, T t) {
            this.a.d(cVar, t);
        }
    }

    @Override // j.d.d.x
    public <T> w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
        return new a(this, eVar.o(this, aVar), aVar);
    }
}
