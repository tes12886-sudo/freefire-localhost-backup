package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class v implements OnCompleteListener {
    final /* synthetic */ TaskCompletionSource a;
    final /* synthetic */ w b;

    v(w wVar, TaskCompletionSource taskCompletionSource) {
        this.b = wVar;
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void a(Task task) {
        this.b.b.remove(this.a);
    }
}
