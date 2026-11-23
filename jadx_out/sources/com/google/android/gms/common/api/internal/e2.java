package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class e2 extends r {
    final /* synthetic */ r.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e2(r.a aVar, com.google.android.gms.common.c[] cVarArr, boolean z, int i2) {
        super(cVarArr, z, i2);
        this.d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.r
    protected final void b(com.google.android.gms.common.api.a.b bVar, TaskCompletionSource taskCompletionSource) {
        this.d.a.a(bVar, taskCompletionSource);
    }
}
