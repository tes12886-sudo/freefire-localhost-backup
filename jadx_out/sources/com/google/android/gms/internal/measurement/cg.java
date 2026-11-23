package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class cg {
    final TreeMap<Integer, p> a = new TreeMap<>();
    final TreeMap<Integer, p> b = new TreeMap<>();

    private static final int c(v4 v4Var, p pVar, q qVar) {
        q qVarA = pVar.a(v4Var, Collections.singletonList(qVar));
        if (qVarA instanceof i) {
            return v5.g(qVarA.c().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i2, p pVar, String str2) {
        TreeMap<Integer, p> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.b;
        } else {
            if (!"edit".equals(str2)) {
                String strValueOf = String.valueOf(str2);
                throw new IllegalStateException(strValueOf.length() != 0 ? "Unknown callback type: ".concat(strValueOf) : new String("Unknown callback type: "));
            }
            treeMap = this.a;
        }
        if (treeMap.containsKey(Integer.valueOf(i2))) {
            i2 = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i2), pVar);
    }

    public final void b(v4 v4Var, c cVar) {
        u9 u9Var = new u9(cVar);
        for (Integer num : this.a.keySet()) {
            b bVarClone = cVar.c().clone();
            int iC = c(v4Var, this.a.get(num), u9Var);
            if (iC == 2 || iC == -1) {
                cVar.d(bVarClone);
            }
        }
        Iterator<Integer> it = this.b.keySet().iterator();
        while (it.hasNext()) {
            c(v4Var, this.b.get(it.next()), u9Var);
        }
    }
}
