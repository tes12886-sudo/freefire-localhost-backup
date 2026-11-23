package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class o3 implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ r3 f;

    o3(r3 r3Var, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.f = r3Var;
        this.a = i2;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var;
        char c;
        h4 h4VarA = this.f.a.A();
        if (!h4VarA.k()) {
            Log.println(6, this.f.z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f.c == 0) {
            if (this.f.a.z().q()) {
                r3Var = this.f;
                r3Var.a.a();
                c = 'C';
            } else {
                r3Var = this.f;
                r3Var.a.a();
                c = 'c';
            }
            r3Var.c = c;
        }
        if (this.f.d < 0) {
            r3 r3Var2 = this.f;
            r3Var2.a.z().p();
            r3.F(r3Var2, 42004L);
        }
        char cCharAt = "01VDIWEA?".charAt(this.a);
        char c2 = this.f.c;
        long j2 = this.f.d;
        String strA = r3.A(true, this.b, this.c, this.d, this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 24);
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c2);
        sb.append(j2);
        sb.append(":");
        sb.append(strA);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = this.b.substring(0, 1024);
        }
        e4 e4Var = h4VarA.d;
        if (e4Var != null) {
            e4Var.a(string, 1L);
        }
    }
}
