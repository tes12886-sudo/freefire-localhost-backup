package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class m extends j<Void> {
    final /* synthetic */ o c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(o oVar, j.d.a.d.a.f.p<Void> pVar) {
        super(oVar, pVar);
        this.c = oVar;
    }

    @Override // com.google.android.play.core.assetpacks.j, j.d.a.d.a.b.q0
    public final void c0(Bundle bundle, Bundle bundle2) {
        super.c0(bundle, bundle2);
        if (!this.c.e.compareAndSet(true, false)) {
            o.f.e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.c.c();
        }
    }
}
