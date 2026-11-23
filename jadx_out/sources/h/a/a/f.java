package h.a.a;

/* JADX INFO: loaded from: classes.dex */
final class f extends h.a.a.b {
    private final String a;
    private final String b;
    private final boolean c;

    static final class b extends h.a.a.b.a {
        private String a;
        private String b;
        private Boolean c;

        b() {
        }

        @Override // h.a.a.b.a
        h.a.a.b a() {
            String str = "";
            if (this.a == null) {
                str = " id";
            }
            if (this.b == null) {
                str = str + " providerPackageName";
            }
            if (this.c == null) {
                str = str + " limitAdTrackingEnabled";
            }
            if (str.isEmpty()) {
                return new f(this.a, this.b, this.c.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // h.a.a.b.a
        h.a.a.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null id");
            }
            this.a = str;
            return this;
        }

        @Override // h.a.a.b.a
        h.a.a.b.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // h.a.a.b.a
        h.a.a.b.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null providerPackageName");
            }
            this.b = str;
            return this;
        }
    }

    private f(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // h.a.a.b
    public String b() {
        return this.a;
    }

    @Override // h.a.a.b
    public String c() {
        return this.b;
    }

    @Override // h.a.a.b
    public boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h.a.a.b)) {
            return false;
        }
        h.a.a.b bVar = (h.a.a.b) obj;
        return this.a.equals(bVar.b()) && this.b.equals(bVar.c()) && this.c == bVar.d();
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        return "AdvertisingIdInfo{id=" + this.a + ", providerPackageName=" + this.b + ", limitAdTrackingEnabled=" + this.c + "}";
    }
}
