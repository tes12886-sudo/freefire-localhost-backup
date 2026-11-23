package com.google.android.datatransport.h.x.j;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements com.google.android.datatransport.h.u.a.b<h0> {
    private final k.a.a<Context> a;
    private final k.a.a<String> b;
    private final k.a.a<Integer> c;

    public i0(k.a.a<Context> aVar, k.a.a<String> aVar2, k.a.a<Integer> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public static i0 a(k.a.a<Context> aVar, k.a.a<String> aVar2, k.a.a<Integer> aVar3) {
        return new i0(aVar, aVar2, aVar3);
    }

    public static h0 c(Context context, String str, int i2) {
        return new h0(context, str, i2);
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h0 get() {
        return c(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
