package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class t extends v.d.e {
    private final int a;
    private final String b;
    private final String c;
    private final boolean d;

    static final class b extends v.d.e.a {
        private Integer a;
        private String b;
        private String c;
        private Boolean d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.e.a
        public v.d.e a() {
            String str = "";
            if (this.a == null) {
                str = " platform";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (this.c == null) {
                str = str + " buildVersion";
            }
            if (this.d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new t(this.a.intValue(), this.b, this.c, this.d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.e.a
        public v.d.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.e.a
        public v.d.e.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.e.a
        public v.d.e.a d(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.d.e.a
        public v.d.e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.b = str;
            return this;
        }
    }

    private t(int i2, String str, String str2, boolean z) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.e
    public String b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.e
    public int c() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.e
    public String d() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.d.e
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.e)) {
            return false;
        }
        v.d.e eVar = (v.d.e) obj;
        return this.a == eVar.c() && this.b.equals(eVar.d()) && this.c.equals(eVar.b()) && this.d == eVar.e();
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }
}
