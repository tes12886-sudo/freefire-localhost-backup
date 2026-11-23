package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class g5 {
    private long A;
    private long B;
    private String C;
    private boolean D;
    private long E;
    private long F;
    private final a5 a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f1201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f1202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f1203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f1204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f1205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f1206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f1207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f1208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f1209o;
    private long p;
    private boolean q;
    private String r;
    private Boolean s;
    private long t;
    private List<String> u;
    private String v;
    private long w;
    private long x;
    private long y;
    private long z;

    g5(a5 a5Var, String str) {
        com.google.android.gms.common.internal.q.k(a5Var);
        com.google.android.gms.common.internal.q.g(str);
        this.a = a5Var;
        this.b = str;
        a5Var.f().h();
    }

    public final boolean A() {
        this.a.f().h();
        return this.D;
    }

    public final String B() {
        this.a.f().h();
        return this.C;
    }

    public final String C() {
        this.a.f().h();
        String str = this.C;
        D(null);
        return str;
    }

    public final void D(String str) {
        this.a.f().h();
        this.D |= !ca.G(this.C, str);
        this.C = str;
    }

    public final long E() {
        this.a.f().h();
        return this.p;
    }

    public final void F(long j2) {
        this.a.f().h();
        this.D |= this.p != j2;
        this.p = j2;
    }

    public final boolean G() {
        this.a.f().h();
        return this.q;
    }

    public final void H(boolean z) {
        this.a.f().h();
        this.D |= this.q != z;
        this.q = z;
    }

    public final Boolean I() {
        this.a.f().h();
        return this.s;
    }

    public final void J(Boolean bool) {
        boolean zEquals;
        this.a.f().h();
        boolean z = this.D;
        Boolean bool2 = this.s;
        int i2 = ca.f1176i;
        if (bool2 == null && bool == null) {
            zEquals = true;
        } else {
            zEquals = bool2 == null ? false : bool2.equals(bool);
        }
        this.D = z | (!zEquals);
        this.s = bool;
    }

    public final List<String> K() {
        this.a.f().h();
        return this.u;
    }

    public final void L(List<String> list) {
        this.a.f().h();
        List<String> list2 = this.u;
        int i2 = ca.f1176i;
        if (list2 == null && list == null) {
            return;
        }
        if (list2 != null && list2.equals(list)) {
            return;
        }
        this.D = true;
        this.u = list != null ? new ArrayList(list) : null;
    }

    public final void M() {
        this.a.f().h();
        this.D = false;
    }

    public final String N() {
        this.a.f().h();
        return this.b;
    }

    public final String O() {
        this.a.f().h();
        return this.c;
    }

    public final void P(String str) {
        this.a.f().h();
        this.D |= !ca.G(this.c, str);
        this.c = str;
    }

    public final String Q() {
        this.a.f().h();
        return this.d;
    }

    public final void R(String str) {
        this.a.f().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ ca.G(this.d, str);
        this.d = str;
    }

    public final String S() {
        this.a.f().h();
        return this.r;
    }

    public final void T(String str) {
        this.a.f().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ ca.G(this.r, str);
        this.r = str;
    }

    public final String U() {
        this.a.f().h();
        return this.v;
    }

    public final void V(String str) {
        this.a.f().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ ca.G(this.v, str);
        this.v = str;
    }

    public final String W() {
        this.a.f().h();
        return this.e;
    }

    public final void X(String str) {
        this.a.f().h();
        this.D |= !ca.G(this.e, str);
        this.e = str;
    }

    public final String Y() {
        this.a.f().h();
        return this.f;
    }

    public final void Z(String str) {
        this.a.f().h();
        this.D |= !ca.G(this.f, str);
        this.f = str;
    }

    public final void a(long j2) {
        this.a.f().h();
        this.D |= this.f1207m != j2;
        this.f1207m = j2;
    }

    public final long a0() {
        this.a.f().h();
        return this.f1202h;
    }

    public final long b() {
        this.a.f().h();
        return this.f1208n;
    }

    public final void b0(long j2) {
        this.a.f().h();
        this.D |= this.f1202h != j2;
        this.f1202h = j2;
    }

    public final void c(long j2) {
        this.a.f().h();
        this.D |= this.f1208n != j2;
        this.f1208n = j2;
    }

    public final long c0() {
        this.a.f().h();
        return this.f1203i;
    }

    public final long d() {
        this.a.f().h();
        return this.t;
    }

    public final void d0(long j2) {
        this.a.f().h();
        this.D |= this.f1203i != j2;
        this.f1203i = j2;
    }

    public final void e(long j2) {
        this.a.f().h();
        this.D |= this.t != j2;
        this.t = j2;
    }

    public final String e0() {
        this.a.f().h();
        return this.f1204j;
    }

    public final boolean f() {
        this.a.f().h();
        return this.f1209o;
    }

    public final void f0(String str) {
        this.a.f().h();
        this.D |= !ca.G(this.f1204j, str);
        this.f1204j = str;
    }

    public final void g(boolean z) {
        this.a.f().h();
        this.D |= this.f1209o != z;
        this.f1209o = z;
    }

    public final long g0() {
        this.a.f().h();
        return this.f1205k;
    }

    public final void h(long j2) {
        com.google.android.gms.common.internal.q.a(j2 >= 0);
        this.a.f().h();
        this.D = (this.f1201g != j2) | this.D;
        this.f1201g = j2;
    }

    public final void h0(long j2) {
        this.a.f().h();
        this.D |= this.f1205k != j2;
        this.f1205k = j2;
    }

    public final long i() {
        this.a.f().h();
        return this.f1201g;
    }

    public final String i0() {
        this.a.f().h();
        return this.f1206l;
    }

    public final long j() {
        this.a.f().h();
        return this.E;
    }

    public final void j0(String str) {
        this.a.f().h();
        this.D |= !ca.G(this.f1206l, str);
        this.f1206l = str;
    }

    public final void k(long j2) {
        this.a.f().h();
        this.D |= this.E != j2;
        this.E = j2;
    }

    public final long k0() {
        this.a.f().h();
        return this.f1207m;
    }

    public final long l() {
        this.a.f().h();
        return this.F;
    }

    public final void m(long j2) {
        this.a.f().h();
        this.D |= this.F != j2;
        this.F = j2;
    }

    public final void n() {
        this.a.f().h();
        long j2 = this.f1201g + 1;
        if (j2 > 2147483647L) {
            this.a.d().r().b("Bundle index overflow. appId", r3.x(this.b));
            j2 = 0;
        }
        this.D = true;
        this.f1201g = j2;
    }

    public final long o() {
        this.a.f().h();
        return this.w;
    }

    public final void p(long j2) {
        this.a.f().h();
        this.D |= this.w != j2;
        this.w = j2;
    }

    public final long q() {
        this.a.f().h();
        return this.x;
    }

    public final void r(long j2) {
        this.a.f().h();
        this.D |= this.x != j2;
        this.x = j2;
    }

    public final long s() {
        this.a.f().h();
        return this.y;
    }

    public final void t(long j2) {
        this.a.f().h();
        this.D |= this.y != j2;
        this.y = j2;
    }

    public final long u() {
        this.a.f().h();
        return this.z;
    }

    public final void v(long j2) {
        this.a.f().h();
        this.D |= this.z != j2;
        this.z = j2;
    }

    public final long w() {
        this.a.f().h();
        return this.B;
    }

    public final void x(long j2) {
        this.a.f().h();
        this.D |= this.B != j2;
        this.B = j2;
    }

    public final long y() {
        this.a.f().h();
        return this.A;
    }

    public final void z(long j2) {
        this.a.f().h();
        this.D |= this.A != j2;
        this.A = j2;
    }
}
