package j.d.a.c.f.h;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes.dex */
final class c extends b0 {
    final /* synthetic */ d c;

    c(d dVar) {
        this.c = dVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        t.a(i2, this.c.e, "index");
        d dVar = this.c;
        int i3 = i2 + i2;
        Object obj = dVar.d[i3];
        obj.getClass();
        Object obj2 = dVar.d[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // j.d.a.c.f.h.y
    public final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
