package m.h0.h;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import l.s;
import m.b0;
import m.d0;
import m.p;
import m.r;
import m.v;
import m.z;

/* JADX INFO: loaded from: classes.dex */
public final class e implements m.e {
    private final z a;
    private final b0 b;
    private final boolean c;
    private final g d;
    private final r e;
    private final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f2205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f2206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f2207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private f f2208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private m.h0.h.c f2210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2213o;
    private volatile boolean p;
    private volatile m.h0.h.c q;
    private volatile f r;

    public final class a implements Runnable {
        private final m.f a;
        private volatile AtomicInteger b;
        final /* synthetic */ e c;

        public a(e eVar, m.f fVar) {
            l.y.c.i.e(eVar, "this$0");
            l.y.c.i.e(fVar, "responseCallback");
            this.c = eVar;
            this.a = fVar;
            this.b = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            l.y.c.i.e(executorService, "executorService");
            p pVarQ = this.c.o().q();
            if (m.h0.d.f2188g && Thread.holdsLock(pVarQ)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + pVarQ);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.c.y(interruptedIOException);
                    this.a.onFailure(this.c, interruptedIOException);
                    this.c.o().q().f(this);
                }
            } catch (Throwable th) {
                this.c.o().q().f(this);
                throw th;
            }
        }

        public final e b() {
            return this.c;
        }

        public final AtomicInteger c() {
            return this.b;
        }

        public final String d() {
            return this.c.t().j().i();
        }

        public final void e(a aVar) {
            l.y.c.i.e(aVar, "other");
            this.b = aVar.b;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            boolean z;
            IOException e;
            p pVarQ;
            String strK = l.y.c.i.k("OkHttp ", this.c.z());
            e eVar = this.c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strK);
            try {
                try {
                    eVar.f.t();
                    try {
                        z = true;
                        try {
                            this.a.onResponse(eVar, eVar.v());
                            pVarQ = eVar.o().q();
                        } catch (IOException e2) {
                            e = e2;
                            if (z) {
                                m.h0.l.h.a.g().j(l.y.c.i.k("Callback failure for ", eVar.G()), 4, e);
                            } else {
                                this.a.onFailure(eVar, e);
                            }
                            pVarQ = eVar.o().q();
                        } catch (Throwable th2) {
                            th = th2;
                            eVar.cancel();
                            if (!z) {
                                IOException iOException = new IOException(l.y.c.i.k("canceled due to ", th));
                                l.b.a(iOException, th);
                                this.a.onFailure(eVar, iOException);
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        z = false;
                    } catch (Throwable th3) {
                        th = th3;
                        z = false;
                    }
                    pVarQ.f(this);
                    threadCurrentThread.setName(name);
                } catch (Throwable th4) {
                    eVar.o().q().f(this);
                    throw th4;
                }
            } catch (Throwable th5) {
                threadCurrentThread.setName(name);
                throw th5;
            }
        }
    }

    public static final class b extends WeakReference<e> {
        private final Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            l.y.c.i.e(eVar, "referent");
            this.a = obj;
        }

        public final Object a() {
            return this.a;
        }
    }

    public static final class c extends n.a {
        c() {
        }

        @Override // n.a
        protected void z() {
            e.this.cancel();
        }
    }

    public e(z zVar, b0 b0Var, boolean z) {
        l.y.c.i.e(zVar, "client");
        l.y.c.i.e(b0Var, "originalRequest");
        this.a = zVar;
        this.b = b0Var;
        this.c = z;
        this.d = zVar.n().a();
        this.e = zVar.s().a(this);
        c cVar = new c();
        cVar.g(o().i(), TimeUnit.MILLISECONDS);
        this.f = cVar;
        this.f2205g = new AtomicBoolean();
        this.f2213o = true;
    }

    private final <E extends IOException> E E(E e) {
        if (this.f2209k || !this.f.u()) {
            return e;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause(e);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String G() {
        StringBuilder sb = new StringBuilder();
        sb.append(f() ? "canceled " : "");
        sb.append(this.c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(z());
        return sb.toString();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final <E extends IOException> E g(E e) {
        Socket socketA;
        boolean z = m.h0.d.f2188g;
        if (z && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        f fVar = this.f2208j;
        if (fVar != null) {
            if (z && Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + fVar);
            }
            synchronized (fVar) {
                socketA = A();
            }
            if (this.f2208j == null) {
                if (socketA != null) {
                    m.h0.d.k(socketA);
                }
                this.e.l(this, fVar);
            } else {
                if (!(socketA == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e2 = (E) E(e);
        if (e != null) {
            r rVar = this.e;
            l.y.c.i.c(e2);
            rVar.e(this, e2);
        } else {
            this.e.d(this);
        }
        return e2;
    }

    private final void h() {
        this.f2206h = m.h0.l.h.a.g().h("response.body().close()");
        this.e.f(this);
    }

    private final m.a k(v vVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifierX;
        m.g gVarK;
        if (vVar.j()) {
            SSLSocketFactory sSLSocketFactoryJ = this.a.J();
            hostnameVerifierX = this.a.x();
            sSLSocketFactory = sSLSocketFactoryJ;
            gVarK = this.a.k();
        } else {
            sSLSocketFactory = null;
            hostnameVerifierX = null;
            gVarK = null;
        }
        return new m.a(vVar.i(), vVar.n(), this.a.r(), this.a.I(), sSLSocketFactory, hostnameVerifierX, gVarK, this.a.D(), this.a.C(), this.a.B(), this.a.o(), this.a.E());
    }

    public final Socket A() {
        f fVar = this.f2208j;
        l.y.c.i.c(fVar);
        if (m.h0.d.f2188g && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + fVar);
        }
        List<Reference<e>> listO = fVar.o();
        Iterator<Reference<e>> it = listO.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (l.y.c.i.a(it.next().get(), this)) {
                break;
            }
            i2++;
        }
        if (!(i2 != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        listO.remove(i2);
        this.f2208j = null;
        if (listO.isEmpty()) {
            fVar.C(System.nanoTime());
            if (this.d.c(fVar)) {
                return fVar.E();
            }
        }
        return null;
    }

    public final boolean B() {
        d dVar = this.f2207i;
        l.y.c.i.c(dVar);
        return dVar.e();
    }

    public final void C(f fVar) {
        this.r = fVar;
    }

    public final void D() {
        if (!(!this.f2209k)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f2209k = true;
        this.f.u();
    }

    @Override // m.e
    public d0 b() {
        if (!this.f2205g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f.t();
        h();
        try {
            this.a.q().b(this);
            return v();
        } finally {
            this.a.q().g(this);
        }
    }

    @Override // m.e
    public b0 c() {
        return this.b;
    }

    @Override // m.e
    public void cancel() {
        if (this.p) {
            return;
        }
        this.p = true;
        m.h0.h.c cVar = this.q;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.r;
        if (fVar != null) {
            fVar.e();
        }
        this.e.g(this);
    }

    public final void e(f fVar) {
        l.y.c.i.e(fVar, "connection");
        if (!m.h0.d.f2188g || Thread.holdsLock(fVar)) {
            if (!(this.f2208j == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f2208j = fVar;
            fVar.o().add(new b(this, this.f2206h));
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + fVar);
    }

    @Override // m.e
    public boolean f() {
        return this.p;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return new e(this.a, this.b, this.c);
    }

    public final void m(b0 b0Var, boolean z) {
        l.y.c.i.e(b0Var, "request");
        if (!(this.f2210l == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.f2212n)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.f2211m)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            s sVar = s.a;
        }
        if (z) {
            this.f2207i = new d(this.d, k(b0Var.j()), this, this.e);
        }
    }

    public final void n(boolean z) {
        m.h0.h.c cVar;
        synchronized (this) {
            if (!this.f2213o) {
                throw new IllegalStateException("released".toString());
            }
            s sVar = s.a;
        }
        if (z && (cVar = this.q) != null) {
            cVar.d();
        }
        this.f2210l = null;
    }

    public final z o() {
        return this.a;
    }

    public final f p() {
        return this.f2208j;
    }

    public final r q() {
        return this.e;
    }

    public final boolean r() {
        return this.c;
    }

    public final m.h0.h.c s() {
        return this.f2210l;
    }

    public final b0 t() {
        return this.b;
    }

    @Override // m.e
    public void u(m.f fVar) {
        l.y.c.i.e(fVar, "responseCallback");
        if (!this.f2205g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        h();
        this.a.q().a(new a(this, fVar));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a2  */
    public final d0 v() throws Throwable {
        ArrayList arrayList = new ArrayList();
        l.t.r.r(arrayList, this.a.y());
        arrayList.add(new m.h0.i.j(this.a));
        arrayList.add(new m.h0.i.a(this.a.p()));
        arrayList.add(new m.h0.f.a(this.a.h()));
        arrayList.add(m.h0.h.a.a);
        if (!this.c) {
            l.t.r.r(arrayList, this.a.z());
        }
        arrayList.add(new m.h0.i.b(this.c));
        boolean z = false;
        try {
            d0 d0VarA = new m.h0.i.g(this, arrayList, 0, null, this.b, this.a.m(), this.a.G(), this.a.L()).a(this.b);
            if (f()) {
                m.h0.d.j(d0VarA);
                throw new IOException("Canceled");
            }
            y(null);
            return d0VarA;
        } catch (IOException e) {
            try {
                IOException iOExceptionY = y(e);
                if (iOExceptionY == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionY;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    y(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z) {
                y(null);
            }
            throw th;
        }
    }

    public final m.h0.h.c w(m.h0.i.g gVar) throws IOException {
        l.y.c.i.e(gVar, "chain");
        synchronized (this) {
            if (!this.f2213o) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.f2212n)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.f2211m)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            s sVar = s.a;
        }
        d dVar = this.f2207i;
        l.y.c.i.c(dVar);
        m.h0.h.c cVar = new m.h0.h.c(this, this.e, dVar, dVar.a(this.a, gVar));
        this.f2210l = cVar;
        this.q = cVar;
        synchronized (this) {
            this.f2211m = true;
            this.f2212n = true;
        }
        if (this.p) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:47:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:47:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final <E extends IOException> E x(m.h0.h.c cVar, boolean z, boolean z2, E e) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        l.y.c.i.e(cVar, "exchange");
        if (!l.y.c.i.a(cVar, this.q)) {
            return e;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (this.f2211m) {
                        if (z) {
                            this.f2211m = false;
                        }
                        if (z2) {
                            this.f2212n = false;
                        }
                        z5 = this.f2211m;
                        if (z5) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (!z5) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                    } else if (z2 || !this.f2212n) {
                        z4 = false;
                    } else {
                        if (z) {
                            this.f2211m = false;
                        }
                        if (z2) {
                            this.f2212n = false;
                        }
                        z5 = this.f2211m;
                        if (z5 || this.f2212n) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (!z5 && !this.f2212n && !this.f2213o) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
            s sVar = s.a;
        }
        if (z3) {
            this.q = null;
            f fVar = this.f2208j;
            if (fVar != null) {
                fVar.t();
            }
        }
        return z4 ? (E) g(e) : e;
    }

    public final IOException y(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f2213o) {
                this.f2213o = false;
                if (!this.f2211m && !this.f2212n) {
                    z = true;
                }
            }
            s sVar = s.a;
        }
        return z ? g(iOException) : iOException;
    }

    public final String z() {
        return this.b.j().s();
    }
}
