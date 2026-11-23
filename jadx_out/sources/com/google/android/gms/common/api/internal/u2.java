package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* JADX INFO: loaded from: classes.dex */
final class u2 extends zabw {
    final /* synthetic */ Dialog a;
    final /* synthetic */ v2 b;

    u2(v2 v2Var, Dialog dialog) {
        this.b = v2Var;
        this.a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void a() {
        this.b.b.o();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
