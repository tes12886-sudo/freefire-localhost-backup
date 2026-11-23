package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class p implements w {
    private final Executor a;
    private final Object b = new Object();

    @GuardedBy("mLock")
    @Nullable
    private OnCompleteListener c;

    public p(Executor executor, OnCompleteListener onCompleteListener) {
        this.a = executor;
        this.c = onCompleteListener;
    }

    @Override // com.google.android.gms.tasks.w
    public final void a(Task task) {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new o(this, task));
        }
    }

    @Override // com.google.android.gms.tasks.w
    public final void b() {
        synchronized (this.b) {
            this.c = null;
        }
    }
}
