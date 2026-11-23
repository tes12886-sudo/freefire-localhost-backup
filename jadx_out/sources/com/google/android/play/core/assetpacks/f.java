package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class f extends j.d.a.d.a.b.g {
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ j.d.a.d.a.f.p d;
    final /* synthetic */ int e;
    final /* synthetic */ o f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(o oVar, j.d.a.d.a.f.p pVar, int i2, String str, j.d.a.d.a.f.p pVar2, int i3) {
        super(pVar);
        this.f = oVar;
        this.b = i2;
        this.c = str;
        this.d = pVar2;
        this.e = i3;
    }

    @Override // j.d.a.d.a.b.g
    protected final void a() {
        try {
            ((j.d.a.d.a.b.o0) this.f.c.c()).y(this.f.a, o.h(this.b, this.c), o.j(), new n(this.f, this.d, this.b, this.c, this.e));
        } catch (RemoteException e) {
            o.f.c(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
