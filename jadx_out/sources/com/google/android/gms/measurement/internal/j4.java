package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class j4 implements ServiceConnection {
    private final String a;
    final /* synthetic */ k4 b;

    j4(k4 k4Var, String str) {
        this.b = k4Var;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.a.d().r().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.t0 t0VarM = com.google.android.gms.internal.measurement.s0.m(iBinder);
            if (t0VarM == null) {
                this.b.a.d().r().a("Install Referrer Service implementation was not found");
            } else {
                this.b.a.d().w().a("Install Referrer Service connected");
                this.b.a.f().r(new i4(this, t0VarM, this));
            }
        } catch (RuntimeException e) {
            this.b.a.d().r().b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.d().w().a("Install Referrer Service disconnected");
    }
}
