package j.e.b.h;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final e a;
    public final List<String> b;

    public f(e eVar, List<String> list) {
        this.a = eVar;
        this.b = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a.equals(fVar.a)) {
            return this.b.equals(fVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "IssueAccessTokenResult{accessToken=" + ((Object) "#####") + ", permissions=" + this.b + '}';
    }
}
