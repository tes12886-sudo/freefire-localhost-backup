package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class q extends v.d.AbstractC0137d.a.b.e.AbstractC0146b {
    private final long a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;

    static final class b extends v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a {
        private Long a;
        private String b;
        private String c;
        private Long d;
        private Integer e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a
        public v.d.AbstractC0137d.a.b.e.AbstractC0146b a() {
            String str = "";
            if (this.a == null) {
                str = " pc";
            }
            if (this.b == null) {
                str = str + " symbol";
            }
            if (this.d == null) {
                str = str + " offset";
            }
            if (this.e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new q(this.a.longValue(), this.b, this.c, this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a
        public v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a
        public v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a c(int i2) {
            this.e = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a
        public v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a d(long j2) {
            this.d = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a
        public v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a e(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a
        public v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.b = str;
            return this;
        }
    }

    private q(long j2, String str, String str2, long j3, int i2) {
        this.a = j2;
        this.b = str;
        this.c = str2;
        this.d = j3;
        this.e = i2;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b
    public String b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b
    public int c() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b
    public long d() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.a.b.e.AbstractC0146b)) {
            return false;
        }
        v.d.AbstractC0137d.a.b.e.AbstractC0146b abstractC0146b = (v.d.AbstractC0137d.a.b.e.AbstractC0146b) obj;
        return this.a == abstractC0146b.e() && this.b.equals(abstractC0146b.f()) && ((str = this.c) != null ? str.equals(abstractC0146b.b()) : abstractC0146b.b() == null) && this.d == abstractC0146b.d() && this.e == abstractC0146b.c();
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b
    public String f() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.a;
        int iHashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.d;
        return this.e ^ ((iHashCode2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.a + ", symbol=" + this.b + ", file=" + this.c + ", offset=" + this.d + ", importance=" + this.e + "}";
    }
}
