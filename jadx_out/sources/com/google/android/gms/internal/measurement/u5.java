package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class u5 extends ContentObserver {
    final /* synthetic */ w5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u5(w5 w5Var, Handler handler) {
        super(null);
        this.a = w5Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.d();
    }
}
