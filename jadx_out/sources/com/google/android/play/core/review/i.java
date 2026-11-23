package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import j.d.a.d.a.f.p;

/* JADX INFO: loaded from: classes.dex */
final class i extends h<ReviewInfo> {
    i(j jVar, p pVar) {
        super(jVar, new j.d.a.d.a.b.f("OnRequestInstallCallback"), pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.play.core.review.h, j.d.a.d.a.b.e
    public final void Z0(Bundle bundle) {
        super.Z0(bundle);
        this.b.e((T) ReviewInfo.b((PendingIntent) bundle.get("confirmation_intent")));
    }
}
