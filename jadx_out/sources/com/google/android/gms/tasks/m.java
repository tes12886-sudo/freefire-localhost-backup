package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class m implements Runnable {
    final /* synthetic */ n a;

    m(n nVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.b) {
            n nVar = this.a;
            if (nVar.c != null) {
                nVar.c.onCanceled();
            }
        }
    }
}
