package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class r implements w {
    private final Executor a;
    private final Object b = new Object();

    @GuardedBy("mLock")
    @Nullable
    private OnFailureListener c;

    public r(Executor executor, OnFailureListener onFailureListener) {
        this.a = executor;
        this.c = onFailureListener;
    }

    @Override // com.google.android.gms.tasks.w
    public final void a(Task task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return;
        }
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new q(this, task));
        }
    }

    @Override // com.google.android.gms.tasks.w
    public final void b() {
        synchronized (this.b) {
            this.c = null;
        }
    }
}
