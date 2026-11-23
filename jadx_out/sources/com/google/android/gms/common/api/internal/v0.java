package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class v0 extends j.d.a.c.f.d.n {
    final /* synthetic */ x0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v0(x0 x0Var, Looper looper) {
        super(looper);
        this.a = x0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            x0.z(this.a);
            return;
        }
        if (i2 == 2) {
            x0.y(this.a);
            return;
        }
        Log.w("GoogleApiClientImpl", "Unknown message id: " + i2);
    }
}
