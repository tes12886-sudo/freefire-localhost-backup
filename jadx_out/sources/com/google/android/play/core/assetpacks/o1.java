package com.google.android.play.core.assetpacks;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class o1 implements j.d.a.d.a.b.h0<n1> {
    private final j.d.a.d.a.b.h0 a;
    private final /* synthetic */ int b = 0;

    public o1(j.d.a.d.a.b.h0<v> h0Var) {
        this.a = h0Var;
    }

    public o1(j.d.a.d.a.b.h0<s2> h0Var, byte[] bArr) {
        this.a = h0Var;
    }

    public o1(j.d.a.d.a.b.h0<Context> h0Var, char[] cArr) {
        this.a = h0Var;
    }

    public o1(j.d.a.d.a.b.h0<v> h0Var, short[] sArr) {
        this.a = h0Var;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.play.core.assetpacks.c0, com.google.android.play.core.assetpacks.n1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.play.core.assetpacks.n1, com.google.android.play.core.assetpacks.u1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.play.core.assetpacks.c2, com.google.android.play.core.assetpacks.n1] */
    @Override // j.d.a.d.a.b.h0
    public final /* bridge */ /* synthetic */ n1 a() {
        int i2 = this.b;
        if (i2 == 0) {
            return new n1((v) this.a.a());
        }
        if (i2 != 1) {
            return i2 != 2 ? new c2((v) this.a.a()) : new u1(((o2) this.a).a());
        }
        return new c0(j.d.a.d.a.b.g0.c(this.a));
    }
}
