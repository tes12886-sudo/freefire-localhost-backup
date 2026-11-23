package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class w implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ l b;
    final /* synthetic */ e c;

    w(e eVar, String str, l lVar) {
        this.c = eVar;
        this.a = str;
        this.b = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        m0 m0VarB = e.B(this.c, this.a);
        if (m0VarB.b() != null) {
            this.b.a(m0VarB.a(), m0VarB.b());
            return null;
        }
        this.b.a(m0VarB.a(), j.d.a.c.f.h.b0.t());
        return null;
    }
}
