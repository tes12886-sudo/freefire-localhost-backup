package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class l6 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Object c;
    final /* synthetic */ long d;
    final /* synthetic */ d7 e;

    l6(d7 d7Var, String str, String str2, Object obj, long j2) {
        this.e = d7Var;
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.p(this.a, this.b, this.c, this.d);
    }
}
