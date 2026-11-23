package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h.p.b.a<Void> implements com.google.android.gms.common.api.internal.o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Semaphore f915o;
    private Set<com.google.android.gms.common.api.e> p;

    public g(Context context, Set<com.google.android.gms.common.api.e> set) {
        super(context);
        this.f915o = new Semaphore(0);
        this.p = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // h.p.b.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final Void A() {
        Iterator<com.google.android.gms.common.api.e> it = this.p.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().m(this)) {
                i2++;
            }
        }
        try {
            this.f915o.tryAcquire(i2, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // h.p.b.b
    protected final void o() {
        this.f915o.drainPermits();
        h();
    }

    @Override // com.google.android.gms.common.api.internal.o
    public final void onComplete() {
        this.f915o.release();
    }
}
