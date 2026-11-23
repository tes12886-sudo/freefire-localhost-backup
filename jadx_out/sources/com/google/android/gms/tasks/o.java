package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class o implements Runnable {
    final /* synthetic */ Task a;
    final /* synthetic */ p b;

    o(p pVar, Task task) {
        this.b = pVar;
        this.a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            p pVar = this.b;
            if (pVar.c != null) {
                pVar.c.a(this.a);
            }
        }
    }
}
