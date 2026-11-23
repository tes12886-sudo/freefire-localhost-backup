package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import j.d.a.d.a.f.p;

/* JADX INFO: loaded from: classes.dex */
final class d extends ResultReceiver {
    final /* synthetic */ p a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Handler handler, p pVar) {
        super(handler);
        this.a = pVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, Bundle bundle) {
        this.a.e(null);
    }
}
