package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
final class u implements com.google.android.gms.common.api.f.a {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ w b;

    u(w wVar, BasePendingResult basePendingResult) {
        this.b = wVar;
        this.a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.f.a
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
