package com.google.android.datatransport.h.x.j;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements com.google.android.datatransport.h.u.a.b<f0> {
    private final k.a.a<com.google.android.datatransport.h.z.a> a;
    private final k.a.a<com.google.android.datatransport.h.z.a> b;
    private final k.a.a<z> c;
    private final k.a.a<h0> d;

    public g0(k.a.a<com.google.android.datatransport.h.z.a> aVar, k.a.a<com.google.android.datatransport.h.z.a> aVar2, k.a.a<z> aVar3, k.a.a<h0> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public static g0 a(k.a.a<com.google.android.datatransport.h.z.a> aVar, k.a.a<com.google.android.datatransport.h.z.a> aVar2, k.a.a<z> aVar3, k.a.a<h0> aVar4) {
        return new g0(aVar, aVar2, aVar3, aVar4);
    }

    public static f0 c(com.google.android.datatransport.h.z.a aVar, com.google.android.datatransport.h.z.a aVar2, Object obj, Object obj2) {
        return new f0(aVar, aVar2, (z) obj, (h0) obj2);
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f0 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
