package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.ed;

/* JADX INFO: loaded from: classes.dex */
final class ra extends qa {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.p3 f1274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ sa f1275h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ra(sa saVar, String str, int i2, com.google.android.gms.internal.measurement.p3 p3Var) {
        super(str, i2);
        this.f1275h = saVar;
        this.f1274g = p3Var;
    }

    @Override // com.google.android.gms.measurement.internal.qa
    final int a() {
        return this.f1274g.y();
    }

    @Override // com.google.android.gms.measurement.internal.qa
    final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.qa
    final boolean c() {
        return false;
    }

    final boolean k(Long l2, Long l3, com.google.android.gms.internal.measurement.d5 d5Var, boolean z) {
        p3 p3VarR;
        String strR;
        String str;
        Boolean boolF;
        ed.a();
        boolean zW = this.f1275h.a.z().w(this.a, f3.Y);
        boolean zB = this.f1274g.B();
        boolean zC = this.f1274g.C();
        boolean zE = this.f1274g.E();
        boolean z2 = zB || zC || zE;
        Boolean boolE = null;
        boolE = null;
        if (z && !z2) {
            this.f1275h.a.d().w().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), this.f1274g.x() ? Integer.valueOf(this.f1274g.y()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.j3 j3VarA = this.f1274g.A();
        boolean zC2 = j3VarA.C();
        if (d5Var.C()) {
            if (j3VarA.z()) {
                boolF = qa.g(d5Var.D(), j3VarA.A());
                boolE = qa.e(boolF, zC2);
            } else {
                p3VarR = this.f1275h.a.d().r();
                strR = this.f1275h.a.H().r(d5Var.z());
                str = "No number filter for long property. property";
                p3VarR.b(str, strR);
            }
        } else if (!d5Var.E()) {
            if (d5Var.A()) {
                if (j3VarA.x()) {
                    boolF = qa.f(d5Var.B(), j3VarA.y(), this.f1275h.a.d());
                } else if (!j3VarA.z()) {
                    p3VarR = this.f1275h.a.d().r();
                    strR = this.f1275h.a.H().r(d5Var.z());
                    str = "No string or number filter defined. property";
                } else if (x9.C(d5Var.B())) {
                    boolF = qa.i(d5Var.B(), j3VarA.A());
                } else {
                    this.f1275h.a.d().r().c("Invalid user property value for Numeric number filter. property, value", this.f1275h.a.H().r(d5Var.z()), d5Var.B());
                }
                boolE = qa.e(boolF, zC2);
            } else {
                p3VarR = this.f1275h.a.d().r();
                strR = this.f1275h.a.H().r(d5Var.z());
                str = "User property has no value, property";
            }
            p3VarR.b(str, strR);
        } else if (j3VarA.z()) {
            boolF = qa.h(d5Var.G(), j3VarA.A());
            boolE = qa.e(boolF, zC2);
        } else {
            p3VarR = this.f1275h.a.d().r();
            strR = this.f1275h.a.H().r(d5Var.z());
            str = "No number filter for double property. property";
            p3VarR.b(str, strR);
        }
        this.f1275h.a.d().w().b("Property filter result", boolE == null ? "null" : boolE);
        if (boolE == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (zE && !boolE.booleanValue()) {
            return true;
        }
        if (!z || this.f1274g.B()) {
            this.d = boolE;
        }
        if (boolE.booleanValue() && z2 && d5Var.x()) {
            long jY = d5Var.y();
            if (l2 != null) {
                jY = l2.longValue();
            }
            if (zW && this.f1274g.B() && !this.f1274g.C() && l3 != null) {
                jY = l3.longValue();
            }
            if (this.f1274g.C()) {
                this.f = Long.valueOf(jY);
            } else {
                this.e = Long.valueOf(jY);
            }
        }
        return true;
    }
}
