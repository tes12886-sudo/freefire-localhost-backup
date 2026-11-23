package com.google.firebase.installations.q;

/* JADX INFO: loaded from: classes.dex */
final class b extends f {
    private final String a;
    private final long b;
    private final f.b c;

    /* JADX INFO: renamed from: com.google.firebase.installations.q.b$b, reason: collision with other inner class name */
    static final class C0151b extends f.a {
        private String a;
        private Long b;
        private f.b c;

        C0151b() {
        }

        @Override // com.google.firebase.installations.q.f.a
        public f a() {
            String str = "";
            if (this.b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.q.f.a
        public f.a b(f.b bVar) {
            this.c = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.q.f.a
        public f.a c(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.f.a
        public f.a d(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }
    }

    private b(String str, long j2, f.b bVar) {
        this.a = str;
        this.b = j2;
        this.c = bVar;
    }

    @Override // com.google.firebase.installations.q.f
    public f.b b() {
        return this.c;
    }

    @Override // com.google.firebase.installations.q.f
    public String c() {
        return this.a;
    }

    @Override // com.google.firebase.installations.q.f
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.b == fVar.d()) {
                f.b bVar = this.c;
                f.b bVarB = fVar.b();
                if (bVar == null) {
                    if (bVarB == null) {
                        return true;
                    }
                } else if (bVar.equals(bVarB)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.b;
        int i2 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        f.b bVar = this.c;
        return i2 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}
