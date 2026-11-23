package n;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class q implements c {
    public final v a;
    public final b b;
    public boolean c;

    public q(v vVar) {
        l.y.c.i.e(vVar, "sink");
        this.a = vVar;
        this.b = new b();
    }

    @Override // n.c
    public c A(int i2) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.z0(i2);
        b();
        return this;
    }

    @Override // n.c
    public c E(byte[] bArr) {
        l.y.c.i.e(bArr, "source");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.w0(bArr);
        b();
        return this;
    }

    @Override // n.c
    public c G(e eVar) {
        l.y.c.i.e(eVar, "byteString");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.v0(eVar);
        b();
        return this;
    }

    @Override // n.c
    public c R(String str) {
        l.y.c.i.e(str, "string");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.I0(str);
        b();
        return this;
    }

    @Override // n.c
    public c S(long j2) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.A0(j2);
        b();
        return this;
    }

    @Override // n.c
    public b a() {
        return this.b;
    }

    public c b() {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        long jA0 = this.b.a0();
        if (jA0 > 0) {
            this.a.h(this.b, jA0);
        }
        return this;
    }

    @Override // n.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.c) {
            return;
        }
        Throwable th = null;
        try {
            if (this.b.r0() > 0) {
                v vVar = this.a;
                b bVar = this.b;
                vVar.h(bVar, bVar.r0());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // n.v
    public y d() {
        return this.a.d();
    }

    @Override // n.c
    public c e(byte[] bArr, int i2, int i3) {
        l.y.c.i.e(bArr, "source");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.x0(bArr, i2, i3);
        b();
        return this;
    }

    @Override // n.c, n.v, java.io.Flushable
    public void flush() {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.b.r0() > 0) {
            v vVar = this.a;
            b bVar = this.b;
            vVar.h(bVar, bVar.r0());
        }
        this.a.flush();
    }

    @Override // n.v
    public void h(b bVar, long j2) {
        l.y.c.i.e(bVar, "source");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.h(bVar, j2);
        b();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // n.c
    public c m(long j2) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.B0(j2);
        b();
        return this;
    }

    @Override // n.c
    public c p(int i2) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.G0(i2);
        b();
        return this;
    }

    @Override // n.c
    public c r(int i2) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.C0(i2);
        b();
        return this;
    }

    @Override // n.c
    public c t(long j2) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.F0(j2);
        b();
        return this;
    }

    public String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        l.y.c.i.e(byteBuffer, "source");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.b.write(byteBuffer);
        b();
        return iWrite;
    }

    @Override // n.c
    public c y(int i2) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.b.D0(i2);
        b();
        return this;
    }
}
