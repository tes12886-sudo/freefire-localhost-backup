package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z extends x {
    public z() {
        this.a.add(n0.EQUALS);
        this.a.add(n0.GREATER_THAN);
        this.a.add(n0.GREATER_THAN_EQUALS);
        this.a.add(n0.IDENTITY_EQUALS);
        this.a.add(n0.IDENTITY_NOT_EQUALS);
        this.a.add(n0.LESS_THAN);
        this.a.add(n0.LESS_THAN_EQUALS);
        this.a.add(n0.NOT_EQUALS);
    }

    private static boolean c(q qVar, q qVar2) {
        if (qVar instanceof m) {
            qVar = new u(qVar.b());
        }
        if (qVar2 instanceof m) {
            qVar2 = new u(qVar2.b());
        }
        if ((qVar instanceof u) && (qVar2 instanceof u)) {
            return qVar.b().compareTo(qVar2.b()) < 0;
        }
        double dDoubleValue = qVar.c().doubleValue();
        double dDoubleValue2 = qVar2.c().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || Double.compare(dDoubleValue, dDoubleValue2) >= 0) ? false : true;
    }

    private static boolean d(q qVar, q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof v) || (qVar instanceof o)) {
                return true;
            }
            if (qVar instanceof i) {
                if (Double.isNaN(qVar.c().doubleValue()) || Double.isNaN(qVar2.c().doubleValue())) {
                    return false;
                }
                return qVar.c().equals(qVar2.c());
            }
            if (qVar instanceof u) {
                return qVar.b().equals(qVar2.b());
            }
            if (qVar instanceof g) {
                return qVar.d().equals(qVar2.d());
            }
            return qVar == qVar2;
        }
        if (((qVar instanceof v) || (qVar instanceof o)) && ((qVar2 instanceof v) || (qVar2 instanceof o))) {
            return true;
        }
        boolean z = qVar instanceof i;
        if (z && (qVar2 instanceof u)) {
            return d(qVar, new i(qVar2.c()));
        }
        boolean z2 = qVar instanceof u;
        if ((!z2 || !(qVar2 instanceof i)) && !(qVar instanceof g)) {
            if (qVar2 instanceof g) {
                return d(qVar, new i(qVar2.c()));
            }
            if ((z2 || z) && (qVar2 instanceof m)) {
                return d(qVar, new u(qVar2.b()));
            }
            if ((qVar instanceof m) && ((qVar2 instanceof u) || (qVar2 instanceof i))) {
                return d(new u(qVar.b()), qVar2);
            }
            return false;
        }
        return d(new i(qVar.c()), qVar2);
    }

    private static boolean e(q qVar, q qVar2) {
        if (qVar instanceof m) {
            qVar = new u(qVar.b());
        }
        if (qVar2 instanceof m) {
            qVar2 = new u(qVar2.b());
        }
        return (((qVar instanceof u) && (qVar2 instanceof u)) || !(Double.isNaN(qVar.c().doubleValue()) || Double.isNaN(qVar2.c().doubleValue()))) && !c(qVar2, qVar);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, v4 v4Var, List<q> list) {
        boolean zD;
        boolean zD2;
        v5.a(v5.e(str).name(), 2, list);
        q qVarA = v4Var.a(list.get(0));
        q qVarA2 = v4Var.a(list.get(1));
        int iOrdinal = v5.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zD2 = d(qVarA, qVarA2);
            } else if (iOrdinal == 42) {
                zD = c(qVarA, qVarA2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zD = c(qVarA2, qVarA);
                        break;
                    case 38:
                        zD = e(qVarA2, qVarA);
                        break;
                    case 39:
                        zD = v5.f(qVarA, qVarA2);
                        break;
                    case 40:
                        zD2 = v5.f(qVarA, qVarA2);
                        break;
                    default:
                        super.b(str);
                        throw null;
                }
            } else {
                zD = e(qVarA, qVarA2);
            }
            zD = !zD2;
        } else {
            zD = d(qVarA, qVarA2);
        }
        return zD ? q.C : q.D;
    }
}
