package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class q6 implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ d7 d;

    q6(d7 d7Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.d = d7Var;
        this.a = atomicReference;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.R().N(this.a, null, this.b, this.c);
    }
}
