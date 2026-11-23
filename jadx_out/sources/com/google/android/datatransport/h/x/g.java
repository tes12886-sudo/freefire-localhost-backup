package com.google.android.datatransport.h.x;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;

/* JADX INFO: loaded from: classes.dex */
public final class g implements com.google.android.datatransport.h.u.a.b<n> {
    private final k.a.a<com.google.android.datatransport.h.z.a> a;

    public g(k.a.a<com.google.android.datatransport.h.z.a> aVar) {
        this.a = aVar;
    }

    public static n a(com.google.android.datatransport.h.z.a aVar) {
        n nVarA = f.a(aVar);
        com.google.android.datatransport.h.u.a.d.c(nVarA, "Cannot return null from a non-@Nullable @Provides method");
        return nVarA;
    }

    public static g b(k.a.a<com.google.android.datatransport.h.z.a> aVar) {
        return new g(aVar);
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n get() {
        return a(this.a.get());
    }
}
