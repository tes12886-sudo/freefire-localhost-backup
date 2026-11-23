package j.e.b.h;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final String a;
    public final long b;
    public final String c;

    public h(String str, long j2, String str2) {
        this.a = str;
        this.b = j2;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.b != hVar.b || !this.a.equals(hVar.a)) {
                return false;
            }
            String str = this.c;
            String str2 = hVar.c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j2 = this.b;
        int i2 = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.c;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RefreshTokenResult{accessToken='#####', expiresInMillis=" + this.b + ", refreshToken='#####'}";
    }
}
