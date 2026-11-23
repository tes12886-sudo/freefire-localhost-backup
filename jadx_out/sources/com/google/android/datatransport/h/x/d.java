package com.google.android.datatransport.h.x;

import com.google.android.datatransport.h.x.j.y;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements com.google.android.datatransport.h.u.a.b<c> {
    private final k.a.a<Executor> a;
    private final k.a.a<com.google.android.datatransport.runtime.backends.e> b;
    private final k.a.a<s> c;
    private final k.a.a<y> d;
    private final k.a.a<com.google.android.datatransport.h.y.b> e;

    public d(k.a.a<Executor> aVar, k.a.a<com.google.android.datatransport.runtime.backends.e> aVar2, k.a.a<s> aVar3, k.a.a<y> aVar4, k.a.a<com.google.android.datatransport.h.y.b> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
    }

    public static d a(k.a.a<Executor> aVar, k.a.a<com.google.android.datatransport.runtime.backends.e> aVar2, k.a.a<s> aVar3, k.a.a<y> aVar4, k.a.a<com.google.android.datatransport.h.y.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, s sVar, y yVar, com.google.android.datatransport.h.y.b bVar) {
        return new c(executor, eVar, sVar, yVar, bVar);
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
