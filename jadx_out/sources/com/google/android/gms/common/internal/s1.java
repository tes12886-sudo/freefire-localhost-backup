package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class s1 implements Handler.Callback {
    final /* synthetic */ t1 a;

    /* synthetic */ s1(t1 t1Var, r1 r1Var) {
        this.a = t1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.a.f) {
                p1 p1Var = (p1) message.obj;
                q1 q1Var = (q1) this.a.f.get(p1Var);
                if (q1Var != null && q1Var.i()) {
                    if (q1Var.j()) {
                        q1Var.g("GmsClientSupervisor");
                    }
                    this.a.f.remove(p1Var);
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        synchronized (this.a.f) {
            p1 p1Var2 = (p1) message.obj;
            q1 q1Var2 = (q1) this.a.f.get(p1Var2);
            if (q1Var2 != null && q1Var2.a() == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(p1Var2), new Exception());
                ComponentName componentNameB = q1Var2.b();
                if (componentNameB == null) {
                    componentNameB = p1Var2.b();
                }
                if (componentNameB == null) {
                    String strD = p1Var2.d();
                    q.k(strD);
                    componentNameB = new ComponentName(strD, "unknown");
                }
                q1Var2.onServiceDisconnected(componentNameB);
            }
        }
        return true;
    }
}
