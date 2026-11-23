package j.c.a.d.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j.f.a.b<b, a> {
    public static final j.f.a.e<b> f = new C0222b();
    public final Long d;
    public final Long e;

    public static final class a extends j.f.a.b.a<b, a> {
        public Long c;
        public Long d;

        public a c(Long l2) {
            this.d = l2;
            return this;
        }

        public a d(Long l2) {
            this.c = l2;
            return this;
        }

        public b e() {
            Long l2 = this.c;
            if (l2 != null) {
                return new b(this.c, this.d, super.b());
            }
            j.f.a.h.b.c(l2, "Sign");
            throw null;
        }
    }

    /* JADX INFO: renamed from: j.c.a.d.a.b$b, reason: collision with other inner class name */
    private static final class C0222b extends j.f.a.e<b> {
        C0222b() {
            super(j.f.a.a.LENGTH_DELIMITED, b.class);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b c(j.f.a.f fVar) {
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
                    aVar.c(j.f.a.e.e.c(fVar));
                }
            }
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(j.f.a.g gVar, b bVar) {
            j.f.a.e<Long> eVar = j.f.a.e.e;
            eVar.i(gVar, 1, bVar.d);
            Long l2 = bVar.e;
            if (l2 != null) {
                eVar.i(gVar, 2, l2);
            }
            gVar.f(bVar.c());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int j(b bVar) {
            j.f.a.e<Long> eVar = j.f.a.e.e;
            int iK = eVar.k(1, bVar.d);
            Long l2 = bVar.e;
            return iK + (l2 != null ? eVar.k(2, l2) : 0) + bVar.c().t();
        }
    }

    public b(Long l2, Long l3, n.e eVar) {
        super(f, eVar);
        this.d = l2;
        this.e = l3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return c().equals(bVar.c()) && this.d.equals(bVar.d) && j.f.a.h.b.a(this.e, bVar.e);
    }

    public int hashCode() {
        int i2 = this.c;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((c().hashCode() * 37) + this.d.hashCode()) * 37;
        Long l2 = this.e;
        int iHashCode2 = iHashCode + (l2 != null ? l2.hashCode() : 0);
        this.c = iHashCode2;
        return iHashCode2;
    }

    @Override // j.f.a.b
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", Sign=");
        sb.append(this.d);
        if (this.e != null) {
            sb.append(", OldId=");
            sb.append(this.e);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "GetGPidRequest{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
