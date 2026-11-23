package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements j.d.a.d.a.b.h0<a1> {
    private final j.d.a.d.a.b.h0 a;
    private final j.d.a.d.a.b.h0 b;
    private final j.d.a.d.a.b.h0 c;
    private final j.d.a.d.a.b.h0 d;
    private final /* synthetic */ int e = 0;

    public b1(j.d.a.d.a.b.h0<v> h0Var, j.d.a.d.a.b.h0<s2> h0Var2, j.d.a.d.a.b.h0<o0> h0Var3, j.d.a.d.a.b.h0<Executor> h0Var4) {
        this.a = h0Var;
        this.b = h0Var2;
        this.c = h0Var3;
        this.d = h0Var4;
    }

    public b1(j.d.a.d.a.b.h0<v> h0Var, j.d.a.d.a.b.h0<s2> h0Var2, j.d.a.d.a.b.h0<s> h0Var3, j.d.a.d.a.b.h0<o0> h0Var4, byte[] bArr) {
        this.a = h0Var;
        this.b = h0Var2;
        this.c = h0Var3;
        this.d = h0Var4;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.play.core.assetpacks.a1, com.google.android.play.core.assetpacks.j0] */
    @Override // j.d.a.d.a.b.h0
    public final /* bridge */ /* synthetic */ a1 a() {
        if (this.e != 0) {
            return new j0((v) this.a.a(), j.d.a.d.a.b.g0.c(this.b), j.d.a.d.a.b.g0.c(this.c), (o0) this.d.a());
        }
        Object objA = this.a.a();
        return new a1((v) objA, j.d.a.d.a.b.g0.c(this.b), (o0) this.c.a(), j.d.a.d.a.b.g0.c(this.d));
    }
}
