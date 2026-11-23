package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class j extends v.d.AbstractC0137d {
    private final long a;
    private final String b;
    private final v.d.AbstractC0137d.a c;
    private final v.d.AbstractC0137d.c d;
    private final v.d.AbstractC0137d.AbstractC0148d e;

    static final class b extends v.d.AbstractC0137d.b {
        private Long a;
        private String b;
        private v.d.AbstractC0137d.a c;
        private v.d.AbstractC0137d.c d;
        private v.d.AbstractC0137d.AbstractC0148d e;

        b() {
        }

        private b(v.d.AbstractC0137d abstractC0137d) {
            this.a = Long.valueOf(abstractC0137d.e());
            this.b = abstractC0137d.f();
            this.c = abstractC0137d.b();
            this.d = abstractC0137d.c();
            this.e = abstractC0137d.d();
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.b
        public v.d.AbstractC0137d a() {
            String str = "";
            if (this.a == null) {
                str = " timestamp";
            }
            if (this.b == null) {
                str = str + " type";
            }
            if (this.c == null) {
                str = str + " app";
            }
            if (this.d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new j(this.a.longValue(), this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.b
        public v.d.AbstractC0137d.b b(v.d.AbstractC0137d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.b
        public v.d.AbstractC0137d.b c(v.d.AbstractC0137d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.b
        public v.d.AbstractC0137d.b d(v.d.AbstractC0137d.AbstractC0148d abstractC0148d) {
            this.e = abstractC0148d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.b
        public v.d.AbstractC0137d.b e(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.b
        public v.d.AbstractC0137d.b f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.b = str;
            return this;
        }
    }

    private j(long j2, String str, v.d.AbstractC0137d.a aVar, v.d.AbstractC0137d.c cVar, v.d.AbstractC0137d.AbstractC0148d abstractC0148d) {
        this.a = j2;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = abstractC0148d;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d
    public v.d.AbstractC0137d.a b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d
    public v.d.AbstractC0137d.c c() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d
    public v.d.AbstractC0137d.AbstractC0148d d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d)) {
            return false;
        }
        v.d.AbstractC0137d abstractC0137d = (v.d.AbstractC0137d) obj;
        if (this.a == abstractC0137d.e() && this.b.equals(abstractC0137d.f()) && this.c.equals(abstractC0137d.b()) && this.d.equals(abstractC0137d.c())) {
            v.d.AbstractC0137d.AbstractC0148d abstractC0148d = this.e;
            v.d.AbstractC0137d.AbstractC0148d abstractC0148dD = abstractC0137d.d();
            if (abstractC0148d == null) {
                if (abstractC0148dD == null) {
                    return true;
                }
            } else if (abstractC0148d.equals(abstractC0148dD)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d
    public String f() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d
    public v.d.AbstractC0137d.b g() {
        return new b(this);
    }

    public int hashCode() {
        long j2 = this.a;
        int iHashCode = (((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        v.d.AbstractC0137d.AbstractC0148d abstractC0148d = this.e;
        return (abstractC0148d == null ? 0 : abstractC0148d.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + "}";
    }
}
