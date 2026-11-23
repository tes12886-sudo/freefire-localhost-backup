package j.d.a.c.f.h;

/* JADX INFO: loaded from: classes.dex */
final class z extends v {
    private final b0 c;

    z(b0 b0Var, int i2) {
        super(b0Var.size(), i2);
        this.c = b0Var;
    }

    @Override // j.d.a.c.f.h.v
    protected final Object a(int i2) {
        return this.c.get(i2);
    }
}
