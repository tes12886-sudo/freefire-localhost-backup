package com.google.android.datatransport.h;

/* JADX INFO: loaded from: classes.dex */
final class c extends m {
    private final n a;
    private final String b;
    private final com.google.android.datatransport.c<?> c;
    private final com.google.android.datatransport.e<?, byte[]> d;
    private final com.google.android.datatransport.b e;

    static final class b extends m.a {
        private n a;
        private String b;
        private com.google.android.datatransport.c<?> c;
        private com.google.android.datatransport.e<?, byte[]> d;
        private com.google.android.datatransport.b e;

        b() {
        }

        @Override // com.google.android.datatransport.h.m.a
        public m a() {
            String str = "";
            if (this.a == null) {
                str = " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.d == null) {
                str = str + " transformer";
            }
            if (this.e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.h.m.a
        m.a b(com.google.android.datatransport.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.e = bVar;
            return this;
        }

        @Override // com.google.android.datatransport.h.m.a
        m.a c(com.google.android.datatransport.c<?> cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null event");
            }
            this.c = cVar;
            return this;
        }

        @Override // com.google.android.datatransport.h.m.a
        m.a d(com.google.android.datatransport.e<?, byte[]> eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.d = eVar;
            return this;
        }

        @Override // com.google.android.datatransport.h.m.a
        public m.a e(n nVar) {
            if (nVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.a = nVar;
            return this;
        }

        @Override // com.google.android.datatransport.h.m.a
        public m.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.b = str;
            return this;
        }
    }

    private c(n nVar, String str, com.google.android.datatransport.c<?> cVar, com.google.android.datatransport.e<?, byte[]> eVar, com.google.android.datatransport.b bVar) {
        this.a = nVar;
        this.b = str;
        this.c = cVar;
        this.d = eVar;
        this.e = bVar;
    }

    @Override // com.google.android.datatransport.h.m
    public com.google.android.datatransport.b b() {
        return this.e;
    }

    @Override // com.google.android.datatransport.h.m
    com.google.android.datatransport.c<?> c() {
        return this.c;
    }

    @Override // com.google.android.datatransport.h.m
    com.google.android.datatransport.e<?, byte[]> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.f()) && this.b.equals(mVar.g()) && this.c.equals(mVar.c()) && this.d.equals(mVar.e()) && this.e.equals(mVar.b());
    }

    @Override // com.google.android.datatransport.h.m
    public n f() {
        return this.a;
    }

    @Override // com.google.android.datatransport.h.m
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }
}
