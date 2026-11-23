package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class v2 extends j.d.a.d.a.b.g {
    final /* synthetic */ Map b;
    final /* synthetic */ j.d.a.d.a.f.p c;
    final /* synthetic */ o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v2(o oVar, j.d.a.d.a.f.p pVar, Map map, j.d.a.d.a.f.p pVar2) {
        super(pVar);
        this.d = oVar;
        this.b = map;
        this.c = pVar2;
    }

    @Override // j.d.a.d.a.b.g
    protected final void a() {
        try {
            ((j.d.a.d.a.b.o0) this.d.c.c()).A0(this.d.a, o.m(this.b), new l(this.d, this.c));
        } catch (RemoteException e) {
            o.f.c(e, "syncPacks", new Object[0]);
            this.c.d(new RuntimeException(e));
        }
    }
}
