package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class f extends v.d {
    private final String a;
    private final String b;
    private final long c;
    private final Long d;
    private final boolean e;
    private final v.d.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v.d.f f1406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v.d.e f1407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v.d.c f1408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w<v.d.AbstractC0137d> f1409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f1410k;

    static final class b extends v.d.b {
        private String a;
        private String b;
        private Long c;
        private Long d;
        private Boolean e;
        private v.d.a f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private v.d.f f1411g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private v.d.e f1412h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private v.d.c f1413i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private w<v.d.AbstractC0137d> f1414j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Integer f1415k;

        b() {
        }

        private b(v.d dVar) {
            this.a = dVar.f();
            this.b = dVar.h();
            this.c = Long.valueOf(dVar.k());
            this.d = dVar.d();
            this.e = Boolean.valueOf(dVar.m());
            this.f = dVar.b();
            this.f1411g = dVar.l();
            this.f1412h = dVar.j();
            this.f1413i = dVar.c();
            this.f1414j = dVar.e();
            this.f1415k = Integer.valueOf(dVar.g());
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.b
        public v.d a() {
            String str = "";
            if (this.a == null) {
                str = " generator";
            }
            if (this.b == null) {
                str = str + " identifier";
            }
            if (this.c == null) {
                str = str + " startedAt";
            }
            if (this.e == null) {
                str = str + " crashed";
            }
            if (this.f == null) {
                str = str + " app";
            }
            if (this.f1415k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new f(this.a, this.b, this.c.longValue(), this.d, this.e.booleanValue(), this.f, this.f1411g, this.f1412h, this.f1413i, this.f1414j, this.f1415k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.b
        public v.d.b b(v.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.b
        public v.d.b c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.b
        public v.d.b d(v.d.c cVar) {
            this.f1413i = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.b
        public v.d.b e(Long l2) {
            this.d = l2;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.b
        public v.d.b f(w<v.d.AbstractC0137d> wVar) {
            this.f1414j = wVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.b
        public v.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.b
        public v.d.b h(int i2) {
            this.f1415k = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.b
        public v.d.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.b
        public v.d.b k(v.d.e eVar) {
            this.f1412h = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.b
        public v.d.b l(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.b
        public v.d.b m(v.d.f fVar) {
            this.f1411g = fVar;
            return this;
        }
    }

    private f(String str, String str2, long j2, Long l2, boolean z, v.d.a aVar, v.d.f fVar, v.d.e eVar, v.d.c cVar, w<v.d.AbstractC0137d> wVar, int i2) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = l2;
        this.e = z;
        this.f = aVar;
        this.f1406g = fVar;
        this.f1407h = eVar;
        this.f1408i = cVar;
        this.f1409j = wVar;
        this.f1410k = i2;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d
    public v.d.a b() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d
    public v.d.c c() {
        return this.f1408i;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d
    public Long d() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d
    public w<v.d.AbstractC0137d> e() {
        return this.f1409j;
    }

    public boolean equals(Object obj) {
        Long l2;
        v.d.f fVar;
        v.d.e eVar;
        v.d.c cVar;
        w<v.d.AbstractC0137d> wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d)) {
            return false;
        }
        v.d dVar = (v.d) obj;
        return this.a.equals(dVar.f()) && this.b.equals(dVar.h()) && this.c == dVar.k() && ((l2 = this.d) != null ? l2.equals(dVar.d()) : dVar.d() == null) && this.e == dVar.m() && this.f.equals(dVar.b()) && ((fVar = this.f1406g) != null ? fVar.equals(dVar.l()) : dVar.l() == null) && ((eVar = this.f1407h) != null ? eVar.equals(dVar.j()) : dVar.j() == null) && ((cVar = this.f1408i) != null ? cVar.equals(dVar.c()) : dVar.c() == null) && ((wVar = this.f1409j) != null ? wVar.equals(dVar.e()) : dVar.e() == null) && this.f1410k == dVar.g();
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d
    public String f() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d
    public int g() {
        return this.f1410k;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j2 = this.c;
        int i2 = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l2 = this.d;
        int iHashCode2 = (((((i2 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003;
        v.d.f fVar = this.f1406g;
        int iHashCode3 = (iHashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        v.d.e eVar = this.f1407h;
        int iHashCode4 = (iHashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        v.d.c cVar = this.f1408i;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        w<v.d.AbstractC0137d> wVar = this.f1409j;
        return ((iHashCode5 ^ (wVar != null ? wVar.hashCode() : 0)) * 1000003) ^ this.f1410k;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d
    public v.d.e j() {
        return this.f1407h;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d
    public long k() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d
    public v.d.f l() {
        return this.f1406g;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d
    public boolean m() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d
    public v.d.b n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.a + ", identifier=" + this.b + ", startedAt=" + this.c + ", endedAt=" + this.d + ", crashed=" + this.e + ", app=" + this.f + ", user=" + this.f1406g + ", os=" + this.f1407h + ", device=" + this.f1408i + ", events=" + this.f1409j + ", generatorType=" + this.f1410k + "}";
    }
}
