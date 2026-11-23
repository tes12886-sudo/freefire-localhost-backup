package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.h.x.j.y;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class q {
    private final Executor a;
    private final y b;
    private final s c;
    private final com.google.android.datatransport.h.y.b d;

    q(Executor executor, y yVar, s sVar, com.google.android.datatransport.h.y.b bVar) {
        this.a = executor;
        this.b = yVar;
        this.c = sVar;
        this.d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Object c() {
        Iterator<com.google.android.datatransport.h.n> it = this.b.D().iterator();
        while (it.hasNext()) {
            this.c.a(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e() {
        this.d.b(new com.google.android.datatransport.h.y.b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.h
            @Override // com.google.android.datatransport.h.y.b.a
            public final Object b() {
                return this.a.c();
            }
        });
    }

    public void a() {
        this.a.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e();
            }
        });
    }
}
