package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class f5 implements Callable<List<aa>> {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ t5 d;

    f5(t5 t5Var, String str, String str2, String str3) {
        this.d = t5Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<aa> call() {
        this.d.a.l();
        return this.d.a.V().W(this.a, this.b, this.c);
    }
}
