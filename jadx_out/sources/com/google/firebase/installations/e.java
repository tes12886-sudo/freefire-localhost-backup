package com.google.firebase.installations;

/* JADX INFO: loaded from: classes.dex */
final class e extends k {
    private final String a;
    private final long b;
    private final long c;

    static final class b extends k.a {
        private String a;
        private Long b;
        private Long c;

        b() {
        }

        @Override // com.google.firebase.installations.k.a
        public k a() {
            String str = "";
            if (this.a == null) {
                str = " token";
            }
            if (this.b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new e(this.a, this.b.longValue(), this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.k.a
        public k.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.k.a
        public k.a c(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.k.a
        public k.a d(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }
    }

    private e(String str, long j2, long j3) {
        this.a = str;
        this.b = j2;
        this.c = j3;
    }

    @Override // com.google.firebase.installations.k
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.installations.k
    public long c() {
        return this.c;
    }

    @Override // com.google.firebase.installations.k
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a.equals(kVar.b()) && this.b == kVar.d() && this.c == kVar.c();
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.b;
        long j3 = this.c;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }
}
