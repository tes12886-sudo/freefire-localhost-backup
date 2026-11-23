package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class h extends j.d.a.d.a.b.g {
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;
    final /* synthetic */ j.d.a.d.a.f.p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ o f1308g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(o oVar, j.d.a.d.a.f.p pVar, int i2, String str, String str2, int i3, j.d.a.d.a.f.p pVar2) {
        super(pVar);
        this.f1308g = oVar;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
        this.f = pVar2;
    }

    @Override // j.d.a.d.a.b.g
    protected final void a() {
        try {
            ((j.d.a.d.a.b.o0) this.f1308g.c.c()).H0(this.f1308g.a, o.q(this.b, this.c, this.d, this.e), o.j(), new k(this.f1308g, this.f));
        } catch (RemoteException e) {
            o.f.b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.c, this.d, Integer.valueOf(this.e), Integer.valueOf(this.b));
            this.f.d(new RuntimeException(e));
        }
    }
}
