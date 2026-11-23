package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class f<T> implements g<T> {
    private final CountDownLatch a = new CountDownLatch(1);

    /* synthetic */ f(e eVar) {
    }

    public final void a() throws InterruptedException {
        this.a.await();
    }

    public final boolean b(long j2, TimeUnit timeUnit) {
        return this.a.await(j2, timeUnit);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t) {
        this.a.countDown();
    }
}
