package j.c.a.d.a;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j.f.a.b<a, C0221a> {
    public static final j.f.a.e<a> e = new b();
    public final Long d;

    /* JADX INFO: renamed from: j.c.a.d.a.a$a, reason: collision with other inner class name */
    public static final class C0221a extends j.f.a.b.a<a, C0221a> {
        public Long c;

        public C0221a c(Long l2) {
            this.c = l2;
            return this;
        }

        public a d() {
            Long l2 = this.c;
            if (l2 != null) {
                return new a(this.c, super.b());
            }
            j.f.a.h.b.c(l2, "GPid");
            throw null;
        }
    }

    private static final class b extends j.f.a.e<a> {
        b() {
            super(j.f.a.a.LENGTH_DELIMITED, a.class);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a c(j.f.a.f fVar) {
            C0221a c0221a = new C0221a();
            long jC = fVar.c();
            while (true) {
                int iF = fVar.f();
                if (iF == -1) {
                    fVar.d(jC);
                    return c0221a.d();
                }
                if (iF != 1) {
                    j.f.a.a aVarG = fVar.g();
                    c0221a.a(iF, aVarG, aVarG.a().c(fVar));
                } else {
                    c0221a.c(j.f.a.e.e.c(fVar));
                }
            }
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(j.f.a.g gVar, a aVar) {
            j.f.a.e.e.i(gVar, 1, aVar.d);
            gVar.f(aVar.c());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int j(a aVar) {
            return j.f.a.e.e.k(1, aVar.d) + aVar.c().t();
        }
    }

    public a(Long l2, n.e eVar) {
        super(e, eVar);
        this.d = l2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return c().equals(aVar.c()) && this.d.equals(aVar.d);
    }

    public int hashCode() {
        int i2 = this.c;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = (c().hashCode() * 37) + this.d.hashCode();
        this.c = iHashCode;
        return iHashCode;
    }

    @Override // j.f.a.b
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", GPid=");
        sb.append(this.d);
        StringBuilder sbReplace = sb.replace(0, 2, "ConnectRequest{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
