package m.h0.i;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import l.t.m;
import l.t.u;
import m.b0;
import m.c0;
import m.d0;
import m.e0;
import m.f0;
import m.v;
import m.w;
import m.z;

/* JADX INFO: loaded from: classes.dex */
public final class j implements w {
    private final z a;

    public j(z zVar) {
        l.y.c.i.e(zVar, "client");
        this.a = zVar;
    }

    private final b0 b(d0 d0Var, String str) {
        String strQ;
        v vVarT;
        c0 c0VarA = null;
        if (!this.a.t() || (strQ = d0.Q(d0Var, "Location", null, 2, null)) == null || (vVarT = d0Var.f0().j().t(strQ)) == null) {
            return null;
        }
        if (!l.y.c.i.a(vVarT.u(), d0Var.f0().j().u()) && !this.a.v()) {
            return null;
        }
        b0.a aVarH = d0Var.f0().h();
        if (f.b(str)) {
            int iL = d0Var.l();
            f fVar = f.a;
            boolean z = fVar.d(str) || iL == 308 || iL == 307;
            if (fVar.c(str) && iL != 308 && iL != 307) {
                str = "GET";
            } else if (z) {
                c0VarA = d0Var.f0().a();
            }
            aVarH.f(str, c0VarA);
            if (!z) {
                aVarH.h("Transfer-Encoding");
                aVarH.h("Content-Length");
                aVarH.h("Content-Type");
            }
        }
        if (!m.h0.d.h(d0Var.f0().j(), vVarT)) {
            aVarH.h("Authorization");
        }
        aVarH.p(vVarT);
        return aVarH.a();
    }

    private final b0 c(d0 d0Var, m.h0.h.c cVar) throws ProtocolException {
        m.h0.h.f fVarH;
        f0 f0VarA = (cVar == null || (fVarH = cVar.h()) == null) ? null : fVarH.A();
        int iL = d0Var.l();
        String strG = d0Var.f0().g();
        if (iL != 307 && iL != 308) {
            if (iL == 401) {
                return this.a.g().a(f0VarA, d0Var);
            }
            if (iL == 421) {
                c0 c0VarA = d0Var.f0().a();
                if ((c0VarA != null && c0VarA.g()) || cVar == null || !cVar.k()) {
                    return null;
                }
                cVar.h().y();
                return d0Var.f0();
            }
            if (iL == 503) {
                d0 d0VarC0 = d0Var.c0();
                if ((d0VarC0 == null || d0VarC0.l() != 503) && g(d0Var, Integer.MAX_VALUE) == 0) {
                    return d0Var.f0();
                }
                return null;
            }
            if (iL == 407) {
                l.y.c.i.c(f0VarA);
                if (f0VarA.b().type() == Proxy.Type.HTTP) {
                    return this.a.D().a(f0VarA, d0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iL == 408) {
                if (!this.a.H()) {
                    return null;
                }
                c0 c0VarA2 = d0Var.f0().a();
                if (c0VarA2 != null && c0VarA2.g()) {
                    return null;
                }
                d0 d0VarC1 = d0Var.c0();
                if ((d0VarC1 == null || d0VarC1.l() != 408) && g(d0Var, 0) <= 0) {
                    return d0Var.f0();
                }
                return null;
            }
            switch (iL) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(d0Var, strG);
    }

    private final boolean d(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean e(IOException iOException, m.h0.h.e eVar, b0 b0Var, boolean z) {
        if (this.a.H()) {
            return !(z && f(iOException, b0Var)) && d(iOException, z) && eVar.B();
        }
        return false;
    }

    private final boolean f(IOException iOException, b0 b0Var) {
        c0 c0VarA = b0Var.a();
        return (c0VarA != null && c0VarA.g()) || (iOException instanceof FileNotFoundException);
    }

    private final int g(d0 d0Var, int i2) {
        String strQ = d0.Q(d0Var, "Retry-After", null, 2, null);
        if (strQ == null) {
            return i2;
        }
        if (!new l.d0.f("\\d+").a(strQ)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strQ);
        l.y.c.i.d(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // m.w
    public d0 a(w.a aVar) {
        IOException e;
        l.y.c.i.e(aVar, "chain");
        g gVar = (g) aVar;
        b0 b0VarJ = gVar.j();
        m.h0.h.e eVarF = gVar.f();
        List listG = m.g();
        d0 d0Var = null;
        boolean z = true;
        int i2 = 0;
        while (true) {
            eVarF.m(b0VarJ, z);
            try {
                if (eVarF.f()) {
                    throw new IOException("Canceled");
                }
                try {
                    d0 d0VarA = gVar.a(b0VarJ);
                    if (d0Var != null) {
                        d0.a aVarB0 = d0VarA.b0();
                        d0.a aVarB1 = d0Var.b0();
                        aVarB1.b(null);
                        aVarB0.p(aVarB1.c());
                        d0VarA = aVarB0.c();
                    }
                    d0Var = d0VarA;
                    m.h0.h.c cVarS = eVarF.s();
                    b0 b0VarC = c(d0Var, cVarS);
                    if (b0VarC == null) {
                        if (cVarS != null && cVarS.l()) {
                            eVarF.D();
                        }
                        eVarF.n(false);
                        return d0Var;
                    }
                    c0 c0VarA = b0VarC.a();
                    if (c0VarA != null && c0VarA.g()) {
                        eVarF.n(false);
                        return d0Var;
                    }
                    e0 e0VarB = d0Var.b();
                    if (e0VarB != null) {
                        m.h0.d.j(e0VarB);
                    }
                    i2++;
                    if (i2 > 20) {
                        throw new ProtocolException(l.y.c.i.k("Too many follow-up requests: ", Integer.valueOf(i2)));
                    }
                    eVarF.n(true);
                    b0VarJ = b0VarC;
                    z = true;
                } catch (IOException e2) {
                    e = e2;
                    if (!e(e, eVarF, b0VarJ, !(e instanceof m.h0.k.a))) {
                        m.h0.d.X(e, listG);
                        throw e;
                    }
                    listG = u.I(listG, e);
                    eVarF.n(true);
                    z = false;
                } catch (m.h0.h.i e3) {
                    if (!e(e3.c(), eVarF, b0VarJ, false)) {
                        IOException iOExceptionB = e3.b();
                        m.h0.d.X(iOExceptionB, listG);
                        throw iOExceptionB;
                    }
                    e = e3.b();
                    listG = u.I(listG, e);
                    eVarF.n(true);
                    z = false;
                }
            } catch (Throwable th) {
                eVarF.n(true);
                throw th;
            }
        }
    }
}
