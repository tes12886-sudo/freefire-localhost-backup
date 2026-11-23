package j.c.a.d.a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends j.f.a.b<d, a> {
    public static final j.f.a.e<d> e = new b();
    public final String d;

    public static final class a extends j.f.a.b.a<d, a> {
        public String c;

        public a c(String str) {
            this.c = str;
            return this;
        }

        public d d() {
            String str = this.c;
            if (str != null) {
                return new d(this.c, super.b());
            }
            j.f.a.h.b.c(str, "Region");
            throw null;
        }
    }

    private static final class b extends j.f.a.e<d> {
        b() {
            super(j.f.a.a.LENGTH_DELIMITED, d.class);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public d c(j.f.a.f fVar) {
            a aVar = new a();
            long jC = fVar.c();
            while (true) {
                int iF = fVar.f();
                if (iF == -1) {
                    fVar.d(jC);
                    return aVar.d();
                }
                if (iF != 1) {
                    j.f.a.a aVarG = fVar.g();
                    aVar.a(iF, aVarG, aVarG.a().c(fVar));
                } else {
                    aVar.c(j.f.a.e.f2142g.c(fVar));
                }
            }
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(j.f.a.g gVar, d dVar) {
            j.f.a.e.f2142g.i(gVar, 1, dVar.d);
            gVar.f(dVar.c());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int j(d dVar) {
            return j.f.a.e.f2142g.k(1, dVar.d) + dVar.c().t();
        }
    }

    public d(String str, n.e eVar) {
        super(e, eVar);
        this.d = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c().equals(dVar.c()) && this.d.equals(dVar.d);
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
        sb.append(", Region=");
        sb.append(this.d);
        StringBuilder sbReplace = sb.replace(0, 2, "GetRegionResponse{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
