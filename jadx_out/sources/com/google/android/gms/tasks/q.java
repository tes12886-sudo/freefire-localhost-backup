package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class q implements Runnable {
    final /* synthetic */ Task a;
    final /* synthetic */ r b;

    q(r rVar, Task task) {
        this.b = rVar;
        this.a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            r rVar = this.b;
            if (rVar.c != null) {
                OnFailureListener onFailureListener = rVar.c;
                Exception exception = this.a.getException();
                com.google.android.gms.common.internal.q.k(exception);
                onFailureListener.onFailure(exception);
            }
        }
    }
}
