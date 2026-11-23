package com.google.firebase.crashlytics.internal.e;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class e extends v.c.b {
    private final String a;
    private final byte[] b;

    static final class b extends v.c.b.a {
        private String a;
        private byte[] b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.c.b.a
        public v.c.b a() {
            String str = "";
            if (this.a == null) {
                str = " filename";
            }
            if (this.b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new e(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.c.b.a
        public v.c.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.b = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.e.v.c.b.a
        public v.c.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.a = str;
            return this;
        }
    }

    private e(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.c.b
    public byte[] b() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.e.v.c.b
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.c.b)) {
            return false;
        }
        v.c.b bVar = (v.c.b) obj;
        if (this.a.equals(bVar.c())) {
            if (Arrays.equals(this.b, bVar instanceof e ? ((e) bVar).b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
