package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class e1 implements c.a {
    final /* synthetic */ g a;

    e1(g gVar) {
        this.a = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z) {
        g gVar = this.a;
        gVar.p.sendMessage(gVar.p.obtainMessage(1, Boolean.valueOf(z)));
    }
}
