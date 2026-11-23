package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements ServiceConnection {
    private final int a;
    final /* synthetic */ c b;

    public i1(c cVar, int i2) {
        this.b = cVar;
        this.a = i2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.b;
        if (iBinder == null) {
            c.i0(cVar, 16);
            return;
        }
        synchronized (cVar.f1007m) {
            c cVar2 = this.b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.f1008n = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m)) ? new y0(iBinder) : (m) iInterfaceQueryLocalInterface;
        }
        this.b.j0(0, null, this.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.b.f1007m) {
            this.b.f1008n = null;
        }
        Handler handler = this.b.f1005k;
        handler.sendMessage(handler.obtainMessage(6, this.a, 1));
    }
}
