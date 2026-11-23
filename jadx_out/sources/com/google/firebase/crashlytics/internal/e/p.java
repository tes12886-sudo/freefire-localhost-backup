package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class p extends v.d.AbstractC0137d.a.b.e {
    private final String a;
    private final int b;
    private final w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> c;

    static final class b extends v.d.AbstractC0137d.a.b.e.AbstractC0145a {
        private String a;
        private Integer b;
        private w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> c;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0145a
        public v.d.AbstractC0137d.a.b.e a() {
            String str = "";
            if (this.a == null) {
                str = " name";
            }
            if (this.b == null) {
                str = str + " importance";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new p(this.a, this.b.intValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0145a
        public v.d.AbstractC0137d.a.b.e.AbstractC0145a b(w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> wVar) {
            if (wVar == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = wVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0145a
        public v.d.AbstractC0137d.a.b.e.AbstractC0145a c(int i2) {
            this.b = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0145a
        public v.d.AbstractC0137d.a.b.e.AbstractC0145a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.a = str;
            return this;
        }
    }

    private p(String str, int i2, w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> wVar) {
        this.a = str;
        this.b = i2;
        this.c = wVar;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e
    public w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e
    public int c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.AbstractC0137d.a.b.e)) {
            return false;
        }
        v.d.AbstractC0137d.a.b.e eVar = (v.d.AbstractC0137d.a.b.e) obj;
        return this.a.equals(eVar.d()) && this.b == eVar.c() && this.c.equals(eVar.b());
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}
