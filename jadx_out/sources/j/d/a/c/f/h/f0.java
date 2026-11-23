package j.d.a.c.f.h;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends y implements Set {

    @CheckForNull
    private transient b0 b;

    f0() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // j.d.a.c.f.h.y
    public b0 f() {
        b0 b0Var = this.b;
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0VarN = n();
        this.b = b0VarN;
        return b0VarN;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return h.a(this);
    }

    b0 n() {
        return b0.q(toArray());
    }
}
