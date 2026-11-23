package com.google.android.datatransport.h.x;

import android.content.Context;
import com.google.android.datatransport.h.x.j.y;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;

/* JADX INFO: loaded from: classes.dex */
public final class i implements com.google.android.datatransport.h.u.a.b<s> {
    private final k.a.a<Context> a;
    private final k.a.a<y> b;
    private final k.a.a<n> c;
    private final k.a.a<com.google.android.datatransport.h.z.a> d;

    public i(k.a.a<Context> aVar, k.a.a<y> aVar2, k.a.a<n> aVar3, k.a.a<com.google.android.datatransport.h.z.a> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public static i a(k.a.a<Context> aVar, k.a.a<y> aVar2, k.a.a<n> aVar3, k.a.a<com.google.android.datatransport.h.z.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static s c(Context context, y yVar, n nVar, com.google.android.datatransport.h.z.a aVar) {
        s sVarA = h.a(context, yVar, nVar, aVar);
        com.google.android.datatransport.h.u.a.d.c(sVarA, "Cannot return null from a non-@Nullable @Provides method");
        return sVarA;
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
