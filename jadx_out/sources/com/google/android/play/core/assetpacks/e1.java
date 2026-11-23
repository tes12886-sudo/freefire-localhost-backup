package com.google.android.play.core.assetpacks;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements j.d.a.d.a.b.h0<d1> {
    private final j.d.a.d.a.b.h0 a;
    private final j.d.a.d.a.b.h0 b;
    private final j.d.a.d.a.b.h0 c;
    private final /* synthetic */ int d = 0;

    public e1(j.d.a.d.a.b.h0<a1> h0Var, j.d.a.d.a.b.h0<v> h0Var2, j.d.a.d.a.b.h0<c0> h0Var3) {
        this.a = h0Var;
        this.b = h0Var2;
        this.c = h0Var3;
    }

    public e1(j.d.a.d.a.b.h0<Context> h0Var, j.d.a.d.a.b.h0<o> h0Var2, j.d.a.d.a.b.h0<i1> h0Var3, byte[] bArr) {
        this.c = h0Var;
        this.b = h0Var2;
        this.a = h0Var3;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.play.core.assetpacks.d1, com.google.android.play.core.assetpacks.s2, java.lang.Object] */
    @Override // j.d.a.d.a.b.h0
    public final /* bridge */ /* synthetic */ d1 a() {
        if (this.d == 0) {
            return new d1((a1) this.a.a(), (v) this.b.a(), (c0) this.c.a());
        }
        ?? r0 = (s2) (k2.b(((o2) this.c).a()) == null ? j.d.a.d.a.b.g0.c(this.b).a() : j.d.a.d.a.b.g0.c(this.a).a());
        j.d.a.d.a.b.s.d(r0);
        return r0;
    }
}
