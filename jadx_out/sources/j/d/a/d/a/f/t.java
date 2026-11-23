package j.d.a.d.a.f;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class t<ResultT> extends e<ResultT> {
    private final Object a = new Object();
    private final o<ResultT> b = new o<>();
    private boolean c;
    private ResultT d;
    private Exception e;

    t() {
    }

    private final void l() {
        j.d.a.d.a.b.r.b(this.c, "Task is not yet complete");
    }

    private final void m() {
        j.d.a.d.a.b.r.b(!this.c, "Task is already complete");
    }

    private final void n() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }

    @Override // j.d.a.d.a.f.e
    public final e<ResultT> a(a<ResultT> aVar) {
        this.b.a(new i(f.a, aVar));
        n();
        return this;
    }

    @Override // j.d.a.d.a.f.e
    public final e<ResultT> b(Executor executor, b bVar) {
        this.b.a(new k(executor, bVar));
        n();
        return this;
    }

    @Override // j.d.a.d.a.f.e
    public final e<ResultT> c(Executor executor, c<? super ResultT> cVar) {
        this.b.a(new m(executor, cVar));
        n();
        return this;
    }

    @Override // j.d.a.d.a.f.e
    public final Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // j.d.a.d.a.f.e
    public final ResultT e() {
        ResultT resultt;
        synchronized (this.a) {
            l();
            Exception exc = this.e;
            if (exc != null) {
                throw new d(exc);
            }
            resultt = this.d;
        }
        return resultt;
    }

    @Override // j.d.a.d.a.f.e
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // j.d.a.d.a.f.e
    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.e == null) {
                z = true;
            }
        }
        return z;
    }

    public final void h(ResultT resultt) {
        synchronized (this.a) {
            m();
            this.c = true;
            this.d = resultt;
        }
        this.b.b(this);
    }

    public final boolean i(ResultT resultt) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = resultt;
            this.b.b(this);
            return true;
        }
    }

    public final void j(Exception exc) {
        synchronized (this.a) {
            m();
            this.c = true;
            this.e = exc;
        }
        this.b.b(this);
    }

    public final boolean k(Exception exc) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = exc;
            this.b.b(this);
            return true;
        }
    }
}
