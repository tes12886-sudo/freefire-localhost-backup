package com.google.android.datatransport.h.x.j;

/* JADX INFO: loaded from: classes.dex */
final class w extends z {
    private final long b;
    private final int c;
    private final int d;
    private final long e;
    private final int f;

    static final class b extends z.a {
        private Long a;
        private Integer b;
        private Integer c;
        private Long d;
        private Integer e;

        b() {
        }

        @Override // com.google.android.datatransport.h.x.j.z.a
        z a() {
            String str = "";
            if (this.a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new w(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.h.x.j.z.a
        z.a b(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.android.datatransport.h.x.j.z.a
        z.a c(long j2) {
            this.d = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.h.x.j.z.a
        z.a d(int i2) {
            this.b = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.android.datatransport.h.x.j.z.a
        z.a e(int i2) {
            this.e = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.android.datatransport.h.x.j.z.a
        z.a f(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }
    }

    private w(long j2, int i2, int i3, long j3, int i4) {
        this.b = j2;
        this.c = i2;
        this.d = i3;
        this.e = j3;
        this.f = i4;
    }

    @Override // com.google.android.datatransport.h.x.j.z
    int b() {
        return this.d;
    }

    @Override // com.google.android.datatransport.h.x.j.z
    long c() {
        return this.e;
    }

    @Override // com.google.android.datatransport.h.x.j.z
    int d() {
        return this.c;
    }

    @Override // com.google.android.datatransport.h.x.j.z
    int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.b == zVar.f() && this.c == zVar.d() && this.d == zVar.b() && this.e == zVar.c() && this.f == zVar.e();
    }

    @Override // com.google.android.datatransport.h.x.j.z
    long f() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.b;
        int i2 = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j3 = this.e;
        return this.f ^ ((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.c + ", criticalSectionEnterTimeoutMs=" + this.d + ", eventCleanUpAge=" + this.e + ", maxBlobByteSizePerRow=" + this.f + "}";
    }
}
