package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class b0 implements ServiceConnection {
    private final Object a = new Object();
    private boolean b = false;
    private f c;
    final /* synthetic */ e d;

    /* synthetic */ b0(e eVar, f fVar, a0 a0Var) {
        this.d = eVar;
        this.c = fVar;
    }

    private final void c(h hVar) {
        synchronized (this.a) {
            f fVar = this.c;
            if (fVar != null) {
                fVar.onBillingSetupFinished(hVar);
            }
        }
    }

    final /* synthetic */ Object a() {
        Bundle bundle;
        int iG;
        synchronized (this.a) {
            if (this.b) {
                return null;
            }
            if (TextUtils.isEmpty(null)) {
                bundle = null;
            } else {
                bundle = new Bundle();
                bundle.putString("accountName", null);
            }
            int i2 = 3;
            try {
                String packageName = this.d.e.getPackageName();
                int i3 = 17;
                iG = 3;
                while (true) {
                    if (i3 < 3) {
                        i3 = 0;
                        break;
                    }
                    if (bundle == null) {
                        try {
                            iG = this.d.f.G(i3, packageName, "subs");
                        } catch (Exception e) {
                            e = e;
                            i2 = iG;
                            j.d.a.c.f.h.k.n("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                            this.d.a = 0;
                            this.d.f = null;
                            iG = i2;
                        }
                    } else {
                        iG = this.d.f.y0(i3, packageName, "subs", bundle);
                    }
                    if (iG == 0) {
                        break;
                    }
                    i3--;
                }
                boolean z = true;
                this.d.f458i = i3 >= 5;
                this.d.f457h = i3 >= 3;
                if (i3 < 3) {
                    j.d.a.c.f.h.k.l("BillingClient", "In-app billing API does not support subscription on this device.");
                }
                for (int i4 = 17; i4 >= 3; i4--) {
                    iG = bundle == null ? this.d.f.G(i4, packageName, "inapp") : this.d.f.y0(i4, packageName, "inapp", bundle);
                    if (iG == 0) {
                        this.d.f459j = i4;
                        break;
                    }
                }
                e eVar = this.d;
                eVar.s = eVar.f459j >= 17;
                e eVar2 = this.d;
                eVar2.r = eVar2.f459j >= 16;
                e eVar3 = this.d;
                eVar3.q = eVar3.f459j >= 15;
                e eVar4 = this.d;
                eVar4.p = eVar4.f459j >= 14;
                e eVar5 = this.d;
                eVar5.f464o = eVar5.f459j >= 12;
                e eVar6 = this.d;
                eVar6.f463n = eVar6.f459j >= 10;
                e eVar7 = this.d;
                eVar7.f462m = eVar7.f459j >= 9;
                e eVar8 = this.d;
                eVar8.f461l = eVar8.f459j >= 8;
                e eVar9 = this.d;
                if (eVar9.f459j < 6) {
                    z = false;
                }
                eVar9.f460k = z;
                if (this.d.f459j < 3) {
                    j.d.a.c.f.h.k.m("BillingClient", "In-app billing API version 3 is not supported on this device.");
                }
                if (iG == 0) {
                    this.d.a = 2;
                } else {
                    this.d.a = 0;
                    this.d.f = null;
                }
            } catch (Exception e2) {
                e = e2;
            }
            c(iG == 0 ? i0.f470k : i0.a);
            return null;
        }
    }

    final /* synthetic */ void b() {
        this.d.a = 0;
        this.d.f = null;
        c(i0.f472m);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        j.d.a.c.f.h.k.l("BillingClient", "Billing service connected.");
        this.d.f = j.d.a.c.f.h.m.j(iBinder);
        e eVar = this.d;
        if (eVar.t(new Callable() { // from class: com.android.billingclient.api.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.a();
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.z
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        }, eVar.p()) == null) {
            c(this.d.r());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        j.d.a.c.f.h.k.m("BillingClient", "Billing service disconnected.");
        this.d.f = null;
        this.d.a = 0;
        synchronized (this.a) {
            f fVar = this.c;
            if (fVar != null) {
                fVar.onBillingServiceDisconnected();
            }
        }
    }
}
