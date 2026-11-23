package com.google.android.datatransport.h.x;

import com.google.android.datatransport.h.n;
import com.google.android.datatransport.h.r;
import com.google.android.datatransport.h.x.j.y;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class c implements e {
    private static final Logger f = Logger.getLogger(r.class.getName());
    private final s a;
    private final Executor b;
    private final com.google.android.datatransport.runtime.backends.e c;
    private final y d;
    private final com.google.android.datatransport.h.y.b e;

    public c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, s sVar, y yVar, com.google.android.datatransport.h.y.b bVar) {
        this.b = executor;
        this.c = eVar;
        this.a = sVar;
        this.d = yVar;
        this.e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Object c(n nVar, com.google.android.datatransport.h.i iVar) {
        this.d.C(nVar, iVar);
        this.a.a(nVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e(final n nVar, com.google.android.datatransport.g gVar, com.google.android.datatransport.h.i iVar) {
        try {
            m mVarA = this.c.a(nVar.b());
            if (mVarA == null) {
                String str = String.format("Transport backend '%s' is not registered", nVar.b());
                f.warning(str);
                gVar.a(new IllegalArgumentException(str));
            } else {
                final com.google.android.datatransport.h.i iVarA = mVarA.a(iVar);
                this.e.b(new com.google.android.datatransport.h.y.b.a() { // from class: com.google.android.datatransport.h.x.b
                    @Override // com.google.android.datatransport.h.y.b.a
                    public final Object b() {
                        return this.a.c(nVar, iVarA);
                    }
                });
                gVar.a(null);
            }
        } catch (Exception e) {
            f.warning("Error scheduling event " + e.getMessage());
            gVar.a(e);
        }
    }

    @Override // com.google.android.datatransport.h.x.e
    public void a(final n nVar, final com.google.android.datatransport.h.i iVar, final com.google.android.datatransport.g gVar) {
        this.b.execute(new Runnable() { // from class: com.google.android.datatransport.h.x.a
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e(nVar, gVar, iVar);
            }
        });
    }
}
