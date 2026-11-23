package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class q8 implements ServiceConnection, com.google.android.gms.common.internal.c.a, com.google.android.gms.common.internal.c.b {
    private volatile boolean a;
    private volatile n3 b;
    final /* synthetic */ r8 c;

    protected q8(r8 r8Var) {
        this.c = r8Var;
    }

    static /* synthetic */ boolean d(q8 q8Var, boolean z) {
        q8Var.a = false;
        return false;
    }

    public final void a(Intent intent) {
        this.c.h();
        Context contextC = this.c.a.c();
        com.google.android.gms.common.n.a aVarB = com.google.android.gms.common.n.a.b();
        synchronized (this) {
            if (this.a) {
                this.c.a.d().w().a("Connection attempt already in progress");
                return;
            }
            this.c.a.d().w().a("Using local app measurement service");
            this.a = true;
            aVarB.a(contextC, intent, this.c.c, 129);
        }
    }

    public final void b() {
        if (this.b != null && (this.b.a() || this.b.l())) {
            this.b.s();
        }
        this.b = null;
    }

    public final void c() {
        this.c.h();
        Context contextC = this.c.a.c();
        synchronized (this) {
            if (this.a) {
                this.c.a.d().w().a("Connection attempt already in progress");
                return;
            }
            if (this.b != null && (this.b.l() || this.b.a())) {
                this.c.a.d().w().a("Already awaiting connection attempt");
                return;
            }
            this.b = new n3(contextC, Looper.getMainLooper(), this, this);
            this.c.a.d().w().a("Connecting to remote service");
            this.a = true;
            com.google.android.gms.common.internal.q.k(this.b);
            this.b.v();
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void j(int i2) {
        com.google.android.gms.common.internal.q.f("MeasurementServiceConnection.onConnectionSuspended");
        this.c.a.d().v().a("Service connection suspended");
        this.c.a.f().r(new o8(this));
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void m(ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.q.f("MeasurementServiceConnection.onConnectionFailed");
        r3 r3VarB = this.c.a.B();
        if (r3VarB != null) {
            r3VarB.r().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.a.f().r(new p8(this));
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void o(Bundle bundle) {
        com.google.android.gms.common.internal.q.f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                com.google.android.gms.common.internal.q.k(this.b);
                this.c.a.f().r(new n8(this, this.b.I()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.common.internal.q.f("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.c.a.d().o().a("Service connected with null binder");
                return;
            }
            i3 g3Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    g3Var = iInterfaceQueryLocalInterface instanceof i3 ? (i3) iInterfaceQueryLocalInterface : new g3(iBinder);
                    this.c.a.d().w().a("Bound to IMeasurementService interface");
                } else {
                    this.c.a.d().o().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.c.a.d().o().a("Service connect failed to get IMeasurementService");
            }
            if (g3Var == null) {
                this.a = false;
                try {
                    com.google.android.gms.common.n.a.b().c(this.c.a.c(), this.c.c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.c.a.f().r(new l8(this, g3Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.q.f("MeasurementServiceConnection.onServiceDisconnected");
        this.c.a.d().v().a("Service disconnected");
        this.c.a.f().r(new m8(this, componentName));
    }
}
