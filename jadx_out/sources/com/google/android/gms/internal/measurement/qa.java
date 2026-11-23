package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class qa {
    private static final Class<?> a;
    private static final db<?, ?> b;
    private static final db<?, ?> c;
    private static final db<?, ?> d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = C(false);
        c = C(true);
        d = new fb();
    }

    public static void A(Class<?> cls) {
        Class<?> cls2;
        if (!z8.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void B(int i2, List<?> list, h8 h8Var, oa oaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            h8Var.D(i2, list.get(i3), oaVar);
        }
    }

    private static db<?, ?> C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (db) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int D(List<Long> list) {
        int iB;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r9) {
            r9 r9Var = (r9) list;
            iB = 0;
            while (i2 < size) {
                iB += g8.B(r9Var.p(i2));
                i2++;
            }
        } else {
            iB = 0;
            while (i2 < size) {
                iB += g8.B(list.get(i2).longValue());
                i2++;
            }
        }
        return iB;
    }

    static int E(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return D(list) + (list.size() * g8.y(i2));
    }

    static int F(List<Long> list) {
        int iB;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r9) {
            r9 r9Var = (r9) list;
            iB = 0;
            while (i2 < size) {
                iB += g8.B(r9Var.p(i2));
                i2++;
            }
        } else {
            iB = 0;
            while (i2 < size) {
                iB += g8.B(list.get(i2).longValue());
                i2++;
            }
        }
        return iB;
    }

    static int G(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return F(list) + (size * g8.y(i2));
    }

    static int H(List<Long> list) {
        int iB;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r9) {
            r9 r9Var = (r9) list;
            iB = 0;
            while (i2 < size) {
                long jP = r9Var.p(i2);
                iB += g8.B((jP >> 63) ^ (jP + jP));
                i2++;
            }
        } else {
            iB = 0;
            while (i2 < size) {
                long jLongValue = list.get(i2).longValue();
                iB += g8.B((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
        }
        return iB;
    }

    static int I(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + (size * g8.y(i2));
    }

    static int J(List<Integer> list) {
        int iZ;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a9) {
            a9 a9Var = (a9) list;
            iZ = 0;
            while (i2 < size) {
                iZ += g8.z(a9Var.d(i2));
                i2++;
            }
        } else {
            iZ = 0;
            while (i2 < size) {
                iZ += g8.z(list.get(i2).intValue());
                i2++;
            }
        }
        return iZ;
    }

    static int K(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J(list) + (size * g8.y(i2));
    }

    static int L(List<Integer> list) {
        int iZ;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a9) {
            a9 a9Var = (a9) list;
            iZ = 0;
            while (i2 < size) {
                iZ += g8.z(a9Var.d(i2));
                i2++;
            }
        } else {
            iZ = 0;
            while (i2 < size) {
                iZ += g8.z(list.get(i2).intValue());
                i2++;
            }
        }
        return iZ;
    }

    static int M(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return L(list) + (size * g8.y(i2));
    }

    static int N(List<Integer> list) {
        int iA;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a9) {
            a9 a9Var = (a9) list;
            iA = 0;
            while (i2 < size) {
                iA += g8.A(a9Var.d(i2));
                i2++;
            }
        } else {
            iA = 0;
            while (i2 < size) {
                iA += g8.A(list.get(i2).intValue());
                i2++;
            }
        }
        return iA;
    }

    static int O(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * g8.y(i2));
    }

    static int P(List<Integer> list) {
        int iA;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a9) {
            a9 a9Var = (a9) list;
            iA = 0;
            while (i2 < size) {
                int iD = a9Var.d(i2);
                iA += g8.A((iD >> 31) ^ (iD + iD));
                i2++;
            }
        } else {
            iA = 0;
            while (i2 < size) {
                int iIntValue = list.get(i2).intValue();
                iA += g8.A((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
        }
        return iA;
    }

    static int Q(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * g8.y(i2));
    }

    static int R(List<?> list) {
        return list.size() * 4;
    }

    static int S(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (g8.A(i2 << 3) + 4);
    }

    static int T(List<?> list) {
        return list.size() * 8;
    }

    static int U(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (g8.A(i2 << 3) + 8);
    }

    static int V(List<?> list) {
        return list.size();
    }

    static int W(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (g8.A(i2 << 3) + 1);
    }

    static int X(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iY = g8.y(i2) * size;
        if (list instanceof m9) {
            m9 m9Var = (m9) list;
            while (i3 < size) {
                Object objO = m9Var.o(i3);
                iY += objO instanceof z7 ? g8.a((z7) objO) : g8.C((String) objO);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                iY += obj instanceof z7 ? g8.a((z7) obj) : g8.C((String) obj);
                i3++;
            }
        }
        return iY;
    }

    static int Y(int i2, Object obj, oa oaVar) {
        if (!(obj instanceof k9)) {
            return g8.A(i2 << 3) + g8.b((da) obj, oaVar);
        }
        int iA = g8.A(i2 << 3);
        int iA2 = ((k9) obj).a();
        return iA + g8.A(iA2) + iA2;
    }

    static int Z(int i2, List<?> list, oa oaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = g8.y(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            iY += obj instanceof k9 ? g8.D((k9) obj) : g8.b((da) obj, oaVar);
        }
        return iY;
    }

    public static db<?, ?> a() {
        return b;
    }

    static int a0(int i2, List<z7> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = size * g8.y(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iY += g8.a(list.get(i3));
        }
        return iY;
    }

    public static db<?, ?> b() {
        return c;
    }

    static int b0(int i2, List<da> list, oa oaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iE += g8.e(i2, list.get(i3), oaVar);
        }
        return iE;
    }

    public static db<?, ?> c() {
        return d;
    }

    static boolean d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <T, FT extends p8<FT>> void e(m8<FT> m8Var, T t, T t2) {
        m8Var.b(t2);
        throw null;
    }

    static <T, UT, UB> void f(db<UT, UB> dbVar, T t, T t2) {
        dbVar.c(t, dbVar.f(dbVar.d(t), dbVar.d(t2)));
    }

    static <UT, UB> UB g(int i2, List<Integer> list, c9 c9Var, UB ub, db<UT, UB> dbVar) {
        if (c9Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int iIntValue = list.get(i4).intValue();
                if (c9Var.a(iIntValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(iIntValue));
                    }
                    i3++;
                } else {
                    ub = (UB) h(i2, iIntValue, ub, dbVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!c9Var.a(iIntValue2)) {
                    ub = (UB) h(i2, iIntValue2, ub, dbVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB h(int i2, int i3, UB ub, db<UT, UB> dbVar) {
        if (ub == null) {
            ub = dbVar.b();
        }
        dbVar.a(ub, i2, i3);
        return ub;
    }

    static <T> void i(y9 y9Var, T t, T t2, long j2) {
        nb.t(t, j2, y9.b(nb.s(t, j2), nb.s(t2, j2)));
    }

    public static void j(int i2, List<Double> list, h8 h8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.b(i2, list, z);
    }

    public static void k(int i2, List<Float> list, h8 h8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.a(i2, list, z);
    }

    public static void l(int i2, List<Long> list, h8 h8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.I(i2, list, z);
    }

    public static void m(int i2, List<Long> list, h8 h8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.J(i2, list, z);
    }

    public static void n(int i2, List<Long> list, h8 h8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.k(i2, list, z);
    }

    public static void o(int i2, List<Long> list, h8 h8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.K(i2, list, z);
    }

    public static void p(int i2, List<Long> list, h8 h8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.i(i2, list, z);
    }

    public static void q(int i2, List<Integer> list, h8 h8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.G(i2, list, z);
    }

    public static void r(int i2, List<Integer> list, h8 h8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.g(i2, list, z);
    }

    public static void s(int i2, List<Integer> list, h8 h8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.j(i2, list, z);
    }

    public static void t(int i2, List<Integer> list, h8 h8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.H(i2, list, z);
    }

    public static void u(int i2, List<Integer> list, h8 h8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.h(i2, list, z);
    }

    public static void v(int i2, List<Integer> list, h8 h8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.c(i2, list, z);
    }

    public static void w(int i2, List<Boolean> list, h8 h8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.d(i2, list, z);
    }

    public static void x(int i2, List<String> list, h8 h8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.e(i2, list);
    }

    public static void y(int i2, List<z7> list, h8 h8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h8Var.f(i2, list);
    }

    public static void z(int i2, List<?> list, h8 h8Var, oa oaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            h8Var.C(i2, list.get(i3), oaVar);
        }
    }
}
