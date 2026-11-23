package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v5 {
    public static void a(String str, int i2, List<q> list) {
        if (list.size() != i2) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i2), Integer.valueOf(list.size())));
        }
    }

    public static void b(String str, int i2, List<q> list) {
        if (list.size() < i2) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i2), Integer.valueOf(list.size())));
        }
    }

    public static void c(String str, int i2, List<q> list) {
        if (list.size() > i2) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i2), Integer.valueOf(list.size())));
        }
    }

    public static boolean d(q qVar) {
        if (qVar == null) {
            return false;
        }
        Double dC = qVar.c();
        return !dC.isNaN() && dC.doubleValue() >= 0.0d && dC.equals(Double.valueOf(Math.floor(dC.doubleValue())));
    }

    public static n0 e(String str) {
        n0 n0VarA = null;
        if (str != null && !str.isEmpty()) {
            n0VarA = n0.a(Integer.parseInt(str));
        }
        if (n0VarA != null) {
            return n0VarA;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static boolean f(q qVar, q qVar2) {
        if (!qVar.getClass().equals(qVar2.getClass())) {
            return false;
        }
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

    public static int g(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        double d2 = d > 0.0d ? 1 : -1;
        double dFloor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return (int) ((d2 * dFloor) % 4.294967296E9d);
    }

    public static long h(double d) {
        return ((long) g(d)) & 4294967295L;
    }

    public static double i(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        double d2 = d > 0.0d ? 1 : -1;
        double dFloor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return d2 * dFloor;
    }

    public static Object j(q qVar) {
        if (q.y.equals(qVar)) {
            return null;
        }
        if (q.x.equals(qVar)) {
            return "";
        }
        return !qVar.c().isNaN() ? qVar.c() : qVar.b();
    }

    public static int k(v4 v4Var) {
        int iG = g(v4Var.h("runtime.counter").c().doubleValue() + 1.0d);
        if (iG > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        v4Var.e("runtime.counter", new i(Double.valueOf(iG)));
        return iG;
    }
}
