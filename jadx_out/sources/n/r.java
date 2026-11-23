package n;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class r implements d {
    public final x a;
    public final b b;
    public boolean c;

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            r rVar = r.this;
            if (rVar.c) {
                throw new IOException("closed");
            }
            return (int) Math.min(rVar.b.r0(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            r.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            r rVar = r.this;
            if (rVar.c) {
                throw new IOException("closed");
            }
            if (rVar.b.r0() == 0) {
                r rVar2 = r.this;
                if (rVar2.a.I(rVar2.b, 8192L) == -1) {
                    return -1;
                }
            }
            return r.this.b.readByte() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            l.y.c.i.e(bArr, "data");
            if (r.this.c) {
                throw new IOException("closed");
            }
            c0.b(bArr.length, i2, i3);
            if (r.this.b.r0() == 0) {
                r rVar = r.this;
                if (rVar.a.I(rVar.b, 8192L) == -1) {
                    return -1;
                }
            }
            return r.this.b.read(bArr, i2, i3);
        }

        public String toString() {
            return r.this + ".inputStream()";
        }
    }

    public r(x xVar) {
        l.y.c.i.e(xVar, "source");
        this.a = xVar;
        this.b = new b();
    }

    @Override // n.d
    public byte[] B(long j2) throws EOFException {
        P(j2);
        return this.b.B(j2);
    }

    @Override // n.x
    public long I(b bVar, long j2) {
        l.y.c.i.e(bVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(l.y.c.i.k("byteCount < 0: ", Long.valueOf(j2)).toString());
        }
        if (!(true ^ this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.b.r0() == 0 && this.a.I(this.b, 8192L) == -1) {
            return -1L;
        }
        return this.b.I(bVar, Math.min(j2, this.b.r0()));
    }

    @Override // n.d
    public long J() throws EOFException {
        P(8L);
        return this.b.J();
    }

    @Override // n.d
    public String K(long j2) throws EOFException {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(l.y.c.i.k("limit < 0: ", Long.valueOf(j2)).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        byte b = (byte) 10;
        long jC = c(b, 0L, j3);
        if (jC != -1) {
            return n.d0.a.b(this.b, jC);
        }
        if (j3 < Long.MAX_VALUE && q(j3) && this.b.d0(j3 - 1) == ((byte) 13) && q(1 + j3) && this.b.d0(j3) == b) {
            return n.d0.a.b(this.b, j3);
        }
        b bVar = new b();
        b bVar2 = this.b;
        bVar2.c0(bVar, 0L, Math.min(32, bVar2.r0()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b.r0(), j2) + " content=" + bVar.j0().j() + (char) 8230);
    }

    @Override // n.d
    public long L(v vVar) {
        b bVar;
        l.y.c.i.e(vVar, "sink");
        long j2 = 0;
        while (true) {
            long jI = this.a.I(this.b, 8192L);
            bVar = this.b;
            if (jI == -1) {
                break;
            }
            long jA0 = bVar.a0();
            if (jA0 > 0) {
                j2 += jA0;
                vVar.h(this.b, jA0);
            }
        }
        if (bVar.r0() <= 0) {
            return j2;
        }
        long jR0 = j2 + this.b.r0();
        b bVar2 = this.b;
        vVar.h(bVar2, bVar2.r0());
        return jR0;
    }

    @Override // n.d
    public void P(long j2) throws EOFException {
        if (!q(j2)) {
            throw new EOFException();
        }
    }

    @Override // n.d
    public long U() throws EOFException {
        P(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!q(i3)) {
                break;
            }
            byte bD0 = this.b.d0(i2);
            if ((bD0 < ((byte) 48) || bD0 > ((byte) 57)) && ((bD0 < ((byte) 97) || bD0 > ((byte) 102)) && (bD0 < ((byte) 65) || bD0 > ((byte) 70)))) {
                if (i2 != 0) {
                    break;
                }
                l.d0.a.a(16);
                l.d0.a.a(16);
                String string = Integer.toString(bD0, 16);
                l.y.c.i.d(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                throw new NumberFormatException(l.y.c.i.k("Expected leading [0-9a-fA-F] character but was 0x", string));
            }
            i2 = i3;
        }
        return this.b.U();
    }

    @Override // n.d
    public String V(Charset charset) {
        l.y.c.i.e(charset, "charset");
        this.b.y0(this.a);
        return this.b.V(charset);
    }

    @Override // n.d
    public InputStream W() {
        return new a();
    }

    @Override // n.d
    public int X(o oVar) throws EOFException {
        l.y.c.i.e(oVar, "options");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iC = n.d0.a.c(this.b, oVar, true);
            if (iC != -2) {
                if (iC == -1) {
                    break;
                }
                this.b.skip(oVar.f()[iC].t());
                return iC;
            }
        } while (this.a.I(this.b, 8192L) != -1);
        return -1;
    }

    @Override // n.d, n.c
    public b a() {
        return this.b;
    }

    public long b(byte b) {
        return c(b, 0L, Long.MAX_VALUE);
    }

    public long c(byte b, long j2, long j3) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j2 && j2 <= j3)) {
            throw new IllegalArgumentException(("fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        while (j2 < j3) {
            long jE0 = this.b.e0(b, j2, j3);
            if (jE0 != -1) {
                return jE0;
            }
            long jR0 = this.b.r0();
            if (jR0 >= j3 || this.a.I(this.b, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, jR0);
        }
        return -1L;
    }

    @Override // n.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.Y();
    }

    @Override // n.x
    public y d() {
        return this.a.d();
    }

    public short f() throws EOFException {
        P(2L);
        return this.b.m0();
    }

    @Override // n.d
    public String i(long j2) throws EOFException {
        P(j2);
        return this.b.i(j2);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // n.d
    public b n() {
        return this.b;
    }

    @Override // n.d
    public e o(long j2) throws EOFException {
        P(j2);
        return this.b.o(j2);
    }

    @Override // n.d
    public boolean q(long j2) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(l.y.c.i.k("byteCount < 0: ", Long.valueOf(j2)).toString());
        }
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.b.r0() < j2) {
            if (this.a.I(this.b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        l.y.c.i.e(byteBuffer, "sink");
        if (this.b.r0() == 0 && this.a.I(this.b, 8192L) == -1) {
            return -1;
        }
        return this.b.read(byteBuffer);
    }

    @Override // n.d
    public byte readByte() throws EOFException {
        P(1L);
        return this.b.readByte();
    }

    @Override // n.d
    public int readInt() throws EOFException {
        P(4L);
        return this.b.readInt();
    }

    @Override // n.d
    public short readShort() throws EOFException {
        P(2L);
        return this.b.readShort();
    }

    @Override // n.d
    public void skip(long j2) throws EOFException {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j2 > 0) {
            if (this.b.r0() == 0 && this.a.I(this.b, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j2, this.b.r0());
            this.b.skip(jMin);
            j2 -= jMin;
        }
    }

    public String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // n.d
    public String v() {
        return K(Long.MAX_VALUE);
    }

    @Override // n.d
    public int w() throws EOFException {
        P(4L);
        return this.b.w();
    }

    @Override // n.d
    public boolean z() {
        if (!this.c) {
            return this.b.z() && this.a.I(this.b, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }
}
