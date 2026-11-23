package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class u implements Runnable {
    final /* synthetic */ Task a;
    final /* synthetic */ v b;

    u(v vVar, Task task) {
        this.b = vVar;
        this.a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskA = this.b.b.a(this.a.getResult());
            if (taskA == null) {
                this.b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = c.b;
            taskA.addOnSuccessListener(executor, this.b);
            taskA.addOnFailureListener(executor, this.b);
            taskA.addOnCanceledListener(executor, this.b);
        } catch (b e) {
            if (e.getCause() instanceof Exception) {
                this.b.onFailure((Exception) e.getCause());
            } else {
                this.b.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.b.onCanceled();
        } catch (Exception e2) {
            this.b.onFailure(e2);
        }
    }
}
