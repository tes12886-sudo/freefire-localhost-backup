package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class h1 implements Runnable {
    final /* synthetic */ i1 a;

    h1(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j1 j1Var = this.a.a;
        j1Var.b.h(String.valueOf(j1Var.b.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
