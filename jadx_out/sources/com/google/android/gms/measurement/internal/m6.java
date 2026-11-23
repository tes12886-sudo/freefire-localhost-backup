package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class m6 implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ d7 b;

    m6(d7 d7Var, long j2) {
        this.b = d7Var;
        this.a = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.t(this.a, true);
        this.b.a.R().T(new AtomicReference<>());
    }
}
