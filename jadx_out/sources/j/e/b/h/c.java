package j.e.b.h;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final String a;
    public final long b;
    public final List<String> c;

    public c(String str, long j2, List<String> list) {
        this.a = str;
        this.b = j2;
        this.c = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a.equals(cVar.a) && this.b == cVar.b) {
            return this.c.equals(cVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int iIntValue = Integer.valueOf(this.a).intValue() * 31;
        long j2 = this.b;
        return ((iIntValue + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "AccessTokenVerificationResult{expiresInMillis=" + this.b + ", channelId=" + this.a + ", permissions=" + this.c + '}';
    }
}
