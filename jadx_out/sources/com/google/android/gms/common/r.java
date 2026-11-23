package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import j.d.a.c.f.d.n;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"HandlerLeak"})
final class r extends n {
    private final Context a;
    final /* synthetic */ GoogleApiAvailability b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = googleApiAvailability;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i2);
            return;
        }
        int iIsGooglePlayServicesAvailable = this.b.isGooglePlayServicesAvailable(this.a);
        if (this.b.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
            this.b.showErrorNotification(this.a, iIsGooglePlayServicesAvailable);
        }
    }
}
