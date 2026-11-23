package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class t implements w {
    private final Executor a;
    private final Object b = new Object();

    @GuardedBy("mLock")
    @Nullable
    private OnSuccessListener c;

    public t(Executor executor, OnSuccessListener onSuccessListener) {
        this.a = executor;
        this.c = onSuccessListener;
    }

    @Override // com.google.android.gms.tasks.w
    public final void a(Task task) {
        if (task.isSuccessful()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new s(this, task));
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
