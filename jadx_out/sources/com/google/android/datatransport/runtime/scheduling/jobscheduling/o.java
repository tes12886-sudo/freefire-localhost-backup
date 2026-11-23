package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.h.x.j.e0;
import com.google.android.datatransport.h.x.j.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class o {
    private final Context a;
    private final com.google.android.datatransport.runtime.backends.e b;
    private final y c;
    private final s d;
    private final Executor e;
    private final com.google.android.datatransport.h.y.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.datatransport.h.z.a f890g;

    public o(Context context, com.google.android.datatransport.runtime.backends.e eVar, y yVar, s sVar, Executor executor, com.google.android.datatransport.h.y.b bVar, com.google.android.datatransport.h.z.a aVar) {
        this.a = context;
        this.b = eVar;
        this.c = yVar;
        this.d = sVar;
        this.e = executor;
        this.f = bVar;
        this.f890g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Iterable c(com.google.android.datatransport.h.n nVar) {
        return this.c.s(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Object e(com.google.android.datatransport.runtime.backends.g gVar, Iterable iterable, com.google.android.datatransport.h.n nVar, int i2) {
        if (gVar.c() == com.google.android.datatransport.runtime.backends.g.a.TRANSIENT_ERROR) {
            this.c.N(iterable);
            this.d.a(nVar, i2 + 1);
            return null;
        }
        this.c.k(iterable);
        if (gVar.c() == com.google.android.datatransport.runtime.backends.g.a.OK) {
            this.c.x(nVar, this.f890g.a() + gVar.b());
        }
        if (!this.c.M(nVar)) {
            return null;
        }
        this.d.b(nVar, 1, true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Object g(com.google.android.datatransport.h.n nVar, int i2) {
        this.d.a(nVar, i2 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void i(final com.google.android.datatransport.h.n nVar, final int i2, Runnable runnable) {
        try {
            try {
                com.google.android.datatransport.h.y.b bVar = this.f;
                final y yVar = this.c;
                yVar.getClass();
                bVar.b(new com.google.android.datatransport.h.y.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.b
                    @Override // com.google.android.datatransport.h.y.b.a
                    public final Object b() {
                        return Integer.valueOf(yVar.g());
                    }
                });
                if (a()) {
                    j(nVar, i2);
                } else {
                    this.f.b(new com.google.android.datatransport.h.y.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
                        @Override // com.google.android.datatransport.h.y.b.a
                        public final Object b() {
                            return this.a.g(nVar, i2);
                        }
                    });
                }
            } catch (com.google.android.datatransport.h.y.a unused) {
                this.d.a(nVar, i2 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    void j(final com.google.android.datatransport.h.n nVar, final int i2) {
        com.google.android.datatransport.runtime.backends.g gVarB;
        com.google.android.datatransport.runtime.backends.m mVarA = this.b.a(nVar.b());
        final Iterable iterable = (Iterable) this.f.b(new com.google.android.datatransport.h.y.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f
            @Override // com.google.android.datatransport.h.y.b.a
            public final Object b() {
                return this.a.c(nVar);
            }
        });
        if (iterable.iterator().hasNext()) {
            if (mVarA == null) {
                com.google.android.datatransport.h.v.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", nVar);
                gVarB = com.google.android.datatransport.runtime.backends.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e0) it.next()).b());
                }
                com.google.android.datatransport.runtime.backends.f.a aVarA = com.google.android.datatransport.runtime.backends.f.a();
                aVarA.b(arrayList);
                aVarA.c(nVar.c());
                gVarB = mVarA.b(aVarA.a());
            }
            final com.google.android.datatransport.runtime.backends.g gVar = gVarB;
            this.f.b(new com.google.android.datatransport.h.y.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.d
                @Override // com.google.android.datatransport.h.y.b.a
                public final Object b() {
                    return this.a.e(gVar, iterable, nVar, i2);
                }
            });
        }
    }

    public void k(final com.google.android.datatransport.h.n nVar, final int i2, final Runnable runnable) {
        this.e.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.e
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i(nVar, i2, runnable);
            }
        });
    }
}
