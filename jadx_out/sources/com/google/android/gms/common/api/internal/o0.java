package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
abstract class o0 implements Runnable {
    final /* synthetic */ p0 a;

    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e) {
                this.a.a.r(e);
            }
        } finally {
            this.a.b.unlock();
        }
    }
}
