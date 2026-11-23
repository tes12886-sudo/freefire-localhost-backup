package j.d.d;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n extends k {
    private final j.d.d.z.h<String, k> a = new j.d.d.z.h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof n) && ((n) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void q(String str, k kVar) {
        j.d.d.z.h<String, k> hVar = this.a;
        if (kVar == null) {
            kVar = m.a;
        }
        hVar.put(str, kVar);
    }

    public void r(String str, String str2) {
        q(str, str2 == null ? m.a : new p(str2));
    }

    public Set<Map.Entry<String, k>> s() {
        return this.a.entrySet();
    }

    public k t(String str) {
        return this.a.get(str);
    }

    public p u(String str) {
        return (p) this.a.get(str);
    }
}
