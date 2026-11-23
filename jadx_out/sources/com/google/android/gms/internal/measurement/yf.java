package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yf extends j {
    private final w7 c;
    final Map<String, j> d;

    public yf(w7 w7Var) {
        super("require");
        this.d = new HashMap();
        this.c = w7Var;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(v4 v4Var, List<q> list) {
        j jVarCall;
        v5.a("require", 1, list);
        String strB = v4Var.a(list.get(0)).b();
        if (this.d.containsKey(strB)) {
            return this.d.get(strB);
        }
        w7 w7Var = this.c;
        if (w7Var.a.containsKey(strB)) {
            try {
                jVarCall = w7Var.a.get(strB).call();
            } catch (Exception unused) {
                String strValueOf = String.valueOf(strB);
                throw new IllegalStateException(strValueOf.length() != 0 ? "Failed to create API implementation: ".concat(strValueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            jVarCall = q.x;
        }
        if (jVarCall instanceof j) {
            this.d.put(strB, (j) jVarCall);
        }
        return jVarCall;
    }
}
