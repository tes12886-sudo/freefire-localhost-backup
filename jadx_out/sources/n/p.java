package n;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
final class p implements v {
    private final OutputStream a;
    private final y b;

    public p(OutputStream outputStream, y yVar) {
        l.y.c.i.e(outputStream, "out");
        l.y.c.i.e(yVar, "timeout");
        this.a = outputStream;
        this.b = yVar;
    }

    @Override // n.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // n.v
    public y d() {
        return this.b;
    }

    @Override // n.v, java.io.Flushable
    public void flush() throws IOException {
        this.a.flush();
    }

    @Override // n.v
    public void h(b bVar, long j2) throws IOException {
        l.y.c.i.e(bVar, "source");
        c0.b(bVar.r0(), 0L, j2);
        while (j2 > 0) {
            this.b.f();
            s sVar = bVar.a;
            l.y.c.i.c(sVar);
            int iMin = (int) Math.min(j2, sVar.c - sVar.b);
            this.a.write(sVar.a, sVar.b, iMin);
            sVar.b += iMin;
            long j3 = iMin;
            j2 -= j3;
            bVar.q0(bVar.r0() - j3);
            if (sVar.b == sVar.c) {
                bVar.a = sVar.b();
                t.b(sVar);
            }
        }
    }

    public String toString() {
        return "sink(" + this.a + ')';
    }
}
