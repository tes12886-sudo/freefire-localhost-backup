package j.d.d.z.n;

import j.d.d.q;
import j.d.d.r;
import j.d.d.w;
import j.d.d.x;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class l<T> extends w<T> {
    private final r<T> a;
    private final j.d.d.j<T> b;
    final j.d.d.e c;
    private final j.d.d.a0.a<T> d;
    private final x e;
    private final l<T>.b f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile w<T> f2081g;

    private final class b implements q, j.d.d.i {
        private b() {
        }

        @Override // j.d.d.i
        public <R> R a(j.d.d.k kVar, Type type) {
            return (R) l.this.c.h(kVar, type);
        }
    }

    private static final class c implements x {
        private final j.d.d.a0.a<?> a;
        private final boolean b;
        private final Class<?> c;
        private final r<?> d;
        private final j.d.d.j<?> e;

        c(Object obj, j.d.d.a0.a<?> aVar, boolean z, Class<?> cls) {
            r<?> rVar = obj instanceof r ? (r) obj : null;
            this.d = rVar;
            j.d.d.j<?> jVar = obj instanceof j.d.d.j ? (j.d.d.j) obj : null;
            this.e = jVar;
            j.d.d.z.a.a((rVar == null && jVar == null) ? false : true);
            this.a = aVar;
            this.b = z;
            this.c = cls;
        }

        @Override // j.d.d.x
        public <T> w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
            boolean zIsAssignableFrom;
            j.d.d.a0.a<?> aVar2 = this.a;
            if (aVar2 != null) {
                zIsAssignableFrom = aVar2.equals(aVar) || (this.b && this.a.getType() == aVar.getRawType());
            } else {
                zIsAssignableFrom = this.c.isAssignableFrom(aVar.getRawType());
            }
            if (zIsAssignableFrom) {
                return new l(this.d, this.e, eVar, aVar, this);
            }
            return null;
        }
    }

    public l(r<T> rVar, j.d.d.j<T> jVar, j.d.d.e eVar, j.d.d.a0.a<T> aVar, x xVar) {
        this.a = rVar;
        this.b = jVar;
        this.c = eVar;
        this.d = aVar;
        this.e = xVar;
    }

    private w<T> e() {
        w<T> wVar = this.f2081g;
        if (wVar != null) {
            return wVar;
        }
        w<T> wVarO = this.c.o(this.e, this.d);
        this.f2081g = wVarO;
        return wVarO;
    }

    public static x f(j.d.d.a0.a<?> aVar, Object obj) {
        return new c(obj, aVar, aVar.getType() == aVar.getRawType(), null);
    }

    @Override // j.d.d.w
    public T b(j.d.d.b0.a aVar) {
        if (this.b == null) {
            return e().b(aVar);
        }
        j.d.d.k kVarA = j.d.d.z.l.a(aVar);
        if (kVarA.j()) {
            return null;
        }
        return this.b.a(kVarA, this.d.getType(), this.f);
    }

    @Override // j.d.d.w
    public void d(j.d.d.b0.c cVar, T t) throws IOException {
        r<T> rVar = this.a;
        if (rVar == null) {
            e().d(cVar, t);
        } else if (t == null) {
            cVar.b0();
        } else {
            j.d.d.z.l.b(rVar.b(t, this.d.getType(), this.f), cVar);
        }
    }
}
