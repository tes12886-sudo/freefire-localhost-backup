package j.g.a.a.a;

import java.util.concurrent.ConcurrentHashMap;
import m.z;

/* JADX INFO: loaded from: classes.dex */
public class n {
    final ConcurrentHashMap<Class, Object> a;
    final o.u b;

    public n(x xVar) {
        this(j.g.a.a.a.y.i.b.c(xVar, u.f().c()), new j.g.a.a.a.y.g());
    }

    n(z zVar, j.g.a.a.a.y.g gVar) {
        this.a = a();
        this.b = c(zVar, gVar);
    }

    private ConcurrentHashMap a() {
        return new ConcurrentHashMap();
    }

    private j.d.d.e b() {
        j.d.d.f fVar = new j.d.d.f();
        fVar.d(new j.g.a.a.a.z.g());
        fVar.d(new j.g.a.a.a.z.h());
        fVar.c(j.g.a.a.a.z.c.class, new j.g.a.a.a.z.d());
        return fVar.b();
    }

    private o.u c(z zVar, j.g.a.a.a.y.g gVar) {
        o.u.b bVar = new o.u.b();
        bVar.f(zVar);
        bVar.b(gVar.c());
        bVar.a(o.z.a.a.g(b()));
        return bVar.d();
    }

    public j.g.a.a.a.a0.a d() {
        return (j.g.a.a.a.a0.a) e(j.g.a.a.a.a0.a.class);
    }

    protected <T> T e(Class<T> cls) {
        if (!this.a.contains(cls)) {
            this.a.putIfAbsent(cls, this.b.b(cls));
        }
        return (T) this.a.get(cls);
    }
}
