package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends w0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f1021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f1022h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(c cVar, int i2, IBinder iBinder, Bundle bundle) {
        super(cVar, i2, bundle);
        this.f1022h = cVar;
        this.f1021g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.w0
    protected final void f(ConnectionResult connectionResult) {
        if (this.f1022h.u != null) {
            this.f1022h.u.m(connectionResult);
        }
        this.f1022h.Q(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.w0
    protected final boolean g() {
        String str;
        try {
            IBinder iBinder = this.f1021g;
            q.k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f1022h.J().equals(interfaceDescriptor)) {
                str = "service descriptor mismatch: " + this.f1022h.J() + " vs. " + interfaceDescriptor;
                Log.w("GmsClient", str);
                return false;
            }
            IInterface iInterfaceX = this.f1022h.x(this.f1021g);
            if (iInterfaceX == null || !(c.l0(this.f1022h, 2, 4, iInterfaceX) || c.l0(this.f1022h, 3, 4, iInterfaceX))) {
                return false;
            }
            this.f1022h.y = null;
            Bundle bundleC = this.f1022h.C();
            c cVar = this.f1022h;
            if (cVar.t == null) {
                return true;
            }
            cVar.t.o(bundleC);
            return true;
        } catch (RemoteException unused) {
            str = "service probably died";
        }
    }
}
