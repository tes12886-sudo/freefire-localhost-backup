package m.h0.h;

import com.garena.unity.webview.UnityWebViewActivityProxy;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import l.d0.p;
import l.t.n;
import m.a0;
import m.b0;
import m.d0;
import m.f0;
import m.h0.k.m;
import m.r;
import m.t;
import m.v;
import m.z;
import n.l;
import n.y;

/* JADX INFO: loaded from: classes.dex */
public final class f extends m.h0.k.f.c implements m.j {
    private final f0 b;
    private Socket c;
    private Socket d;
    private t e;
    private a0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private m.h0.k.f f2215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n.d f2216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n.c f2217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2222n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2223o;
    private final List<Reference<e>> p;
    private long q;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            a = iArr;
        }
    }

    static final class b extends l.y.c.j implements l.y.b.a<List<? extends Certificate>> {
        final /* synthetic */ m.g a;
        final /* synthetic */ t b;
        final /* synthetic */ m.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m.g gVar, t tVar, m.a aVar) {
            super(0);
            this.a = gVar;
            this.b = tVar;
            this.c = aVar;
        }

        @Override // l.y.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> a() {
            m.h0.n.c cVarD = this.a.d();
            l.y.c.i.c(cVarD);
            return cVarD.a(this.b.d(), this.c.l().i());
        }
    }

    static final class c extends l.y.c.j implements l.y.b.a<List<? extends X509Certificate>> {
        c() {
            super(0);
        }

        @Override // l.y.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> a() {
            t tVar = f.this.e;
            l.y.c.i.c(tVar);
            List<Certificate> listD = tVar.d();
            ArrayList arrayList = new ArrayList(n.o(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public f(g gVar, f0 f0Var) {
        l.y.c.i.e(gVar, "connectionPool");
        l.y.c.i.e(f0Var, "route");
        this.b = f0Var;
        this.f2223o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    private final boolean B(List<f0> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (f0 f0Var : list) {
                if (f0Var.b().type() == Proxy.Type.DIRECT && this.b.b().type() == Proxy.Type.DIRECT && l.y.c.i.a(this.b.d(), f0Var.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void F(int i2) throws SocketException {
        Socket socket = this.d;
        l.y.c.i.c(socket);
        n.d dVar = this.f2216h;
        l.y.c.i.c(dVar);
        n.c cVar = this.f2217i;
        l.y.c.i.c(cVar);
        socket.setSoTimeout(0);
        m.h0.k.f.a aVar = new m.h0.k.f.a(true, m.h0.g.e.f2197i);
        aVar.s(socket, this.b.a().l().i(), dVar, cVar);
        aVar.k(this);
        aVar.l(i2);
        m.h0.k.f fVarA = aVar.a();
        this.f2215g = fVarA;
        this.f2223o = m.h0.k.f.L.a().d();
        m.h0.k.f.K0(fVarA, false, null, 3, null);
    }

    private final boolean G(v vVar) {
        t tVar;
        if (m.h0.d.f2188g && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        v vVarL = this.b.a().l();
        if (vVar.n() != vVarL.n()) {
            return false;
        }
        if (l.y.c.i.a(vVar.i(), vVarL.i())) {
            return true;
        }
        if (this.f2219k || (tVar = this.e) == null) {
            return false;
        }
        l.y.c.i.c(tVar);
        return f(vVar, tVar);
    }

    private final boolean f(v vVar, t tVar) {
        List<Certificate> listD = tVar.d();
        return (listD.isEmpty() ^ true) && m.h0.n.d.a.e(vVar.i(), (X509Certificate) listD.get(0));
    }

    private final void i(int i2, int i3, m.e eVar, r rVar) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyB = this.b.b();
        m.a aVarA = this.b.a();
        Proxy.Type type = proxyB.type();
        int i4 = type == null ? -1 : a.a[type.ordinal()];
        if (i4 == 1 || i4 == 2) {
            socketCreateSocket = aVarA.j().createSocket();
            l.y.c.i.c(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyB);
        }
        this.c = socketCreateSocket;
        rVar.j(eVar, this.b.d(), proxyB);
        socketCreateSocket.setSoTimeout(i3);
        try {
            m.h0.l.h.a.g().f(socketCreateSocket, this.b.d(), i2);
            try {
                this.f2216h = l.b(l.f(socketCreateSocket));
                this.f2217i = l.a(l.d(socketCreateSocket));
            } catch (NullPointerException e) {
                if (l.y.c.i.a(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(l.y.c.i.k("Failed to connect to ", this.b.d()));
            connectException.initCause(e2);
            throw connectException;
        }
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
    private final void j(m.h0.h.b bVar) throws Throwable {
        m.a aVarA = this.b.a();
        SSLSocketFactory sSLSocketFactoryK = aVarA.k();
        SSLSocket sSLSocket = null;
        try {
            l.y.c.i.c(sSLSocketFactoryK);
            Socket socketCreateSocket = sSLSocketFactoryK.createSocket(this.c, aVarA.l().i(), aVarA.l().n(), true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                m.l lVarA = bVar.a(sSLSocket2);
                if (lVarA.h()) {
                    m.h0.l.h.a.g().e(sSLSocket2, aVarA.l().i(), aVarA.f());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                t.a aVar = t.e;
                l.y.c.i.d(session, "sslSocketSession");
                t tVarA = aVar.a(session);
                HostnameVerifier hostnameVerifierE = aVarA.e();
                l.y.c.i.c(hostnameVerifierE);
                if (hostnameVerifierE.verify(aVarA.l().i(), session)) {
                    m.g gVarA = aVarA.a();
                    l.y.c.i.c(gVarA);
                    this.e = new t(tVarA.e(), tVarA.a(), tVarA.c(), new b(gVarA, tVarA, aVarA));
                    gVarA.b(aVarA.l().i(), new c());
                    String strG = lVarA.h() ? m.h0.l.h.a.g().g(sSLSocket2) : null;
                    this.d = sSLSocket2;
                    this.f2216h = l.b(l.f(sSLSocket2));
                    this.f2217i = l.a(l.d(sSLSocket2));
                    this.f = strG != null ? a0.b.a(strG) : a0.HTTP_1_1;
                    m.h0.l.h.a.g().b(sSLSocket2);
                    return;
                }
                List<Certificate> listD = tVarA.d();
                if (!(!listD.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVarA.l().i() + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) listD.get(0);
                throw new SSLPeerUnverifiedException(l.d0.i.e("\n              |Hostname " + aVarA.l().i() + " not verified:\n              |    certificate: " + m.g.c.a(x509Certificate) + "\n              |    DN: " + ((Object) x509Certificate.getSubjectDN().getName()) + "\n              |    subjectAltNames: " + m.h0.n.d.a.a(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    m.h0.l.h.a.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    m.h0.d.k(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void k(int i2, int i3, int i4, m.e eVar, r rVar) throws IOException {
        b0 b0VarM = m();
        v vVarJ = b0VarM.j();
        int i5 = 0;
        while (i5 < 21) {
            i5++;
            i(i2, i3, eVar, rVar);
            b0VarM = l(i3, i4, b0VarM, vVarJ);
            if (b0VarM == null) {
                return;
            }
            Socket socket = this.c;
            if (socket != null) {
                m.h0.d.k(socket);
            }
            this.c = null;
            this.f2217i = null;
            this.f2216h = null;
            rVar.h(eVar, this.b.d(), this.b.b(), null);
        }
    }

    private final b0 l(int i2, int i3, b0 b0Var, v vVar) throws IOException {
        String str = "CONNECT " + m.h0.d.P(vVar, true) + " HTTP/1.1";
        while (true) {
            n.d dVar = this.f2216h;
            l.y.c.i.c(dVar);
            n.c cVar = this.f2217i;
            l.y.c.i.c(cVar);
            m.h0.j.b bVar = new m.h0.j.b(null, this, dVar, cVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dVar.d().g(i2, timeUnit);
            cVar.d().g(i3, timeUnit);
            bVar.A(b0Var.e(), str);
            bVar.a();
            d0.a aVarG = bVar.g(false);
            l.y.c.i.c(aVarG);
            aVarG.s(b0Var);
            d0 d0VarC = aVarG.c();
            bVar.z(d0VarC);
            int iL = d0VarC.l();
            if (iL == 200) {
                if (dVar.a().z() && cVar.a().z()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iL != 407) {
                throw new IOException(l.y.c.i.k("Unexpected response code for CONNECT: ", Integer.valueOf(d0VarC.l())));
            }
            b0 b0VarA = this.b.a().h().a(this.b, d0VarC);
            if (b0VarA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (p.l(UnityWebViewActivityProxy.IntentActions.CLOSE, d0.Q(d0VarC, "Connection", null, 2, null), true)) {
                return b0VarA;
            }
            b0Var = b0VarA;
        }
    }

    private final b0 m() {
        b0.a aVar = new b0.a();
        aVar.p(this.b.a().l());
        aVar.f("CONNECT", null);
        aVar.d("Host", m.h0.d.P(this.b.a().l(), true));
        aVar.d("Proxy-Connection", "Keep-Alive");
        aVar.d("User-Agent", "okhttp/4.10.0");
        b0 b0VarA = aVar.a();
        d0.a aVar2 = new d0.a();
        aVar2.s(b0VarA);
        aVar2.q(a0.HTTP_1_1);
        aVar2.g(407);
        aVar2.n("Preemptive Authenticate");
        aVar2.b(m.h0.d.c);
        aVar2.t(-1L);
        aVar2.r(-1L);
        aVar2.k("Proxy-Authenticate", "OkHttp-Preemptive");
        b0 b0VarA2 = this.b.a().h().a(this.b, aVar2.c());
        return b0VarA2 == null ? b0VarA : b0VarA2;
    }

    private final void n(m.h0.h.b bVar, int i2, m.e eVar, r rVar) throws Throwable {
        if (this.b.a().k() != null) {
            rVar.C(eVar);
            j(bVar);
            rVar.B(eVar, this.e);
            if (this.f == a0.HTTP_2) {
                F(i2);
                return;
            }
            return;
        }
        List<a0> listF = this.b.a().f();
        a0 a0Var = a0.H2_PRIOR_KNOWLEDGE;
        if (!listF.contains(a0Var)) {
            this.d = this.c;
            this.f = a0.HTTP_1_1;
        } else {
            this.d = this.c;
            this.f = a0Var;
            F(i2);
        }
    }

    public f0 A() {
        return this.b;
    }

    public final void C(long j2) {
        this.q = j2;
    }

    public final void D(boolean z) {
        this.f2218j = z;
    }

    public Socket E() {
        Socket socket = this.d;
        l.y.c.i.c(socket);
        return socket;
    }

    public final synchronized void H(e eVar, IOException iOException) {
        int i2;
        l.y.c.i.e(eVar, "call");
        if (iOException instanceof m.h0.k.n) {
            if (((m.h0.k.n) iOException).a == m.h0.k.b.REFUSED_STREAM) {
                int i3 = this.f2222n + 1;
                this.f2222n = i3;
                if (i3 > 1) {
                    this.f2218j = true;
                    i2 = this.f2220l;
                    this.f2220l = i2 + 1;
                }
            } else if (((m.h0.k.n) iOException).a != m.h0.k.b.CANCEL || !eVar.f()) {
                this.f2218j = true;
                i2 = this.f2220l;
                this.f2220l = i2 + 1;
            }
        } else if (!w() || (iOException instanceof m.h0.k.a)) {
            this.f2218j = true;
            if (this.f2221m == 0) {
                if (iOException != null) {
                    h(eVar.o(), this.b, iOException);
                }
                i2 = this.f2220l;
                this.f2220l = i2 + 1;
            }
        }
    }

    @Override // m.j
    public a0 a() {
        a0 a0Var = this.f;
        l.y.c.i.c(a0Var);
        return a0Var;
    }

    @Override // m.h0.k.f.c
    public synchronized void b(m.h0.k.f fVar, m mVar) {
        l.y.c.i.e(fVar, "connection");
        l.y.c.i.e(mVar, "settings");
        this.f2223o = mVar.d();
    }

    @Override // m.h0.k.f.c
    public void c(m.h0.k.i iVar) {
        l.y.c.i.e(iVar, "stream");
        iVar.d(m.h0.k.b.REFUSED_STREAM, null);
    }

    public final void e() {
        Socket socket = this.c;
        if (socket == null) {
            return;
        }
        m.h0.d.k(socket);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111  */
    /* JADX WARN: Code duplicated, block: B:57:0x013b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0141  */
    /* JADX WARN: Code duplicated, block: B:60:0x0146  */
    /* JADX WARN: Code duplicated, block: B:77:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:0: B:71:0x009a->B:79:?, LOOP_END, SYNTHETIC] */
    public final void g(int i2, int i3, int i4, int i5, boolean z, m.e eVar, r rVar) throws Throwable {
        Socket socket;
        Socket socket2;
        l.y.c.i.e(eVar, "call");
        l.y.c.i.e(rVar, "eventListener");
        if (!(this.f == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        List<m.l> listB = this.b.a().b();
        m.h0.h.b bVar = new m.h0.h.b(listB);
        if (this.b.a().k() == null) {
            if (!listB.contains(m.l.f2302h)) {
                throw new i(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strI = this.b.a().l().i();
            if (!m.h0.l.h.a.g().i(strI)) {
                throw new i(new UnknownServiceException("CLEARTEXT communication to " + strI + " not permitted by network security policy"));
            }
        } else if (this.b.a().f().contains(a0.H2_PRIOR_KNOWLEDGE)) {
            throw new i(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        i iVar = null;
        while (true) {
            try {
                if (this.b.c()) {
                    k(i2, i3, i4, eVar, rVar);
                    if (this.c == null) {
                        break;
                    }
                } else {
                    try {
                        i(i2, i3, eVar, rVar);
                    } catch (IOException e) {
                        e = e;
                        socket = this.d;
                        if (socket != null) {
                            m.h0.d.k(socket);
                        }
                        socket2 = this.c;
                        if (socket2 != null) {
                            m.h0.d.k(socket2);
                        }
                        this.d = null;
                        this.c = null;
                        this.f2216h = null;
                        this.f2217i = null;
                        this.e = null;
                        this.f = null;
                        this.f2215g = null;
                        this.f2223o = 1;
                        rVar.i(eVar, this.b.d(), this.b.b(), null, e);
                        if (iVar == null) {
                            iVar = new i(e);
                        } else {
                            iVar.a(e);
                        }
                        if (z) {
                            throw iVar;
                        }
                        if (bVar.b(e)) {
                            throw iVar;
                        }
                    }
                }
                try {
                    n(bVar, i5, eVar, rVar);
                    rVar.h(eVar, this.b.d(), this.b.b(), this.f);
                    break;
                } catch (IOException e2) {
                    e = e2;
                    socket = this.d;
                    if (socket != null) {
                        m.h0.d.k(socket);
                    }
                    socket2 = this.c;
                    if (socket2 != null) {
                        m.h0.d.k(socket2);
                    }
                    this.d = null;
                    this.c = null;
                    this.f2216h = null;
                    this.f2217i = null;
                    this.e = null;
                    this.f = null;
                    this.f2215g = null;
                    this.f2223o = 1;
                    rVar.i(eVar, this.b.d(), this.b.b(), null, e);
                    if (iVar == null) {
                        iVar = new i(e);
                    } else {
                        iVar.a(e);
                    }
                    if (z) {
                        throw iVar;
                    }
                    if (bVar.b(e)) {
                        throw iVar;
                    }
                }
            } catch (IOException e3) {
                e = e3;
            }
        }
        if (this.b.c() && this.c == null) {
            throw new i(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.q = System.nanoTime();
    }

    public final void h(z zVar, f0 f0Var, IOException iOException) {
        l.y.c.i.e(zVar, "client");
        l.y.c.i.e(f0Var, "failedRoute");
        l.y.c.i.e(iOException, "failure");
        if (f0Var.b().type() != Proxy.Type.DIRECT) {
            m.a aVarA = f0Var.a();
            aVarA.i().connectFailed(aVarA.l().v(), f0Var.b().address(), iOException);
        }
        zVar.w().b(f0Var);
    }

    public final List<Reference<e>> o() {
        return this.p;
    }

    public final long p() {
        return this.q;
    }

    public final boolean q() {
        return this.f2218j;
    }

    public final int r() {
        return this.f2220l;
    }

    public t s() {
        return this.e;
    }

    public final synchronized void t() {
        this.f2221m++;
    }

    public String toString() {
        m.i iVarA;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.b.a().l().i());
        sb.append(':');
        sb.append(this.b.a().l().n());
        sb.append(", proxy=");
        sb.append(this.b.b());
        sb.append(" hostAddress=");
        sb.append(this.b.d());
        sb.append(" cipherSuite=");
        t tVar = this.e;
        Object obj = "none";
        if (tVar != null && (iVarA = tVar.a()) != null) {
            obj = iVarA;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u(m.a aVar, List<f0> list) {
        l.y.c.i.e(aVar, "address");
        if (m.h0.d.f2188g && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (this.p.size() >= this.f2223o || this.f2218j || !this.b.a().d(aVar)) {
            return false;
        }
        if (l.y.c.i.a(aVar.l().i(), A().a().l().i())) {
            return true;
        }
        if (this.f2215g == null || list == null || !B(list) || aVar.e() != m.h0.n.d.a || !G(aVar.l())) {
            return false;
        }
        try {
            m.g gVarA = aVar.a();
            l.y.c.i.c(gVarA);
            String strI = aVar.l().i();
            t tVarS = s();
            l.y.c.i.c(tVarS);
            gVarA.a(strI, tVarS.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean v(boolean z) {
        long jP;
        if (m.h0.d.f2188g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.c;
        l.y.c.i.c(socket);
        Socket socket2 = this.d;
        l.y.c.i.c(socket2);
        n.d dVar = this.f2216h;
        l.y.c.i.c(dVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        m.h0.k.f fVar = this.f2215g;
        if (fVar != null) {
            return fVar.v0(jNanoTime);
        }
        synchronized (this) {
            jP = jNanoTime - p();
        }
        if (jP < 10000000000L || !z) {
            return true;
        }
        return m.h0.d.C(socket2, dVar);
    }

    public final boolean w() {
        return this.f2215g != null;
    }

    public final m.h0.i.d x(z zVar, m.h0.i.g gVar) throws SocketException {
        l.y.c.i.e(zVar, "client");
        l.y.c.i.e(gVar, "chain");
        Socket socket = this.d;
        l.y.c.i.c(socket);
        n.d dVar = this.f2216h;
        l.y.c.i.c(dVar);
        n.c cVar = this.f2217i;
        l.y.c.i.c(cVar);
        m.h0.k.f fVar = this.f2215g;
        if (fVar != null) {
            return new m.h0.k.g(zVar, this, gVar, fVar);
        }
        socket.setSoTimeout(gVar.l());
        y yVarD = dVar.d();
        long jI = gVar.i();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yVarD.g(jI, timeUnit);
        cVar.d().g(gVar.k(), timeUnit);
        return new m.h0.j.b(zVar, this, dVar, cVar);
    }

    public final synchronized void y() {
        this.f2219k = true;
    }

    public final synchronized void z() {
        this.f2218j = true;
    }
}
