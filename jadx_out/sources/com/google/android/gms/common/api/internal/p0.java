package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements y0 {
    private final b1 a;
    private final Lock b;
    private final Context c;
    private final GoogleApiAvailabilityLight d;
    private ConnectionResult e;
    private int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f975h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private j.d.a.c.g.g f978k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f981n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.gms.common.internal.j f982o;
    private boolean p;
    private boolean q;
    private final com.google.android.gms.common.internal.d r;
    private final Map s;
    private final com.google.android.gms.common.api.a.AbstractC0120a t;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f974g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Bundle f976i = new Bundle();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Set f977j = new HashSet();
    private final ArrayList u = new ArrayList();

    public p0(b1 b1Var, com.google.android.gms.common.internal.d dVar, Map map, GoogleApiAvailabilityLight googleApiAvailabilityLight, com.google.android.gms.common.api.a.AbstractC0120a abstractC0120a, Lock lock, Context context) {
        this.a = b1Var;
        this.r = dVar;
        this.s = map;
        this.d = googleApiAvailabilityLight;
        this.t = abstractC0120a;
        this.b = lock;
        this.c = context;
    }

    static /* bridge */ /* synthetic */ void A(p0 p0Var, j.d.a.c.g.b.l lVar) {
        if (p0Var.n(0)) {
            ConnectionResult connectionResultF = lVar.f();
            if (!connectionResultF.n()) {
                if (!p0Var.p(connectionResultF)) {
                    p0Var.k(connectionResultF);
                    return;
                } else {
                    p0Var.h();
                    p0Var.m();
                    return;
                }
            }
            com.google.android.gms.common.internal.u0 u0VarH = lVar.h();
            com.google.android.gms.common.internal.q.k(u0VarH);
            com.google.android.gms.common.internal.u0 u0Var = u0VarH;
            ConnectionResult connectionResultF2 = u0Var.f();
            if (!connectionResultF2.n()) {
                String strValueOf = String.valueOf(connectionResultF2);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(strValueOf)), new Exception());
                p0Var.k(connectionResultF2);
                return;
            }
            p0Var.f981n = true;
            com.google.android.gms.common.internal.j jVarH = u0Var.h();
            com.google.android.gms.common.internal.q.k(jVarH);
            p0Var.f982o = jVarH;
            p0Var.p = u0Var.j();
            p0Var.q = u0Var.l();
            p0Var.m();
        }
    }

    private final void I() {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Future) arrayList.get(i2)).cancel(true);
        }
        this.u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void h() {
        this.f980m = false;
        this.a.f949n.p = Collections.emptySet();
        for (com.google.android.gms.common.api.a.c cVar : this.f977j) {
            if (!this.a.f942g.containsKey(cVar)) {
                this.a.f942g.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    @GuardedBy("mLock")
    private final void i(boolean z) {
        j.d.a.c.g.g gVar = this.f978k;
        if (gVar != null) {
            if (gVar.a() && z) {
                gVar.p();
            }
            gVar.s();
            com.google.android.gms.common.internal.q.k(this.r);
            this.f982o = null;
        }
    }

    @GuardedBy("mLock")
    private final void j() {
        this.a.m();
        c1.a().execute(new d0(this));
        j.d.a.c.g.g gVar = this.f978k;
        if (gVar != null) {
            if (this.p) {
                com.google.android.gms.common.internal.j jVar = this.f982o;
                com.google.android.gms.common.internal.q.k(jVar);
                gVar.o(jVar, this.q);
            }
            i(false);
        }
        Iterator it = this.a.f942g.keySet().iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.a.f fVar = (com.google.android.gms.common.api.a.f) this.a.f.get((com.google.android.gms.common.api.a.c) it.next());
            com.google.android.gms.common.internal.q.k(fVar);
            fVar.s();
        }
        this.a.f950o.a(this.f976i.isEmpty() ? null : this.f976i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void k(ConnectionResult connectionResult) {
        I();
        i(!connectionResult.l());
        this.a.p(connectionResult);
        this.a.f950o.c(connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void l(ConnectionResult connectionResult, com.google.android.gms.common.api.a aVar, boolean z) {
        int iB = aVar.c().b();
        if ((!z || connectionResult.l() || this.d.getErrorResolutionIntent(connectionResult.f()) != null) && (this.e == null || iB < this.f)) {
            this.e = connectionResult;
            this.f = iB;
        }
        this.a.f942g.put(aVar.b(), connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void m() {
        if (this.f975h != 0) {
            return;
        }
        if (!this.f980m || this.f981n) {
            ArrayList arrayList = new ArrayList();
            this.f974g = 1;
            this.f975h = this.a.f.size();
            for (com.google.android.gms.common.api.a.c cVar : this.a.f.keySet()) {
                if (!this.a.f942g.containsKey(cVar)) {
                    arrayList.add((com.google.android.gms.common.api.a.f) this.a.f.get(cVar));
                } else if (o()) {
                    j();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.u.add(c1.a().submit(new i0(this, arrayList)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean n(int i2) {
        if (this.f974g == i2) {
            return true;
        }
        Log.w("GACConnecting", this.a.f949n.v());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.f975h);
        Log.e("GACConnecting", "GoogleApiClient connecting is in step " + q(this.f974g) + " but received callback for step " + q(i2), new Exception());
        k(new ConnectionResult(8, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean o() {
        ConnectionResult connectionResult;
        int i2 = this.f975h - 1;
        this.f975h = i2;
        if (i2 > 0) {
            return false;
        }
        if (i2 < 0) {
            Log.w("GACConnecting", this.a.f949n.v());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            connectionResult = new ConnectionResult(8, null);
        } else {
            connectionResult = this.e;
            if (connectionResult == null) {
                return true;
            }
            this.a.f948m = this.f;
        }
        k(connectionResult);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean p(ConnectionResult connectionResult) {
        return this.f979l && !connectionResult.l();
    }

    private static final String q(int i2) {
        return i2 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    static /* bridge */ /* synthetic */ Set x(p0 p0Var) {
        com.google.android.gms.common.internal.d dVar = p0Var.r;
        if (dVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(dVar.g());
        Map mapK = p0Var.r.k();
        for (com.google.android.gms.common.api.a aVar : mapK.keySet()) {
            if (!p0Var.a.f942g.containsKey(aVar.b())) {
                hashSet.addAll(((com.google.android.gms.common.internal.d0) mapK.get(aVar)).a);
            }
        }
        return hashSet;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    @GuardedBy("mLock")
    public final void a(Bundle bundle) {
        if (n(1)) {
            if (bundle != null) {
                this.f976i.putAll(bundle);
            }
            if (o()) {
                j();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    @GuardedBy("mLock")
    public final void b(ConnectionResult connectionResult, com.google.android.gms.common.api.a aVar, boolean z) {
        if (n(1)) {
            l(connectionResult, aVar, z);
            if (o()) {
                j();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.y0
    @GuardedBy("mLock")
    public final void c(int i2) {
        k(new ConnectionResult(8, null));
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.common.api.a$f, j.d.a.c.g.g] */
    @Override // com.google.android.gms.common.api.internal.y0
    @GuardedBy("mLock")
    public final void d() {
        this.a.f942g.clear();
        this.f980m = false;
        l0 l0Var = null;
        this.e = null;
        this.f974g = 0;
        this.f979l = true;
        this.f981n = false;
        this.p = false;
        HashMap map = new HashMap();
        boolean z = false;
        for (com.google.android.gms.common.api.a aVar : this.s.keySet()) {
            com.google.android.gms.common.api.a.f fVar = (com.google.android.gms.common.api.a.f) this.a.f.get(aVar.b());
            com.google.android.gms.common.internal.q.k(fVar);
            com.google.android.gms.common.api.a.f fVar2 = fVar;
            z |= aVar.c().b() == 1;
            boolean zBooleanValue = ((Boolean) this.s.get(aVar)).booleanValue();
            if (fVar2.u()) {
                this.f980m = true;
                if (zBooleanValue) {
                    this.f977j.add(aVar.b());
                } else {
                    this.f979l = false;
                }
            }
            map.put(fVar2, new e0(this, aVar, zBooleanValue));
        }
        if (z) {
            this.f980m = false;
        }
        if (this.f980m) {
            com.google.android.gms.common.internal.q.k(this.r);
            com.google.android.gms.common.internal.q.k(this.t);
            this.r.l(Integer.valueOf(System.identityHashCode(this.a.f949n)));
            m0 m0Var = new m0(this, l0Var);
            com.google.android.gms.common.api.a.AbstractC0120a abstractC0120a = this.t;
            Context context = this.c;
            Looper looperL = this.a.f949n.l();
            com.google.android.gms.common.internal.d dVar = this.r;
            this.f978k = abstractC0120a.c(context, looperL, dVar, dVar.h(), m0Var, m0Var);
        }
        this.f975h = this.a.f.size();
        this.u.add(c1.a().submit(new h0(this, map)));
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void e() {
    }

    @Override // com.google.android.gms.common.api.internal.y0
    @GuardedBy("mLock")
    public final boolean f() {
        I();
        i(true);
        this.a.p(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final d g(d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
