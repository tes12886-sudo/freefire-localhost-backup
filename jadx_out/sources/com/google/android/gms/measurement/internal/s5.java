package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class s5 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ long d;
    final /* synthetic */ t5 e;

    s5(t5 t5Var, String str, String str2, String str3, long j2) {
        this.e = t5Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.a;
        if (str == null) {
            this.e.a.s().Q().y(this.b, null);
        } else {
            this.e.a.s().Q().y(this.b, new k7(this.c, str, this.d));
        }
    }
}
