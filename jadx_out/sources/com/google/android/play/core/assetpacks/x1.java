package com.google.android.play.core.assetpacks;

/* JADX INFO: loaded from: classes.dex */
final class x1 {
    private final int a;
    private final String b;
    private final long c;
    private final long d;
    private final int e;

    x1() {
    }

    x1(int i2, String str, long j2, long j3, int i3) {
        this();
        this.a = i2;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = i3;
    }

    int a() {
        return this.a;
    }

    String b() {
        return this.b;
    }

    long c() {
        return this.c;
    }

    long d() {
        return this.d;
    }

    int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x1 x1Var = (x1) obj;
            if (this.a == x1Var.a() && ((str = this.b) != null ? str.equals(x1Var.b()) : x1Var.b() == null) && this.c == x1Var.c() && this.d == x1Var.d() && this.e == x1Var.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.c;
        long j3 = this.d;
        return ((((((i2 ^ iHashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.e;
    }

    public String toString() {
        int i2 = this.a;
        String str = this.b;
        long j2 = this.c;
        long j3 = this.d;
        int i3 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i2);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j2);
        sb.append(", remainingBytes=");
        sb.append(j3);
        sb.append(", previousChunk=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
