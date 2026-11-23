package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class g1 implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ j1 b;

    g1(j1 j1Var, int i2) {
        this.b = j1Var;
        this.a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.h(this.a);
    }
}
