package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class a1 extends j.d.a.c.f.d.n {
    final /* synthetic */ b1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a1(b1 b1Var, Looper looper) {
        super(looper);
        this.a = b1Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            ((z0) message.obj).b(this.a);
        } else {
            if (i2 == 2) {
                throw ((RuntimeException) message.obj);
            }
            Log.w("GACStateManager", "Unknown message id: " + i2);
        }
    }
}
