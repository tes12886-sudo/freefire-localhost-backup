package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class u2 extends j.d.a.d.a.b.g {
    final /* synthetic */ List b;
    final /* synthetic */ j.d.a.d.a.f.p c;
    final /* synthetic */ o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u2(o oVar, j.d.a.d.a.f.p pVar, List list, j.d.a.d.a.f.p pVar2) {
        super(pVar);
        this.d = oVar;
        this.b = list;
        this.c = pVar2;
    }

    @Override // j.d.a.d.a.b.g
    protected final void a() {
        try {
            ((j.d.a.d.a.b.o0) this.d.c.c()).B(this.d.a, o.k(this.b), o.j(), new j(this.d, this.c, (byte[]) null));
        } catch (RemoteException e) {
            o.f.c(e, "cancelDownloads(%s)", this.b);
        }
    }
}
