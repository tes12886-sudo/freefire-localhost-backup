package m.h0.k;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import l.s;
import m.u;
import n.v;
import n.x;
import n.y;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    private final int a;
    private final f b;
    private long c;
    private long d;
    private long e;
    private long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<u> f2276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f2278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f2279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c f2280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c f2281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private m.h0.k.b f2282m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IOException f2283n;

    public final class a implements v {
        private boolean a;
        private final n.b b;
        private u c;
        private boolean d;
        final /* synthetic */ i e;

        public a(i iVar, boolean z) {
            l.y.c.i.e(iVar, "this$0");
            this.e = iVar;
            this.a = z;
            this.b = new n.b();
        }

        private final void b(boolean z) throws IOException {
            long jMin;
            boolean z2;
            i iVar = this.e;
            synchronized (iVar) {
                iVar.s().t();
                while (iVar.r() >= iVar.q() && !f() && !c() && iVar.h() == null) {
                    try {
                        iVar.F();
                    } catch (Throwable th) {
                        iVar.s().A();
                        throw th;
                    }
                }
                iVar.s().A();
                iVar.c();
                jMin = Math.min(iVar.q() - iVar.r(), this.b.r0());
                iVar.D(iVar.r() + jMin);
                z2 = z && jMin == this.b.r0();
                s sVar = s.a;
            }
            this.e.s().t();
            try {
                this.e.g().M0(this.e.j(), z2, this.b, jMin);
            } finally {
                this.e.s().A();
            }
        }

        public final boolean c() {
            return this.d;
        }

        @Override // n.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i iVar = this.e;
            if (m.h0.d.f2188g && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = this.e;
            synchronized (iVar2) {
                if (c()) {
                    return;
                }
                boolean z = iVar2.h() == null;
                s sVar = s.a;
                if (!this.e.o().a) {
                    boolean z2 = this.b.r0() > 0;
                    if (this.c != null) {
                        while (this.b.r0() > 0) {
                            b(false);
                        }
                        f fVarG = this.e.g();
                        int iJ = this.e.j();
                        u uVar = this.c;
                        l.y.c.i.c(uVar);
                        fVarG.N0(iJ, z, m.h0.d.N(uVar));
                    } else if (z2) {
                        while (this.b.r0() > 0) {
                            b(true);
                        }
                    } else if (z) {
                        this.e.g().M0(this.e.j(), true, null, 0L);
                    }
                }
                synchronized (this.e) {
                    j(true);
                    s sVar2 = s.a;
                }
                this.e.g().flush();
                this.e.b();
            }
        }

        @Override // n.v
        public y d() {
            return this.e.s();
        }

        public final boolean f() {
            return this.a;
        }

        @Override // n.v, java.io.Flushable
        public void flush() throws IOException {
            i iVar = this.e;
            if (m.h0.d.f2188g && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = this.e;
            synchronized (iVar2) {
                iVar2.c();
                s sVar = s.a;
            }
            while (this.b.r0() > 0) {
                b(false);
                this.e.g().flush();
            }
        }

        @Override // n.v
        public void h(n.b bVar, long j2) throws IOException {
            l.y.c.i.e(bVar, "source");
            i iVar = this.e;
            if (!m.h0.d.f2188g || !Thread.holdsLock(iVar)) {
                this.b.h(bVar, j2);
                while (this.b.r0() >= 16384) {
                    b(false);
                }
            } else {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
            }
        }

        public final void j(boolean z) {
            this.d = z;
        }
    }

    public final class b implements x {
        private final long a;
        private boolean b;
        private final n.b c;
        private final n.b d;
        private boolean e;
        final /* synthetic */ i f;

        public b(i iVar, long j2, boolean z) {
            l.y.c.i.e(iVar, "this$0");
            this.f = iVar;
            this.a = j2;
            this.b = z;
            this.c = new n.b();
            this.d = new n.b();
        }

        private final void Q(long j2) {
            i iVar = this.f;
            if (!m.h0.d.f2188g || !Thread.holdsLock(iVar)) {
                this.f.g().L0(j2);
                return;
            }
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
        }

        public final void F(boolean z) {
            this.b = z;
        }

        @Override // n.x
        public long I(n.b bVar, long j2) throws IOException {
            long jI;
            boolean z;
            l.y.c.i.e(bVar, "sink");
            long j3 = 0;
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(l.y.c.i.k("byteCount < 0: ", Long.valueOf(j2)).toString());
            }
            while (true) {
                IOException iOExceptionI = null;
                i iVar = this.f;
                synchronized (iVar) {
                    iVar.m().t();
                    try {
                        if (iVar.h() != null && (iOExceptionI = iVar.i()) == null) {
                            m.h0.k.b bVarH = iVar.h();
                            l.y.c.i.c(bVarH);
                            iOExceptionI = new n(bVarH);
                        }
                        if (b()) {
                            throw new IOException("stream closed");
                        }
                        if (f().r0() > j3) {
                            jI = f().I(bVar, Math.min(j2, f().r0()));
                            iVar.C(iVar.l() + jI);
                            long jL = iVar.l() - iVar.k();
                            if (iOExceptionI == null && jL >= iVar.g().n0().c() / 2) {
                                iVar.g().R0(iVar.j(), jL);
                                iVar.B(iVar.l());
                            }
                        } else {
                            if (c() || iOExceptionI != null) {
                                jI = -1;
                            } else {
                                iVar.F();
                                jI = -1;
                                z = true;
                            }
                            iVar.m().A();
                            s sVar = s.a;
                        }
                        z = false;
                        iVar.m().A();
                        s sVar2 = s.a;
                    } catch (Throwable th) {
                        iVar.m().A();
                        throw th;
                    }
                }
                if (!z) {
                    if (jI != -1) {
                        Q(jI);
                        return jI;
                    }
                    if (iOExceptionI == null) {
                        return -1L;
                    }
                    throw iOExceptionI;
                }
                j3 = 0;
            }
        }

        public final void O(u uVar) {
        }

        public final boolean b() {
            return this.e;
        }

        public final boolean c() {
            return this.b;
        }

        @Override // n.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long jR0;
            i iVar = this.f;
            synchronized (iVar) {
                u(true);
                jR0 = f().r0();
                f().Y();
                iVar.notifyAll();
                s sVar = s.a;
            }
            if (jR0 > 0) {
                Q(jR0);
            }
            this.f.b();
        }

        @Override // n.x
        public y d() {
            return this.f.m();
        }

        public final n.b f() {
            return this.d;
        }

        public final n.b j() {
            return this.c;
        }

        public final void l(n.d dVar, long j2) throws EOFException {
            boolean zC;
            boolean z;
            boolean z2;
            long jR0;
            l.y.c.i.e(dVar, "source");
            i iVar = this.f;
            if (m.h0.d.f2188g && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
            }
            while (j2 > 0) {
                synchronized (this.f) {
                    zC = c();
                    z = true;
                    z2 = f().r0() + j2 > this.a;
                    s sVar = s.a;
                }
                if (z2) {
                    dVar.skip(j2);
                    this.f.f(m.h0.k.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (zC) {
                    dVar.skip(j2);
                    return;
                }
                long jI = dVar.I(this.c, j2);
                if (jI == -1) {
                    throw new EOFException();
                }
                j2 -= jI;
                i iVar2 = this.f;
                synchronized (iVar2) {
                    if (b()) {
                        jR0 = j().r0();
                        j().Y();
                    } else {
                        if (f().r0() != 0) {
                            z = false;
                        }
                        f().y0(j());
                        if (z) {
                            iVar2.notifyAll();
                        }
                        jR0 = 0;
                    }
                }
                if (jR0 > 0) {
                    Q(jR0);
                }
            }
        }

        public final void u(boolean z) {
            this.e = z;
        }
    }

    public final class c extends n.a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ i f2284l;

        public c(i iVar) {
            l.y.c.i.e(iVar, "this$0");
            this.f2284l = iVar;
        }

        public final void A() throws IOException {
            if (u()) {
                throw v(null);
            }
        }

        @Override // n.a
        protected IOException v(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // n.a
        protected void z() {
            this.f2284l.f(m.h0.k.b.CANCEL);
            this.f2284l.g().E0();
        }
    }

    public i(int i2, f fVar, boolean z, boolean z2, u uVar) {
        l.y.c.i.e(fVar, "connection");
        this.a = i2;
        this.b = fVar;
        this.f = fVar.o0().c();
        ArrayDeque<u> arrayDeque = new ArrayDeque<>();
        this.f2276g = arrayDeque;
        this.f2278i = new b(this, fVar.n0().c(), z2);
        this.f2279j = new a(this, z);
        this.f2280k = new c(this);
        this.f2281l = new c(this);
        if (uVar == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!t())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(uVar);
        }
    }

    private final boolean e(m.h0.k.b bVar, IOException iOException) {
        if (m.h0.d.f2188g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            if (p().c() && o().f()) {
                return false;
            }
            z(bVar);
            A(iOException);
            notifyAll();
            s sVar = s.a;
            this.b.D0(this.a);
            return true;
        }
    }

    public final void A(IOException iOException) {
        this.f2283n = iOException;
    }

    public final void B(long j2) {
        this.d = j2;
    }

    public final void C(long j2) {
        this.c = j2;
    }

    public final void D(long j2) {
        this.e = j2;
    }

    public final synchronized u E() {
        u uVarRemoveFirst;
        this.f2280k.t();
        while (this.f2276g.isEmpty() && this.f2282m == null) {
            try {
                F();
            } catch (Throwable th) {
                this.f2280k.A();
                throw th;
            }
        }
        this.f2280k.A();
        if (!(!this.f2276g.isEmpty())) {
            IOException iOException = this.f2283n;
            if (iOException != null) {
                throw iOException;
            }
            m.h0.k.b bVar = this.f2282m;
            l.y.c.i.c(bVar);
            throw new n(bVar);
        }
        uVarRemoveFirst = this.f2276g.removeFirst();
        l.y.c.i.d(uVarRemoveFirst, "headersQueue.removeFirst()");
        return uVarRemoveFirst;
    }

    public final void F() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final y G() {
        return this.f2281l;
    }

    public final void a(long j2) {
        this.f += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    public final void b() {
        boolean z;
        boolean zU;
        if (m.h0.d.f2188g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z = !p().c() && p().b() && (o().f() || o().c());
            zU = u();
            s sVar = s.a;
        }
        if (z) {
            d(m.h0.k.b.CANCEL, null);
        } else {
            if (zU) {
                return;
            }
            this.b.D0(this.a);
        }
    }

    public final void c() throws IOException {
        if (this.f2279j.c()) {
            throw new IOException("stream closed");
        }
        if (this.f2279j.f()) {
            throw new IOException("stream finished");
        }
        if (this.f2282m != null) {
            IOException iOException = this.f2283n;
            if (iOException != null) {
                throw iOException;
            }
            m.h0.k.b bVar = this.f2282m;
            l.y.c.i.c(bVar);
            throw new n(bVar);
        }
    }

    public final void d(m.h0.k.b bVar, IOException iOException) {
        l.y.c.i.e(bVar, "rstStatusCode");
        if (e(bVar, iOException)) {
            this.b.P0(this.a, bVar);
        }
    }

    public final void f(m.h0.k.b bVar) {
        l.y.c.i.e(bVar, "errorCode");
        if (e(bVar, null)) {
            this.b.Q0(this.a, bVar);
        }
    }

    public final f g() {
        return this.b;
    }

    public final synchronized m.h0.k.b h() {
        return this.f2282m;
    }

    public final IOException i() {
        return this.f2283n;
    }

    public final int j() {
        return this.a;
    }

    public final long k() {
        return this.d;
    }

    public final long l() {
        return this.c;
    }

    public final c m() {
        return this.f2280k;
    }

    public final v n() {
        synchronized (this) {
            if (!(this.f2277h || t())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            s sVar = s.a;
        }
        return this.f2279j;
    }

    public final a o() {
        return this.f2279j;
    }

    public final b p() {
        return this.f2278i;
    }

    public final long q() {
        return this.f;
    }

    public final long r() {
        return this.e;
    }

    public final c s() {
        return this.f2281l;
    }

    public final boolean t() {
        return this.b.i0() == ((this.a & 1) == 1);
    }

    public final synchronized boolean u() {
        if (this.f2282m != null) {
            return false;
        }
        return ((this.f2278i.c() || this.f2278i.b()) && (this.f2279j.f() || this.f2279j.c()) && this.f2277h) ? false : true;
    }

    public final y v() {
        return this.f2280k;
    }

    public final void w(n.d dVar, int i2) {
        l.y.c.i.e(dVar, "source");
        if (!m.h0.d.f2188g || !Thread.holdsLock(this)) {
            this.f2278i.l(dVar, i2);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
    }

    public final void x(u uVar, boolean z) {
        boolean zU;
        l.y.c.i.e(uVar, "headers");
        if (m.h0.d.f2188g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f2277h && z) {
                p().O(uVar);
            } else {
                this.f2277h = true;
                this.f2276g.add(uVar);
            }
            if (z) {
                p().F(true);
            }
            zU = u();
            notifyAll();
            s sVar = s.a;
        }
        if (zU) {
            return;
        }
        this.b.D0(this.a);
    }

    public final synchronized void y(m.h0.k.b bVar) {
        l.y.c.i.e(bVar, "errorCode");
        if (this.f2282m == null) {
            this.f2282m = bVar;
            notifyAll();
        }
    }

    public final void z(m.h0.k.b bVar) {
        this.f2282m = bVar;
    }
}
