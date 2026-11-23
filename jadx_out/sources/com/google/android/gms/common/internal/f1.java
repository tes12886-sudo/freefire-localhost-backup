package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class f1 extends j.d.a.c.f.f.i {
    final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(c cVar, Looper looper) {
        super(looper);
        this.a = cVar;
    }

    private static final void a(Message message) {
        g1 g1Var = (g1) message.obj;
        g1Var.b();
        g1Var.e();
    }

    private static final boolean b(Message message) {
        int i2 = message.what;
        return i2 == 2 || i2 == 1 || i2 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a.B.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || ((i2 == 4 && !this.a.y()) || message.what == 5)) && !this.a.l()) {
            a(message);
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            this.a.y = new ConnectionResult(message.arg2);
            if (c.m0(this.a)) {
                c cVar = this.a;
                if (!cVar.z) {
                    cVar.n0(3, null);
                    return;
                }
            }
            c cVar2 = this.a;
            ConnectionResult connectionResult = cVar2.y != null ? cVar2.y : new ConnectionResult(8);
            this.a.f1009o.a(connectionResult);
            this.a.Q(connectionResult);
            return;
        }
        if (i3 == 5) {
            c cVar3 = this.a;
            ConnectionResult connectionResult2 = cVar3.y != null ? cVar3.y : new ConnectionResult(8);
            this.a.f1009o.a(connectionResult2);
            this.a.Q(connectionResult2);
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.a.f1009o.a(connectionResult3);
            this.a.Q(connectionResult3);
            return;
        }
        if (i3 == 6) {
            this.a.n0(5, null);
            c cVar4 = this.a;
            if (cVar4.t != null) {
                cVar4.t.j(message.arg2);
            }
            this.a.R(message.arg2);
            c.l0(this.a, 5, 1, null);
            return;
        }
        if (i3 == 2 && !this.a.a()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((g1) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
