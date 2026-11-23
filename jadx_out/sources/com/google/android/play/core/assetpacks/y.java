package com.google.android.play.core.assetpacks;

/* JADX INFO: loaded from: classes.dex */
final class y extends b {
    private final int a;
    private final String b;
    private final String c;

    y(int i2, String str, String str2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final String a() {
        return this.c;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final int c() {
        return this.a;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.c() && ((str = this.b) != null ? str.equals(bVar.d()) : bVar.d() == null)) {
                String str2 = this.c;
                String strA = bVar.a();
                if (str2 != null ? str2.equals(strA) : strA == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i2 = this.a;
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i2);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
