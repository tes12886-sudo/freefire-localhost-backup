package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class a implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ d2 c;

    a(d2 d2Var, String str, long j2) {
        this.c = d2Var;
        this.a = str;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d2.l(this.c, this.a, this.b);
    }
}
