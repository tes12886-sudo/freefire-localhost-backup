package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
final class g0 extends zag {
    final /* synthetic */ Intent a;
    final /* synthetic */ Fragment b;
    final /* synthetic */ int c;

    g0(Intent intent, Fragment fragment, int i2) {
        this.a = intent;
        this.b = fragment;
        this.c = i2;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
