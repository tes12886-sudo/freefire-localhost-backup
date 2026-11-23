package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class l7 implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ k7 b;
    final /* synthetic */ k7 c;
    final /* synthetic */ long d;
    final /* synthetic */ r7 e;

    l7(r7 r7Var, Bundle bundle, k7 k7Var, k7 k7Var2, long j2) {
        this.e = r7Var;
        this.a = bundle;
        this.b = k7Var;
        this.c = k7Var2;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r7.E(this.e, this.a, this.b, this.c, this.d);
    }
}
