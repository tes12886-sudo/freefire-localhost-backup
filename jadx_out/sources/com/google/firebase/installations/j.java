package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
class j implements m {
    final TaskCompletionSource<String> a;

    public j(TaskCompletionSource<String> taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.m
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.m
    public boolean b(com.google.firebase.installations.p.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.a.e(dVar.d());
        return true;
    }
}
