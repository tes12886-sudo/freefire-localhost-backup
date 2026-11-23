package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class n extends j<Void> {
    final int c;
    final String d;
    final int e;
    final /* synthetic */ o f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(o oVar, j.d.a.d.a.f.p<Void> pVar, int i2, String str, int i3) {
        super(oVar, pVar);
        this.f = oVar;
        this.c = i2;
        this.d = str;
        this.e = i3;
    }

    @Override // com.google.android.play.core.assetpacks.j, j.d.a.d.a.b.q0
    public final void o0(Bundle bundle) {
        this.f.c.b();
        o.f.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i2 = this.e;
        if (i2 > 0) {
            this.f.x(this.c, this.d, i2 - 1);
        }
    }
}
