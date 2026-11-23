package m;

import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Closeable {
    private final b0 a;
    private final a0 b;
    private final String c;
    private final int d;
    private final t e;
    private final u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e0 f2171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d0 f2172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d0 f2173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d0 f2174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f2175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f2176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m.h0.h.c f2177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d f2178n;

    public static class a {
        private b0 a;
        private a0 b;
        private int c;
        private String d;
        private t e;
        private u.a f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private e0 f2179g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d0 f2180h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private d0 f2181i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private d0 f2182j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f2183k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f2184l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private m.h0.h.c f2185m;

        public a() {
            this.c = -1;
            this.f = new u.a();
        }

        public a(d0 d0Var) {
            l.y.c.i.e(d0Var, "response");
            this.c = -1;
            this.a = d0Var.f0();
            this.b = d0Var.d0();
            this.c = d0Var.l();
            this.d = d0Var.Z();
            this.e = d0Var.F();
            this.f = d0Var.T().d();
            this.f2179g = d0Var.b();
            this.f2180h = d0Var.a0();
            this.f2181i = d0Var.f();
            this.f2182j = d0Var.c0();
            this.f2183k = d0Var.g0();
            this.f2184l = d0Var.e0();
            this.f2185m = d0Var.u();
        }

        private final void e(d0 d0Var) {
            if (d0Var == null) {
                return;
            }
            if (!(d0Var.b() == null)) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }

        private final void f(String str, d0 d0Var) {
            if (d0Var == null) {
                return;
            }
            if (!(d0Var.b() == null)) {
                throw new IllegalArgumentException(l.y.c.i.k(str, ".body != null").toString());
            }
            if (!(d0Var.a0() == null)) {
                throw new IllegalArgumentException(l.y.c.i.k(str, ".networkResponse != null").toString());
            }
            if (!(d0Var.f() == null)) {
                throw new IllegalArgumentException(l.y.c.i.k(str, ".cacheResponse != null").toString());
            }
            if (!(d0Var.c0() == null)) {
                throw new IllegalArgumentException(l.y.c.i.k(str, ".priorResponse != null").toString());
            }
        }

        public final void A(d0 d0Var) {
            this.f2180h = d0Var;
        }

        public final void B(d0 d0Var) {
            this.f2182j = d0Var;
        }

        public final void C(a0 a0Var) {
            this.b = a0Var;
        }

        public final void D(long j2) {
            this.f2184l = j2;
        }

        public final void E(b0 b0Var) {
            this.a = b0Var;
        }

        public final void F(long j2) {
            this.f2183k = j2;
        }

        public a a(String str, String str2) {
            l.y.c.i.e(str, "name");
            l.y.c.i.e(str2, "value");
            i().a(str, str2);
            return this;
        }

        public a b(e0 e0Var) {
            u(e0Var);
            return this;
        }

        public d0 c() {
            int i2 = this.c;
            if (!(i2 >= 0)) {
                throw new IllegalStateException(l.y.c.i.k("code < 0: ", Integer.valueOf(h())).toString());
            }
            b0 b0Var = this.a;
            if (b0Var == null) {
                throw new IllegalStateException("request == null".toString());
            }
            a0 a0Var = this.b;
            if (a0Var == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.d;
            if (str != null) {
                return new d0(b0Var, a0Var, str, i2, this.e, this.f.e(), this.f2179g, this.f2180h, this.f2181i, this.f2182j, this.f2183k, this.f2184l, this.f2185m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public a d(d0 d0Var) {
            f("cacheResponse", d0Var);
            v(d0Var);
            return this;
        }

        public a g(int i2) {
            w(i2);
            return this;
        }

        public final int h() {
            return this.c;
        }

        public final u.a i() {
            return this.f;
        }

        public a j(t tVar) {
            x(tVar);
            return this;
        }

        public a k(String str, String str2) {
            l.y.c.i.e(str, "name");
            l.y.c.i.e(str2, "value");
            i().h(str, str2);
            return this;
        }

        public a l(u uVar) {
            l.y.c.i.e(uVar, "headers");
            y(uVar.d());
            return this;
        }

        public final void m(m.h0.h.c cVar) {
            l.y.c.i.e(cVar, "deferredTrailers");
            this.f2185m = cVar;
        }

        public a n(String str) {
            l.y.c.i.e(str, "message");
            z(str);
            return this;
        }

        public a o(d0 d0Var) {
            f("networkResponse", d0Var);
            A(d0Var);
            return this;
        }

        public a p(d0 d0Var) {
            e(d0Var);
            B(d0Var);
            return this;
        }

        public a q(a0 a0Var) {
            l.y.c.i.e(a0Var, "protocol");
            C(a0Var);
            return this;
        }

        public a r(long j2) {
            D(j2);
            return this;
        }

        public a s(b0 b0Var) {
            l.y.c.i.e(b0Var, "request");
            E(b0Var);
            return this;
        }

        public a t(long j2) {
            F(j2);
            return this;
        }

        public final void u(e0 e0Var) {
            this.f2179g = e0Var;
        }

        public final void v(d0 d0Var) {
            this.f2181i = d0Var;
        }

        public final void w(int i2) {
            this.c = i2;
        }

        public final void x(t tVar) {
            this.e = tVar;
        }

        public final void y(u.a aVar) {
            l.y.c.i.e(aVar, "<set-?>");
            this.f = aVar;
        }

        public final void z(String str) {
            this.d = str;
        }
    }

    public d0(b0 b0Var, a0 a0Var, String str, int i2, t tVar, u uVar, e0 e0Var, d0 d0Var, d0 d0Var2, d0 d0Var3, long j2, long j3, m.h0.h.c cVar) {
        l.y.c.i.e(b0Var, "request");
        l.y.c.i.e(a0Var, "protocol");
        l.y.c.i.e(str, "message");
        l.y.c.i.e(uVar, "headers");
        this.a = b0Var;
        this.b = a0Var;
        this.c = str;
        this.d = i2;
        this.e = tVar;
        this.f = uVar;
        this.f2171g = e0Var;
        this.f2172h = d0Var;
        this.f2173i = d0Var2;
        this.f2174j = d0Var3;
        this.f2175k = j2;
        this.f2176l = j3;
        this.f2177m = cVar;
    }

    public static /* synthetic */ String Q(d0 d0Var, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return d0Var.O(str, str2);
    }

    public final t F() {
        return this.e;
    }

    public final String O(String str, String str2) {
        l.y.c.i.e(str, "name");
        String strB = this.f.b(str);
        return strB == null ? str2 : strB;
    }

    public final u T() {
        return this.f;
    }

    public final boolean Y() {
        int i2 = this.d;
        return 200 <= i2 && i2 < 300;
    }

    public final String Z() {
        return this.c;
    }

    public final d0 a0() {
        return this.f2172h;
    }

    public final e0 b() {
        return this.f2171g;
    }

    public final a b0() {
        return new a(this);
    }

    public final d c() {
        d dVar = this.f2178n;
        if (dVar != null) {
            return dVar;
        }
        d dVarB = d.f2161n.b(this.f);
        this.f2178n = dVarB;
        return dVarB;
    }

    public final d0 c0() {
        return this.f2174j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e0 e0Var = this.f2171g;
        if (e0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        e0Var.close();
    }

    public final a0 d0() {
        return this.b;
    }

    public final long e0() {
        return this.f2176l;
    }

    public final d0 f() {
        return this.f2173i;
    }

    public final b0 f0() {
        return this.a;
    }

    public final long g0() {
        return this.f2175k;
    }

    public final List<h> j() {
        String str;
        u uVar = this.f;
        int i2 = this.d;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i2 != 407) {
                return l.t.m.g();
            }
            str = "Proxy-Authenticate";
        }
        return m.h0.i.e.a(uVar, str);
    }

    public final int l() {
        return this.d;
    }

    public String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.j() + '}';
    }

    public final m.h0.h.c u() {
        return this.f2177m;
    }
}
