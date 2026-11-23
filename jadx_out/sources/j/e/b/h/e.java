package j.e.b.h;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final String a;
    public final long b;
    public final long c;
    public final String d;

    public e(String str, long j2, long j3, String str2) {
        this.a = str;
        this.b = j2;
        this.c = j3;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.b == eVar.b && this.c == eVar.c && this.a.equals(eVar.a)) {
            return this.d.equals(eVar.d);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j2 = this.b;
        int i2 = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        return ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "InternalAccessToken{accessToken='#####', expiresInMillis=" + this.b + ", issuedClientTimeMillis=" + this.c + ", refreshToken='" + this.d + "'}";
    }
}
