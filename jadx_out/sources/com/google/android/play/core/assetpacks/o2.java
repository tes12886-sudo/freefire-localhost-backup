package com.google.android.play.core.assetpacks;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class o2 implements j.d.a.d.a.b.h0<Context> {
    private final k2 a;

    public o2(k2 k2Var) {
        this.a = k2Var;
    }

    public static Context c(k2 k2Var) {
        Context contextA = k2Var.a();
        j.d.a.d.a.b.s.d(contextA);
        return contextA;
    }

    @Override // j.d.a.d.a.b.h0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Context a() {
        return c(this.a);
    }
}
