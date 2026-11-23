package j.c.a.d.a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends j.f.a.b<e, a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j.f.a.e<e> f1913g = new b();
    public final Integer d;
    public final Integer e;
    public final n.e f;

    public static final class a extends j.f.a.b.a<e, a> {
        public Integer c;
        public Integer d;
        public n.e e;

        public a c(Integer num) {
            this.c = num;
            return this;
        }

        public a d(n.e eVar) {
            this.e = eVar;
            return this;
        }

        public a e(Integer num) {
            this.d = num;
            return this;
        }

        public e f() {
            Integer num = this.c;
            if (num != null && this.d != null && this.e != null) {
                return new e(this.c, this.d, this.e, super.b());
            }
            j.f.a.h.b.c(num, "Appid", this.d, "Msgid", this.e, "Data");
            throw null;
        }
    }

    private static final class b extends j.f.a.e<e> {
        b() {
            super(j.f.a.a.LENGTH_DELIMITED, e.class);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public e c(j.f.a.f fVar) {
            a aVar = new a();
            long jC = fVar.c();
            while (true) {
                int iF = fVar.f();
                if (iF == -1) {
                    fVar.d(jC);
                    return aVar.f();
                }
                if (iF == 1) {
                    aVar.c(j.f.a.e.c.c(fVar));
                } else if (iF == 2) {
                    aVar.e(j.f.a.e.c.c(fVar));
                } else if (iF != 3) {
                    j.f.a.a aVarG = fVar.g();
                    aVar.a(iF, aVarG, aVarG.a().c(fVar));
                } else {
                    aVar.d(j.f.a.e.f2143h.c(fVar));
                }
            }
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(j.f.a.g gVar, e eVar) {
            j.f.a.e<Integer> eVar2 = j.f.a.e.c;
            eVar2.i(gVar, 1, eVar.d);
            eVar2.i(gVar, 2, eVar.e);
            j.f.a.e.f2143h.i(gVar, 3, eVar.f);
            gVar.f(eVar.c());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int j(e eVar) {
            j.f.a.e<Integer> eVar2 = j.f.a.e.c;
            return eVar2.k(1, eVar.d) + eVar2.k(2, eVar.e) + j.f.a.e.f2143h.k(3, eVar.f) + eVar.c().t();
        }
    }

    static {
        n.e eVar = n.e.e;
    }

    public e(Integer num, Integer num2, n.e eVar, n.e eVar2) {
        super(f1913g, eVar2);
        this.d = num;
        this.e = num2;
        this.f = eVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return c().equals(eVar.c()) && this.d.equals(eVar.d) && this.e.equals(eVar.e) && this.f.equals(eVar.f);
    }

    public int hashCode() {
        int i2 = this.c;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = (((((c().hashCode() * 37) + this.d.hashCode()) * 37) + this.e.hashCode()) * 37) + this.f.hashCode();
        this.c = iHashCode;
        return iHashCode;
    }

    @Override // j.f.a.b
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", Appid=");
        sb.append(this.d);
        sb.append(", Msgid=");
        sb.append(this.e);
        sb.append(", Data=");
        sb.append(this.f);
        StringBuilder sbReplace = sb.replace(0, 2, "MsgType{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
