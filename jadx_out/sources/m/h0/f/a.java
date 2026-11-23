package m.h0.f;

import java.io.IOException;
import l.d0.p;
import l.y.c.f;
import l.y.c.i;
import m.a0;
import m.b0;
import m.d0;
import m.e;
import m.e0;
import m.h0.d;
import m.r;
import m.u;
import m.w;

/* JADX INFO: loaded from: classes.dex */
public final class a implements w {
    public static final C0263a b = new C0263a(null);
    private final m.c a;

    /* JADX INFO: renamed from: m.h0.f.a$a, reason: collision with other inner class name */
    public static final class C0263a {
        private C0263a() {
        }

        public /* synthetic */ C0263a(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final u c(u uVar, u uVar2) {
            u.a aVar = new u.a();
            int size = uVar.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + 1;
                String strC = uVar.c(i3);
                String strH = uVar.h(i3);
                if ((!p.l("Warning", strC, true) || !p.x(strH, "1", false, 2, null)) && (d(strC) || !e(strC) || uVar2.b(strC) == null)) {
                    aVar.d(strC, strH);
                }
                i3 = i4;
            }
            int size2 = uVar2.size();
            while (i2 < size2) {
                int i5 = i2 + 1;
                String strC2 = uVar2.c(i2);
                if (!d(strC2) && e(strC2)) {
                    aVar.d(strC2, uVar2.h(i2));
                }
                i2 = i5;
            }
            return aVar.e();
        }

        private final boolean d(String str) {
            return p.l("Content-Length", str, true) || p.l("Content-Encoding", str, true) || p.l("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return (p.l("Connection", str, true) || p.l("Keep-Alive", str, true) || p.l("Proxy-Authenticate", str, true) || p.l("Proxy-Authorization", str, true) || p.l("TE", str, true) || p.l("Trailers", str, true) || p.l("Transfer-Encoding", str, true) || p.l("Upgrade", str, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d0 f(d0 d0Var) {
            if ((d0Var == null ? null : d0Var.b()) == null) {
                return d0Var;
            }
            d0.a aVarB0 = d0Var.b0();
            aVarB0.b(null);
            return aVarB0.c();
        }
    }

    public a(m.c cVar) {
    }

    @Override // m.w
    public d0 a(w.a aVar) {
        i.e(aVar, "chain");
        e eVarCall = aVar.call();
        m.c cVar = this.a;
        if (cVar != null) {
            cVar.b(aVar.c());
            throw null;
        }
        c cVarB = new c.b(System.currentTimeMillis(), aVar.c(), null).b();
        b0 b0VarB = cVarB.b();
        d0 d0VarA = cVarB.a();
        m.c cVar2 = this.a;
        if (cVar2 != null) {
            cVar2.l(cVarB);
            throw null;
        }
        m.h0.h.e eVar = eVarCall instanceof m.h0.h.e ? (m.h0.h.e) eVarCall : null;
        r rVarQ = eVar == null ? null : eVar.q();
        if (rVarQ == null) {
            rVarQ = r.a;
        }
        if (b0VarB == null && d0VarA == null) {
            d0.a aVar2 = new d0.a();
            aVar2.s(aVar.c());
            aVar2.q(a0.HTTP_1_1);
            aVar2.g(504);
            aVar2.n("Unsatisfiable Request (only-if-cached)");
            aVar2.b(d.c);
            aVar2.t(-1L);
            aVar2.r(System.currentTimeMillis());
            d0 d0VarC = aVar2.c();
            rVarQ.A(eVarCall, d0VarC);
            return d0VarC;
        }
        if (b0VarB == null) {
            i.c(d0VarA);
            d0.a aVarB0 = d0VarA.b0();
            aVarB0.d(b.f(d0VarA));
            d0 d0VarC2 = aVarB0.c();
            rVarQ.b(eVarCall, d0VarC2);
            return d0VarC2;
        }
        if (d0VarA != null) {
            rVarQ.a(eVarCall, d0VarA);
        } else if (this.a != null) {
            rVarQ.c(eVarCall);
        }
        d0 d0VarA2 = aVar.a(b0VarB);
        if (d0VarA != null) {
            boolean z = false;
            if (d0VarA2 != null && d0VarA2.l() == 304) {
                z = true;
            }
            if (z) {
                d0.a aVarB1 = d0VarA.b0();
                C0263a c0263a = b;
                aVarB1.l(c0263a.c(d0VarA.T(), d0VarA2.T()));
                aVarB1.t(d0VarA2.g0());
                aVarB1.r(d0VarA2.e0());
                aVarB1.d(c0263a.f(d0VarA));
                aVarB1.o(c0263a.f(d0VarA2));
                aVarB1.c();
                e0 e0VarB = d0VarA2.b();
                i.c(e0VarB);
                e0VarB.close();
                m.c cVar3 = this.a;
                i.c(cVar3);
                cVar3.j();
                throw null;
            }
            e0 e0VarB2 = d0VarA.b();
            if (e0VarB2 != null) {
                d.j(e0VarB2);
            }
        }
        i.c(d0VarA2);
        d0.a aVarB2 = d0VarA2.b0();
        C0263a c0263a2 = b;
        aVarB2.d(c0263a2.f(d0VarA));
        aVarB2.o(c0263a2.f(d0VarA2));
        d0 d0VarC3 = aVarB2.c();
        if (this.a != null) {
            if (m.h0.i.e.b(d0VarC3) && c.c.a(d0VarC3, b0VarB)) {
                this.a.c(d0VarC3);
                throw null;
            }
            if (m.h0.i.f.a.a(b0VarB.g())) {
                try {
                    this.a.f(b0VarB);
                    throw null;
                } catch (IOException unused) {
                }
            }
        }
        return d0VarC3;
    }
}
