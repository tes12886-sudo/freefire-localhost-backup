package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class h0 extends o0 {
    private final Map b;
    final /* synthetic */ p0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p0 p0Var, Map map) {
        super(p0Var, null);
        this.c = p0Var;
        this.b = map;
    }

    @Override // com.google.android.gms.common.api.internal.o0
    @GuardedBy("mLock")
    public final void a() {
        com.google.android.gms.common.internal.m0 m0Var = new com.google.android.gms.common.internal.m0(this.c.d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.google.android.gms.common.api.a.f fVar : this.b.keySet()) {
            if (!fVar.i() || ((e0) this.b.get(fVar)).c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int iB = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                iB = m0Var.b(this.c.c, (com.google.android.gms.common.api.a.f) arrayList.get(i2));
                i2++;
                if (iB != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                iB = m0Var.b(this.c.c, (com.google.android.gms.common.api.a.f) arrayList2.get(i2));
                i2++;
                if (iB == 0) {
                    break;
                }
            }
        }
        if (iB != 0) {
            ConnectionResult connectionResult = new ConnectionResult(iB, null);
            p0 p0Var = this.c;
            p0Var.a.q(new f0(this, p0Var, connectionResult));
            return;
        }
        p0 p0Var2 = this.c;
        if (p0Var2.f980m && p0Var2.f978k != null) {
            p0Var2.f978k.b();
        }
        for (com.google.android.gms.common.api.a.f fVar2 : this.b.keySet()) {
            com.google.android.gms.common.internal.c.InterfaceC0123c interfaceC0123c = (com.google.android.gms.common.internal.c.InterfaceC0123c) this.b.get(fVar2);
            if (!fVar2.i() || m0Var.b(this.c.c, fVar2) == 0) {
                fVar2.r(interfaceC0123c);
            } else {
                p0 p0Var3 = this.c;
                p0Var3.a.q(new g0(this, p0Var3, interfaceC0123c));
            }
        }
    }
}
