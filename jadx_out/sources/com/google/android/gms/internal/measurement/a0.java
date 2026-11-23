package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends x {
    protected a0() {
        this.a.add(n0.APPLY);
        this.a.add(n0.BLOCK);
        this.a.add(n0.BREAK);
        this.a.add(n0.CASE);
        this.a.add(n0.DEFAULT);
        this.a.add(n0.CONTINUE);
        this.a.add(n0.DEFINE_FUNCTION);
        this.a.add(n0.FN);
        this.a.add(n0.IF);
        this.a.add(n0.QUOTE);
        this.a.add(n0.RETURN);
        this.a.add(n0.SWITCH);
        this.a.add(n0.TERNARY);
    }

    private static q c(v4 v4Var, List<q> list) {
        v5.b(n0.FN.name(), 2, list);
        q qVarA = v4Var.a(list.get(0));
        q qVarA2 = v4Var.a(list.get(1));
        if (!(qVarA2 instanceof f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", qVarA2.getClass().getCanonicalName()));
        }
        List<q> listR = ((f) qVarA2).r();
        List<q> arrayList = new ArrayList<>();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new p(qVarA.b(), listR, arrayList, v4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
    
        if (r9.equals("continue") == false) goto L65;
     */
    @Override // com.google.android.gms.internal.measurement.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q a(String str, v4 v4Var, List<q> list) {
        q qVarA;
        n0 n0Var = n0.ADD;
        int iOrdinal = v5.e(str).ordinal();
        if (iOrdinal == 2) {
            v5.a(n0.APPLY.name(), 3, list);
            q qVarA2 = v4Var.a(list.get(0));
            String strB = v4Var.a(list.get(1)).b();
            q qVarA3 = v4Var.a(list.get(2));
            if (!(qVarA3 instanceof f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", qVarA3.getClass().getCanonicalName()));
            }
            if (strB.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return qVarA2.q(strB, v4Var, ((f) qVarA3).r());
        }
        if (iOrdinal == 15) {
            v5.a(n0.BREAK.name(), 0, list);
            return q.z;
        }
        if (iOrdinal == 25) {
            return c(v4Var, list);
        }
        if (iOrdinal == 41) {
            v5.b(n0.IF.name(), 2, list);
            q qVarA4 = v4Var.a(list.get(0));
            q qVarA5 = v4Var.a(list.get(1));
            q qVarA6 = list.size() > 2 ? v4Var.a(list.get(2)) : null;
            q qVar = q.x;
            q qVarB = qVarA4.d().booleanValue() ? v4Var.b((f) qVarA5) : qVarA6 != null ? v4Var.b((f) qVarA6) : qVar;
            return qVarB instanceof h ? qVarB : qVar;
        }
        if (iOrdinal == 54) {
            return new f(list);
        }
        if (iOrdinal == 57) {
            if (list.isEmpty()) {
                return q.B;
            }
            v5.a(n0.RETURN.name(), 1, list);
            return new h("return", v4Var.a(list.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                v5.b(n0.DEFINE_FUNCTION.name(), 2, list);
                q qVarC = c(v4Var, list);
                j jVar = (j) qVarC;
                v4Var.e(jVar.e() == null ? "" : jVar.e(), qVarC);
                return qVarC;
            }
            if (iOrdinal == 60) {
                v5.a(n0.SWITCH.name(), 3, list);
                q qVarA7 = v4Var.a(list.get(0));
                q qVarA8 = v4Var.a(list.get(1));
                q qVarA9 = v4Var.a(list.get(2));
                if (!(qVarA8 instanceof f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(qVarA9 instanceof f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                f fVar = (f) qVarA8;
                f fVar2 = (f) qVarA9;
                boolean z = false;
                for (int i2 = 0; i2 < fVar.t(); i2++) {
                    if (z || qVarA7.equals(v4Var.a(fVar.v(i2)))) {
                        qVarA = v4Var.a(fVar2.v(i2));
                        if (qVarA instanceof h) {
                            if (((h) qVarA).e().equals("break")) {
                                return q.x;
                            }
                            return qVarA;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (fVar.t() + 1 == fVar2.t()) {
                    qVarA = v4Var.a(fVar2.v(fVar.t()));
                    if (qVarA instanceof h) {
                        String strE = ((h) qVarA).e();
                        if (!strE.equals("return")) {
                        }
                        return qVarA;
                    }
                }
                return q.x;
            }
            if (iOrdinal == 61) {
                v5.a(n0.TERNARY.name(), 3, list);
                return v4Var.a(v4Var.a(list.get(0)).d().booleanValue() ? list.get(1) : list.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return v4Var.c().b(new f(list));
                case 12:
                    v5.a(n0.BREAK.name(), 0, list);
                    return q.A;
                case 13:
                    break;
                default:
                    super.b(str);
                    throw null;
            }
        }
        if (!list.isEmpty()) {
            q qVarA10 = v4Var.a(list.get(0));
            if (qVarA10 instanceof f) {
                return v4Var.b((f) qVarA10);
            }
        }
        return q.x;
    }
}
