package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
class i implements m {
    private final n a;
    private final TaskCompletionSource<k> b;

    public i(n nVar, TaskCompletionSource<k> taskCompletionSource) {
        this.a = nVar;
        this.b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.m
    public boolean a(Exception exc) {
        this.b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.m
    public boolean b(com.google.firebase.installations.p.d dVar) {
        if (!dVar.k() || this.a.f(dVar)) {
            return false;
        }
        TaskCompletionSource<k> taskCompletionSource = this.b;
        k.a aVarA = k.a();
        aVarA.b(dVar.b());
        aVarA.d(dVar.c());
        aVarA.c(dVar.h());
        taskCompletionSource.c(aVarA.a());
        return true;
    }
}
