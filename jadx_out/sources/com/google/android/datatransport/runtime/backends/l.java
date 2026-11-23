package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class l implements com.google.android.datatransport.h.u.a.b<k> {
    private final k.a.a<Context> a;
    private final k.a.a<i> b;

    public l(k.a.a<Context> aVar, k.a.a<i> aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public static l a(k.a.a<Context> aVar, k.a.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.a.get(), this.b.get());
    }
}
