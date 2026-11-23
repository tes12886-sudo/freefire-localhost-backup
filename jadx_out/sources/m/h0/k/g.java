package m.h0.k;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m.a0;
import m.b0;
import m.d0;
import m.u;
import m.z;
import n.v;
import n.x;
import n.y;

/* JADX INFO: loaded from: classes.dex */
public final class g implements m.h0.i.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f2273g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List<String> f2274h = m.h0.d.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List<String> f2275i = m.h0.d.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final m.h0.h.f a;
    private final m.h0.i.g b;
    private final f c;
    private volatile i d;
    private final a0 e;
    private volatile boolean f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final List<c> a(b0 b0Var) {
            l.y.c.i.e(b0Var, "request");
            u uVarE = b0Var.e();
            ArrayList arrayList = new ArrayList(uVarE.size() + 4);
            arrayList.add(new c(c.f, b0Var.g()));
            arrayList.add(new c(c.f2241g, m.h0.i.i.a.c(b0Var.j())));
            String strD = b0Var.d("Host");
            if (strD != null) {
                arrayList.add(new c(c.f2243i, strD));
            }
            arrayList.add(new c(c.f2242h, b0Var.j().u()));
            int i2 = 0;
            int size = uVarE.size();
            while (i2 < size) {
                int i3 = i2 + 1;
                String strC = uVarE.c(i2);
                Locale locale = Locale.US;
                l.y.c.i.d(locale, "US");
                String lowerCase = strC.toLowerCase(locale);
                l.y.c.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!g.f2274h.contains(lowerCase) || (l.y.c.i.a(lowerCase, "te") && l.y.c.i.a(uVarE.h(i2), "trailers"))) {
                    arrayList.add(new c(lowerCase, uVarE.h(i2)));
                }
                i2 = i3;
            }
            return arrayList;
        }

        public final d0.a b(u uVar, a0 a0Var) throws ProtocolException {
            l.y.c.i.e(uVar, "headerBlock");
            l.y.c.i.e(a0Var, "protocol");
            u.a aVar = new u.a();
            int size = uVar.size();
            m.h0.i.k kVarA = null;
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                String strC = uVar.c(i2);
                String strH = uVar.h(i2);
                if (l.y.c.i.a(strC, ":status")) {
                    kVarA = m.h0.i.k.d.a(l.y.c.i.k("HTTP/1.1 ", strH));
                } else if (!g.f2275i.contains(strC)) {
                    aVar.d(strC, strH);
                }
                i2 = i3;
            }
            if (kVarA == null) {
                throw new ProtocolException("Expected ':status' header not present");
            }
            d0.a aVar2 = new d0.a();
            aVar2.q(a0Var);
            aVar2.g(kVarA.b);
            aVar2.n(kVarA.c);
            aVar2.l(aVar.e());
            return aVar2;
        }
    }

    public g(z zVar, m.h0.h.f fVar, m.h0.i.g gVar, f fVar2) {
        l.y.c.i.e(zVar, "client");
        l.y.c.i.e(fVar, "connection");
        l.y.c.i.e(gVar, "chain");
        l.y.c.i.e(fVar2, "http2Connection");
        this.a = fVar;
        this.b = gVar;
        this.c = fVar2;
        List<a0> listB = zVar.B();
        a0 a0Var = a0.H2_PRIOR_KNOWLEDGE;
        this.e = listB.contains(a0Var) ? a0Var : a0.HTTP_2;
    }

    @Override // m.h0.i.d
    public void a() {
        i iVar = this.d;
        l.y.c.i.c(iVar);
        iVar.n().close();
    }

    @Override // m.h0.i.d
    public void b(b0 b0Var) throws IOException {
        l.y.c.i.e(b0Var, "request");
        if (this.d != null) {
            return;
        }
        this.d = this.c.x0(f2273g.a(b0Var), b0Var.a() != null);
        if (this.f) {
            i iVar = this.d;
            l.y.c.i.c(iVar);
            iVar.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        i iVar2 = this.d;
        l.y.c.i.c(iVar2);
        y yVarV = iVar2.v();
        long jI = this.b.i();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yVarV.g(jI, timeUnit);
        i iVar3 = this.d;
        l.y.c.i.c(iVar3);
        iVar3.G().g(this.b.k(), timeUnit);
    }

    @Override // m.h0.i.d
    public void c() {
        this.c.flush();
    }

    @Override // m.h0.i.d
    public void cancel() {
        this.f = true;
        i iVar = this.d;
        if (iVar == null) {
            return;
        }
        iVar.f(b.CANCEL);
    }

    @Override // m.h0.i.d
    public long d(d0 d0Var) {
        l.y.c.i.e(d0Var, "response");
        if (m.h0.i.e.b(d0Var)) {
            return m.h0.d.s(d0Var);
        }
        return 0L;
    }

    @Override // m.h0.i.d
    public x e(d0 d0Var) {
        l.y.c.i.e(d0Var, "response");
        i iVar = this.d;
        l.y.c.i.c(iVar);
        return iVar.p();
    }

    @Override // m.h0.i.d
    public v f(b0 b0Var, long j2) {
        l.y.c.i.e(b0Var, "request");
        i iVar = this.d;
        l.y.c.i.c(iVar);
        return iVar.n();
    }

    @Override // m.h0.i.d
    public d0.a g(boolean z) throws ProtocolException {
        i iVar = this.d;
        l.y.c.i.c(iVar);
        d0.a aVarB = f2273g.b(iVar.E(), this.e);
        if (z && aVarB.h() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // m.h0.i.d
    public m.h0.h.f h() {
        return this.a;
    }
}
