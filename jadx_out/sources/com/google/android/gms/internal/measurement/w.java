package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w extends x {
    public w() {
        this.a.add(n0.BITWISE_AND);
        this.a.add(n0.BITWISE_LEFT_SHIFT);
        this.a.add(n0.BITWISE_NOT);
        this.a.add(n0.BITWISE_OR);
        this.a.add(n0.BITWISE_RIGHT_SHIFT);
        this.a.add(n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(n0.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, v4 v4Var, List<q> list) {
        n0 n0Var = n0.ADD;
        switch (v5.e(str).ordinal()) {
            case 4:
                v5.a(n0.BITWISE_AND.name(), 2, list);
                return new i(Double.valueOf(v5.g(v4Var.a(list.get(0)).c().doubleValue()) & v5.g(v4Var.a(list.get(1)).c().doubleValue())));
            case 5:
                v5.a(n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(v5.g(v4Var.a(list.get(0)).c().doubleValue()) << ((int) (v5.h(v4Var.a(list.get(1)).c().doubleValue()) & 31))));
            case 6:
                v5.a(n0.BITWISE_NOT.name(), 1, list);
                return new i(Double.valueOf(v5.g(v4Var.a(list.get(0)).c().doubleValue()) ^ (-1)));
            case 7:
                v5.a(n0.BITWISE_OR.name(), 2, list);
                return new i(Double.valueOf(v5.g(v4Var.a(list.get(0)).c().doubleValue()) | v5.g(v4Var.a(list.get(1)).c().doubleValue())));
            case 8:
                v5.a(n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(v5.g(v4Var.a(list.get(0)).c().doubleValue()) >> ((int) (v5.h(v4Var.a(list.get(1)).c().doubleValue()) & 31))));
            case 9:
                v5.a(n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new i(Double.valueOf(v5.h(v4Var.a(list.get(0)).c().doubleValue()) >>> ((int) (v5.h(v4Var.a(list.get(1)).c().doubleValue()) & 31))));
            case 10:
                v5.a(n0.BITWISE_XOR.name(), 2, list);
                return new i(Double.valueOf(v5.g(v4Var.a(list.get(0)).c().doubleValue()) ^ v5.g(v4Var.a(list.get(1)).c().doubleValue())));
            default:
                super.b(str);
                throw null;
        }
    }
}
