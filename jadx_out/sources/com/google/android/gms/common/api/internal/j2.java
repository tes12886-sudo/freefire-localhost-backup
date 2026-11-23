package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class j2<R extends com.google.android.gms.common.api.j> extends com.google.android.gms.common.api.n<R> implements com.google.android.gms.common.api.k<R> {
    private com.google.android.gms.common.api.m a;
    private j2 b;
    private volatile com.google.android.gms.common.api.l c;
    private final Object d;
    private Status e;
    private final WeakReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h2 f969g;

    private final void g(Status status) {
        synchronized (this.d) {
            this.e = status;
            h(status);
        }
    }

    private final void h(Status status) {
        synchronized (this.d) {
            com.google.android.gms.common.api.m mVar = this.a;
            if (mVar != null) {
                mVar.a(status);
                com.google.android.gms.common.internal.q.l(status, "onFailure must not return null");
                j2 j2Var = this.b;
                com.google.android.gms.common.internal.q.k(j2Var);
                j2Var.g(status);
            } else if (i()) {
                com.google.android.gms.common.api.l lVar = this.c;
                com.google.android.gms.common.internal.q.k(lVar);
                lVar.b(status);
            }
        }
    }

    @GuardedBy("mSyncToken")
    private final boolean i() {
        return (this.c == null || ((com.google.android.gms.common.api.e) this.f.get()) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(com.google.android.gms.common.api.j jVar) {
        if (jVar instanceof com.google.android.gms.common.api.h) {
            try {
                ((com.google.android.gms.common.api.h) jVar).a();
            } catch (RuntimeException e) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(String.valueOf(jVar))), e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void a(com.google.android.gms.common.api.j jVar) {
        synchronized (this.d) {
            if (!jVar.c().n()) {
                g(jVar.c());
                j(jVar);
            } else if (this.a != null) {
                z1.a().submit(new g2(this, jVar));
            } else if (i()) {
                com.google.android.gms.common.api.l lVar = this.c;
                com.google.android.gms.common.internal.q.k(lVar);
                lVar.c(jVar);
            }
        }
    }

    final void f() {
        this.c = null;
    }
}
