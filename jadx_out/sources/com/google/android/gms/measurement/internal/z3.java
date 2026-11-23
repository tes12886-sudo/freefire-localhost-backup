package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
final class z3 extends BroadcastReceiver {
    private final v9 a;
    private boolean b;
    private boolean c;

    z3(v9 v9Var) {
        com.google.android.gms.common.internal.q.k(v9Var);
        this.a = v9Var;
    }

    public final void a() {
        this.a.c0();
        this.a.f().h();
        if (this.b) {
            return;
        }
        this.a.c().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.c = this.a.U().m();
        this.a.d().w().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.c));
        this.b = true;
    }

    public final void b() {
        this.a.c0();
        this.a.f().h();
        this.a.f().h();
        if (this.b) {
            this.a.d().w().a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                this.a.c().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.d().o().b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.c0();
        String action = intent.getAction();
        this.a.d().w().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.a.d().r().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM = this.a.U().m();
        if (this.c != zM) {
            this.c = zM;
            this.a.f().r(new y3(this, zM));
        }
    }
}
