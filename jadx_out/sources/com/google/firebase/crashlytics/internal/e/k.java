package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class k extends v.d.AbstractC0137d.a {
    private final v.d.AbstractC0137d.a.b a;
    private final w<v.b> b;
    private final Boolean c;
    private final int d;

    static final class b extends v.d.AbstractC0137d.a.AbstractC0138a {
        private v.d.AbstractC0137d.a.b a;
        private w<v.b> b;
        private Boolean c;
        private Integer d;

        b() {
        }

        private b(v.d.AbstractC0137d.a aVar) {
            this.a = aVar.d();
            this.b = aVar.c();
            this.c = aVar.b();
            this.d = Integer.valueOf(aVar.e());
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.AbstractC0138a
        public v.d.AbstractC0137d.a a() {
            String str = "";
            if (this.a == null) {
                str = " execution";
            }
            if (this.d == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new k(this.a, this.b, this.c, this.d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.AbstractC0138a
        public v.d.AbstractC0137d.a.AbstractC0138a b(Boolean bool) {
            this.c = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.AbstractC0138a
        public v.d.AbstractC0137d.a.AbstractC0138a c(w<v.b> wVar) {
            this.b = wVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.AbstractC0138a
        public v.d.AbstractC0137d.a.AbstractC0138a d(v.d.AbstractC0137d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.a = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.AbstractC0138a
        public v.d.AbstractC0137d.a.AbstractC0138a e(int i2) {
            this.d = Integer.valueOf(i2);
            return this;
        }
    }

    private k(v.d.AbstractC0137d.a.b bVar, w<v.b> wVar, Boolean bool, int i2) {
        this.a = bVar;
        this.b = wVar;
        this.c = bool;
        this.d = i2;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a
    public Boolean b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a
    public w<v.b> c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a
    public v.d.AbstractC0137d.a.b d() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a
    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        w<v.b> wVar;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.a)) {
            return false;
        }
        v.d.AbstractC0137d.a aVar = (v.d.AbstractC0137d.a) obj;
        return this.a.equals(aVar.d()) && ((wVar = this.b) != null ? wVar.equals(aVar.c()) : aVar.c() == null) && ((bool = this.c) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.d == aVar.e();
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a
    public v.d.AbstractC0137d.a.AbstractC0138a f() {
        return new b(this);
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        w<v.b> wVar = this.b;
        int iHashCode2 = (iHashCode ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        Boolean bool = this.c;
        return ((iHashCode2 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.d;
    }

    public String toString() {
        return "Application{execution=" + this.a + ", customAttributes=" + this.b + ", background=" + this.c + ", uiOrientation=" + this.d + "}";
    }
}
