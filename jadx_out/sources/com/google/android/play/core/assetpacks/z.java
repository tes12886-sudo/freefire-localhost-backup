package com.google.android.play.core.assetpacks;

/* JADX INFO: loaded from: classes.dex */
final class z extends AssetPackState {
    private final String a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1354g;

    z(String str, int i2, int i3, long j2, long j3, int i4, int i5) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = j2;
        this.e = j3;
        this.f = i4;
        this.f1354g = i5;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int a() {
        return this.f1354g;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long c() {
        return this.d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.a.equals(assetPackState.f()) && this.b == assetPackState.g() && this.c == assetPackState.e() && this.d == assetPackState.c() && this.e == assetPackState.h() && this.f == assetPackState.i() && this.f1354g == assetPackState.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String f() {
        return this.a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int g() {
        return this.b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        int i2 = this.b;
        int i3 = this.c;
        long j2 = this.d;
        long j3 = this.e;
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f) * 1000003) ^ this.f1354g;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int i() {
        return this.f;
    }

    public final String toString() {
        String str = this.a;
        int i2 = this.b;
        int i3 = this.c;
        long j2 = this.d;
        long j3 = this.e;
        int i4 = this.f;
        int i5 = this.f1354g;
        StringBuilder sb = new StringBuilder(str.length() + 217);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", transferProgressPercentage=");
        sb.append(i4);
        sb.append(", updateAvailability=");
        sb.append(i5);
        sb.append("}");
        return sb.toString();
    }
}
