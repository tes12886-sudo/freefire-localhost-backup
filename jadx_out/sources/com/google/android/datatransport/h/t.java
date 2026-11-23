package com.google.android.datatransport.h;

/* JADX INFO: loaded from: classes.dex */
public final class t implements com.google.android.datatransport.h.u.a.b<r> {
    private final k.a.a<com.google.android.datatransport.h.z.a> a;
    private final k.a.a<com.google.android.datatransport.h.z.a> b;
    private final k.a.a<com.google.android.datatransport.h.x.e> c;
    private final k.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.o> d;
    private final k.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.q> e;

    public t(k.a.a<com.google.android.datatransport.h.z.a> aVar, k.a.a<com.google.android.datatransport.h.z.a> aVar2, k.a.a<com.google.android.datatransport.h.x.e> aVar3, k.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.o> aVar4, k.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.q> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
    }

    public static t a(k.a.a<com.google.android.datatransport.h.z.a> aVar, k.a.a<com.google.android.datatransport.h.z.a> aVar2, k.a.a<com.google.android.datatransport.h.x.e> aVar3, k.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.o> aVar4, k.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.q> aVar5) {
        return new t(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static r c(com.google.android.datatransport.h.z.a aVar, com.google.android.datatransport.h.z.a aVar2, com.google.android.datatransport.h.x.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.o oVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.q qVar) {
        return new r(aVar, aVar2, eVar, oVar, qVar);
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
