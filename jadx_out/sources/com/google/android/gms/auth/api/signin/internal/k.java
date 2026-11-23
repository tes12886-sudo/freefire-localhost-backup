package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
final class k extends o<Status> {
    k(com.google.android.gms.common.api.e eVar) {
        super(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.j f(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* synthetic */ void r(com.google.android.gms.common.api.a.b bVar) {
        i iVar = (i) bVar;
        ((u) iVar.I()).M0(new l(this), iVar.r0());
    }
}
