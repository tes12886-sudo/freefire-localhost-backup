package j.d.a.c.f.h;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class e extends f0 {
    private final transient e0 c;
    private final transient b0 d;

    e(e0 e0Var, b0 b0Var) {
        this.c = e0Var;
        this.d = b0Var;
    }

    @Override // j.d.a.c.f.h.y
    final int b(Object[] objArr, int i2) {
        return this.d.b(objArr, 0);
    }

    @Override // j.d.a.c.f.h.y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@CheckForNull Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // j.d.a.c.f.h.f0, j.d.a.c.f.h.y
    public final b0 f() {
        return this.d;
    }

    @Override // j.d.a.c.f.h.y
    /* JADX INFO: renamed from: h */
    public final i iterator() {
        return this.d.listIterator(0);
    }

    @Override // j.d.a.c.f.h.y, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.size();
    }
}
