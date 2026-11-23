package j.d.a.d.a.b;

/* JADX INFO: loaded from: classes.dex */
final class a0 extends x {
    private final z a = new z();

    a0() {
    }

    @Override // j.d.a.d.a.b.x
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.a.a(th).add(th2);
    }
}
