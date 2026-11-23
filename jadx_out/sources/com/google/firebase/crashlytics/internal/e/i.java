package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class i extends v.d.c {
    private final int a;
    private final String b;
    private final int c;
    private final long d;
    private final long e;
    private final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f1419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f1420i;

    static final class b extends v.d.c.a {
        private Integer a;
        private String b;
        private Integer c;
        private Long d;
        private Long e;
        private Boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f1421g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f1422h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f1423i;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.c.a
        public v.d.c a() {
            String str = "";
            if (this.a == null) {
                str = " arch";
            }
            if (this.b == null) {
                str = str + " model";
            }
            if (this.c == null) {
                str = str + " cores";
            }
            if (this.d == null) {
                str = str + " ram";
            }
            if (this.e == null) {
                str = str + " diskSpace";
            }
            if (this.f == null) {
                str = str + " simulator";
            }
            if (this.f1421g == null) {
                str = str + " state";
            }
            if (this.f1422h == null) {
                str = str + " manufacturer";
            }
            if (this.f1423i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new i(this.a.intValue(), this.b, this.c.intValue(), this.d.longValue(), this.e.longValue(), this.f.booleanValue(), this.f1421g.intValue(), this.f1422h, this.f1423i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.c.a
        public v.d.c.a b(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.c.a
        public v.d.c.a c(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.c.a
        public v.d.c.a d(long j2) {
            this.e = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.c.a
        public v.d.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f1422h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.c.a
        public v.d.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.c.a
        public v.d.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f1423i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.c.a
        public v.d.c.a h(long j2) {
            this.d = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.c.a
        public v.d.c.a i(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.c.a
        public v.d.c.a j(int i2) {
            this.f1421g = Integer.valueOf(i2);
            return this;
        }
    }

    private i(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
        this.a = i2;
        this.b = str;
        this.c = i3;
        this.d = j2;
        this.e = j3;
        this.f = z;
        this.f1418g = i4;
        this.f1419h = str2;
        this.f1420i = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.c
    public int b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.c
    public int c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.c
    public long d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.c
    public String e() {
        return this.f1419h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.c)) {
            return false;
        }
        v.d.c cVar = (v.d.c) obj;
        return this.a == cVar.b() && this.b.equals(cVar.f()) && this.c == cVar.c() && this.d == cVar.h() && this.e == cVar.d() && this.f == cVar.j() && this.f1418g == cVar.i() && this.f1419h.equals(cVar.e()) && this.f1420i.equals(cVar.g());
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.c
    public String f() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.c
    public String g() {
        return this.f1420i;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.c
    public long h() {
        return this.d;
    }

    public int hashCode() {
        int iHashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j2 = this.d;
        int i2 = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.e;
        return ((((((((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.f1418g) * 1000003) ^ this.f1419h.hashCode()) * 1000003) ^ this.f1420i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.c
    public int i() {
        return this.f1418g;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.c
    public boolean j() {
        return this.f;
    }

    public String toString() {
        return "Device{arch=" + this.a + ", model=" + this.b + ", cores=" + this.c + ", ram=" + this.d + ", diskSpace=" + this.e + ", simulator=" + this.f + ", state=" + this.f1418g + ", manufacturer=" + this.f1419h + ", modelClass=" + this.f1420i + "}";
    }
}
