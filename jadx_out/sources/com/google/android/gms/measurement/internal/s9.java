package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class s9 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b = "_err";
    final /* synthetic */ Bundle c;
    final /* synthetic */ t9 d;

    s9(t9 t9Var, String str, String str2, Bundle bundle) {
        this.d = t9Var;
        this.a = str;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVarJ = this.d.a.b0().J(this.a, this.b, this.c, "auto", this.d.a.e().a(), false, false);
        v9 v9Var = this.d.a;
        com.google.android.gms.common.internal.q.k(tVarJ);
        v9Var.g0(tVarJ, this.a);
    }
}
