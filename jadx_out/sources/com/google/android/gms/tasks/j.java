package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class j implements w {
    private final Executor a;
    private final Continuation b;
    private final b0 c;

    public j(Executor executor, Continuation continuation, b0 b0Var) {
        this.a = executor;
        this.b = continuation;
        this.c = b0Var;
    }

    @Override // com.google.android.gms.tasks.w
    public final void a(Task task) {
        this.a.execute(new i(this, task));
    }

    @Override // com.google.android.gms.tasks.w
    public final void b() {
        throw new UnsupportedOperationException();
    }
}
