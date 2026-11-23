package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class t1 extends h {

    @GuardedBy("connectionStatus")
    private final HashMap f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f1031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Handler f1032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s1 f1033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.common.n.a f1034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f1035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f1036l;

    t1(Context context, Looper looper) {
        s1 s1Var = new s1(this, null);
        this.f1033i = s1Var;
        this.f1031g = context.getApplicationContext();
        this.f1032h = new j.d.a.c.f.f.i(looper, s1Var);
        this.f1034j = com.google.android.gms.common.n.a.b();
        this.f1035k = 5000L;
        this.f1036l = 300000L;
    }

    @Override // com.google.android.gms.common.internal.h
    protected final void d(p1 p1Var, ServiceConnection serviceConnection, String str) {
        q.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            q1 q1Var = (q1) this.f.get(p1Var);
            if (q1Var == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + p1Var.toString());
            }
            if (!q1Var.h(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + p1Var.toString());
            }
            q1Var.f(serviceConnection, str);
            if (q1Var.i()) {
                this.f1032h.sendMessageDelayed(this.f1032h.obtainMessage(0, p1Var), this.f1035k);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.h
    protected final boolean f(p1 p1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zJ;
        q.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            q1 q1Var = (q1) this.f.get(p1Var);
            if (q1Var == null) {
                q1Var = new q1(this, p1Var);
                q1Var.d(serviceConnection, serviceConnection, str);
                q1Var.e(str, executor);
                this.f.put(p1Var, q1Var);
            } else {
                this.f1032h.removeMessages(0, p1Var);
                if (q1Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + p1Var.toString());
                }
                q1Var.d(serviceConnection, serviceConnection, str);
                int iA = q1Var.a();
                if (iA == 1) {
                    serviceConnection.onServiceConnected(q1Var.b(), q1Var.c());
                } else if (iA == 2) {
                    q1Var.e(str, executor);
                }
            }
            zJ = q1Var.j();
        }
        return zJ;
    }
}
