package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Handler.Callback {

    @NotOnlyInitialized
    private final k0 a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Handler f1025h;
    private final ArrayList b = new ArrayList();
    final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private volatile boolean e = false;
    private final AtomicInteger f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1024g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f1026i = new Object();

    public l0(Looper looper, k0 k0Var) {
        this.a = k0Var;
        this.f1025h = new j.d.a.c.f.d.n(looper, this);
    }

    public final void a() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public final void b() {
        this.e = true;
    }

    public final void c(ConnectionResult connectionResult) {
        q.e(this.f1025h, "onConnectionFailure must only be called on the Handler thread");
        this.f1025h.removeMessages(1);
        synchronized (this.f1026i) {
            ArrayList<com.google.android.gms.common.api.e.c> arrayList = new ArrayList(this.d);
            int i2 = this.f.get();
            for (com.google.android.gms.common.api.e.c cVar : arrayList) {
                if (this.e && this.f.get() == i2) {
                    if (this.d.contains(cVar)) {
                        cVar.m(connectionResult);
                    }
                }
                return;
            }
        }
    }

    public final void d(Bundle bundle) {
        q.e(this.f1025h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f1026i) {
            q.n(!this.f1024g);
            this.f1025h.removeMessages(1);
            this.f1024g = true;
            q.n(this.c.isEmpty());
            ArrayList<com.google.android.gms.common.api.e.b> arrayList = new ArrayList(this.b);
            int i2 = this.f.get();
            for (com.google.android.gms.common.api.e.b bVar : arrayList) {
                if (!this.e || !this.a.a() || this.f.get() != i2) {
                    break;
                    break;
                    break;
                } else if (!this.c.contains(bVar)) {
                    bVar.o(bundle);
                }
            }
            this.c.clear();
            this.f1024g = false;
        }
    }

    public final void e(int i2) {
        q.e(this.f1025h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f1025h.removeMessages(1);
        synchronized (this.f1026i) {
            this.f1024g = true;
            ArrayList<com.google.android.gms.common.api.e.b> arrayList = new ArrayList(this.b);
            int i3 = this.f.get();
            for (com.google.android.gms.common.api.e.b bVar : arrayList) {
                if (!this.e || this.f.get() != i3) {
                    break;
                    break;
                } else if (this.b.contains(bVar)) {
                    bVar.j(i2);
                }
            }
            this.c.clear();
            this.f1024g = false;
        }
    }

    public final void f(com.google.android.gms.common.api.e.b bVar) {
        q.k(bVar);
        synchronized (this.f1026i) {
            if (this.b.contains(bVar)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(bVar) + " is already registered");
            } else {
                this.b.add(bVar);
            }
        }
        if (this.a.a()) {
            Handler handler = this.f1025h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void g(com.google.android.gms.common.api.e.c cVar) {
        q.k(cVar);
        synchronized (this.f1026i) {
            if (this.d.contains(cVar)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(cVar) + " is already registered");
            } else {
                this.d.add(cVar);
            }
        }
    }

    public final void h(com.google.android.gms.common.api.e.c cVar) {
        q.k(cVar);
        synchronized (this.f1026i) {
            if (!this.d.remove(cVar)) {
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + String.valueOf(cVar) + " not found");
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i2, new Exception());
            return false;
        }
        com.google.android.gms.common.api.e.b bVar = (com.google.android.gms.common.api.e.b) message.obj;
        synchronized (this.f1026i) {
            if (this.e && this.a.a() && this.b.contains(bVar)) {
                bVar.o(null);
            }
        }
        return true;
    }
}
