package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class q0 implements z0 {
    private final a1 a;
    private final Bundle b;
    private final /* synthetic */ int c = 0;

    q0(a1 a1Var, Bundle bundle) {
        this.a = a1Var;
        this.b = bundle;
    }

    q0(a1 a1Var, Bundle bundle, byte[] bArr) {
        this.a = a1Var;
        this.b = bundle;
    }

    @Override // com.google.android.play.core.assetpacks.z0
    public final Object a() {
        return this.c != 0 ? this.a.k(this.b) : this.a.j(this.b);
    }
}
