package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k {
    public static q a(m mVar, q qVar, v4 v4Var, List<q> list) {
        if (mVar.n(qVar.b())) {
            q qVarF = mVar.f(qVar.b());
            if (qVarF instanceof j) {
                return ((j) qVarF).a(v4Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", qVar.b()));
        }
        if (!"hasOwnProperty".equals(qVar.b())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", qVar.b()));
        }
        v5.a("hasOwnProperty", 1, list);
        return mVar.n(v4Var.a(list.get(0)).b()) ? q.C : q.D;
    }

    public static Iterator<q> b(Map<String, q> map) {
        return new l(map.keySet().iterator());
    }
}
