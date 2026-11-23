package l.v.e.a;

import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {
    private final l.v.c b;
    private transient l.v.a<Object> c;

    public c(l.v.a<Object> aVar) {
        this(aVar, aVar != null ? aVar.a() : null);
    }

    public c(l.v.a<Object> aVar, l.v.c cVar) {
        super(aVar);
        this.b = cVar;
    }

    @Override // l.v.a
    public l.v.c a() {
        l.v.c cVar = this.b;
        i.c(cVar);
        return cVar;
    }

    @Override // l.v.e.a.a
    protected void e() {
        l.v.a<?> aVar = this.c;
        if (aVar != null && aVar != this) {
            l.v.c.a aVarC = a().c(l.v.b.a);
            i.c(aVarC);
            ((l.v.b) aVarC).a(aVar);
        }
        this.c = b.a;
    }

    public final l.v.a<Object> f() {
        l.v.a<Object> aVarB = this.c;
        if (aVarB == null) {
            l.v.b bVar = (l.v.b) a().c(l.v.b.a);
            if (bVar == null || (aVarB = bVar.b(this)) == null) {
                aVarB = this;
            }
            this.c = aVarB;
        }
        return aVarB;
    }
}
