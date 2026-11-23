package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class l extends v.d.AbstractC0137d.a.b {
    private final w<v.d.AbstractC0137d.a.b.e> a;
    private final v.d.AbstractC0137d.a.b.c b;
    private final v.d.AbstractC0137d.a.b.AbstractC0143d c;
    private final w<v.d.AbstractC0137d.a.b.AbstractC0139a> d;

    static final class b extends v.d.AbstractC0137d.a.b.AbstractC0141b {
        private w<v.d.AbstractC0137d.a.b.e> a;
        private v.d.AbstractC0137d.a.b.c b;
        private v.d.AbstractC0137d.a.b.AbstractC0143d c;
        private w<v.d.AbstractC0137d.a.b.AbstractC0139a> d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0141b
        public v.d.AbstractC0137d.a.b a() {
            String str = "";
            if (this.a == null) {
                str = " threads";
            }
            if (this.b == null) {
                str = str + " exception";
            }
            if (this.c == null) {
                str = str + " signal";
            }
            if (this.d == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new l(this.a, this.b, this.c, this.d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0141b
        public v.d.AbstractC0137d.a.b.AbstractC0141b b(w<v.d.AbstractC0137d.a.b.AbstractC0139a> wVar) {
            if (wVar == null) {
                throw new NullPointerException("Null binaries");
            }
            this.d = wVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0141b
        public v.d.AbstractC0137d.a.b.AbstractC0141b c(v.d.AbstractC0137d.a.b.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null exception");
            }
            this.b = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0141b
        public v.d.AbstractC0137d.a.b.AbstractC0141b d(v.d.AbstractC0137d.a.b.AbstractC0143d abstractC0143d) {
            if (abstractC0143d == null) {
                throw new NullPointerException("Null signal");
            }
            this.c = abstractC0143d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0141b
        public v.d.AbstractC0137d.a.b.AbstractC0141b e(w<v.d.AbstractC0137d.a.b.e> wVar) {
            if (wVar == null) {
                throw new NullPointerException("Null threads");
            }
            this.a = wVar;
            return this;
        }
    }

    private l(w<v.d.AbstractC0137d.a.b.e> wVar, v.d.AbstractC0137d.a.b.c cVar, v.d.AbstractC0137d.a.b.AbstractC0143d abstractC0143d, w<v.d.AbstractC0137d.a.b.AbstractC0139a> wVar2) {
        this.a = wVar;
        this.b = cVar;
        this.c = abstractC0143d;
        this.d = wVar2;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b
    public w<v.d.AbstractC0137d.a.b.AbstractC0139a> b() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b
    public v.d.AbstractC0137d.a.b.c c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b
    public v.d.AbstractC0137d.a.b.AbstractC0143d d() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b
    public w<v.d.AbstractC0137d.a.b.e> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.a.b)) {
            return false;
        }
        v.d.AbstractC0137d.a.b bVar = (v.d.AbstractC0137d.a.b) obj;
        return this.a.equals(bVar.e()) && this.b.equals(bVar.c()) && this.c.equals(bVar.d()) && this.d.equals(bVar.b());
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", signal=" + this.c + ", binaries=" + this.d + "}";
    }
}
