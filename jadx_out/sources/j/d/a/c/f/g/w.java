package j.d.a.c.f.g;

/* JADX INFO: loaded from: classes.dex */
final class w extends t {
    private final v a = new v();

    w() {
    }

    @Override // j.d.a.c.f.g.t
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        this.a.a(th, true).add(th2);
    }
}
