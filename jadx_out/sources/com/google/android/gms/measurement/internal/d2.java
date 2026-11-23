package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends e3 {
    private final Map<String, Long> b;
    private final Map<String, Integer> c;
    private long d;

    public d2(a5 a5Var) {
        super(a5Var);
        this.c = new h.f.a();
        this.b = new h.f.a();
    }

    static /* synthetic */ void l(d2 d2Var, String str, long j2) {
        d2Var.h();
        com.google.android.gms.common.internal.q.g(str);
        if (d2Var.c.isEmpty()) {
            d2Var.d = j2;
        }
        Integer num = d2Var.c.get(str);
        if (num != null) {
            d2Var.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (d2Var.c.size() >= 100) {
            d2Var.a.d().r().a("Too many ads visible");
        } else {
            d2Var.c.put(str, 1);
            d2Var.b.put(str, Long.valueOf(j2));
        }
    }

    static /* synthetic */ void m(d2 d2Var, String str, long j2) {
        d2Var.h();
        com.google.android.gms.common.internal.q.g(str);
        Integer num = d2Var.c.get(str);
        if (num == null) {
            d2Var.a.d().o().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        k7 k7VarS = d2Var.a.Q().s(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            d2Var.c.put(str, Integer.valueOf(iIntValue));
            return;
        }
        d2Var.c.remove(str);
        Long l2 = d2Var.b.get(str);
        if (l2 == null) {
            d2Var.a.d().o().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = l2.longValue();
            d2Var.b.remove(str);
            d2Var.p(str, j2 - jLongValue, k7VarS);
        }
        if (d2Var.c.isEmpty()) {
            long j3 = d2Var.d;
            if (j3 == 0) {
                d2Var.a.d().o().a("First ad exposure time was never set");
            } else {
                d2Var.o(j2 - j3, k7VarS);
                d2Var.d = 0L;
            }
        }
    }

    private final void o(long j2, k7 k7Var) {
        if (k7Var == null) {
            this.a.d().w().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j2 < 1000) {
            this.a.d().w().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j2);
        r7.x(k7Var, bundle, true);
        this.a.F().X("am", "_xa", bundle);
    }

    private final void p(String str, long j2, k7 k7Var) {
        if (k7Var == null) {
            this.a.d().w().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j2 < 1000) {
            this.a.d().w().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j2);
        r7.x(k7Var, bundle, true);
        this.a.F().X("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(long j2) {
        Iterator<String> it = this.b.keySet().iterator();
        while (it.hasNext()) {
            this.b.put(it.next(), Long.valueOf(j2));
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.d = j2;
    }

    public final void i(String str, long j2) {
        if (str == null || str.length() == 0) {
            this.a.d().o().a("Ad unit id must be a non-empty string");
        } else {
            this.a.f().r(new a(this, str, j2));
        }
    }

    public final void j(String str, long j2) {
        if (str == null || str.length() == 0) {
            this.a.d().o().a("Ad unit id must be a non-empty string");
        } else {
            this.a.f().r(new b0(this, str, j2));
        }
    }

    public final void k(long j2) {
        k7 k7VarS = this.a.Q().s(false);
        for (String str : this.b.keySet()) {
            p(str, j2 - this.b.get(str).longValue(), k7VarS);
        }
        if (!this.b.isEmpty()) {
            o(j2 - this.d, k7VarS);
        }
        q(j2);
    }
}
