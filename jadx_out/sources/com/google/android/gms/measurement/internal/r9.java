package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class r9 implements Callable<String> {
    final /* synthetic */ ja a;
    final /* synthetic */ v9 b;

    r9(v9 v9Var, ja jaVar) {
        this.b = v9Var;
        this.a = jaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() {
        v9 v9Var = this.b;
        String str = this.a.a;
        com.google.android.gms.common.internal.q.k(str);
        if (v9Var.e0(str).h() && g.c(this.a.v).h()) {
            return this.b.y(this.a).O();
        }
        this.b.d().w().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
