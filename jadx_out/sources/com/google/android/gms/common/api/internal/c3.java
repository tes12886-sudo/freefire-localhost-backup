package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class c3 implements Runnable {
    final /* synthetic */ t a;

    c3(t tVar) {
        this.a = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f989m.lock();
        try {
            t.y(this.a);
        } finally {
            this.a.f989m.unlock();
        }
    }
}
