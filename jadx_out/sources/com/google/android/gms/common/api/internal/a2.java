package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class a2 implements Runnable {
    final /* synthetic */ d2 a;

    a2(d2 d2Var) {
        this.a = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f952g.c(new ConnectionResult(4));
    }
}
