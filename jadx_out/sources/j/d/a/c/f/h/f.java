package j.d.a.c.f.h;

/* JADX INFO: loaded from: classes.dex */
final class f extends b0 {
    private final transient Object[] c;
    private final transient int d;
    private final transient int e;

    f(Object[] objArr, int i2, int i3) {
        this.c = objArr;
        this.d = i2;
        this.e = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        t.a(i2, this.e, "index");
        Object obj = this.c[i2 + i2 + this.d];
        obj.getClass();
        return obj;
    }

    @Override // j.d.a.c.f.h.y
    final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
