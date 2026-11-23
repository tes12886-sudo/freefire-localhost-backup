package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class m extends v.d.AbstractC0137d.a.b.AbstractC0139a {
    private final long a;
    private final long b;
    private final String c;
    private final String d;

    static final class b extends v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a {
        private Long a;
        private Long b;
        private String c;
        private String d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a
        public v.d.AbstractC0137d.a.b.AbstractC0139a a() {
            String str = "";
            if (this.a == null) {
                str = " baseAddress";
            }
            if (this.b == null) {
                str = str + " size";
            }
            if (this.c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new m(this.a.longValue(), this.b.longValue(), this.c, this.d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a
        public v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a b(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a
        public v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a
        public v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a d(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a
        public v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a e(String str) {
            this.d = str;
            return this;
        }
    }

    private m(long j2, long j3, String str, String str2) {
        this.a = j2;
        this.b = j3;
        this.c = str;
        this.d = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0139a
    public long b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0139a
    public String c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0139a
    public long d() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0139a
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.a.b.AbstractC0139a)) {
            return false;
        }
        v.d.AbstractC0137d.a.b.AbstractC0139a abstractC0139a = (v.d.AbstractC0137d.a.b.AbstractC0139a) obj;
        if (this.a == abstractC0139a.b() && this.b == abstractC0139a.d() && this.c.equals(abstractC0139a.c())) {
            String str = this.d;
            String strE = abstractC0139a.e();
            if (str == null) {
                if (strE == null) {
                    return true;
                }
            } else if (str.equals(strE)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int iHashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.a + ", size=" + this.b + ", name=" + this.c + ", uuid=" + this.d + "}";
    }
}
