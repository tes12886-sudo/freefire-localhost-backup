package j.d.a.c.f.h;

/* JADX INFO: loaded from: classes.dex */
final class b extends b0 {
    static final b0 e = new b(new Object[0], 0);
    final transient Object[] c;
    private final transient int d;

    b(Object[] objArr, int i2) {
        this.c = objArr;
        this.d = i2;
    }

    @Override // j.d.a.c.f.h.b0, j.d.a.c.f.h.y
    final int b(Object[] objArr, int i2) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
        return this.d;
    }

    @Override // j.d.a.c.f.h.y
    final int c() {
        return this.d;
    }

    @Override // j.d.a.c.f.h.y
    final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        t.a(i2, this.d, "index");
        Object obj = this.c[i2];
        obj.getClass();
        return obj;
    }

    @Override // j.d.a.c.f.h.y
    final boolean j() {
        return false;
    }

    @Override // j.d.a.c.f.h.y
    final Object[] l() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
