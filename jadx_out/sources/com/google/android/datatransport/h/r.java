package com.google.android.datatransport.h;

import android.content.Context;
import com.google.android.datatransport.TransportFactory;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class r implements q {
    private static volatile s e;
    private final com.google.android.datatransport.h.z.a a;
    private final com.google.android.datatransport.h.z.a b;
    private final com.google.android.datatransport.h.x.e c;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.o d;

    r(com.google.android.datatransport.h.z.a aVar, com.google.android.datatransport.h.z.a aVar2, com.google.android.datatransport.h.x.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.o oVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.q qVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = eVar;
        this.d = oVar;
        qVar.a();
    }

    private i b(m mVar) {
        i.a aVarA = i.a();
        aVarA.i(this.a.a());
        aVarA.k(this.b.a());
        aVarA.j(mVar.g());
        aVarA.h(new h(mVar.b(), mVar.d()));
        aVarA.g(mVar.c().a());
        return aVarA.d();
    }

    public static r c() {
        s sVar = e;
        if (sVar != null) {
            return sVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<com.google.android.datatransport.b> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(com.google.android.datatransport.b.b("proto"));
    }

    public static void f(Context context) {
        if (e == null) {
            synchronized (r.class) {
                if (e == null) {
                    s.a aVarF = e.f();
                    aVarF.b(context);
                    e = aVarF.a();
                }
            }
        }
    }

    @Override // com.google.android.datatransport.h.q
    public void a(m mVar, com.google.android.datatransport.g gVar) {
        this.c.a(mVar.f().e(mVar.c().c()), b(mVar), gVar);
    }

    public com.google.android.datatransport.runtime.scheduling.jobscheduling.o e() {
        return this.d;
    }

    public TransportFactory g(f fVar) {
        Set<com.google.android.datatransport.b> setD = d(fVar);
        n.a aVarA = n.a();
        aVarA.b(fVar.b());
        aVarA.c(fVar.c());
        return new o(setD, aVarA.a(), this);
    }
}
