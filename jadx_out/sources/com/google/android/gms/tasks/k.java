package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class k implements Runnable {
    final /* synthetic */ Task a;
    final /* synthetic */ l b;

    k(l lVar, Task task) {
        this.b = lVar;
        this.a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.b.b.a(this.a);
            if (task == null) {
                this.b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = c.b;
            task.addOnSuccessListener(executor, this.b);
            task.addOnFailureListener(executor, this.b);
            task.addOnCanceledListener(executor, this.b);
        } catch (b e) {
            if (e.getCause() instanceof Exception) {
                this.b.c.a((Exception) e.getCause());
            } else {
                this.b.c.a(e);
            }
        } catch (Exception e2) {
            this.b.c.a(e2);
        }
    }
}
