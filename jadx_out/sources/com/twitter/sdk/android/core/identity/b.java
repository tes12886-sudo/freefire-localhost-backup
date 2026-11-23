package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import j.g.a.a.a.m;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
class b {
    final AtomicReference<a> a = new AtomicReference<>(null);

    b() {
    }

    public boolean a(Activity activity, a aVar) {
        if (d()) {
            m.g().a("Twitter", "Authorize already in progress");
        } else if (aVar.a(activity)) {
            boolean zCompareAndSet = this.a.compareAndSet(null, aVar);
            if (zCompareAndSet) {
                return zCompareAndSet;
            }
            m.g().a("Twitter", "Failed to update authHandler, authorize already in progress.");
            return zCompareAndSet;
        }
        return false;
    }

    public void b() {
        this.a.set(null);
    }

    public a c() {
        return this.a.get();
    }

    public boolean d() {
        return this.a.get() != null;
    }
}
