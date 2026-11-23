package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements y0 {
    private final b1 a;
    private boolean b = false;

    public c0(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void b(ConnectionResult connectionResult, com.google.android.gms.common.api.a aVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void c(int i2) {
        this.a.p(null);
        this.a.f950o.b(i2, this.b);
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void d() {
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void e() {
        if (this.b) {
            this.b = false;
            this.a.q(new b0(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final boolean f() {
        if (this.b) {
            return false;
        }
        Set set = this.a.f949n.w;
        if (set == null || set.isEmpty()) {
            this.a.p(null);
            return true;
        }
        this.b = true;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((j2) it.next()).f();
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final d g(d dVar) {
        try {
            this.a.f949n.x.a(dVar);
            x0 x0Var = this.a.f949n;
            com.google.android.gms.common.api.a.f fVar = (com.google.android.gms.common.api.a.f) x0Var.f1000o.get(dVar.t());
            com.google.android.gms.common.internal.q.l(fVar, "Appropriate Api was not requested.");
            if (fVar.a() || !this.a.f942g.containsKey(dVar.t())) {
                dVar.v(fVar);
            } else {
                dVar.x(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.a.q(new a0(this, this));
        }
        return dVar;
    }

    final void i() {
        if (this.b) {
            this.b = false;
            this.a.f949n.x.b();
            f();
        }
    }
}
