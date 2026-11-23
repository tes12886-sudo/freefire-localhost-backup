package j.c.a.d.a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends j.f.a.b<g, a> {
    public static final j.f.a.e<g> f = new b();
    public final Integer d;
    public final List<Integer> e;

    public static final class a extends j.f.a.b.a<g, a> {
        public Integer c;
        public List<Integer> d = j.f.a.h.b.d();

        public a c(Integer num) {
            this.c = num;
            return this;
        }

        public g d() {
            Integer num = this.c;
            if (num != null) {
                return new g(this.c, this.d, super.b());
            }
            j.f.a.h.b.c(num, "Msgid");
            throw null;
        }
    }

    private static final class b extends j.f.a.e<g> {
        b() {
            super(j.f.a.a.LENGTH_DELIMITED, g.class);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public g c(j.f.a.f fVar) {
            a aVar = new a();
            long jC = fVar.c();
            while (true) {
                int iF = fVar.f();
                if (iF == -1) {
                    fVar.d(jC);
                    return aVar.d();
                }
                if (iF == 1) {
                    aVar.c(j.f.a.e.c.c(fVar));
                } else if (iF != 2) {
                    j.f.a.a aVarG = fVar.g();
                    aVar.a(iF, aVarG, aVarG.a().c(fVar));
                } else {
                    aVar.d.add(j.f.a.e.c.c(fVar));
                }
            }
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(j.f.a.g gVar, g gVar2) {
            j.f.a.e<Integer> eVar = j.f.a.e.c;
            eVar.i(gVar, 1, gVar2.d);
            eVar.a().i(gVar, 2, gVar2.e);
            gVar.f(gVar2.c());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int j(g gVar) {
            j.f.a.e<Integer> eVar = j.f.a.e.c;
            return eVar.k(1, gVar.d) + eVar.a().k(2, gVar.e) + gVar.c().t();
        }
    }

    public g(Integer num, List<Integer> list, n.e eVar) {
        super(f, eVar);
        this.d = num;
        this.e = j.f.a.h.b.b("FailList", list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return c().equals(gVar.c()) && this.d.equals(gVar.d) && this.e.equals(gVar.e);
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
        sb.append(", Msgid=");
        sb.append(this.d);
        if (!this.e.isEmpty()) {
            sb.append(", FailList=");
            sb.append(this.e);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "PushMsgAck{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
