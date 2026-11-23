package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class c extends v.b {
    private final String a;
    private final String b;

    static final class b extends v.b.a {
        private String a;
        private String b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.b.a
        public v.b a() {
            String str = "";
            if (this.a == null) {
                str = " key";
            }
            if (this.b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new c(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.b.a
        public v.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.b.a
        public v.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.b = str;
            return this;
        }
    }

    private c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.b
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.b
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.b)) {
            return false;
        }
        v.b bVar = (v.b) obj;
        return this.a.equals(bVar.b()) && this.b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.a + ", value=" + this.b + "}";
    }
}
