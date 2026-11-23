package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class o5 implements Callable<byte[]> {
    final /* synthetic */ t a;
    final /* synthetic */ String b;
    final /* synthetic */ t5 c;

    o5(t5 t5Var, t tVar, String str) {
        this.c = t5Var;
        this.a = tVar;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ byte[] call() {
        this.c.a.l();
        this.c.a.X().h();
        a5.u();
        throw null;
    }
}
