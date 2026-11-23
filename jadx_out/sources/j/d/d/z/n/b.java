package j.d.d.z.n;

import j.d.d.w;
import j.d.d.x;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements x {
    private final j.d.d.z.c a;

    private static final class a<E> extends w<Collection<E>> {
        private final w<E> a;
        private final j.d.d.z.i<? extends Collection<E>> b;

        public a(j.d.d.e eVar, Type type, w<E> wVar, j.d.d.z.i<? extends Collection<E>> iVar) {
            this.a = new m(eVar, wVar, type);
            this.b = iVar;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<E> b(j.d.d.b0.a aVar) {
            if (aVar.n0() == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            Collection<E> collectionA = this.b.a();
            aVar.b();
            while (aVar.Z()) {
                collectionA.add(this.a.b(aVar));
            }
            aVar.u();
            return collectionA;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.b0();
                return;
            }
            cVar.f();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.a.d(cVar, it.next());
            }
            cVar.u();
        }
    }

    public b(j.d.d.z.c cVar) {
        this.a = cVar;
    }

    @Override // j.d.d.x
    public <T> w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeH = j.d.d.z.b.h(type, rawType);
        return new a(eVar, typeH, eVar.m(j.d.d.a0.a.get(typeH)), this.a.a(aVar));
    }
}
