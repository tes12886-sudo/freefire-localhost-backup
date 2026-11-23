package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class p0 implements com.google.android.gms.common.api.f.a {
    final /* synthetic */ com.google.android.gms.common.api.f a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ p.a c;

    p0(com.google.android.gms.common.api.f fVar, TaskCompletionSource taskCompletionSource, p.a aVar, r0 r0Var) {
        this.a = fVar;
        this.b = taskCompletionSource;
        this.c = aVar;
    }

    @Override // com.google.android.gms.common.api.f.a
    public final void a(Status status) {
        if (!status.n()) {
            this.b.b(b.a(status));
        } else {
            this.b.c(this.c.a(this.a.c(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
