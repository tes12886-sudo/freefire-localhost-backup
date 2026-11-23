package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class f0 extends zag {
    final /* synthetic */ Intent a;
    final /* synthetic */ Activity b;
    final /* synthetic */ int c;

    f0(Intent intent, Activity activity, int i2) {
        this.a = intent;
        this.b = activity;
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
