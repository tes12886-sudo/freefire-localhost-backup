package j.d.e.i.b;

/* JADX INFO: loaded from: classes.dex */
abstract class g {
    static final g b = new e(null, 0, 0);
    private final g a;

    g(g gVar) {
        this.a = gVar;
    }

    final g a(int i2, int i3) {
        return new e(this, i2, i3);
    }

    final g b(int i2, int i3) {
        return new b(this, i2, i3);
    }

    abstract void c(j.d.e.j.a aVar, byte[] bArr);

    final g d() {
        return this.a;
    }
}
