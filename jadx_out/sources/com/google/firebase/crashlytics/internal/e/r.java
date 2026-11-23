package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class r extends v.d.AbstractC0137d.c {
    private final Double a;
    private final int b;
    private final boolean c;
    private final int d;
    private final long e;
    private final long f;

    static final class b extends v.d.AbstractC0137d.c.a {
        private Double a;
        private Integer b;
        private Boolean c;
        private Integer d;
        private Long e;
        private Long f;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c.a
        public v.d.AbstractC0137d.c a() {
            String str = "";
            if (this.b == null) {
                str = " batteryVelocity";
            }
            if (this.c == null) {
                str = str + " proximityOn";
            }
            if (this.d == null) {
                str = str + " orientation";
            }
            if (this.e == null) {
                str = str + " ramUsed";
            }
            if (this.f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new r(this.a, this.b.intValue(), this.c.booleanValue(), this.d.intValue(), this.e.longValue(), this.f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c.a
        public v.d.AbstractC0137d.c.a b(Double d) {
            this.a = d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c.a
        public v.d.AbstractC0137d.c.a c(int i2) {
            this.b = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c.a
        public v.d.AbstractC0137d.c.a d(long j2) {
            this.f = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c.a
        public v.d.AbstractC0137d.c.a e(int i2) {
            this.d = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c.a
        public v.d.AbstractC0137d.c.a f(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c.a
        public v.d.AbstractC0137d.c.a g(long j2) {
            this.e = Long.valueOf(j2);
            return this;
        }
    }

    private r(Double d, int i2, boolean z, int i3, long j2, long j3) {
        this.a = d;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = j2;
        this.f = j3;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c
    public Double b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c
    public int c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c
    public long d() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c
    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.c)) {
            return false;
        }
        v.d.AbstractC0137d.c cVar = (v.d.AbstractC0137d.c) obj;
        Double d = this.a;
        if (d != null ? d.equals(cVar.b()) : cVar.b() == null) {
            if (this.b == cVar.c() && this.c == cVar.g() && this.d == cVar.e() && this.e == cVar.f() && this.f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c
    public long f() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c
    public boolean g() {
        return this.c;
    }

    public int hashCode() {
        Double d = this.a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j2 = this.e;
        long j3 = this.f;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.a + ", batteryVelocity=" + this.b + ", proximityOn=" + this.c + ", orientation=" + this.d + ", ramUsed=" + this.e + ", diskUsed=" + this.f + "}";
    }
}
