package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class o extends v.d.AbstractC0137d.a.b.AbstractC0143d {
    private final String a;
    private final String b;
    private final long c;

    static final class b extends v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a {
        private String a;
        private String b;
        private Long c;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a
        public v.d.AbstractC0137d.a.b.AbstractC0143d a() {
            String str = "";
            if (this.a == null) {
                str = " name";
            }
            if (this.b == null) {
                str = str + " code";
            }
            if (this.c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new o(this.a, this.b, this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a
        public v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a b(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a
        public v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a
        public v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.a = str;
            return this;
        }
    }

    private o(String str, String str2, long j2) {
        this.a = str;
        this.b = str2;
        this.c = j2;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0143d
    public long b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0143d
    public String c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0143d
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.a.b.AbstractC0143d)) {
            return false;
        }
        v.d.AbstractC0137d.a.b.AbstractC0143d abstractC0143d = (v.d.AbstractC0137d.a.b.AbstractC0143d) obj;
        return this.a.equals(abstractC0143d.d()) && this.b.equals(abstractC0143d.c()) && this.c == abstractC0143d.b();
    }

    public int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j2 = this.c;
        return iHashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.a + ", code=" + this.b + ", address=" + this.c + "}";
    }
}
