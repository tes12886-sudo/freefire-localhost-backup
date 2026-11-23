package n;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
class k implements x {
    private final InputStream a;
    private final y b;

    public k(InputStream inputStream, y yVar) {
        l.y.c.i.e(inputStream, "input");
        l.y.c.i.e(yVar, "timeout");
        this.a = inputStream;
        this.b = yVar;
    }

    @Override // n.x
    public long I(b bVar, long j2) throws IOException {
        l.y.c.i.e(bVar, "sink");
        if (j2 == 0) {
            return 0L;
        }
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(l.y.c.i.k("byteCount < 0: ", Long.valueOf(j2)).toString());
        }
        try {
            this.b.f();
            s sVarU0 = bVar.u0(1);
            int i2 = this.a.read(sVarU0.a, sVarU0.c, (int) Math.min(j2, 8192 - sVarU0.c));
            if (i2 != -1) {
                sVarU0.c += i2;
                long j3 = i2;
                bVar.q0(bVar.r0() + j3);
                return j3;
            }
            if (sVarU0.b != sVarU0.c) {
                return -1L;
            }
            bVar.a = sVarU0.b();
            t.b(sVarU0);
            return -1L;
        } catch (AssertionError e) {
            if (l.c(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // n.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // n.x
    public y d() {
        return this.b;
    }

    public String toString() {
        return "source(" + this.a + ')';
    }
}
