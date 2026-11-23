package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w8 extends j {
    private final c c;

    public w8(c cVar) {
        super("internal.eventLogger");
        this.c = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(v4 v4Var, List<q> list) {
        v5.a(this.a, 3, list);
        String strB = v4Var.a(list.get(0)).b();
        long jI = (long) v5.i(v4Var.a(list.get(1)).c().doubleValue());
        q qVarA = v4Var.a(list.get(2));
        HashMap map = new HashMap();
        if (qVarA instanceof n) {
            n nVar = (n) qVarA;
            for (String str : nVar.a()) {
                Object objJ = v5.j(nVar.f(str));
                if (objJ != null) {
                    map.put(str, objJ);
                }
            }
        }
        this.c.e(strB, jI, map);
        return q.x;
    }
}
