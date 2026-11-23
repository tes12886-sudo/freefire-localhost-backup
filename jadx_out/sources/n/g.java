package n;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements x {
    private final x a;

    public g(x xVar) {
        l.y.c.i.e(xVar, "delegate");
        this.a = xVar;
    }

    @Override // n.x
    public long I(b bVar, long j2) {
        l.y.c.i.e(bVar, "sink");
        return this.a.I(bVar, j2);
    }

    public final x b() {
        return this.a;
    }

    @Override // n.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // n.x
    public y d() {
        return this.a.d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('(');
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
