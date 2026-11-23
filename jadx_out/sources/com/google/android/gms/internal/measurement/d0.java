package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static q a(String str, f fVar, v4 v4Var, List<q> list) {
        String str2;
        byte b;
        String strB;
        double dMin;
        j jVar;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                b = str.equals(str2) ? (byte) 18 : (byte) -1;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    b = 0;
                } else {
                    str2 = "toString";
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    b = 2;
                } else {
                    str2 = "toString";
                }
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    b = 10;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -895859076:
                if (str.equals("splice")) {
                    b = 17;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    b = 3;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 6;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    b = 19;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 107868:
                if (str.equals("map")) {
                    b = 7;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 111185:
                if (str.equals("pop")) {
                    b = 8;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3267882:
                if (str.equals("join")) {
                    b = 5;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    b = 9;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3536116:
                if (str.equals("some")) {
                    b = 15;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3536286:
                if (str.equals("sort")) {
                    b = 16;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    b = 1;
                } else {
                    str2 = "toString";
                }
                break;
            case 109407362:
                if (str.equals("shift")) {
                    b = 13;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = 14;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    b = 11;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    b = 12;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b = 4;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            default:
                str2 = "toString";
                break;
        }
        double d = 0.0d;
        switch (b) {
            case 0:
                q qVarJ = fVar.j();
                if (!list.isEmpty()) {
                    Iterator<q> it = list.iterator();
                    while (it.hasNext()) {
                        q qVarA = v4Var.a(it.next());
                        if (qVarA instanceof h) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        f fVar2 = (f) qVarJ;
                        int iT = fVar2.t();
                        if (qVarA instanceof f) {
                            f fVar3 = (f) qVarA;
                            Iterator<Integer> itS = fVar3.s();
                            while (itS.hasNext()) {
                                Integer next = itS.next();
                                fVar2.w(next.intValue() + iT, fVar3.v(next.intValue()));
                            }
                        } else {
                            fVar2.w(iT, qVarA);
                        }
                    }
                }
                return qVarJ;
            case 1:
                v5.a("every", 1, list);
                q qVarA2 = v4Var.a(list.get(0));
                if (qVarA2 instanceof p) {
                    return (fVar.t() == 0 || c(fVar, v4Var, (p) qVarA2, Boolean.FALSE, Boolean.TRUE).t() == fVar.t()) ? q.C : q.D;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                v5.a("filter", 1, list);
                q qVarA3 = v4Var.a(list.get(0));
                if (!(qVarA3 instanceof p)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (fVar.u() == 0) {
                    return new f();
                }
                q qVarJ2 = fVar.j();
                f fVarC = c(fVar, v4Var, (p) qVarA3, null, Boolean.TRUE);
                f fVar4 = new f();
                Iterator<Integer> itS2 = fVarC.s();
                while (itS2.hasNext()) {
                    fVar4.w(fVar4.t(), ((f) qVarJ2).v(itS2.next().intValue()));
                }
                return fVar4;
            case 3:
                v5.a("forEach", 1, list);
                q qVarA4 = v4Var.a(list.get(0));
                if (!(qVarA4 instanceof p)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (fVar.u() != 0) {
                    c(fVar, v4Var, (p) qVarA4, null, null);
                }
                return q.x;
            case 4:
                v5.c("indexOf", 2, list);
                q qVarA5 = q.x;
                if (!list.isEmpty()) {
                    qVarA5 = v4Var.a(list.get(0));
                }
                if (list.size() > 1) {
                    double dI = v5.i(v4Var.a(list.get(1)).c().doubleValue());
                    if (dI >= fVar.t()) {
                        return new i(Double.valueOf(-1.0d));
                    }
                    if (dI < 0.0d) {
                        double dT = fVar.t();
                        Double.isNaN(dT);
                        d = dT + dI;
                    } else {
                        d = dI;
                    }
                }
                Iterator<Integer> itS3 = fVar.s();
                while (itS3.hasNext()) {
                    int iIntValue = itS3.next().intValue();
                    double d2 = iIntValue;
                    if (d2 >= d && v5.f(fVar.v(iIntValue), qVarA5)) {
                        return new i(Double.valueOf(d2));
                    }
                }
                return new i(Double.valueOf(-1.0d));
            case 5:
                v5.c("join", 1, list);
                if (fVar.t() == 0) {
                    return q.E;
                }
                if (list.size() > 0) {
                    q qVarA6 = v4Var.a(list.get(0));
                    strB = ((qVarA6 instanceof o) || (qVarA6 instanceof v)) ? "" : qVarA6.b();
                } else {
                    strB = ",";
                }
                return new u(fVar.B(strB));
            case 6:
                v5.c("lastIndexOf", 2, list);
                q qVarA7 = q.x;
                if (!list.isEmpty()) {
                    qVarA7 = v4Var.a(list.get(0));
                }
                double dT2 = fVar.t() - 1;
                if (list.size() > 1) {
                    q qVarA8 = v4Var.a(list.get(1));
                    dT2 = Double.isNaN(qVarA8.c().doubleValue()) ? fVar.t() - 1 : v5.i(qVarA8.c().doubleValue());
                    if (dT2 < 0.0d) {
                        double dT3 = fVar.t();
                        Double.isNaN(dT3);
                        dT2 += dT3;
                    }
                }
                if (dT2 < 0.0d) {
                    return new i(Double.valueOf(-1.0d));
                }
                for (int iMin = (int) Math.min(fVar.t(), dT2); iMin >= 0; iMin--) {
                    if (fVar.x(iMin) && v5.f(fVar.v(iMin), qVarA7)) {
                        return new i(Double.valueOf(iMin));
                    }
                }
                return new i(Double.valueOf(-1.0d));
            case 7:
                v5.a("map", 1, list);
                q qVarA9 = v4Var.a(list.get(0));
                if (qVarA9 instanceof p) {
                    return fVar.t() == 0 ? new f() : c(fVar, v4Var, (p) qVarA9, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 8:
                v5.a("pop", 0, list);
                int iT2 = fVar.t();
                if (iT2 == 0) {
                    return q.x;
                }
                int i2 = iT2 - 1;
                q qVarV = fVar.v(i2);
                fVar.A(i2);
                return qVarV;
            case 9:
                if (!list.isEmpty()) {
                    Iterator<q> it2 = list.iterator();
                    while (it2.hasNext()) {
                        fVar.w(fVar.t(), v4Var.a(it2.next()));
                    }
                }
                return new i(Double.valueOf(fVar.t()));
            case 10:
                return b(fVar, v4Var, list, true);
            case 11:
                return b(fVar, v4Var, list, false);
            case 12:
                v5.a("reverse", 0, list);
                int iT3 = fVar.t();
                if (iT3 != 0) {
                    for (int i3 = 0; i3 < iT3 / 2; i3++) {
                        if (fVar.x(i3)) {
                            q qVarV2 = fVar.v(i3);
                            fVar.w(i3, null);
                            int i4 = (iT3 - 1) - i3;
                            if (fVar.x(i4)) {
                                fVar.w(i3, fVar.v(i4));
                            }
                            fVar.w(i4, qVarV2);
                        }
                    }
                }
                return fVar;
            case 13:
                v5.a("shift", 0, list);
                if (fVar.t() == 0) {
                    return q.x;
                }
                q qVarV3 = fVar.v(0);
                fVar.A(0);
                return qVarV3;
            case 14:
                v5.c("slice", 2, list);
                if (list.isEmpty()) {
                    return fVar.j();
                }
                double dT4 = fVar.t();
                double dI2 = v5.i(v4Var.a(list.get(0)).c().doubleValue());
                if (dI2 < 0.0d) {
                    Double.isNaN(dT4);
                    dMin = Math.max(dI2 + dT4, 0.0d);
                } else {
                    dMin = Math.min(dI2, dT4);
                }
                if (list.size() == 2) {
                    double dI3 = v5.i(v4Var.a(list.get(1)).c().doubleValue());
                    if (dI3 < 0.0d) {
                        Double.isNaN(dT4);
                        dT4 = Math.max(dT4 + dI3, 0.0d);
                    } else {
                        dT4 = Math.min(dT4, dI3);
                    }
                }
                f fVar5 = new f();
                for (int i5 = (int) dMin; i5 < dT4; i5++) {
                    fVar5.w(fVar5.t(), fVar.v(i5));
                }
                return fVar5;
            case 15:
                v5.a("some", 1, list);
                q qVarA10 = v4Var.a(list.get(0));
                if (!(qVarA10 instanceof j)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (fVar.t() != 0) {
                    j jVar2 = (j) qVarA10;
                    Iterator<Integer> itS4 = fVar.s();
                    while (itS4.hasNext()) {
                        int iIntValue2 = itS4.next().intValue();
                        if (fVar.x(iIntValue2) && jVar2.a(v4Var, Arrays.asList(fVar.v(iIntValue2), new i(Double.valueOf(iIntValue2)), fVar)).d().booleanValue()) {
                            return q.C;
                        }
                    }
                }
                return q.D;
            case 16:
                v5.c("sort", 1, list);
                if (fVar.t() >= 2) {
                    List<q> listR = fVar.r();
                    if (list.isEmpty()) {
                        jVar = null;
                    } else {
                        q qVarA11 = v4Var.a(list.get(0));
                        if (!(qVarA11 instanceof j)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        jVar = (j) qVarA11;
                    }
                    Collections.sort(listR, new c0(jVar, v4Var));
                    fVar.y();
                    Iterator<q> it3 = listR.iterator();
                    int i6 = 0;
                    while (it3.hasNext()) {
                        fVar.w(i6, it3.next());
                        i6++;
                    }
                }
                return fVar;
            case 17:
                if (list.isEmpty()) {
                    return new f();
                }
                int i7 = (int) v5.i(v4Var.a(list.get(0)).c().doubleValue());
                if (i7 < 0) {
                    i7 = Math.max(0, i7 + fVar.t());
                } else if (i7 > fVar.t()) {
                    i7 = fVar.t();
                }
                int iT4 = fVar.t();
                f fVar6 = new f();
                if (list.size() > 1) {
                    int iMax = Math.max(0, (int) v5.i(v4Var.a(list.get(1)).c().doubleValue()));
                    if (iMax > 0) {
                        for (int i8 = i7; i8 < Math.min(iT4, i7 + iMax); i8++) {
                            fVar6.w(fVar6.t(), fVar.v(i7));
                            fVar.A(i7);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i9 = 2; i9 < list.size(); i9++) {
                            q qVarA12 = v4Var.a(list.get(i9));
                            if (qVarA12 instanceof h) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            fVar.z((i7 + i9) - 2, qVarA12);
                        }
                    }
                } else {
                    while (i7 < iT4) {
                        fVar6.w(fVar6.t(), fVar.v(i7));
                        fVar.w(i7, null);
                        i7++;
                    }
                }
                return fVar6;
            case 18:
                v5.a(str2, 0, list);
                return new u(fVar.B(","));
            case 19:
                if (!list.isEmpty()) {
                    f fVar7 = new f();
                    Iterator<q> it4 = list.iterator();
                    while (it4.hasNext()) {
                        q qVarA13 = v4Var.a(it4.next());
                        if (qVarA13 instanceof h) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        fVar7.w(fVar7.t(), qVarA13);
                    }
                    int iT5 = fVar7.t();
                    Iterator<Integer> itS5 = fVar.s();
                    while (itS5.hasNext()) {
                        Integer next2 = itS5.next();
                        fVar7.w(next2.intValue() + iT5, fVar.v(next2.intValue()));
                    }
                    fVar.y();
                    Iterator<Integer> itS6 = fVar7.s();
                    while (itS6.hasNext()) {
                        Integer next3 = itS6.next();
                        fVar.w(next3.intValue(), fVar7.v(next3.intValue()));
                    }
                }
                return new i(Double.valueOf(fVar.t()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static q b(f fVar, v4 v4Var, List<q> list, boolean z) {
        q qVarA;
        v5.b("reduce", 1, list);
        v5.c("reduce", 2, list);
        q qVarA2 = v4Var.a(list.get(0));
        if (!(qVarA2 instanceof j)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            qVarA = v4Var.a(list.get(1));
            if (qVarA instanceof h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (fVar.t() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            qVarA = null;
        }
        j jVar = (j) qVarA2;
        int iT = fVar.t();
        int i2 = z ? 0 : iT - 1;
        int i3 = z ? iT - 1 : 0;
        int i4 = true == z ? 1 : -1;
        if (qVarA == null) {
            qVarA = fVar.v(i2);
            i2 += i4;
        }
        while ((i3 - i2) * i4 >= 0) {
            if (fVar.x(i2)) {
                qVarA = jVar.a(v4Var, Arrays.asList(qVarA, fVar.v(i2), new i(Double.valueOf(i2)), fVar));
                if (qVarA instanceof h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i2 += i4;
            } else {
                i2 += i4;
            }
        }
        return qVarA;
    }

    private static f c(f fVar, v4 v4Var, j jVar, Boolean bool, Boolean bool2) {
        f fVar2 = new f();
        Iterator<Integer> itS = fVar.s();
        while (itS.hasNext()) {
            int iIntValue = itS.next().intValue();
            if (fVar.x(iIntValue)) {
                q qVarA = jVar.a(v4Var, Arrays.asList(fVar.v(iIntValue), new i(Double.valueOf(iIntValue)), fVar));
                if (qVarA.d().equals(bool)) {
                    return fVar2;
                }
                if (bool2 == null || qVarA.d().equals(bool2)) {
                    fVar2.w(iIntValue, qVarA);
                }
            }
        }
        return fVar2;
    }
}
