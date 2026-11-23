package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class h8 {
    private final g8 a;

    private h8(g8 g8Var) {
        g9.b(g8Var, "output");
        this.a = g8Var;
        g8Var.a = this;
    }

    public static h8 l(g8 g8Var) {
        h8 h8Var = g8Var.a;
        return h8Var != null ? h8Var : new h8(g8Var);
    }

    public final void A(int i2, int i3) {
        this.a.i(i2, (i3 >> 31) ^ (i3 + i3));
    }

    public final void B(int i2, long j2) {
        this.a.k(i2, (j2 >> 63) ^ (j2 + j2));
    }

    public final void C(int i2, Object obj, oa oaVar) {
        da daVar = (da) obj;
        e8 e8Var = (e8) this.a;
        e8Var.r((i2 << 3) | 2);
        l7 l7Var = (l7) daVar;
        int iC = l7Var.c();
        if (iC == -1) {
            iC = oaVar.b(l7Var);
            l7Var.f(iC);
        }
        e8Var.r(iC);
        oaVar.d(daVar, e8Var.a);
    }

    public final void D(int i2, Object obj, oa oaVar) {
        g8 g8Var = this.a;
        g8Var.g(i2, 3);
        oaVar.d((da) obj, g8Var.a);
        g8Var.g(i2, 4);
    }

    public final void E(int i2) {
        this.a.g(i2, 3);
    }

    public final void F(int i2) {
        this.a.g(i2, 4);
    }

    public final void G(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.h(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int iZ = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZ += g8.z(list.get(i4).intValue());
        }
        this.a.r(iZ);
        while (i3 < list.size()) {
            this.a.q(list.get(i3).intValue());
            i3++;
        }
    }

    public final void H(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.j(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            i4 += 4;
        }
        this.a.r(i4);
        while (i3 < list.size()) {
            this.a.s(list.get(i3).intValue());
            i3++;
        }
    }

    public final void I(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.k(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int iB = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iB += g8.B(list.get(i4).longValue());
        }
        this.a.r(iB);
        while (i3 < list.size()) {
            this.a.t(list.get(i3).longValue());
            i3++;
        }
    }

    public final void J(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.k(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int iB = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iB += g8.B(list.get(i4).longValue());
        }
        this.a.r(iB);
        while (i3 < list.size()) {
            this.a.t(list.get(i3).longValue());
            i3++;
        }
    }

    public final void K(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.l(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            i4 += 8;
        }
        this.a.r(i4);
        while (i3 < list.size()) {
            this.a.u(list.get(i3).longValue());
            i3++;
        }
    }

    public final void a(int i2, List<Float> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.j(i2, Float.floatToRawIntBits(list.get(i3).floatValue()));
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).floatValue();
            i4 += 4;
        }
        this.a.r(i4);
        while (i3 < list.size()) {
            this.a.s(Float.floatToRawIntBits(list.get(i3).floatValue()));
            i3++;
        }
    }

    public final void b(int i2, List<Double> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.l(i2, Double.doubleToRawLongBits(list.get(i3).doubleValue()));
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).doubleValue();
            i4 += 8;
        }
        this.a.r(i4);
        while (i3 < list.size()) {
            this.a.u(Double.doubleToRawLongBits(list.get(i3).doubleValue()));
            i3++;
        }
    }

    public final void c(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.h(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int iZ = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZ += g8.z(list.get(i4).intValue());
        }
        this.a.r(iZ);
        while (i3 < list.size()) {
            this.a.q(list.get(i3).intValue());
            i3++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(int i2, List<Boolean> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.m(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).booleanValue();
            i4++;
        }
        this.a.r(i4);
        while (i3 < list.size()) {
            this.a.p(list.get(i3).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public final void e(int i2, List<String> list) {
        int i3 = 0;
        if (!(list instanceof m9)) {
            while (i3 < list.size()) {
                this.a.n(i2, list.get(i3));
                i3++;
            }
            return;
        }
        m9 m9Var = (m9) list;
        while (i3 < list.size()) {
            Object objO = m9Var.o(i3);
            if (objO instanceof String) {
                this.a.n(i2, (String) objO);
            } else {
                this.a.o(i2, (z7) objO);
            }
            i3++;
        }
    }

    public final void f(int i2, List<z7> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.a.o(i2, list.get(i3));
        }
    }

    public final void g(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.i(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int iA = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iA += g8.A(list.get(i4).intValue());
        }
        this.a.r(iA);
        while (i3 < list.size()) {
            this.a.r(list.get(i3).intValue());
            i3++;
        }
    }

    public final void h(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.j(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            i4 += 4;
        }
        this.a.r(i4);
        while (i3 < list.size()) {
            this.a.s(list.get(i3).intValue());
            i3++;
        }
    }

    public final void i(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.l(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            i4 += 8;
        }
        this.a.r(i4);
        while (i3 < list.size()) {
            this.a.u(list.get(i3).longValue());
            i3++;
        }
    }

    public final void j(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                g8 g8Var = this.a;
                int iIntValue = list.get(i3).intValue();
                g8Var.i(i2, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int iA = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = list.get(i4).intValue();
            iA += g8.A((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.a.r(iA);
        while (i3 < list.size()) {
            g8 g8Var2 = this.a;
            int iIntValue3 = list.get(i3).intValue();
            g8Var2.r((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i3++;
        }
    }

    public final void k(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                g8 g8Var = this.a;
                long jLongValue = list.get(i3).longValue();
                g8Var.k(i2, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int iB = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue2 = list.get(i4).longValue();
            iB += g8.B((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.a.r(iB);
        while (i3 < list.size()) {
            g8 g8Var2 = this.a;
            long jLongValue3 = list.get(i3).longValue();
            g8Var2.t((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i3++;
        }
    }

    public final void m(int i2, int i3) {
        this.a.j(i2, i3);
    }

    public final void n(int i2, long j2) {
        this.a.k(i2, j2);
    }

    public final void o(int i2, long j2) {
        this.a.l(i2, j2);
    }

    public final void p(int i2, float f) {
        this.a.j(i2, Float.floatToRawIntBits(f));
    }

    public final void q(int i2, double d) {
        this.a.l(i2, Double.doubleToRawLongBits(d));
    }

    public final void r(int i2, int i3) {
        this.a.h(i2, i3);
    }

    public final void s(int i2, long j2) {
        this.a.k(i2, j2);
    }

    public final void t(int i2, int i3) {
        this.a.h(i2, i3);
    }

    public final void u(int i2, long j2) {
        this.a.l(i2, j2);
    }

    public final void v(int i2, int i3) {
        this.a.j(i2, i3);
    }

    public final void w(int i2, boolean z) {
        this.a.m(i2, z);
    }

    public final void x(int i2, String str) {
        this.a.n(i2, str);
    }

    public final void y(int i2, z7 z7Var) {
        this.a.o(i2, z7Var);
    }

    public final void z(int i2, int i3) {
        this.a.i(i2, i3);
    }
}
