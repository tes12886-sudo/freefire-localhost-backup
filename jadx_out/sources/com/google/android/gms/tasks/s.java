package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class s implements Runnable {
    final /* synthetic */ Task a;
    final /* synthetic */ t b;

    s(t tVar, Task task) {
        this.b = tVar;
        this.a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            t tVar = this.b;
            if (tVar.c != null) {
                tVar.c.onSuccess(this.a.getResult());
            }
        }
    }
}
