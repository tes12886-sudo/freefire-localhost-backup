package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class q5 implements Callable<List<aa>> {
    final /* synthetic */ String a;
    final /* synthetic */ t5 b;

    q5(t5 t5Var, String str) {
        this.b = t5Var;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<aa> call() {
        this.b.a.l();
        return this.b.a.V().V(this.a);
    }
}
