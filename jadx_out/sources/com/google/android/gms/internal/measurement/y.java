package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    final Map<String, x> a = new HashMap();
    final l0 b = new l0();

    public y() {
        a(new w());
        a(new z());
        a(new a0());
        a(new e0());
        a(new j0());
        a(new k0());
        a(new m0());
    }

    final void a(x xVar) {
        Iterator<n0> it = xVar.a.iterator();
        while (it.hasNext()) {
            this.a.put(it.next().c().toString(), xVar);
        }
    }

    public final q b(v4 v4Var, q qVar) {
        v5.k(v4Var);
        if (!(qVar instanceof r)) {
            return qVar;
        }
        r rVar = (r) qVar;
        ArrayList<q> arrayListE = rVar.e();
        String strA = rVar.a();
        return (this.a.containsKey(strA) ? this.a.get(strA) : this.b).a(strA, v4Var, arrayListE);
    }
}
