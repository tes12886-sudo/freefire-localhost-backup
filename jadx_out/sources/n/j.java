package n;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class j implements x {
    private final d a;
    private final Inflater b;
    private int c;
    private boolean d;

    public j(d dVar, Inflater inflater) {
        l.y.c.i.e(dVar, "source");
        l.y.c.i.e(inflater, "inflater");
        this.a = dVar;
        this.b = inflater;
    }

    private final void f() {
        int i2 = this.c;
        if (i2 == 0) {
            return;
        }
        int remaining = i2 - this.b.getRemaining();
        this.c -= remaining;
        this.a.skip(remaining);
    }

    @Override // n.x
    public long I(b bVar, long j2) throws IOException {
        l.y.c.i.e(bVar, "sink");
        do {
            long jB = b(bVar, j2);
            if (jB > 0) {
                return jB;
            }
            if (this.b.finished() || this.b.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.z());
        throw new EOFException("source exhausted prematurely");
    }

    public final long b(b bVar, long j2) throws IOException {
        l.y.c.i.e(bVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(l.y.c.i.k("byteCount < 0: ", Long.valueOf(j2)).toString());
        }
        if (!(!this.d)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        try {
            s sVarU0 = bVar.u0(1);
            int iMin = (int) Math.min(j2, 8192 - sVarU0.c);
            c();
            int iInflate = this.b.inflate(sVarU0.a, sVarU0.c, iMin);
            f();
            if (iInflate > 0) {
                sVarU0.c += iInflate;
                long j3 = iInflate;
                bVar.q0(bVar.r0() + j3);
                return j3;
            }
            if (sVarU0.b == sVarU0.c) {
                bVar.a = sVarU0.b();
                t.b(sVarU0);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    public final boolean c() {
        if (!this.b.needsInput()) {
            return false;
        }
        if (this.a.z()) {
            return true;
        }
        s sVar = this.a.a().a;
        l.y.c.i.c(sVar);
        int i2 = sVar.c;
        int i3 = sVar.b;
        int i4 = i2 - i3;
        this.c = i4;
        this.b.setInput(sVar.a, i3, i4);
        return false;
    }

    @Override // n.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // n.x
    public y d() {
        return this.a.d();
    }
}
