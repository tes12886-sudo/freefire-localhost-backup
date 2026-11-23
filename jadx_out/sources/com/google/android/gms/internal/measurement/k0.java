package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends x {
    protected k0() {
        this.a.add(n0.ADD);
        this.a.add(n0.DIVIDE);
        this.a.add(n0.MODULUS);
        this.a.add(n0.MULTIPLY);
        this.a.add(n0.NEGATE);
        this.a.add(n0.POST_DECREMENT);
        this.a.add(n0.POST_INCREMENT);
        this.a.add(n0.PRE_DECREMENT);
        this.a.add(n0.PRE_INCREMENT);
        this.a.add(n0.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, v4 v4Var, List<q> list) {
        n0 n0Var = n0.ADD;
        int iOrdinal = v5.e(str).ordinal();
        if (iOrdinal == 0) {
            v5.a(n0Var.name(), 2, list);
            q qVarA = v4Var.a(list.get(0));
            q qVarA2 = v4Var.a(list.get(1));
            if (!(qVarA instanceof m) && !(qVarA instanceof u) && !(qVarA2 instanceof m) && !(qVarA2 instanceof u)) {
                return new i(Double.valueOf(qVarA.c().doubleValue() + qVarA2.c().doubleValue()));
            }
            String strValueOf = String.valueOf(qVarA.b());
            String strValueOf2 = String.valueOf(qVarA2.b());
            return new u(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        }
        if (iOrdinal == 21) {
            v5.a(n0.DIVIDE.name(), 2, list);
            return new i(Double.valueOf(v4Var.a(list.get(0)).c().doubleValue() / v4Var.a(list.get(1)).c().doubleValue()));
        }
        if (iOrdinal == 59) {
            v5.a(n0.SUBTRACT.name(), 2, list);
            return new i(Double.valueOf(v4Var.a(list.get(0)).c().doubleValue() + new i(Double.valueOf(-v4Var.a(list.get(1)).c().doubleValue())).c().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            v5.a(str, 2, list);
            q qVarA3 = v4Var.a(list.get(0));
            v4Var.a(list.get(1));
            return qVarA3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            v5.a(str, 1, list);
            return v4Var.a(list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                v5.a(n0.MODULUS.name(), 2, list);
                return new i(Double.valueOf(v4Var.a(list.get(0)).c().doubleValue() % v4Var.a(list.get(1)).c().doubleValue()));
            case 45:
                v5.a(n0.MULTIPLY.name(), 2, list);
                return new i(Double.valueOf(v4Var.a(list.get(0)).c().doubleValue() * v4Var.a(list.get(1)).c().doubleValue()));
            case 46:
                v5.a(n0.NEGATE.name(), 1, list);
                return new i(Double.valueOf(-v4Var.a(list.get(0)).c().doubleValue()));
            default:
                super.b(str);
                throw null;
        }
    }
}
