package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class g extends v.d.a {
    private final String a;
    private final String b;
    private final String c;
    private final v.d.a.b d;
    private final String e;
    private final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f1416g;

    static final class b extends v.d.a.AbstractC0136a {
        private String a;
        private String b;
        private String c;
        private v.d.a.b d;
        private String e;
        private String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f1417g;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.a.AbstractC0136a
        public v.d.a a() {
            String str = "";
            if (this.a == null) {
                str = " identifier";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.f1417g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.a.AbstractC0136a
        public v.d.a.AbstractC0136a b(String str) {
            this.f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.a.AbstractC0136a
        public v.d.a.AbstractC0136a c(String str) {
            this.f1417g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.a.AbstractC0136a
        public v.d.a.AbstractC0136a d(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.a.AbstractC0136a
        public v.d.a.AbstractC0136a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.a.AbstractC0136a
        public v.d.a.AbstractC0136a f(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.a.AbstractC0136a
        public v.d.a.AbstractC0136a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.b = str;
            return this;
        }
    }

    private g(String str, String str2, String str3, v.d.a.b bVar, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bVar;
        this.e = str4;
        this.f = str5;
        this.f1416g = str6;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.a
    public String b() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.a
    public String c() {
        return this.f1416g;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.a
    public String d() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.a
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        v.d.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.a)) {
            return false;
        }
        v.d.a aVar = (v.d.a) obj;
        if (this.a.equals(aVar.e()) && this.b.equals(aVar.h()) && ((str = this.c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
            String str4 = this.f1416g;
            String strC = aVar.c();
            if (str4 == null) {
                if (strC == null) {
                    return true;
                }
            } else if (str4.equals(strC)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.a
    public String f() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.a
    public v.d.a.b g() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.a
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        v.d.a.b bVar = this.d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f1416g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.a + ", version=" + this.b + ", displayVersion=" + this.c + ", organization=" + this.d + ", installationUuid=" + this.e + ", developmentPlatform=" + this.f + ", developmentPlatformVersion=" + this.f1416g + "}";
    }
}
