package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class d2 {
    private final String a;
    private final long b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final byte[] f;

    d2() {
    }

    d2(String str, long j2, int i2, boolean z, boolean z2, byte[] bArr) {
        this();
        this.a = str;
        this.b = j2;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = bArr;
    }

    static d2 a(String str, long j2, int i2, boolean z, byte[] bArr, boolean z2) {
        return new d2(str, j2, i2, z, z2, bArr);
    }

    final boolean b() {
        if (d() == null) {
            return false;
        }
        return d().endsWith("/");
    }

    final boolean c() {
        return f() == 0;
    }

    String d() {
        return this.a;
    }

    long e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d2) {
            d2 d2Var = (d2) obj;
            String str = this.a;
            if (str != null ? str.equals(d2Var.d()) : d2Var.d() == null) {
                if (this.b == d2Var.e() && this.c == d2Var.f() && this.d == d2Var.g() && this.e == d2Var.h()) {
                    if (Arrays.equals(this.f, d2Var instanceof d2 ? d2Var.f : d2Var.i())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    int f() {
        return this.c;
    }

    boolean g() {
        return this.d;
    }

    boolean h() {
        return this.e;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.b;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f);
    }

    byte[] i() {
        return this.f;
    }

    public String toString() {
        String str = this.a;
        long j2 = this.b;
        int i2 = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        String string = Arrays.toString(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(string).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j2);
        sb.append(", compressionMethod=");
        sb.append(i2);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
