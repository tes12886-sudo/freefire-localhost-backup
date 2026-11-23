package j.c.a.d.a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends j.f.a.b<f, a> {
    public static final j.f.a.e<f> f = new b();
    public final Long d;
    public final List<e> e;

    public static final class a extends j.f.a.b.a<f, a> {
        public Long c;
        public List<e> d = j.f.a.h.b.d();

        public a c(Long l2) {
            this.c = l2;
            return this;
        }

        public f d() {
            Long l2 = this.c;
            if (l2 != null) {
                return new f(this.c, this.d, super.b());
            }
            j.f.a.h.b.c(l2, "GPid");
            throw null;
        }
    }

    private static final class b extends j.f.a.e<f> {
        b() {
            super(j.f.a.a.LENGTH_DELIMITED, f.class);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public f c(j.f.a.f fVar) {
            a aVar = new a();
            long jC = fVar.c();
            while (true) {
                int iF = fVar.f();
                if (iF == -1) {
                    fVar.d(jC);
                    return aVar.d();
                }
                if (iF == 1) {
                    aVar.c(j.f.a.e.e.c(fVar));
                } else if (iF != 2) {
                    j.f.a.a aVarG = fVar.g();
                    aVar.a(iF, aVarG, aVarG.a().c(fVar));
                } else {
                    aVar.d.add(e.f1913g.c(fVar));
                }
            }
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(j.f.a.g gVar, f fVar) {
            j.f.a.e.e.i(gVar, 1, fVar.d);
            e.f1913g.a().i(gVar, 2, fVar.e);
            gVar.f(fVar.c());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int j(f fVar) {
            return j.f.a.e.e.k(1, fVar.d) + e.f1913g.a().k(2, fVar.e) + fVar.c().t();
        }
    }

    public f(Long l2, List<e> list, n.e eVar) {
        super(f, eVar);
        this.d = l2;
        this.e = j.f.a.h.b.b("Msg", list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return c().equals(fVar.c()) && this.d.equals(fVar.d) && this.e.equals(fVar.e);
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
        if (!this.e.isEmpty()) {
            sb.append(", Msg=");
            sb.append(this.e);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "PushMsg{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
