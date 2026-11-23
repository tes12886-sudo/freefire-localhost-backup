package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class l<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, w {
    private final Executor a;
    private final Continuation b;
    private final b0 c;

    public l(Executor executor, Continuation continuation, b0 b0Var) {
        this.a = executor;
        this.b = continuation;
        this.c = b0Var;
    }

    @Override // com.google.android.gms.tasks.w
    public final void a(Task task) {
        this.a.execute(new k(this, task));
    }

    @Override // com.google.android.gms.tasks.w
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.c.c();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.c.a(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.c.b(tcontinuationresult);
    }
}
