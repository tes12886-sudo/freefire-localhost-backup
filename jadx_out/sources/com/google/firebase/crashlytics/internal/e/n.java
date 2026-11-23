package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class n extends v.d.AbstractC0137d.a.b.c {
    private final String a;
    private final String b;
    private final w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> c;
    private final v.d.AbstractC0137d.a.b.c d;
    private final int e;

    static final class b extends v.d.AbstractC0137d.a.b.c.AbstractC0142a {
        private String a;
        private String b;
        private w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> c;
        private v.d.AbstractC0137d.a.b.c d;
        private Integer e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c.AbstractC0142a
        public v.d.AbstractC0137d.a.b.c a() {
            String str = "";
            if (this.a == null) {
                str = " type";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (this.e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new n(this.a, this.b, this.c, this.d, this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c.AbstractC0142a
        public v.d.AbstractC0137d.a.b.c.AbstractC0142a b(v.d.AbstractC0137d.a.b.c cVar) {
            this.d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c.AbstractC0142a
        public v.d.AbstractC0137d.a.b.c.AbstractC0142a c(w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> wVar) {
            if (wVar == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = wVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c.AbstractC0142a
        public v.d.AbstractC0137d.a.b.c.AbstractC0142a d(int i2) {
            this.e = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c.AbstractC0142a
        public v.d.AbstractC0137d.a.b.c.AbstractC0142a e(String str) {
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c.AbstractC0142a
        public v.d.AbstractC0137d.a.b.c.AbstractC0142a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.a = str;
            return this;
        }
    }

    private n(String str, String str2, w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> wVar, v.d.AbstractC0137d.a.b.c cVar, int i2) {
        this.a = str;
        this.b = str2;
        this.c = wVar;
        this.d = cVar;
        this.e = i2;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c
    public v.d.AbstractC0137d.a.b.c b() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c
    public w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c
    public int d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        v.d.AbstractC0137d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.a.b.c)) {
            return false;
        }
        v.d.AbstractC0137d.a.b.c cVar2 = (v.d.AbstractC0137d.a.b.c) obj;
        return this.a.equals(cVar2.f()) && ((str = this.b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.c.equals(cVar2.c()) && ((cVar = this.d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.e == cVar2.d();
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c
    public String f() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        v.d.AbstractC0137d.a.b.c cVar = this.d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public String toString() {
        return "Exception{type=" + this.a + ", reason=" + this.b + ", frames=" + this.c + ", causedBy=" + this.d + ", overflowCount=" + this.e + "}";
    }
}
