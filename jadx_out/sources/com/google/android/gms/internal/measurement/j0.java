package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends x {
    protected j0() {
        this.a.add(n0.FOR_IN);
        this.a.add(n0.FOR_IN_CONST);
        this.a.add(n0.FOR_IN_LET);
        this.a.add(n0.FOR_LET);
        this.a.add(n0.FOR_OF);
        this.a.add(n0.FOR_OF_CONST);
        this.a.add(n0.FOR_OF_LET);
        this.a.add(n0.WHILE);
    }

    private static q c(h0 h0Var, q qVar, q qVar2) {
        return e(h0Var, qVar.h(), qVar2);
    }

    private static q d(h0 h0Var, q qVar, q qVar2) {
        if (qVar instanceof Iterable) {
            return e(h0Var, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    private static q e(h0 h0Var, Iterator<q> it, q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                q qVarB = h0Var.a(it.next()).b((f) qVar);
                if (qVarB instanceof h) {
                    h hVar = (h) qVarB;
                    if ("break".equals(hVar.e())) {
                        return q.x;
                    }
                    if ("return".equals(hVar.e())) {
                        return hVar;
                    }
                }
            }
        }
        return q.x;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:83:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:86:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:98:0x02db A[EDGE_INSN: B:98:0x02db->B:90:0x02db BREAK  A[LOOP:3: B:79:0x02a6->B:89:0x02d7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x02dd A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, v4 v4Var, List<q> list) {
        q qVarB;
        h hVar;
        n0 n0Var = n0.ADD;
        int iOrdinal = v5.e(str).ordinal();
        if (iOrdinal == 65) {
            v5.a(n0.WHILE.name(), 4, list);
            q qVar = list.get(0);
            q qVar2 = list.get(1);
            q qVar3 = list.get(2);
            q qVarA = v4Var.a(list.get(3));
            if (v4Var.a(qVar3).d().booleanValue()) {
                q qVarB2 = v4Var.b((f) qVarA);
                if (qVarB2 instanceof h) {
                    h hVar2 = (h) qVarB2;
                    if (!"break".equals(hVar2.e())) {
                        if ("return".equals(hVar2.e())) {
                            return hVar2;
                        }
                        while (v4Var.a(qVar).d().booleanValue()) {
                            qVarB = v4Var.b((f) qVarA);
                            if (qVarB instanceof h) {
                                hVar = (h) qVarB;
                                if ("break".equals(hVar.e())) {
                                    break;
                                    break;
                                }
                                if ("return".equals(hVar.e())) {
                                    return hVar;
                                }
                            }
                            v4Var.a(qVar2);
                        }
                    }
                } else {
                    while (v4Var.a(qVar).d().booleanValue()) {
                        qVarB = v4Var.b((f) qVarA);
                        if (qVarB instanceof h) {
                            hVar = (h) qVarB;
                            if ("break".equals(hVar.e())) {
                                break;
                                break;
                            }
                            if ("return".equals(hVar.e())) {
                                return hVar;
                            }
                        }
                        v4Var.a(qVar2);
                    }
                }
            } else {
                while (v4Var.a(qVar).d().booleanValue()) {
                    qVarB = v4Var.b((f) qVarA);
                    if (qVarB instanceof h) {
                        hVar = (h) qVarB;
                        if ("break".equals(hVar.e())) {
                            break;
                        }
                        if ("return".equals(hVar.e())) {
                            return hVar;
                        }
                    }
                    v4Var.a(qVar2);
                }
            }
            return q.x;
        }
        switch (iOrdinal) {
            case 26:
                v5.a(n0.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                String strB = list.get(0).b();
                return c(new i0(v4Var, strB), v4Var.a(list.get(1)), v4Var.a(list.get(2)));
            case 27:
                v5.a(n0.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                String strB2 = list.get(0).b();
                return c(new f0(v4Var, strB2), v4Var.a(list.get(1)), v4Var.a(list.get(2)));
            case 28:
                v5.a(n0.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                String strB3 = list.get(0).b();
                return c(new g0(v4Var, strB3), v4Var.a(list.get(1)), v4Var.a(list.get(2)));
            case 29:
                v5.a(n0.FOR_LET.name(), 4, list);
                q qVarA2 = v4Var.a(list.get(0));
                if (!(qVarA2 instanceof f)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                f fVar = (f) qVarA2;
                q qVar4 = list.get(1);
                q qVar5 = list.get(2);
                q qVarA3 = v4Var.a(list.get(3));
                v4 v4VarC = v4Var.c();
                for (int i2 = 0; i2 < fVar.t(); i2++) {
                    String strB4 = fVar.v(i2).b();
                    v4VarC.e(strB4, v4Var.h(strB4));
                }
                while (v4Var.a(qVar4).d().booleanValue()) {
                    q qVarB3 = v4Var.b((f) qVarA3);
                    if (qVarB3 instanceof h) {
                        h hVar3 = (h) qVarB3;
                        if ("break".equals(hVar3.e())) {
                            return q.x;
                        }
                        if ("return".equals(hVar3.e())) {
                            return hVar3;
                        }
                    }
                    v4 v4VarC2 = v4Var.c();
                    for (int i3 = 0; i3 < fVar.t(); i3++) {
                        String strB5 = fVar.v(i3).b();
                        v4VarC2.e(strB5, v4VarC.h(strB5));
                    }
                    v4VarC2.a(qVar5);
                    v4VarC = v4VarC2;
                }
                return q.x;
            case 30:
                v5.a(n0.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                String strB6 = list.get(0).b();
                return d(new i0(v4Var, strB6), v4Var.a(list.get(1)), v4Var.a(list.get(2)));
            case 31:
                v5.a(n0.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                String strB7 = list.get(0).b();
                return d(new f0(v4Var, strB7), v4Var.a(list.get(1)), v4Var.a(list.get(2)));
            case 32:
                v5.a(n0.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                String strB8 = list.get(0).b();
                return d(new g0(v4Var, strB8), v4Var.a(list.get(1)), v4Var.a(list.get(2)));
            default:
                super.b(str);
                throw null;
        }
    }
}
