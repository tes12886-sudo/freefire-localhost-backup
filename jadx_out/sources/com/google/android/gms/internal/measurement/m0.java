package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends x {
    protected m0() {
        this.a.add(n0.ASSIGN);
        this.a.add(n0.CONST);
        this.a.add(n0.CREATE_ARRAY);
        this.a.add(n0.CREATE_OBJECT);
        this.a.add(n0.EXPRESSION_LIST);
        this.a.add(n0.GET);
        this.a.add(n0.GET_INDEX);
        this.a.add(n0.GET_PROPERTY);
        this.a.add(n0.NULL);
        this.a.add(n0.SET_PROPERTY);
        this.a.add(n0.TYPEOF);
        this.a.add(n0.UNDEFINED);
        this.a.add(n0.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, v4 v4Var, List<q> list) {
        String str2;
        n0 n0Var = n0.ADD;
        int iOrdinal = v5.e(str).ordinal();
        int i2 = 0;
        if (iOrdinal == 3) {
            v5.a(n0.ASSIGN.name(), 2, list);
            q qVarA = v4Var.a(list.get(0));
            if (!(qVarA instanceof u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", qVarA.getClass().getCanonicalName()));
            }
            if (!v4Var.d(qVarA.b())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", qVarA.b()));
            }
            q qVarA2 = v4Var.a(list.get(1));
            v4Var.e(qVarA.b(), qVarA2);
            return qVarA2;
        }
        if (iOrdinal == 14) {
            v5.b(n0.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            for (int i3 = 0; i3 < list.size() - 1; i3 += 2) {
                q qVarA3 = v4Var.a(list.get(i3));
                if (!(qVarA3 instanceof u)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", qVarA3.getClass().getCanonicalName()));
                }
                v4Var.g(qVarA3.b(), v4Var.a(list.get(i3 + 1)));
            }
            return q.x;
        }
        if (iOrdinal == 24) {
            v5.b(n0.EXPRESSION_LIST.name(), 1, list);
            q qVarA4 = q.x;
            while (i2 < list.size()) {
                qVarA4 = v4Var.a(list.get(i2));
                if (qVarA4 instanceof h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i2++;
            }
            return qVarA4;
        }
        if (iOrdinal == 33) {
            v5.a(n0.GET.name(), 1, list);
            q qVarA5 = v4Var.a(list.get(0));
            if (qVarA5 instanceof u) {
                return v4Var.h(qVarA5.b());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", qVarA5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            v5.a(n0.NULL.name(), 0, list);
            return q.y;
        }
        if (iOrdinal == 58) {
            v5.a(n0.SET_PROPERTY.name(), 3, list);
            q qVarA6 = v4Var.a(list.get(0));
            q qVarA7 = v4Var.a(list.get(1));
            q qVarA8 = v4Var.a(list.get(2));
            if (qVarA6 == q.x || qVarA6 == q.y) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", qVarA7.b(), qVarA6.b()));
            }
            if ((qVarA6 instanceof f) && (qVarA7 instanceof i)) {
                ((f) qVarA6).w(qVarA7.c().intValue(), qVarA8);
            } else if (qVarA6 instanceof m) {
                ((m) qVarA6).l(qVarA7.b(), qVarA8);
            }
            return qVarA8;
        }
        if (iOrdinal == 17) {
            if (list.isEmpty()) {
                return new f();
            }
            f fVar = new f();
            Iterator<q> it = list.iterator();
            while (it.hasNext()) {
                q qVarA9 = v4Var.a(it.next());
                if (qVarA9 instanceof h) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                fVar.w(i2, qVarA9);
                i2++;
            }
            return fVar;
        }
        if (iOrdinal == 18) {
            if (list.isEmpty()) {
                return new n();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            n nVar = new n();
            while (i2 < list.size() - 1) {
                q qVarA10 = v4Var.a(list.get(i2));
                q qVarA11 = v4Var.a(list.get(i2 + 1));
                if ((qVarA10 instanceof h) || (qVarA11 instanceof h)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                nVar.l(qVarA10.b(), qVarA11);
                i2 += 2;
            }
            return nVar;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            v5.a(n0.GET_PROPERTY.name(), 2, list);
            q qVarA12 = v4Var.a(list.get(0));
            q qVarA13 = v4Var.a(list.get(1));
            if ((qVarA12 instanceof f) && v5.d(qVarA13)) {
                return ((f) qVarA12).v(qVarA13.c().intValue());
            }
            if (qVarA12 instanceof m) {
                return ((m) qVarA12).f(qVarA13.b());
            }
            if (qVarA12 instanceof u) {
                if ("length".equals(qVarA13.b())) {
                    return new i(Double.valueOf(qVarA12.b().length()));
                }
                if (v5.d(qVarA13) && qVarA13.c().doubleValue() < qVarA12.b().length()) {
                    return new u(String.valueOf(qVarA12.b().charAt(qVarA13.c().intValue())));
                }
            }
            return q.x;
        }
        switch (iOrdinal) {
            case 62:
                v5.a(n0.TYPEOF.name(), 1, list);
                q qVarA14 = v4Var.a(list.get(0));
                if (qVarA14 instanceof v) {
                    str2 = "undefined";
                } else if (qVarA14 instanceof g) {
                    str2 = "boolean";
                } else if (qVarA14 instanceof i) {
                    str2 = "number";
                } else if (qVarA14 instanceof u) {
                    str2 = "string";
                } else if (qVarA14 instanceof p) {
                    str2 = "function";
                } else {
                    if ((qVarA14 instanceof r) || (qVarA14 instanceof h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", qVarA14));
                    }
                    str2 = "object";
                }
                return new u(str2);
            case 63:
                v5.a(n0.UNDEFINED.name(), 0, list);
                return q.x;
            case 64:
                v5.b(n0.VAR.name(), 1, list);
                Iterator<q> it2 = list.iterator();
                while (it2.hasNext()) {
                    q qVarA15 = v4Var.a(it2.next());
                    if (!(qVarA15 instanceof u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", qVarA15.getClass().getCanonicalName()));
                    }
                    v4Var.f(qVarA15.b(), q.x);
                }
                return q.x;
            default:
                super.b(str);
                throw null;
        }
    }
}
