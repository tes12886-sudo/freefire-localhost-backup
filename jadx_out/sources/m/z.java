package m;

import com.FF.voiceengine.FFVoiceConst;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public class z implements Cloneable, e.a {
    public static final b M = new b(null);
    private static final List<a0> N = m.h0.d.t(a0.HTTP_2, a0.HTTP_1_1);
    private static final List<l> O = m.h0.d.t(l.f2301g, l.f2302h);
    private final m.h0.n.c F;
    private final int G;
    private final int H;
    private final int I;
    private final int J;
    private final int K;
    private final m.h0.h.h L;
    private final p a;
    private final k b;
    private final List<w> c;
    private final List<w> d;
    private final r.b e;
    private final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m.b f2326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f2327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f2328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n f2329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c f2330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final q f2331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Proxy f2332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ProxySelector f2333n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final m.b f2334o;
    private final SocketFactory p;
    private final SSLSocketFactory q;
    private final X509TrustManager r;
    private final List<l> s;
    private final List<a0> t;
    private final HostnameVerifier u;
    private final g v;

    public static final class a {
        private int A;
        private int B;
        private long C;
        private m.h0.h.h D;
        private p a = new p();
        private k b = new k();
        private final List<w> c = new ArrayList();
        private final List<w> d = new ArrayList();
        private r.b e = m.h0.d.e(r.a);
        private boolean f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private m.b f2335g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f2336h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f2337i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private n f2338j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private c f2339k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private q f2340l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Proxy f2341m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ProxySelector f2342n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private m.b f2343o;
        private SocketFactory p;
        private SSLSocketFactory q;
        private X509TrustManager r;
        private List<l> s;
        private List<? extends a0> t;
        private HostnameVerifier u;
        private g v;
        private m.h0.n.c w;
        private int x;
        private int y;
        private int z;

        public a() {
            m.b bVar = m.b.a;
            this.f2335g = bVar;
            this.f2336h = true;
            this.f2337i = true;
            this.f2338j = n.a;
            this.f2340l = q.a;
            this.f2343o = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            l.y.c.i.d(socketFactory, "getDefault()");
            this.p = socketFactory;
            b bVar2 = z.M;
            this.s = bVar2.a();
            this.t = bVar2.b();
            this.u = m.h0.n.d.a;
            this.v = g.d;
            this.y = FFVoiceConst.FFVoice_RTC_SERVER_REGION.RTC_EXT_SERVER;
            this.z = FFVoiceConst.FFVoice_RTC_SERVER_REGION.RTC_EXT_SERVER;
            this.A = FFVoiceConst.FFVoice_RTC_SERVER_REGION.RTC_EXT_SERVER;
            this.C = 1024L;
        }

        public final int A() {
            return this.z;
        }

        public final boolean B() {
            return this.f;
        }

        public final m.h0.h.h C() {
            return this.D;
        }

        public final SocketFactory D() {
            return this.p;
        }

        public final SSLSocketFactory E() {
            return this.q;
        }

        public final int F() {
            return this.A;
        }

        public final X509TrustManager G() {
            return this.r;
        }

        public final void H(g gVar) {
            l.y.c.i.e(gVar, "<set-?>");
            this.v = gVar;
        }

        public final void I(m.h0.h.h hVar) {
            this.D = hVar;
        }

        public final a a(w wVar) {
            l.y.c.i.e(wVar, "interceptor");
            s().add(wVar);
            return this;
        }

        public final z b() {
            return new z(this);
        }

        public final a c(g gVar) {
            l.y.c.i.e(gVar, "certificatePinner");
            if (!l.y.c.i.a(gVar, h())) {
                I(null);
            }
            H(gVar);
            return this;
        }

        public final m.b d() {
            return this.f2335g;
        }

        public final c e() {
            return this.f2339k;
        }

        public final int f() {
            return this.x;
        }

        public final m.h0.n.c g() {
            return this.w;
        }

        public final g h() {
            return this.v;
        }

        public final int i() {
            return this.y;
        }

        public final k j() {
            return this.b;
        }

        public final List<l> k() {
            return this.s;
        }

        public final n l() {
            return this.f2338j;
        }

        public final p m() {
            return this.a;
        }

        public final q n() {
            return this.f2340l;
        }

        public final r.b o() {
            return this.e;
        }

        public final boolean p() {
            return this.f2336h;
        }

        public final boolean q() {
            return this.f2337i;
        }

        public final HostnameVerifier r() {
            return this.u;
        }

        public final List<w> s() {
            return this.c;
        }

        public final long t() {
            return this.C;
        }

        public final List<w> u() {
            return this.d;
        }

        public final int v() {
            return this.B;
        }

        public final List<a0> w() {
            return this.t;
        }

        public final Proxy x() {
            return this.f2341m;
        }

        public final m.b y() {
            return this.f2343o;
        }

        public final ProxySelector z() {
            return this.f2342n;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        public final List<l> a() {
            return z.O;
        }

        public final List<a0> b() {
            return z.N;
        }
    }

    public z() {
        this(new a());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0061  */
    public z(a aVar) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorZ;
        m.h0.n.c cVarA;
        g gVarE;
        l.y.c.i.e(aVar, "builder");
        this.a = aVar.m();
        this.b = aVar.j();
        this.c = m.h0.d.R(aVar.s());
        this.d = m.h0.d.R(aVar.u());
        this.e = aVar.o();
        this.f = aVar.B();
        this.f2326g = aVar.d();
        this.f2327h = aVar.p();
        this.f2328i = aVar.q();
        this.f2329j = aVar.l();
        aVar.e();
        this.f2331l = aVar.n();
        this.f2332m = aVar.x();
        if (aVar.x() == null) {
            proxySelectorZ = aVar.z();
            proxySelectorZ = proxySelectorZ == null ? ProxySelector.getDefault() : proxySelectorZ;
            proxySelectorZ = proxySelectorZ == null ? m.h0.m.a.a : proxySelectorZ;
        }
        this.f2333n = proxySelectorZ;
        this.f2334o = aVar.y();
        this.p = aVar.D();
        List<l> listK = aVar.k();
        this.s = listK;
        this.t = aVar.w();
        this.u = aVar.r();
        this.G = aVar.f();
        this.H = aVar.i();
        this.I = aVar.A();
        this.J = aVar.F();
        this.K = aVar.v();
        aVar.t();
        m.h0.h.h hVarC = aVar.C();
        this.L = hVarC == null ? new m.h0.h.h() : hVarC;
        boolean z = true;
        if (!(listK instanceof Collection) || !listK.isEmpty()) {
            Iterator<T> it = listK.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            this.q = null;
            this.F = null;
            this.r = null;
            gVarE = g.d;
        } else {
            if (aVar.E() != null) {
                this.q = aVar.E();
                cVarA = aVar.g();
                l.y.c.i.c(cVarA);
                this.F = cVarA;
                X509TrustManager x509TrustManagerG = aVar.G();
                l.y.c.i.c(x509TrustManagerG);
                this.r = x509TrustManagerG;
            } else {
                m.h0.l.h.a aVar2 = m.h0.l.h.a;
                X509TrustManager x509TrustManagerO = aVar2.g().o();
                this.r = x509TrustManagerO;
                m.h0.l.h hVarG = aVar2.g();
                l.y.c.i.c(x509TrustManagerO);
                this.q = hVarG.n(x509TrustManagerO);
                m.h0.n.c.a aVar3 = m.h0.n.c.a;
                l.y.c.i.c(x509TrustManagerO);
                cVarA = aVar3.a(x509TrustManagerO);
                this.F = cVarA;
            }
            g gVarH = aVar.h();
            l.y.c.i.c(cVarA);
            gVarE = gVarH.e(cVarA);
        }
        this.v = gVarE;
        K();
    }

    private final void K() {
        boolean z;
        if (!(!this.c.contains(null))) {
            throw new IllegalStateException(l.y.c.i.k("Null interceptor: ", y()).toString());
        }
        if (!(!this.d.contains(null))) {
            throw new IllegalStateException(l.y.c.i.k("Null network interceptor: ", z()).toString());
        }
        List<l> list = this.s;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (((l) it.next()).f()) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (!z) {
            if (this.q == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.F == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.r == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.q == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.F == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.r == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!l.y.c.i.a(this.v, g.d)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final int A() {
        return this.K;
    }

    public final List<a0> B() {
        return this.t;
    }

    public final Proxy C() {
        return this.f2332m;
    }

    public final m.b D() {
        return this.f2334o;
    }

    public final ProxySelector E() {
        return this.f2333n;
    }

    public final int G() {
        return this.I;
    }

    public final boolean H() {
        return this.f;
    }

    public final SocketFactory I() {
        return this.p;
    }

    public final SSLSocketFactory J() {
        SSLSocketFactory sSLSocketFactory = this.q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int L() {
        return this.J;
    }

    @Override // m.e.a
    public e a(b0 b0Var) {
        l.y.c.i.e(b0Var, "request");
        return new m.h0.h.e(this, b0Var, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final m.b g() {
        return this.f2326g;
    }

    public final c h() {
        return this.f2330k;
    }

    public final int i() {
        return this.G;
    }

    public final g k() {
        return this.v;
    }

    public final int m() {
        return this.H;
    }

    public final k n() {
        return this.b;
    }

    public final List<l> o() {
        return this.s;
    }

    public final n p() {
        return this.f2329j;
    }

    public final p q() {
        return this.a;
    }

    public final q r() {
        return this.f2331l;
    }

    public final r.b s() {
        return this.e;
    }

    public final boolean t() {
        return this.f2327h;
    }

    public final boolean v() {
        return this.f2328i;
    }

    public final m.h0.h.h w() {
        return this.L;
    }

    public final HostnameVerifier x() {
        return this.u;
    }

    public final List<w> y() {
        return this.c;
    }

    public final List<w> z() {
        return this.d;
    }
}
