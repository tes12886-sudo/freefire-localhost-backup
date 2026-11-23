package j.d.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k implements Iterable<k> {
    private final List<k> a = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof h) && ((h) obj).a.equals(this.a));
    }

    @Override // j.d.d.k
    public String f() {
        if (this.a.size() == 1) {
            return this.a.get(0).f();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<k> iterator() {
        return this.a.iterator();
    }

    public void q(k kVar) {
        if (kVar == null) {
            kVar = m.a;
        }
        this.a.add(kVar);
    }
}
