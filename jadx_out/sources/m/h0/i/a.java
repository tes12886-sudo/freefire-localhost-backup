package m.h0.i;

import java.util.List;
import l.d0.p;
import m.b0;
import m.c0;
import m.d0;
import m.e0;
import m.m;
import m.n;
import m.u;
import m.w;
import m.x;
import n.l;

/* JADX INFO: loaded from: classes.dex */
public final class a implements w {
    private final n a;

    public a(n nVar) {
        l.y.c.i.e(nVar, "cookieJar");
        this.a = nVar;
    }

    private final String b(List<m> list) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                l.t.k.n();
                throw null;
            }
            m mVar = (m) obj;
            if (i2 > 0) {
                sb.append("; ");
            }
            sb.append(mVar.i());
            sb.append('=');
            sb.append(mVar.n());
            i2 = i3;
        }
        String string = sb.toString();
        l.y.c.i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // m.w
    public d0 a(w.a aVar) {
        e0 e0VarB;
        l.y.c.i.e(aVar, "chain");
        b0 b0VarC = aVar.c();
        b0.a aVarH = b0VarC.h();
        c0 c0VarA = b0VarC.a();
        if (c0VarA != null) {
            x xVarB = c0VarA.b();
            if (xVarB != null) {
                aVarH.d("Content-Type", xVarB.toString());
            }
            long jA = c0VarA.a();
            if (jA != -1) {
                aVarH.d("Content-Length", String.valueOf(jA));
                aVarH.h("Transfer-Encoding");
            } else {
                aVarH.d("Transfer-Encoding", "chunked");
                aVarH.h("Content-Length");
            }
        }
        boolean z = false;
        if (b0VarC.d("Host") == null) {
            aVarH.d("Host", m.h0.d.Q(b0VarC.j(), false, 1, null));
        }
        if (b0VarC.d("Connection") == null) {
            aVarH.d("Connection", "Keep-Alive");
        }
        if (b0VarC.d("Accept-Encoding") == null && b0VarC.d("Range") == null) {
            aVarH.d("Accept-Encoding", "gzip");
            z = true;
        }
        List<m> listA = this.a.a(b0VarC.j());
        if (!listA.isEmpty()) {
            aVarH.d("Cookie", b(listA));
        }
        if (b0VarC.d("User-Agent") == null) {
            aVarH.d("User-Agent", "okhttp/4.10.0");
        }
        d0 d0VarA = aVar.a(aVarH.a());
        e.f(this.a, b0VarC.j(), d0VarA.T());
        d0.a aVarB0 = d0VarA.b0();
        aVarB0.s(b0VarC);
        if (z && p.l("gzip", d0.Q(d0VarA, "Content-Encoding", null, 2, null), true) && e.b(d0VarA) && (e0VarB = d0VarA.b()) != null) {
            n.i iVar = new n.i(e0VarB.F());
            u.a aVarD = d0VarA.T().d();
            aVarD.g("Content-Encoding");
            aVarD.g("Content-Length");
            aVarB0.l(aVarD.e());
            aVarB0.b(new h(d0.Q(d0VarA, "Content-Type", null, 2, null), -1L, l.b(iVar)));
        }
        return aVarB0.c();
    }
}
