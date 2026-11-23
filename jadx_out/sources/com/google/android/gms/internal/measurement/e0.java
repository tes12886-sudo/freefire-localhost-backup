package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends x {
    protected e0() {
        this.a.add(n0.AND);
        this.a.add(n0.NOT);
        this.a.add(n0.OR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, v4 v4Var, List<q> list) {
        n0 n0Var = n0.ADD;
        int iOrdinal = v5.e(str).ordinal();
        if (iOrdinal == 1) {
            v5.a(n0.AND.name(), 2, list);
            q qVarA = v4Var.a(list.get(0));
            if (!qVarA.d().booleanValue()) {
                return qVarA;
            }
        } else {
            if (iOrdinal == 47) {
                v5.a(n0.NOT.name(), 1, list);
                return new g(Boolean.valueOf(!v4Var.a(list.get(0)).d().booleanValue()));
            }
            if (iOrdinal != 50) {
                super.b(str);
                throw null;
            }
            v5.a(n0.OR.name(), 2, list);
            q qVarA2 = v4Var.a(list.get(0));
            if (qVarA2.d().booleanValue()) {
                return qVarA2;
            }
        }
        return v4Var.a(list.get(1));
    }
}
