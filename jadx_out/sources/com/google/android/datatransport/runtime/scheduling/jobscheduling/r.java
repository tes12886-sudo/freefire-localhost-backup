package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.h.x.j.y;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class r implements com.google.android.datatransport.h.u.a.b<q> {
    private final k.a.a<Executor> a;
    private final k.a.a<y> b;
    private final k.a.a<s> c;
    private final k.a.a<com.google.android.datatransport.h.y.b> d;

    public r(k.a.a<Executor> aVar, k.a.a<y> aVar2, k.a.a<s> aVar3, k.a.a<com.google.android.datatransport.h.y.b> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public static r a(k.a.a<Executor> aVar, k.a.a<y> aVar2, k.a.a<s> aVar3, k.a.a<com.google.android.datatransport.h.y.b> aVar4) {
        return new r(aVar, aVar2, aVar3, aVar4);
    }

    public static q c(Executor executor, y yVar, s sVar, com.google.android.datatransport.h.y.b bVar) {
        return new q(executor, yVar, sVar, bVar);
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
