package com.google.android.datatransport.h;

import android.content.Context;
import com.google.android.datatransport.h.x.j.b0;
import com.google.android.datatransport.h.x.j.c0;
import com.google.android.datatransport.h.x.j.d0;
import com.google.android.datatransport.h.x.j.f0;
import com.google.android.datatransport.h.x.j.g0;
import com.google.android.datatransport.h.x.j.i0;
import com.google.android.datatransport.h.x.j.y;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class e extends s {
    private k.a.a<Executor> a;
    private k.a.a<Context> b;
    private k.a.a c;
    private k.a.a d;
    private k.a.a e;
    private k.a.a<f0> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.n> f882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> f883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k.a.a<com.google.android.datatransport.h.x.c> f884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private k.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.o> f885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private k.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.q> f886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private k.a.a<r> f887l;

    private static final class b implements s.a {
        private Context a;

        private b() {
        }

        @Override // com.google.android.datatransport.h.s.a
        public s a() {
            com.google.android.datatransport.h.u.a.d.a(this.a, Context.class);
            return new e(this.a);
        }

        @Override // com.google.android.datatransport.h.s.a
        public /* bridge */ /* synthetic */ s.a b(Context context) {
            c(context);
            return this;
        }

        public b c(Context context) {
            com.google.android.datatransport.h.u.a.d.b(context);
            this.a = context;
            return this;
        }
    }

    private e(Context context) {
        j(context);
    }

    public static s.a f() {
        return new b();
    }

    private void j(Context context) {
        this.a = com.google.android.datatransport.h.u.a.a.a(k.a());
        com.google.android.datatransport.h.u.a.b bVarA = com.google.android.datatransport.h.u.a.c.a(context);
        this.b = bVarA;
        com.google.android.datatransport.runtime.backends.j jVarA = com.google.android.datatransport.runtime.backends.j.a(bVarA, com.google.android.datatransport.h.z.c.a(), com.google.android.datatransport.h.z.d.a());
        this.c = jVarA;
        this.d = com.google.android.datatransport.h.u.a.a.a(com.google.android.datatransport.runtime.backends.l.a(this.b, jVarA));
        this.e = i0.a(this.b, b0.a(), c0.a());
        this.f = com.google.android.datatransport.h.u.a.a.a(g0.a(com.google.android.datatransport.h.z.c.a(), com.google.android.datatransport.h.z.d.a(), d0.a(), this.e));
        com.google.android.datatransport.h.x.g gVarB = com.google.android.datatransport.h.x.g.b(com.google.android.datatransport.h.z.c.a());
        this.f882g = gVarB;
        com.google.android.datatransport.h.x.i iVarA = com.google.android.datatransport.h.x.i.a(this.b, this.f, gVarB, com.google.android.datatransport.h.z.d.a());
        this.f883h = iVarA;
        k.a.a<Executor> aVar = this.a;
        k.a.a aVar2 = this.d;
        k.a.a<f0> aVar3 = this.f;
        this.f884i = com.google.android.datatransport.h.x.d.a(aVar, aVar2, iVarA, aVar3, aVar3);
        k.a.a<Context> aVar4 = this.b;
        k.a.a aVar5 = this.d;
        k.a.a<f0> aVar6 = this.f;
        this.f885j = com.google.android.datatransport.runtime.scheduling.jobscheduling.p.a(aVar4, aVar5, aVar6, this.f883h, this.a, aVar6, com.google.android.datatransport.h.z.c.a());
        k.a.a<Executor> aVar7 = this.a;
        k.a.a<f0> aVar8 = this.f;
        this.f886k = com.google.android.datatransport.runtime.scheduling.jobscheduling.r.a(aVar7, aVar8, this.f883h, aVar8);
        this.f887l = com.google.android.datatransport.h.u.a.a.a(t.a(com.google.android.datatransport.h.z.c.a(), com.google.android.datatransport.h.z.d.a(), this.f884i, this.f885j, this.f886k));
    }

    @Override // com.google.android.datatransport.h.s
    y b() {
        return this.f.get();
    }

    @Override // com.google.android.datatransport.h.s
    r c() {
        return this.f887l.get();
    }
}
