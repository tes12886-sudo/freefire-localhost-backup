package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class b extends v {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f1401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v.d f1402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v.c f1403i;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.e.b$b, reason: collision with other inner class name */
    static final class C0135b extends v.a {
        private String a;
        private String b;
        private Integer c;
        private String d;
        private String e;
        private String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private v.d f1404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private v.c f1405h;

        C0135b() {
        }

        private C0135b(v vVar) {
            this.a = vVar.i();
            this.b = vVar.e();
            this.c = Integer.valueOf(vVar.h());
            this.d = vVar.f();
            this.e = vVar.c();
            this.f = vVar.d();
            this.f1404g = vVar.j();
            this.f1405h = vVar.g();
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.a
        public v a() {
            String str = "";
            if (this.a == null) {
                str = " sdkVersion";
            }
            if (this.b == null) {
                str = str + " gmpAppId";
            }
            if (this.c == null) {
                str = str + " platform";
            }
            if (this.d == null) {
                str = str + " installationUuid";
            }
            if (this.e == null) {
                str = str + " buildVersion";
            }
            if (this.f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, this.f1404g, this.f1405h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.a
        public v.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.a
        public v.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.a
        public v.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.a
        public v.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.a
        public v.a f(v.c cVar) {
            this.f1405h = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.a
        public v.a g(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.a
        public v.a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.a
        public v.a i(v.d dVar) {
            this.f1404g = dVar;
            return this;
        }
    }

    private b(String str, String str2, int i2, String str3, String str4, String str5, v.d dVar, v.c cVar) {
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.f1401g = str5;
        this.f1402h = dVar;
        this.f1403i = cVar;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v
    public String c() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v
    public String d() {
        return this.f1401g;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        v.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.b.equals(vVar.i()) && this.c.equals(vVar.e()) && this.d == vVar.h() && this.e.equals(vVar.f()) && this.f.equals(vVar.c()) && this.f1401g.equals(vVar.d()) && ((dVar = this.f1402h) != null ? dVar.equals(vVar.j()) : vVar.j() == null)) {
            v.c cVar = this.f1403i;
            v.c cVarG = vVar.g();
            if (cVar == null) {
                if (cVarG == null) {
                    return true;
                }
            } else if (cVar.equals(cVarG)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v
    public String f() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v
    public v.c g() {
        return this.f1403i;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v
    public int h() {
        return this.d;
    }

    public int hashCode() {
        int iHashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.f1401g.hashCode()) * 1000003;
        v.d dVar = this.f1402h;
        int iHashCode2 = (iHashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        v.c cVar = this.f1403i;
        return iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.e.v
    public String i() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v
    public v.d j() {
        return this.f1402h;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v
    protected v.a k() {
        return new C0135b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", buildVersion=" + this.f + ", displayVersion=" + this.f1401g + ", session=" + this.f1402h + ", ndkPayload=" + this.f1403i + "}";
    }
}
