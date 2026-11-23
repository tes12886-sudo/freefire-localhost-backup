package com.google.android.datatransport.runtime.backends;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class a extends f {
    private final Iterable<com.google.android.datatransport.h.i> a;
    private final byte[] b;

    static final class b extends f.a {
        private Iterable<com.google.android.datatransport.h.i> a;
        private byte[] b;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f a() {
            String str = "";
            if (this.a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f.a b(Iterable<com.google.android.datatransport.h.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    private a(Iterable<com.google.android.datatransport.h.i> iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public Iterable<com.google.android.datatransport.h.i> b() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a.equals(fVar.b())) {
            if (Arrays.equals(this.b, fVar instanceof a ? ((a) fVar).b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}
