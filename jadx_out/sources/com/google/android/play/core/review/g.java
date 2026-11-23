package com.google.android.play.core.review;

import android.os.RemoteException;
import j.d.a.d.a.f.p;

/* JADX INFO: loaded from: classes.dex */
final class g extends j.d.a.d.a.b.g {
    final /* synthetic */ p b;
    final /* synthetic */ j c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(j jVar, p pVar, p pVar2) {
        super(pVar);
        this.c = jVar;
        this.b = pVar2;
    }

    @Override // j.d.a.d.a.b.g
    protected final void a() {
        try {
            ((j.d.a.d.a.b.c) this.c.a.c()).a0(this.c.b, com.google.android.play.core.common.b.b("review"), new i(this.c, this.b));
        } catch (RemoteException e) {
            j.c.c(e, "error requesting in-app review for %s", this.c.b);
            this.b.d(new RuntimeException(e));
        }
    }
}
