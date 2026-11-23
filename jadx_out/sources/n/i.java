package n;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class i implements x {
    private byte a;
    private final r b;
    private final Inflater c;
    private final j d;
    private final CRC32 e;

    public i(x xVar) {
        l.y.c.i.e(xVar, "source");
        r rVar = new r(xVar);
        this.b = rVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new j(rVar, inflater);
        this.e = new CRC32();
    }

    private final void b(String str, int i2, int i3) throws IOException {
        if (i3 == i2) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3));
        l.y.c.i.d(str2, "java.lang.String.format(this, *args)");
        throw new IOException(str2);
    }

    private final void c() throws IOException {
        this.b.P(10L);
        byte bD0 = this.b.b.d0(3L);
        boolean z = ((bD0 >> 1) & 1) == 1;
        if (z) {
            j(this.b.b, 0L, 10L);
        }
        b("ID1ID2", 8075, this.b.readShort());
        this.b.skip(8L);
        if (((bD0 >> 2) & 1) == 1) {
            this.b.P(2L);
            if (z) {
                j(this.b.b, 0L, 2L);
            }
            long jM0 = this.b.b.m0();
            this.b.P(jM0);
            if (z) {
                j(this.b.b, 0L, jM0);
            }
            this.b.skip(jM0);
        }
        if (((bD0 >> 3) & 1) == 1) {
            long jB = this.b.b((byte) 0);
            if (jB == -1) {
                throw new EOFException();
            }
            if (z) {
                j(this.b.b, 0L, jB + 1);
            }
            this.b.skip(jB + 1);
        }
        if (((bD0 >> 4) & 1) == 1) {
            long jB2 = this.b.b((byte) 0);
            if (jB2 == -1) {
                throw new EOFException();
            }
            if (z) {
                j(this.b.b, 0L, jB2 + 1);
            }
            this.b.skip(jB2 + 1);
        }
        if (z) {
            b("FHCRC", this.b.f(), (short) this.e.getValue());
            this.e.reset();
        }
    }

    private final void f() throws IOException {
        b("CRC", this.b.w(), (int) this.e.getValue());
        b("ISIZE", this.b.w(), (int) this.c.getBytesWritten());
    }

    private final void j(b bVar, long j2, long j3) {
        s sVar = bVar.a;
        while (true) {
            l.y.c.i.c(sVar);
            int i2 = sVar.c;
            int i3 = sVar.b;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= (long) (i2 - i3);
            sVar = sVar.f;
        }
        while (j3 > 0) {
            int i4 = (int) (((long) sVar.b) + j2);
            int iMin = (int) Math.min(sVar.c - i4, j3);
            this.e.update(sVar.a, i4, iMin);
            j3 -= (long) iMin;
            sVar = sVar.f;
            l.y.c.i.c(sVar);
            j2 = 0;
        }
    }

    @Override // n.x
    public long I(b bVar, long j2) throws IOException {
        l.y.c.i.e(bVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(l.y.c.i.k("byteCount < 0: ", Long.valueOf(j2)).toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        if (this.a == 0) {
            c();
            this.a = (byte) 1;
        }
        if (this.a == 1) {
            long jR0 = bVar.r0();
            long jI = this.d.I(bVar, j2);
            if (jI != -1) {
                j(bVar, jR0, jI);
                return jI;
            }
            this.a = (byte) 2;
        }
        if (this.a == 2) {
            f();
            this.a = (byte) 3;
            if (!this.b.z()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // n.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }

    @Override // n.x
    public y d() {
        return this.b.d();
    }
}
