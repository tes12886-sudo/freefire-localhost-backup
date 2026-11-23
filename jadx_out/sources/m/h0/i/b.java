package m.h0.i;

import com.garena.unity.webview.UnityWebViewActivityProxy;
import java.io.IOException;
import java.net.ProtocolException;
import l.d0.p;
import m.b0;
import m.c0;
import m.d0;
import m.e0;
import m.w;
import n.l;

/* JADX INFO: loaded from: classes.dex */
public final class b implements w {
    private final boolean a;

    public b(boolean z) {
        this.a = z;
    }

    @Override // m.w
    public d0 a(w.a aVar) throws IOException {
        d0.a aVarP;
        boolean z;
        d0.a aVarB0;
        e0 e0VarO;
        l.y.c.i.e(aVar, "chain");
        g gVar = (g) aVar;
        m.h0.h.c cVarH = gVar.h();
        l.y.c.i.c(cVarH);
        b0 b0VarJ = gVar.j();
        c0 c0VarA = b0VarJ.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        cVarH.t(b0VarJ);
        if (!f.b(b0VarJ.g()) || c0VarA == null) {
            cVarH.n();
            aVarP = null;
            z = true;
        } else {
            if (p.l("100-continue", b0VarJ.d("Expect"), true)) {
                cVarH.f();
                aVarP = cVarH.p(true);
                cVarH.r();
                z = false;
            } else {
                aVarP = null;
                z = true;
            }
            if (aVarP != null) {
                cVarH.n();
                if (!cVarH.h().w()) {
                    cVarH.m();
                }
            } else if (c0VarA.f()) {
                cVarH.f();
                c0VarA.h(l.a(cVarH.c(b0VarJ, true)));
            } else {
                n.c cVarA = l.a(cVarH.c(b0VarJ, false));
                c0VarA.h(cVarA);
                cVarA.close();
            }
        }
        if (c0VarA == null || !c0VarA.f()) {
            cVarH.e();
        }
        if (aVarP == null) {
            aVarP = cVarH.p(false);
            l.y.c.i.c(aVarP);
            if (z) {
                cVarH.r();
                z = false;
            }
        }
        aVarP.s(b0VarJ);
        aVarP.j(cVarH.h().s());
        aVarP.t(jCurrentTimeMillis);
        aVarP.r(System.currentTimeMillis());
        d0 d0VarC = aVarP.c();
        int iL = d0VarC.l();
        if (iL == 100) {
            d0.a aVarP2 = cVarH.p(false);
            l.y.c.i.c(aVarP2);
            if (z) {
                cVarH.r();
            }
            aVarP2.s(b0VarJ);
            aVarP2.j(cVarH.h().s());
            aVarP2.t(jCurrentTimeMillis);
            aVarP2.r(System.currentTimeMillis());
            d0VarC = aVarP2.c();
            iL = d0VarC.l();
        }
        cVarH.q(d0VarC);
        if (this.a && iL == 101) {
            aVarB0 = d0VarC.b0();
            e0VarO = m.h0.d.c;
        } else {
            aVarB0 = d0VarC.b0();
            e0VarO = cVarH.o(d0VarC);
        }
        aVarB0.b(e0VarO);
        d0 d0VarC2 = aVarB0.c();
        if (p.l(UnityWebViewActivityProxy.IntentActions.CLOSE, d0VarC2.f0().d("Connection"), true) || p.l(UnityWebViewActivityProxy.IntentActions.CLOSE, d0.Q(d0VarC2, "Connection", null, 2, null), true)) {
            cVarH.m();
        }
        if (iL == 204 || iL == 205) {
            e0 e0VarB = d0VarC2.b();
            if ((e0VarB == null ? -1L : e0VarB.j()) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(iL);
                sb.append(" had non-zero Content-Length: ");
                e0 e0VarB2 = d0VarC2.b();
                sb.append(e0VarB2 != null ? Long.valueOf(e0VarB2.j()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return d0VarC2;
    }
}
