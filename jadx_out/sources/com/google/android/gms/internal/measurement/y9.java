package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class y9 {
    y9() {
    }

    public static final int a(int i2, Object obj, Object obj2) {
        x9 x9Var = (x9) obj;
        if (x9Var.isEmpty()) {
            return 0;
        }
        Iterator it = x9Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object b(Object obj, Object obj2) {
        x9 x9VarE = (x9) obj;
        x9 x9Var = (x9) obj2;
        if (!x9Var.isEmpty()) {
            if (!x9VarE.h()) {
                x9VarE = x9VarE.e();
            }
            x9VarE.d(x9Var);
        }
        return x9VarE;
    }
}
