package com.google.firebase.installations.p;

/* JADX INFO: loaded from: classes.dex */
final class a extends d {
    private final String a;
    private final c.a b;
    private final String c;
    private final String d;
    private final long e;
    private final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f1446g;

    static final class b extends d.a {
        private String a;
        private c.a b;
        private String c;
        private String d;
        private Long e;
        private Long f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f1447g;

        b() {
        }

        private b(d dVar) {
            this.a = dVar.d();
            this.b = dVar.g();
            this.c = dVar.b();
            this.d = dVar.f();
            this.e = Long.valueOf(dVar.c());
            this.f = Long.valueOf(dVar.h());
            this.f1447g = dVar.e();
        }

        @Override // com.google.firebase.installations.p.d.a
        public d a() {
            String str = "";
            if (this.b == null) {
                str = " registrationStatus";
            }
            if (this.e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.f1447g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.p.d.a
        public d.a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.installations.p.d.a
        public d.a c(long j2) {
            this.e = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.p.d.a
        public d.a d(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.p.d.a
        public d.a e(String str) {
            this.f1447g = str;
            return this;
        }

        @Override // com.google.firebase.installations.p.d.a
        public d.a f(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.installations.p.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.b = aVar;
            return this;
        }

        @Override // com.google.firebase.installations.p.d.a
        public d.a h(long j2) {
            this.f = Long.valueOf(j2);
            return this;
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j2, long j3, String str4) {
        this.a = str;
        this.b = aVar;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = j3;
        this.f1446g = str4;
    }

    @Override // com.google.firebase.installations.p.d
    public String b() {
        return this.c;
    }

    @Override // com.google.firebase.installations.p.d
    public long c() {
        return this.e;
    }

    @Override // com.google.firebase.installations.p.d
    public String d() {
        return this.a;
    }

    @Override // com.google.firebase.installations.p.d
    public String e() {
        return this.f1446g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.a;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.b.equals(dVar.g()) && ((str = this.c) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.d) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.e == dVar.c() && this.f == dVar.h()) {
                String str4 = this.f1446g;
                String strE = dVar.e();
                if (str4 == null) {
                    if (strE == null) {
                        return true;
                    }
                } else if (str4.equals(strE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.p.d
    public String f() {
        return this.d;
    }

    @Override // com.google.firebase.installations.p.d
    public c.a g() {
        return this.b;
    }

    @Override // com.google.firebase.installations.p.d
    public long h() {
        return this.f;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str2 = this.c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j2 = this.e;
        int i2 = (iHashCode3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f1446g;
        return i3 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.p.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.a + ", registrationStatus=" + this.b + ", authToken=" + this.c + ", refreshToken=" + this.d + ", expiresInSecs=" + this.e + ", tokenCreationEpochInSecs=" + this.f + ", fisError=" + this.f1446g + "}";
    }
}
