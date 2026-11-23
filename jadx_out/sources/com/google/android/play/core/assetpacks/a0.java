package com.google.android.play.core.assetpacks;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class a0 extends c {
    private final long a;
    private final Map<String, AssetPackState> b;

    a0(long j2, Map<String, AssetPackState> map) {
        this.a = j2;
        this.b = map;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final Map<String, AssetPackState> e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.a == cVar.f() && this.b.equals(cVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final long f() {
        return this.a;
    }

    public final int hashCode() {
        long j2 = this.a;
        return this.b.hashCode() ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j2 = this.a;
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j2);
        sb.append(", packStates=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
