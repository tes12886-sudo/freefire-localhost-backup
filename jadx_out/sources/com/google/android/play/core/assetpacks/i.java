package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class i extends j.d.a.d.a.b.g {
    final /* synthetic */ j.d.a.d.a.f.p b;
    final /* synthetic */ o c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(o oVar, j.d.a.d.a.f.p pVar, j.d.a.d.a.f.p pVar2) {
        super(pVar);
        this.c = oVar;
        this.b = pVar2;
    }

    @Override // j.d.a.d.a.b.g
    protected final void a() {
        try {
            ((j.d.a.d.a.b.o0) this.c.d.c()).E0(this.c.a, o.j(), new m(this.c, this.b));
        } catch (RemoteException e) {
            o.f.c(e, "keepAlive", new Object[0]);
        }
    }
}
