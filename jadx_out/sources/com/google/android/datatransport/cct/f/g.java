package com.google.android.datatransport.cct.f;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class g extends m {
    private final long a;
    private final long b;
    private final k c;
    private final Integer d;
    private final String e;
    private final List<l> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f860g;

    static final class b extends m.a {
        private Long a;
        private Long b;
        private k c;
        private Integer d;
        private String e;
        private List<l> f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p f861g;

        b() {
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m a() {
            String str = "";
            if (this.a == null) {
                str = " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.f861g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a b(k kVar) {
            this.c = kVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a c(List<l> list) {
            this.f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        m.a d(Integer num) {
            this.d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        m.a e(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a f(p pVar) {
            this.f861g = pVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a g(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.f.m.a
        public m.a h(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }
    }

    private g(long j2, long j3, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.a = j2;
        this.b = j3;
        this.c = kVar;
        this.d = num;
        this.e = str;
        this.f = list;
        this.f860g = pVar;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public k b() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public List<l> c() {
        return this.f;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public Integer d() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a == mVar.g() && this.b == mVar.h() && ((kVar = this.c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f860g;
            p pVarF = mVar.f();
            if (pVar == null) {
                if (pVarF == null) {
                    return true;
                }
            } else if (pVar.equals(pVarF)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public p f() {
        return this.f860g;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public long g() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.f.m
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        k kVar = this.c;
        int iHashCode = (i2 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f860g;
        return iHashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.f860g + "}";
    }
}
