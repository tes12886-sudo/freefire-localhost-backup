package com.google.android.datatransport.cct.f;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class f extends l {
    private final long a;
    private final Integer b;
    private final long c;
    private final byte[] d;
    private final String e;
    private final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o f858g;

    static final class b extends l.a {
        private Long a;
        private Integer b;
        private Long c;
        private byte[] d;
        private String e;
        private Long f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private o f859g;

        b() {
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l a() {
            String str = "";
            if (this.a == null) {
                str = " eventTimeMs";
            }
            if (this.c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.a.longValue(), this.b, this.c.longValue(), this.d, this.e, this.f.longValue(), this.f859g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a b(Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a c(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a d(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a e(o oVar) {
            this.f859g = oVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        l.a f(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        l.a g(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.l.a
        public l.a h(long j2) {
            this.f = Long.valueOf(j2);
            return this;
        }
    }

    private f(long j2, Integer num, long j3, byte[] bArr, String str, long j4, o oVar) {
        this.a = j2;
        this.b = num;
        this.c = j3;
        this.d = bArr;
        this.e = str;
        this.f = j4;
        this.f858g = oVar;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public Integer b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public long c() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public long d() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public o e() {
        return this.f858g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a == lVar.c() && ((num = this.b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.c == lVar.d()) {
            if (Arrays.equals(this.d, lVar instanceof f ? ((f) lVar).d : lVar.f()) && ((str = this.e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f == lVar.h()) {
                o oVar = this.f858g;
                o oVarE = lVar.e();
                if (oVar == null) {
                    if (oVarE == null) {
                        return true;
                    }
                } else if (oVar.equals(oVarE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public byte[] f() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public String g() {
        return this.e;
    }

    @Override // com.google.android.datatransport.cct.f.l
    public long h() {
        return this.f;
    }

    public int hashCode() {
        long j2 = this.a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j3 = this.c;
        int iHashCode2 = (((((i2 ^ iHashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j4 = this.f;
        int i3 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        o oVar = this.f858g;
        return i3 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.f858g + "}";
    }
}
