package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j implements com.google.android.datatransport.h.u.a.b<i> {
    private final k.a.a<Context> a;
    private final k.a.a<com.google.android.datatransport.h.z.a> b;
    private final k.a.a<com.google.android.datatransport.h.z.a> c;

    public j(k.a.a<Context> aVar, k.a.a<com.google.android.datatransport.h.z.a> aVar2, k.a.a<com.google.android.datatransport.h.z.a> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public static j a(k.a.a<Context> aVar, k.a.a<com.google.android.datatransport.h.z.a> aVar2, k.a.a<com.google.android.datatransport.h.z.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, com.google.android.datatransport.h.z.a aVar, com.google.android.datatransport.h.z.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
