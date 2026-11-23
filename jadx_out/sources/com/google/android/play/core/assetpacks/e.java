package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class e extends j.d.a.d.a.b.g {
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;
    final /* synthetic */ j.d.a.d.a.f.p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ o f1307g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(o oVar, j.d.a.d.a.f.p pVar, int i2, String str, String str2, int i3, j.d.a.d.a.f.p pVar2) {
        super(pVar);
        this.f1307g = oVar;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
        this.f = pVar2;
    }

    @Override // j.d.a.d.a.b.g
    protected final void a() {
        try {
            ((j.d.a.d.a.b.o0) this.f1307g.c.c()).S0(this.f1307g.a, o.q(this.b, this.c, this.d, this.e), o.j(), new j(this.f1307g, this.f, (char[]) null));
        } catch (RemoteException e) {
            o.f.c(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
