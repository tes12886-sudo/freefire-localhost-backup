package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class r6 implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ d7 e;

    r6(d7 d7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.e = d7Var;
        this.a = atomicReference;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a.R().P(this.a, null, this.b, this.c, this.d);
    }
}
