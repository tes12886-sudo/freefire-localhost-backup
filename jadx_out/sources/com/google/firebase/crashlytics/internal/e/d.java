package com.google.firebase.crashlytics.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class d extends v.c {
    private final w<v.c.b> a;
    private final String b;

    static final class b extends v.c.a {
        private w<v.c.b> a;
        private String b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.c.a
        public v.c a() {
            String str = "";
            if (this.a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new d(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.c.a
        public v.c.a b(w<v.c.b> wVar) {
            if (wVar == null) {
                throw new NullPointerException("Null files");
            }
            this.a = wVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.c.a
        public v.c.a c(String str) {
            this.b = str;
            return this;
        }
    }

    private d(w<v.c.b> wVar, String str) {
        this.a = wVar;
        this.b = str;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.c
    public w<v.c.b> b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.c
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.c)) {
            return false;
        }
        v.c cVar = (v.c) obj;
        if (this.a.equals(cVar.b())) {
            String str = this.b;
            String strC = cVar.c();
            if (str == null) {
                if (strC == null) {
                    return true;
                }
            } else if (str.equals(strC)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.a + ", orgId=" + this.b + "}";
    }
}
