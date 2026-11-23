package o;

import java.io.IOException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import m.b0;
import m.d0;
import m.e0;

/* JADX INFO: loaded from: classes.dex */
final class n<T> implements d<T> {
    private final s a;
    private final Object[] b;
    private final m.e.a c;
    private final h<e0, T> d;
    private volatile boolean e;

    @GuardedBy("this")
    @Nullable
    private m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    private Throwable f2352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f2353h;

    class a implements m.f {
        final /* synthetic */ f a;

        a(f fVar) {
            this.a = fVar;
        }

        private void a(Throwable th) {
            try {
                this.a.b(n.this, th);
            } catch (Throwable th2) {
                y.s(th2);
                th2.printStackTrace();
            }
        }

        @Override // m.f
        public void onFailure(m.e eVar, IOException iOException) {
            a(iOException);
        }

        @Override // m.f
        public void onResponse(m.e eVar, d0 d0Var) {
            try {
                try {
                    this.a.a(n.this, n.this.g(d0Var));
                } catch (Throwable th) {
                    y.s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                y.s(th2);
                a(th2);
            }
        }
    }

    static final class b extends e0 {
        private final e0 c;
        private final n.d d;

        @Nullable
        IOException e;

        class a extends n.g {
            a(n.x xVar) {
                super(xVar);
            }

            @Override // n.g, n.x
            public long I(n.b bVar, long j2) throws IOException {
                try {
                    return super.I(bVar, j2);
                } catch (IOException e) {
                    b.this.e = e;
                    throw e;
                }
            }
        }

        b(e0 e0Var) {
            this.c = e0Var;
            this.d = n.l.b(new a(e0Var.F()));
        }

        @Override // m.e0
        public n.d F() {
            return this.d;
        }

        void Q() throws IOException {
            IOException iOException = this.e;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // m.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.c.close();
        }

        @Override // m.e0
        public long j() {
            return this.c.j();
        }

        @Override // m.e0
        public m.x l() {
            return this.c.l();
        }
    }

    static final class c extends e0 {

        @Nullable
        private final m.x c;
        private final long d;

        c(@Nullable m.x xVar, long j2) {
            this.c = xVar;
            this.d = j2;
        }

        @Override // m.e0
        public n.d F() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        @Override // m.e0
        public long j() {
            return this.d;
        }

        @Override // m.e0
        public m.x l() {
            return this.c;
        }
    }

    n(s sVar, Object[] objArr, m.e.a aVar, h<e0, T> hVar) {
        this.a = sVar;
        this.b = objArr;
        this.c = aVar;
        this.d = hVar;
    }

    private m.e d() {
        m.e eVarA = this.c.a(this.a.a(this.b));
        if (eVarA != null) {
            return eVarA;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @GuardedBy("this")
    private m.e e() throws IOException {
        m.e eVar = this.f;
        if (eVar != null) {
            return eVar;
        }
        Throwable th = this.f2352g;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            m.e eVarD = d();
            this.f = eVarD;
            return eVarD;
        } catch (IOException | Error | RuntimeException e) {
            y.s(e);
            this.f2352g = e;
            throw e;
        }
    }

    @Override // o.d
    public void Q(f<T> fVar) {
        m.e eVar;
        Throwable th;
        defpackage.e.a(fVar, "callback == null");
        synchronized (this) {
            if (this.f2353h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f2353h = true;
            eVar = this.f;
            th = this.f2352g;
            if (eVar == null && th == null) {
                try {
                    m.e eVarD = d();
                    this.f = eVarD;
                    eVar = eVarD;
                } catch (Throwable th2) {
                    th = th2;
                    y.s(th);
                    this.f2352g = th;
                }
            }
        }
        if (th != null) {
            fVar.b(this, th);
            return;
        }
        if (this.e) {
            eVar.cancel();
        }
        eVar.u(new a(fVar));
    }

    @Override // o.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n<T> clone() {
        return new n<>(this.a, this.b, this.c, this.d);
    }

    @Override // o.d
    public t<T> b() {
        m.e eVarE;
        synchronized (this) {
            if (this.f2353h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f2353h = true;
            eVarE = e();
        }
        if (this.e) {
            eVarE.cancel();
        }
        return g(eVarE.b());
    }

    @Override // o.d
    public synchronized b0 c() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return e().c();
    }

    @Override // o.d
    public void cancel() {
        m.e eVar;
        this.e = true;
        synchronized (this) {
            eVar = this.f;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // o.d
    public boolean f() {
        boolean z = true;
        if (this.e) {
            return true;
        }
        synchronized (this) {
            m.e eVar = this.f;
            if (eVar == null || !eVar.f()) {
                z = false;
            }
        }
        return z;
    }

    t<T> g(d0 d0Var) throws IOException {
        e0 e0VarB = d0Var.b();
        d0.a aVarB0 = d0Var.b0();
        aVarB0.b(new c(e0VarB.l(), e0VarB.j()));
        d0 d0VarC = aVarB0.c();
        int iL = d0VarC.l();
        if (iL < 200 || iL >= 300) {
            try {
                return t.c(y.a(e0VarB), d0VarC);
            } finally {
                e0VarB.close();
            }
        }
        if (iL == 204 || iL == 205) {
            e0VarB.close();
            return t.h(null, d0VarC);
        }
        b bVar = new b(e0VarB);
        try {
            return t.h(this.d.a(bVar), d0VarC);
        } catch (RuntimeException e) {
            bVar.Q();
            throw e;
        }
    }
}
