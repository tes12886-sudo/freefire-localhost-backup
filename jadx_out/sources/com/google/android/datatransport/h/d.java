package com.google.android.datatransport.h;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class d extends n {
    private final String a;
    private final byte[] b;
    private final com.google.android.datatransport.d c;

    static final class b extends n.a {
        private String a;
        private byte[] b;
        private com.google.android.datatransport.d c;

        b() {
        }

        @Override // com.google.android.datatransport.h.n.a
        public n a() {
            String str = "";
            if (this.a == null) {
                str = " backendName";
            }
            if (this.c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.h.n.a
        public n.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.a = str;
            return this;
        }

        @Override // com.google.android.datatransport.h.n.a
        public n.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.h.n.a
        public n.a d(com.google.android.datatransport.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.c = dVar;
            return this;
        }
    }

    private d(String str, byte[] bArr, com.google.android.datatransport.d dVar) {
        this.a = str;
        this.b = bArr;
        this.c = dVar;
    }

    @Override // com.google.android.datatransport.h.n
    public String b() {
        return this.a;
    }

    @Override // com.google.android.datatransport.h.n
    public byte[] c() {
        return this.b;
    }

    @Override // com.google.android.datatransport.h.n
    public com.google.android.datatransport.d d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.a.equals(nVar.b())) {
            if (Arrays.equals(this.b, nVar instanceof d ? ((d) nVar).b : nVar.c()) && this.c.equals(nVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
