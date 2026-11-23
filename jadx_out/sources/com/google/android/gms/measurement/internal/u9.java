package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class u9 {
    com.google.android.gms.internal.measurement.s4 a;
    List<Long> b;
    List<com.google.android.gms.internal.measurement.k4> c;
    long d;
    final /* synthetic */ v9 e;

    /* synthetic */ u9(v9 v9Var, o9 o9Var) {
        this.e = v9Var;
    }

    private static final long b(com.google.android.gms.internal.measurement.k4 k4Var) {
        return ((k4Var.C() / 1000) / 60) / 60;
    }

    public final boolean a(long j2, com.google.android.gms.internal.measurement.k4 k4Var) {
        com.google.android.gms.common.internal.q.k(k4Var);
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (this.c.size() > 0 && b(this.c.get(0)) != b(k4Var)) {
            return false;
        }
        long jD = this.d + ((long) k4Var.d());
        this.e.S();
        if (jD >= Math.max(0, f3.f1194i.b(null).intValue())) {
            return false;
        }
        this.d = jD;
        this.c.add(k4Var);
        this.b.add(Long.valueOf(j2));
        int size = this.c.size();
        this.e.S();
        return size < Math.max(1, f3.f1195j.b(null).intValue());
    }
}
