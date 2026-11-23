package com.google.android.datatransport.h;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private final com.google.android.datatransport.b a;
    private final byte[] b;

    public h(com.google.android.datatransport.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = bVar;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public com.google.android.datatransport.b b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a.equals(hVar.a)) {
            return Arrays.equals(this.b, hVar.b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
