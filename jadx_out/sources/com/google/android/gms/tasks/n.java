package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class n implements w {
    private final Executor a;
    private final Object b = new Object();

    @GuardedBy("mLock")
    @Nullable
    private OnCanceledListener c;

    public n(Executor executor, OnCanceledListener onCanceledListener) {
        this.a = executor;
        this.c = onCanceledListener;
    }

    @Override // com.google.android.gms.tasks.w
    public final void a(Task task) {
        if (task.isCanceled()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new m(this));
            }
        }
    }

    @Override // com.google.android.gms.tasks.w
    public final void b() {
        synchronized (this.b) {
            this.c = null;
        }
    }
}
