package j.g.a.a.a.y.i;

import j.g.a.a.a.k;
import j.g.a.a.a.p;
import j.g.a.a.a.r;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import m.b0;
import m.c0;
import m.d0;
import m.s;
import m.v;
import m.w;

/* JADX INFO: loaded from: classes.dex */
public class a implements w {
    final k<? extends r> a;
    final p b;

    public a(k<? extends r> kVar, p pVar) {
        this.a = kVar;
        this.b = pVar;
    }

    @Override // m.w
    public d0 a(w.a aVar) {
        b0 b0VarC = aVar.c();
        b0.a aVarH = b0VarC.h();
        aVarH.p(d(b0VarC.j()));
        b0 b0VarA = aVarH.a();
        b0.a aVarH2 = b0VarA.h();
        aVarH2.d("Authorization", b(b0VarA));
        return aVar.a(aVarH2.a());
    }

    String b(b0 b0Var) {
        return new j.g.a.a.a.y.j.b().a(this.b, (r) this.a.a(), null, b0Var.g(), b0Var.j().toString(), c(b0Var));
    }

    Map<String, String> c(b0 b0Var) {
        HashMap map = new HashMap();
        if ("POST".equals(b0Var.g().toUpperCase(Locale.US))) {
            c0 c0VarA = b0Var.a();
            if (c0VarA instanceof s) {
                s sVar = (s) c0VarA;
                for (int i2 = 0; i2 < sVar.k(); i2++) {
                    map.put(sVar.i(i2), sVar.l(i2));
                }
            }
        }
        return map;
    }

    v d(v vVar) {
        v.a aVarK = vVar.k();
        aVarK.v(null);
        int iR = vVar.r();
        for (int i2 = 0; i2 < iR; i2++) {
            aVarK.a(c.c(vVar.p(i2)), c.c(vVar.q(i2)));
        }
        return aVarK.c();
    }
}
