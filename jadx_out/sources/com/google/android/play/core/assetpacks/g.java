package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class g extends j.d.a.d.a.b.g {
    final /* synthetic */ int b;
    final /* synthetic */ j.d.a.d.a.f.p c;
    final /* synthetic */ o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(o oVar, j.d.a.d.a.f.p pVar, int i2, j.d.a.d.a.f.p pVar2) {
        super(pVar);
        this.d = oVar;
        this.b = i2;
        this.c = pVar2;
    }

    @Override // j.d.a.d.a.b.g
    protected final void a() {
        try {
            ((j.d.a.d.a.b.o0) this.d.c.c()).b0(this.d.a, o.i(this.b), o.j(), new j(this.d, this.c, (int[]) null));
        } catch (RemoteException e) {
            o.f.c(e, "notifySessionFailed", new Object[0]);
        }
    }
}
