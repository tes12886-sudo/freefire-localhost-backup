package j.d.a.c.f.h;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class d extends f0 {
    private final transient e0 c;
    private final transient Object[] d;
    private final transient int e;

    d(e0 e0Var, Object[] objArr, int i2, int i3) {
        this.c = e0Var;
        this.d = objArr;
        this.e = i3;
    }

    @Override // j.d.a.c.f.h.y
    final int b(Object[] objArr, int i2) {
        return f().b(objArr, 0);
    }

    @Override // j.d.a.c.f.h.y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // j.d.a.c.f.h.y
    /* JADX INFO: renamed from: h */
    public final i iterator() {
        return f().listIterator(0);
    }

    @Override // j.d.a.c.f.h.y, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // j.d.a.c.f.h.f0
    final b0 n() {
        return new c(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }
}
