package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* JADX INFO: loaded from: classes.dex */
final class h0 extends zag {
    final /* synthetic */ Intent a;
    final /* synthetic */ LifecycleFragment b;

    h0(Intent intent, LifecycleFragment lifecycleFragment, int i2) {
        this.a = intent;
        this.b = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
