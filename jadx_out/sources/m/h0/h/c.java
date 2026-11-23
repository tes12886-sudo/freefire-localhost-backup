package m.h0.h;

import java.io.IOException;
import java.net.ProtocolException;
import m.b0;
import m.c0;
import m.d0;
import m.e0;
import m.r;
import n.l;
import n.v;
import n.x;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final e a;
    private final r b;
    private final d c;
    private final m.h0.i.d d;
    private boolean e;
    private final f f;

    private final class a extends n.f {
        private final long b;
        private boolean c;
        private long d;
        private boolean e;
        final /* synthetic */ c f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, v vVar, long j2) {
            super(vVar);
            l.y.c.i.e(cVar, "this$0");
            l.y.c.i.e(vVar, "delegate");
            this.f = cVar;
            this.b = j2;
        }

        private final <E extends IOException> E b(E e) {
            if (this.c) {
                return e;
            }
            this.c = true;
            return (E) this.f.a(this.d, false, true, e);
        }

        @Override // n.f, n.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.e) {
                return;
            }
            this.e = true;
            long j2 = this.b;
            if (j2 != -1 && this.d != j2) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                b(null);
            } catch (IOException e) {
                throw b(e);
            }
        }

        @Override // n.f, n.v, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw b(e);
            }
        }

        @Override // n.f, n.v
        public void h(n.b bVar, long j2) throws IOException {
            l.y.c.i.e(bVar, "source");
            if (!(!this.e)) {
                throw new IllegalStateException("closed".toString());
            }
            long j3 = this.b;
            if (j3 == -1 || this.d + j2 <= j3) {
                try {
                    super.h(bVar, j2);
                    this.d += j2;
                    return;
                } catch (IOException e) {
                    throw b(e);
                }
            }
            throw new ProtocolException("expected " + this.b + " bytes but received " + (this.d + j2));
        }
    }

    public final class b extends n.g {
        private final long b;
        private long c;
        private boolean d;
        private boolean e;
        private boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f2200g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, x xVar, long j2) {
            super(xVar);
            l.y.c.i.e(cVar, "this$0");
            l.y.c.i.e(xVar, "delegate");
            this.f2200g = cVar;
            this.b = j2;
            this.d = true;
            if (j2 == 0) {
                c(null);
            }
        }

        @Override // n.g, n.x
        public long I(n.b bVar, long j2) throws IOException {
            l.y.c.i.e(bVar, "sink");
            if (!(!this.f)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long jI = b().I(bVar, j2);
                if (this.d) {
                    this.d = false;
                    this.f2200g.i().w(this.f2200g.g());
                }
                if (jI == -1) {
                    c(null);
                    return -1L;
                }
                long j3 = this.c + jI;
                long j4 = this.b;
                if (j4 != -1 && j3 > j4) {
                    throw new ProtocolException("expected " + this.b + " bytes but received " + j3);
                }
                this.c = j3;
                if (j3 == j4) {
                    c(null);
                }
                return jI;
            } catch (IOException e) {
                throw c(e);
            }
        }

        public final <E extends IOException> E c(E e) {
            if (this.e) {
                return e;
            }
            this.e = true;
            if (e == null && this.d) {
                this.d = false;
                this.f2200g.i().w(this.f2200g.g());
            }
            return (E) this.f2200g.a(this.c, true, false, e);
        }

        @Override // n.g, n.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f) {
                return;
            }
            this.f = true;
            try {
                super.close();
                c(null);
            } catch (IOException e) {
                throw c(e);
            }
        }
    }

    public c(e eVar, r rVar, d dVar, m.h0.i.d dVar2) {
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(rVar, "eventListener");
        l.y.c.i.e(dVar, "finder");
        l.y.c.i.e(dVar2, "codec");
        this.a = eVar;
        this.b = rVar;
        this.c = dVar;
        this.d = dVar2;
        this.f = dVar2.h();
    }

    private final void s(IOException iOException) {
        this.c.h(iOException);
        this.d.h().H(this.a, iOException);
    }

    public final <E extends IOException> E a(long j2, boolean z, boolean z2, E e) {
        if (e != null) {
            s(e);
        }
        if (z2) {
            r rVar = this.b;
            e eVar = this.a;
            if (e != null) {
                rVar.s(eVar, e);
            } else {
                rVar.q(eVar, j2);
            }
        }
        if (z) {
            if (e != null) {
                this.b.x(this.a, e);
            } else {
                this.b.v(this.a, j2);
            }
        }
        return (E) this.a.x(this, z2, z, e);
    }

    public final void b() {
        this.d.cancel();
    }

    public final v c(b0 b0Var, boolean z) {
        l.y.c.i.e(b0Var, "request");
        this.e = z;
        c0 c0VarA = b0Var.a();
        l.y.c.i.c(c0VarA);
        long jA = c0VarA.a();
        this.b.r(this.a);
        return new a(this, this.d.f(b0Var, jA), jA);
    }

    public final void d() {
        this.d.cancel();
        this.a.x(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.d.a();
        } catch (IOException e) {
            this.b.s(this.a, e);
            s(e);
            throw e;
        }
    }

    public final void f() throws IOException {
        try {
            this.d.c();
        } catch (IOException e) {
            this.b.s(this.a, e);
            s(e);
            throw e;
        }
    }

    public final e g() {
        return this.a;
    }

    public final f h() {
        return this.f;
    }

    public final r i() {
        return this.b;
    }

    public final d j() {
        return this.c;
    }

    public final boolean k() {
        return !l.y.c.i.a(this.c.d().l().i(), this.f.A().a().l().i());
    }

    public final boolean l() {
        return this.e;
    }

    public final void m() {
        this.d.h().z();
    }

    public final void n() {
        this.a.x(this, true, false, null);
    }

    public final e0 o(d0 d0Var) throws IOException {
        l.y.c.i.e(d0Var, "response");
        try {
            String strQ = d0.Q(d0Var, "Content-Type", null, 2, null);
            long jD = this.d.d(d0Var);
            return new m.h0.i.h(strQ, jD, l.b(new b(this, this.d.e(d0Var), jD)));
        } catch (IOException e) {
            this.b.x(this.a, e);
            s(e);
            throw e;
        }
    }

    public final d0.a p(boolean z) throws IOException {
        try {
            d0.a aVarG = this.d.g(z);
            if (aVarG != null) {
                aVarG.m(this);
            }
            return aVarG;
        } catch (IOException e) {
            this.b.x(this.a, e);
            s(e);
            throw e;
        }
    }

    public final void q(d0 d0Var) {
        l.y.c.i.e(d0Var, "response");
        this.b.y(this.a, d0Var);
    }

    public final void r() {
        this.b.z(this.a);
    }

    public final void t(b0 b0Var) throws IOException {
        l.y.c.i.e(b0Var, "request");
        try {
            this.b.u(this.a);
            this.d.b(b0Var);
            this.b.t(this.a, b0Var);
        } catch (IOException e) {
            this.b.s(this.a, e);
            s(e);
            throw e;
        }
    }
}
