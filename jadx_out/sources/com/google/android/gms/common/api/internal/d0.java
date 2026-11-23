package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class d0 implements Runnable {
    final /* synthetic */ p0 a;

    d0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p0 p0Var = this.a;
        p0Var.d.cancelAvailabilityErrorNotifications(p0Var.c);
    }
}
