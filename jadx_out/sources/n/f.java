package n;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements v {
    private final v a;

    public f(v vVar) {
        l.y.c.i.e(vVar, "delegate");
        this.a = vVar;
    }

    @Override // n.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // n.v
    public y d() {
        return this.a.d();
    }

    @Override // n.v, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // n.v
    public void h(b bVar, long j2) {
        l.y.c.i.e(bVar, "source");
        this.a.h(bVar, j2);
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
