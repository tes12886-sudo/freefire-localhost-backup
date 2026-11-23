package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.d;
import com.google.firebase.messaging.j0;
import com.google.firebase.messaging.o;
import j.d.a.c.d.a;
import j.d.a.c.d.b;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends b {
    @Override // j.d.a.c.d.b
    protected final int b(Context context, a aVar) {
        try {
            return ((Integer) d.a(new o(context).g(aVar.f()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // j.d.a.c.d.b
    protected final void c(Context context, Bundle bundle) {
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (j0.B(intentPutExtras)) {
            j0.s(intentPutExtras);
        }
    }
}
