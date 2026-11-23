package j.d.a.d.a.b;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class w extends v {
    private final v a;
    private final long b;
    private final long c;

    public w(v vVar, long j2, long j3) {
        this.a = vVar;
        long j4 = j(j2);
        this.b = j4;
        this.c = j(j4 + j3);
    }

    private final long j(long j2) {
        if (j2 < 0) {
            return 0L;
        }
        return j2 > this.a.b() ? this.a.b() : j2;
    }

    @Override // j.d.a.d.a.b.v
    public final long b() {
        return this.c - this.b;
    }

    @Override // j.d.a.d.a.b.v
    protected final InputStream c(long j2, long j3) {
        long j4 = j(this.b);
        return this.a.c(j4, j(j3 + j4) - j4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
