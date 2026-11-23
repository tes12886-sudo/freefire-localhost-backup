package m.h0.j;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import l.d0.p;
import l.d0.q;
import l.y.c.i;
import m.b0;
import m.d0;
import m.h0.i.k;
import m.n;
import m.u;
import m.z;
import n.h;
import n.v;
import n.x;
import n.y;

/* JADX INFO: loaded from: classes.dex */
public final class b implements m.h0.i.d {
    private final z a;
    private final m.h0.h.f b;
    private final n.d c;
    private final n.c d;
    private int e;
    private final m.h0.j.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u f2230g;

    private abstract class a implements x {
        private final h a;
        private boolean b;
        final /* synthetic */ b c;

        public a(b bVar) {
            i.e(bVar, "this$0");
            this.c = bVar;
            this.a = new h(bVar.c.d());
        }

        @Override // n.x
        public long I(n.b bVar, long j2) throws IOException {
            i.e(bVar, "sink");
            try {
                return this.c.c.I(bVar, j2);
            } catch (IOException e) {
                this.c.h().z();
                c();
                throw e;
            }
        }

        protected final boolean b() {
            return this.b;
        }

        public final void c() {
            if (this.c.e == 6) {
                return;
            }
            if (this.c.e != 5) {
                throw new IllegalStateException(i.k("state: ", Integer.valueOf(this.c.e)));
            }
            this.c.r(this.a);
            this.c.e = 6;
        }

        @Override // n.x
        public y d() {
            return this.a;
        }

        protected final void f(boolean z) {
            this.b = z;
        }
    }

    /* JADX INFO: renamed from: m.h0.j.b$b, reason: collision with other inner class name */
    private final class C0264b implements v {
        private final h a;
        private boolean b;
        final /* synthetic */ b c;

        public C0264b(b bVar) {
            i.e(bVar, "this$0");
            this.c = bVar;
            this.a = new h(bVar.d.d());
        }

        @Override // n.v, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c.d.R("0\r\n\r\n");
            this.c.r(this.a);
            this.c.e = 3;
        }

        @Override // n.v
        public y d() {
            return this.a;
        }

        @Override // n.v, java.io.Flushable
        public synchronized void flush() {
            if (this.b) {
                return;
            }
            this.c.d.flush();
        }

        @Override // n.v
        public void h(n.b bVar, long j2) {
            i.e(bVar, "source");
            if (!(!this.b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j2 == 0) {
                return;
            }
            this.c.d.m(j2);
            this.c.d.R("\r\n");
            this.c.d.h(bVar, j2);
            this.c.d.R("\r\n");
        }
    }

    private final class c extends a {
        private final m.v d;
        private long e;
        private boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f2231g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, m.v vVar) {
            super(bVar);
            i.e(bVar, "this$0");
            i.e(vVar, "url");
            this.f2231g = bVar;
            this.d = vVar;
            this.e = -1L;
            this.f = true;
        }

        private final void j() throws ProtocolException {
            if (this.e != -1) {
                this.f2231g.c.v();
            }
            try {
                this.e = this.f2231g.c.U();
                String string = q.u0(this.f2231g.c.v()).toString();
                if (this.e >= 0) {
                    if (!(string.length() > 0) || p.x(string, ";", false, 2, null)) {
                        if (this.e == 0) {
                            this.f = false;
                            b bVar = this.f2231g;
                            bVar.f2230g = bVar.f.a();
                            z zVar = this.f2231g.a;
                            i.c(zVar);
                            n nVarP = zVar.p();
                            m.v vVar = this.d;
                            u uVar = this.f2231g.f2230g;
                            i.c(uVar);
                            m.h0.i.e.f(nVarP, vVar, uVar);
                            c();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.e + string + '\"');
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // m.h0.j.b.a, n.x
        public long I(n.b bVar, long j2) throws IOException {
            i.e(bVar, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(i.k("byteCount < 0: ", Long.valueOf(j2)).toString());
            }
            if (!(true ^ b())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f) {
                return -1L;
            }
            long j3 = this.e;
            if (j3 == 0 || j3 == -1) {
                j();
                if (!this.f) {
                    return -1L;
                }
            }
            long jI = super.I(bVar, Math.min(j2, this.e));
            if (jI != -1) {
                this.e -= jI;
                return jI;
            }
            this.f2231g.h().z();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c();
            throw protocolException;
        }

        @Override // n.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (b()) {
                return;
            }
            if (this.f && !m.h0.d.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f2231g.h().z();
                c();
            }
            f(true);
        }
    }

    private final class d extends a {
        private long d;
        final /* synthetic */ b e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b bVar, long j2) {
            super(bVar);
            i.e(bVar, "this$0");
            this.e = bVar;
            this.d = j2;
            if (j2 == 0) {
                c();
            }
        }

        @Override // m.h0.j.b.a, n.x
        public long I(n.b bVar, long j2) throws IOException {
            i.e(bVar, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(i.k("byteCount < 0: ", Long.valueOf(j2)).toString());
            }
            if (!(true ^ b())) {
                throw new IllegalStateException("closed".toString());
            }
            long j3 = this.d;
            if (j3 == 0) {
                return -1L;
            }
            long jI = super.I(bVar, Math.min(j3, j2));
            if (jI == -1) {
                this.e.h().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c();
                throw protocolException;
            }
            long j4 = this.d - jI;
            this.d = j4;
            if (j4 == 0) {
                c();
            }
            return jI;
        }

        @Override // n.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (b()) {
                return;
            }
            if (this.d != 0 && !m.h0.d.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.e.h().z();
                c();
            }
            f(true);
        }
    }

    private final class e implements v {
        private final h a;
        private boolean b;
        final /* synthetic */ b c;

        public e(b bVar) {
            i.e(bVar, "this$0");
            this.c = bVar;
            this.a = new h(bVar.d.d());
        }

        @Override // n.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c.r(this.a);
            this.c.e = 3;
        }

        @Override // n.v
        public y d() {
            return this.a;
        }

        @Override // n.v, java.io.Flushable
        public void flush() {
            if (this.b) {
                return;
            }
            this.c.d.flush();
        }

        @Override // n.v
        public void h(n.b bVar, long j2) {
            i.e(bVar, "source");
            if (!(!this.b)) {
                throw new IllegalStateException("closed".toString());
            }
            m.h0.d.i(bVar.r0(), 0L, j2);
            this.c.d.h(bVar, j2);
        }
    }

    private final class f extends a {
        private boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b bVar) {
            super(bVar);
            i.e(bVar, "this$0");
        }

        @Override // m.h0.j.b.a, n.x
        public long I(n.b bVar, long j2) throws IOException {
            i.e(bVar, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(i.k("byteCount < 0: ", Long.valueOf(j2)).toString());
            }
            if (!(!b())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.d) {
                return -1L;
            }
            long jI = super.I(bVar, j2);
            if (jI != -1) {
                return jI;
            }
            this.d = true;
            c();
            return -1L;
        }

        @Override // n.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (b()) {
                return;
            }
            if (!this.d) {
                c();
            }
            f(true);
        }
    }

    public b(z zVar, m.h0.h.f fVar, n.d dVar, n.c cVar) {
        i.e(fVar, "connection");
        i.e(dVar, "source");
        i.e(cVar, "sink");
        this.a = zVar;
        this.b = fVar;
        this.c = dVar;
        this.d = cVar;
        this.f = new m.h0.j.a(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(h hVar) {
        y yVarI = hVar.i();
        hVar.j(y.d);
        yVarI.a();
        yVarI.b();
    }

    private final boolean s(b0 b0Var) {
        return p.l("chunked", b0Var.d("Transfer-Encoding"), true);
    }

    private final boolean t(d0 d0Var) {
        return p.l("chunked", d0.Q(d0Var, "Transfer-Encoding", null, 2, null), true);
    }

    private final v u() {
        int i2 = this.e;
        if (!(i2 == 1)) {
            throw new IllegalStateException(i.k("state: ", Integer.valueOf(i2)).toString());
        }
        this.e = 2;
        return new C0264b(this);
    }

    private final x v(m.v vVar) {
        int i2 = this.e;
        if (!(i2 == 4)) {
            throw new IllegalStateException(i.k("state: ", Integer.valueOf(i2)).toString());
        }
        this.e = 5;
        return new c(this, vVar);
    }

    private final x w(long j2) {
        int i2 = this.e;
        if (!(i2 == 4)) {
            throw new IllegalStateException(i.k("state: ", Integer.valueOf(i2)).toString());
        }
        this.e = 5;
        return new d(this, j2);
    }

    private final v x() {
        int i2 = this.e;
        if (!(i2 == 1)) {
            throw new IllegalStateException(i.k("state: ", Integer.valueOf(i2)).toString());
        }
        this.e = 2;
        return new e(this);
    }

    private final x y() {
        int i2 = this.e;
        if (!(i2 == 4)) {
            throw new IllegalStateException(i.k("state: ", Integer.valueOf(i2)).toString());
        }
        this.e = 5;
        h().z();
        return new f(this);
    }

    public final void A(u uVar, String str) {
        i.e(uVar, "headers");
        i.e(str, "requestLine");
        int i2 = this.e;
        if (!(i2 == 0)) {
            throw new IllegalStateException(i.k("state: ", Integer.valueOf(i2)).toString());
        }
        this.d.R(str).R("\r\n");
        int size = uVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.d.R(uVar.c(i3)).R(": ").R(uVar.h(i3)).R("\r\n");
        }
        this.d.R("\r\n");
        this.e = 1;
    }

    @Override // m.h0.i.d
    public void a() {
        this.d.flush();
    }

    @Override // m.h0.i.d
    public void b(b0 b0Var) {
        i.e(b0Var, "request");
        m.h0.i.i iVar = m.h0.i.i.a;
        Proxy.Type type = h().A().b().type();
        i.d(type, "connection.route().proxy.type()");
        A(b0Var.e(), iVar.a(b0Var, type));
    }

    @Override // m.h0.i.d
    public void c() {
        this.d.flush();
    }

    @Override // m.h0.i.d
    public void cancel() {
        h().e();
    }

    @Override // m.h0.i.d
    public long d(d0 d0Var) {
        i.e(d0Var, "response");
        if (!m.h0.i.e.b(d0Var)) {
            return 0L;
        }
        if (t(d0Var)) {
            return -1L;
        }
        return m.h0.d.s(d0Var);
    }

    @Override // m.h0.i.d
    public x e(d0 d0Var) {
        long jS;
        i.e(d0Var, "response");
        if (!m.h0.i.e.b(d0Var)) {
            jS = 0;
        } else {
            if (t(d0Var)) {
                return v(d0Var.f0().j());
            }
            jS = m.h0.d.s(d0Var);
            if (jS == -1) {
                return y();
            }
        }
        return w(jS);
    }

    @Override // m.h0.i.d
    public v f(b0 b0Var, long j2) throws ProtocolException {
        i.e(b0Var, "request");
        if (b0Var.a() != null && b0Var.a().f()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(b0Var)) {
            return u();
        }
        if (j2 != -1) {
            return x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // m.h0.i.d
    public d0.a g(boolean z) {
        int i2 = this.e;
        boolean z2 = true;
        if (i2 != 1 && i2 != 3) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalStateException(i.k("state: ", Integer.valueOf(i2)).toString());
        }
        try {
            k kVarA = k.d.a(this.f.b());
            d0.a aVar = new d0.a();
            aVar.q(kVarA.a);
            aVar.g(kVarA.b);
            aVar.n(kVarA.c);
            aVar.l(this.f.a());
            if (z && kVarA.b == 100) {
                return null;
            }
            if (kVarA.b == 100) {
                this.e = 3;
                return aVar;
            }
            this.e = 4;
            return aVar;
        } catch (EOFException e2) {
            throw new IOException(i.k("unexpected end of stream on ", h().A().a().l().s()), e2);
        }
    }

    @Override // m.h0.i.d
    public m.h0.h.f h() {
        return this.b;
    }

    public final void z(d0 d0Var) {
        i.e(d0Var, "response");
        long jS = m.h0.d.s(d0Var);
        if (jS == -1) {
            return;
        }
        x xVarW = w(jS);
        m.h0.d.K(xVarW, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        xVarW.close();
    }
}
