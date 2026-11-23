package com.google.android.datatransport.h;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class b extends i {
    private final String a;
    private final Integer b;
    private final h c;
    private final long d;
    private final long e;
    private final Map<String, String> f;

    /* JADX INFO: renamed from: com.google.android.datatransport.h.b$b, reason: collision with other inner class name */
    static final class C0117b extends i.a {
        private String a;
        private Integer b;
        private h c;
        private Long d;
        private Long e;
        private Map<String, String> f;

        C0117b() {
        }

        @Override // com.google.android.datatransport.h.i.a
        public i d() {
            String str = "";
            if (this.a == null) {
                str = " transportName";
            }
            if (this.c == null) {
                str = str + " encodedPayload";
            }
            if (this.d == null) {
                str = str + " eventMillis";
            }
            if (this.e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.h.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.h.i.a
        protected i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f = map;
            return this;
        }

        @Override // com.google.android.datatransport.h.i.a
        public i.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.google.android.datatransport.h.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.c = hVar;
            return this;
        }

        @Override // com.google.android.datatransport.h.i.a
        public i.a i(long j2) {
            this.d = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.h.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.a = str;
            return this;
        }

        @Override // com.google.android.datatransport.h.i.a
        public i.a k(long j2) {
            this.e = Long.valueOf(j2);
            return this;
        }
    }

    private b(String str, Integer num, h hVar, long j2, long j3, Map<String, String> map) {
        this.a = str;
        this.b = num;
        this.c = hVar;
        this.d = j2;
        this.e = j3;
        this.f = map;
    }

    @Override // com.google.android.datatransport.h.i
    protected Map<String, String> c() {
        return this.f;
    }

    @Override // com.google.android.datatransport.h.i
    public Integer d() {
        return this.b;
    }

    @Override // com.google.android.datatransport.h.i
    public h e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.j()) && ((num = this.b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.c.equals(iVar.e()) && this.d == iVar.f() && this.e == iVar.k() && this.f.equals(iVar.c());
    }

    @Override // com.google.android.datatransport.h.i
    public long f() {
        return this.d;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j2 = this.d;
        int i2 = (iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.e;
        return ((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    @Override // com.google.android.datatransport.h.i
    public String j() {
        return this.a;
    }

    @Override // com.google.android.datatransport.h.i
    public long k() {
        return this.e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
