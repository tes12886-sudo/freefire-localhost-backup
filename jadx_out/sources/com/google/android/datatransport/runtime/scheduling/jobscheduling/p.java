package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.h.x.j.y;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class p implements com.google.android.datatransport.h.u.a.b<o> {
    private final k.a.a<Context> a;
    private final k.a.a<com.google.android.datatransport.runtime.backends.e> b;
    private final k.a.a<y> c;
    private final k.a.a<s> d;
    private final k.a.a<Executor> e;
    private final k.a.a<com.google.android.datatransport.h.y.b> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k.a.a<com.google.android.datatransport.h.z.a> f891g;

    public p(k.a.a<Context> aVar, k.a.a<com.google.android.datatransport.runtime.backends.e> aVar2, k.a.a<y> aVar3, k.a.a<s> aVar4, k.a.a<Executor> aVar5, k.a.a<com.google.android.datatransport.h.y.b> aVar6, k.a.a<com.google.android.datatransport.h.z.a> aVar7) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f891g = aVar7;
    }

    public static p a(k.a.a<Context> aVar, k.a.a<com.google.android.datatransport.runtime.backends.e> aVar2, k.a.a<y> aVar3, k.a.a<s> aVar4, k.a.a<Executor> aVar5, k.a.a<com.google.android.datatransport.h.y.b> aVar6, k.a.a<com.google.android.datatransport.h.z.a> aVar7) {
        return new p(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static o c(Context context, com.google.android.datatransport.runtime.backends.e eVar, y yVar, s sVar, Executor executor, com.google.android.datatransport.h.y.b bVar, com.google.android.datatransport.h.z.a aVar) {
        return new o(context, eVar, yVar, sVar, executor, bVar, aVar);
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.f891g.get());
    }
}
