package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.j;

/* JADX INFO: loaded from: classes.dex */
final class q<R extends j> extends BasePendingResult<R> {
    private final j r;

    public q(e eVar, j jVar) {
        super(eVar);
        this.r = jVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final R f(Status status) {
        return (R) this.r;
    }
}
