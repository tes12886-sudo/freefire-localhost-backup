package j.c.a.d.a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends j.f.a.b<c, a> {
    public static final j.f.a.e<c> f = new b();
    public final Long d;
    public final String e;

    public static final class a extends j.f.a.b.a<c, a> {
        public Long c;
        public String d;

        public a c(String str) {
            this.d = str;
            return this;
        }

        public a d(Long l2) {
            this.c = l2;
            return this;
        }

        public c e() {
            Long l2 = this.c;
            if (l2 != null && this.d != null) {
                return new c(this.c, this.d, super.b());
            }
            j.f.a.h.b.c(l2, "GPid", this.d, "ConnServerAddr");
            throw null;
        }
    }

    private static final class b extends j.f.a.e<c> {
        b() {
            super(j.f.a.a.LENGTH_DELIMITED, c.class);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public c c(j.f.a.f fVar) {
            a aVar = new a();
            long jC = fVar.c();
            while (true) {
                int iF = fVar.f();
                if (iF == -1) {
                    fVar.d(jC);
                    return aVar.e();
                }
                if (iF == 1) {
                    aVar.d(j.f.a.e.e.c(fVar));
                } else if (iF != 2) {
                    j.f.a.a aVarG = fVar.g();
                    aVar.a(iF, aVarG, aVarG.a().c(fVar));
                } else {
                    aVar.c(j.f.a.e.f2142g.c(fVar));
                }
            }
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(j.f.a.g gVar, c cVar) {
            j.f.a.e.e.i(gVar, 1, cVar.d);
            j.f.a.e.f2142g.i(gVar, 2, cVar.e);
            gVar.f(cVar.c());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int j(c cVar) {
            return j.f.a.e.e.k(1, cVar.d) + j.f.a.e.f2142g.k(2, cVar.e) + cVar.c().t();
        }
    }

    public c(Long l2, String str, n.e eVar) {
        super(f, eVar);
        this.d = l2;
        this.e = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return c().equals(cVar.c()) && this.d.equals(cVar.d) && this.e.equals(cVar.e);
    }

    public int hashCode() {
        int i2 = this.c;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = (((c().hashCode() * 37) + this.d.hashCode()) * 37) + this.e.hashCode();
        this.c = iHashCode;
        return iHashCode;
    }

    @Override // j.f.a.b
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", GPid=");
        sb.append(this.d);
        sb.append(", ConnServerAddr=");
        sb.append(this.e);
        StringBuilder sbReplace = sb.replace(0, 2, "GetGPidResponse{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
