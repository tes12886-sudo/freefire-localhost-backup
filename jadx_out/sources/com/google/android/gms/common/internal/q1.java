package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class q1 implements ServiceConnection, u1 {
    private final Map a = new HashMap();
    private int b = 2;
    private boolean c;
    private IBinder d;
    private final p1 e;
    private ComponentName f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ t1 f1030g;

    public q1(t1 t1Var, p1 p1Var) {
        this.f1030g = t1Var;
        this.e = p1Var;
    }

    public final int a() {
        return this.b;
    }

    public final ComponentName b() {
        return this.f;
    }

    public final IBinder c() {
        return this.d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (com.google.android.gms.common.util.l.l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            t1 t1Var = this.f1030g;
            boolean zD = t1Var.f1034j.d(t1Var.f1031g, str, this.e.c(t1Var.f1031g), this, this.e.a(), executor);
            this.c = zD;
            if (zD) {
                this.f1030g.f1032h.sendMessageDelayed(this.f1030g.f1032h.obtainMessage(1, this.e), this.f1030g.f1036l);
            } else {
                this.b = 2;
                try {
                    t1 t1Var2 = this.f1030g;
                    t1Var2.f1034j.c(t1Var2.f1031g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f1030g.f1032h.removeMessages(1, this.e);
        t1 t1Var = this.f1030g;
        t1Var.f1034j.c(t1Var.f1031g, this);
        this.c = false;
        this.b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.a.isEmpty();
    }

    public final boolean j() {
        return this.c;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f1030g.f) {
            this.f1030g.f1032h.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f1030g.f) {
            this.f1030g.f1032h.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
