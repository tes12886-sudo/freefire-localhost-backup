package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements com.google.android.gms.common.api.e.b, com.google.android.gms.common.api.e.c, b3 {

    @NotOnlyInitialized
    private final com.google.android.gms.common.api.a.f b;
    private final b c;
    private final w d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d2 f963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f964i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ g f968m;
    private final Queue a = new LinkedList();
    private final Set e = new HashSet();
    private final Map f = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f965j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ConnectionResult f966k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f967l = 0;

    public j1(g gVar, GoogleApi googleApi) {
        this.f968m = gVar;
        com.google.android.gms.common.api.a.f fVarL = googleApi.l(gVar.p.getLooper(), this);
        this.b = fVarL;
        this.c = googleApi.b();
        this.d = new w();
        this.f962g = googleApi.k();
        if (fVarL.u()) {
            this.f963h = googleApi.m(gVar.f953g, gVar.p);
        } else {
            this.f963h = null;
        }
    }

    static /* bridge */ /* synthetic */ void B(j1 j1Var, l1 l1Var) {
        if (j1Var.f965j.contains(l1Var) && !j1Var.f964i) {
            if (j1Var.b.a()) {
                j1Var.f();
            } else {
                j1Var.E();
            }
        }
    }

    static /* bridge */ /* synthetic */ void C(j1 j1Var, l1 l1Var) {
        com.google.android.gms.common.c[] cVarArrG;
        if (j1Var.f965j.remove(l1Var)) {
            j1Var.f968m.p.removeMessages(15, l1Var);
            j1Var.f968m.p.removeMessages(16, l1Var);
            com.google.android.gms.common.c cVar = l1Var.b;
            ArrayList arrayList = new ArrayList(j1Var.a.size());
            for (p2 p2Var : j1Var.a) {
                if ((p2Var instanceof q1) && (cVarArrG = ((q1) p2Var).g(j1Var)) != null && com.google.android.gms.common.util.b.c(cVarArrG, cVar)) {
                    arrayList.add(p2Var);
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                p2 p2Var2 = (p2) arrayList.get(i2);
                j1Var.a.remove(p2Var2);
                p2Var2.b(new com.google.android.gms.common.api.o(cVar));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.google.android.gms.common.c b(com.google.android.gms.common.c[] cVarArr) {
        if (cVarArr != null && cVarArr.length != 0) {
            com.google.android.gms.common.c[] cVarArrM = this.b.m();
            if (cVarArrM == null) {
                cVarArrM = new com.google.android.gms.common.c[0];
            }
            h.f.a aVar = new h.f.a(cVarArrM.length);
            for (com.google.android.gms.common.c cVar : cVarArrM) {
                aVar.put(cVar.f(), Long.valueOf(cVar.h()));
            }
            for (com.google.android.gms.common.c cVar2 : cVarArr) {
                Long l2 = (Long) aVar.get(cVar2.f());
                if (l2 == null || l2.longValue() < cVar2.h()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final void c(ConnectionResult connectionResult) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((s2) it.next()).c(this.c, connectionResult, com.google.android.gms.common.internal.o.a(connectionResult, ConnectionResult.e) ? this.b.n() : null);
        }
        this.e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Status status) {
        com.google.android.gms.common.internal.q.d(this.f968m.p);
        e(status, null, false);
    }

    private final void e(Status status, Exception exc, boolean z) {
        com.google.android.gms.common.internal.q.d(this.f968m.p);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            p2 p2Var = (p2) it.next();
            if (!z || p2Var.a == 2) {
                if (status != null) {
                    p2Var.a(status);
                } else {
                    p2Var.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void f() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            p2 p2Var = (p2) arrayList.get(i2);
            if (!this.b.a()) {
                return;
            }
            if (n(p2Var)) {
                this.a.remove(p2Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        D();
        c(ConnectionResult.e);
        l();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            y1 y1Var = (y1) it.next();
            if (b(y1Var.a.b()) == null) {
                try {
                    y1Var.a.c(this.b, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    j(3);
                    this.b.h("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
            it.remove();
        }
        f();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(int i2) {
        D();
        this.f964i = true;
        this.d.e(i2, this.b.q());
        g gVar = this.f968m;
        gVar.p.sendMessageDelayed(Message.obtain(gVar.p, 9, this.c), this.f968m.a);
        g gVar2 = this.f968m;
        gVar2.p.sendMessageDelayed(Message.obtain(gVar2.p, 11, this.c), this.f968m.b);
        this.f968m.f955i.c();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((y1) it.next()).c.run();
        }
    }

    private final void i() {
        this.f968m.p.removeMessages(12, this.c);
        g gVar = this.f968m;
        gVar.p.sendMessageDelayed(gVar.p.obtainMessage(12, this.c), this.f968m.c);
    }

    private final void k(p2 p2Var) {
        p2Var.d(this.d, P());
        try {
            p2Var.c(this);
        } catch (DeadObjectException unused) {
            j(1);
            this.b.h("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void l() {
        if (this.f964i) {
            this.f968m.p.removeMessages(11, this.c);
            this.f968m.p.removeMessages(9, this.c);
            this.f964i = false;
        }
    }

    private final boolean n(p2 p2Var) {
        if (!(p2Var instanceof q1)) {
            k(p2Var);
            return true;
        }
        q1 q1Var = (q1) p2Var;
        com.google.android.gms.common.c cVarB = b(q1Var.g(this));
        if (cVarB == null) {
            k(p2Var);
            return true;
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + cVarB.f() + ", " + cVarB.h() + ").");
        if (!this.f968m.q || !q1Var.f(this)) {
            q1Var.b(new com.google.android.gms.common.api.o(cVarB));
            return true;
        }
        l1 l1Var = new l1(this.c, cVarB, null);
        int iIndexOf = this.f965j.indexOf(l1Var);
        if (iIndexOf >= 0) {
            l1 l1Var2 = (l1) this.f965j.get(iIndexOf);
            this.f968m.p.removeMessages(15, l1Var2);
            g gVar = this.f968m;
            gVar.p.sendMessageDelayed(Message.obtain(gVar.p, 15, l1Var2), this.f968m.a);
            return false;
        }
        this.f965j.add(l1Var);
        g gVar2 = this.f968m;
        gVar2.p.sendMessageDelayed(Message.obtain(gVar2.p, 15, l1Var), this.f968m.a);
        g gVar3 = this.f968m;
        gVar3.p.sendMessageDelayed(Message.obtain(gVar3.p, 16, l1Var), this.f968m.b);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (p(connectionResult)) {
            return false;
        }
        this.f968m.h(connectionResult, this.f962g);
        return false;
    }

    private final boolean p(ConnectionResult connectionResult) {
        synchronized (g.t) {
            g gVar = this.f968m;
            if (gVar.f959m == null || !gVar.f960n.contains(this.c)) {
                return false;
            }
            this.f968m.f959m.s(connectionResult, this.f962g);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(boolean z) {
        com.google.android.gms.common.internal.q.d(this.f968m.p);
        if (!this.b.a() || this.f.size() != 0) {
            return false;
        }
        if (!this.d.g()) {
            this.b.h("Timing out service connection.");
            return true;
        }
        if (z) {
            i();
        }
        return false;
    }

    public final void D() {
        com.google.android.gms.common.internal.q.d(this.f968m.p);
        this.f966k = null;
    }

    public final void E() {
        ConnectionResult connectionResult;
        com.google.android.gms.common.internal.q.d(this.f968m.p);
        if (this.b.a() || this.b.l()) {
            return;
        }
        try {
            g gVar = this.f968m;
            int iB = gVar.f955i.b(gVar.f953g, this.b);
            if (iB != 0) {
                ConnectionResult connectionResult2 = new ConnectionResult(iB, null);
                Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + connectionResult2.toString());
                H(connectionResult2, null);
                return;
            }
            g gVar2 = this.f968m;
            com.google.android.gms.common.api.a.f fVar = this.b;
            n1 n1Var = new n1(gVar2, fVar, this.c);
            if (fVar.u()) {
                d2 d2Var = this.f963h;
                com.google.android.gms.common.internal.q.k(d2Var);
                d2Var.s1(n1Var);
            }
            try {
                this.b.r(n1Var);
                return;
            } catch (SecurityException e) {
                e = e;
                connectionResult = new ConnectionResult(10);
            }
        } catch (IllegalStateException e2) {
            e = e2;
            connectionResult = new ConnectionResult(10);
        }
        H(connectionResult, e);
    }

    public final void F(p2 p2Var) {
        com.google.android.gms.common.internal.q.d(this.f968m.p);
        if (this.b.a()) {
            if (n(p2Var)) {
                i();
                return;
            } else {
                this.a.add(p2Var);
                return;
            }
        }
        this.a.add(p2Var);
        ConnectionResult connectionResult = this.f966k;
        if (connectionResult == null || !connectionResult.l()) {
            E();
        } else {
            H(this.f966k, null);
        }
    }

    final void G() {
        this.f967l++;
    }

    public final void H(ConnectionResult connectionResult, Exception exc) {
        com.google.android.gms.common.internal.q.d(this.f968m.p);
        d2 d2Var = this.f963h;
        if (d2Var != null) {
            d2Var.t1();
        }
        D();
        this.f968m.f955i.c();
        c(connectionResult);
        if ((this.b instanceof com.google.android.gms.common.internal.z.q) && connectionResult.f() != 24) {
            this.f968m.d = true;
            g gVar = this.f968m;
            gVar.p.sendMessageDelayed(gVar.p.obtainMessage(19), 300000L);
        }
        if (connectionResult.f() == 4) {
            d(g.s);
            return;
        }
        if (this.a.isEmpty()) {
            this.f966k = connectionResult;
            return;
        }
        if (exc != null) {
            com.google.android.gms.common.internal.q.d(this.f968m.p);
            e(null, exc, false);
            return;
        }
        if (!this.f968m.q) {
            d(g.i(this.c, connectionResult));
            return;
        }
        e(g.i(this.c, connectionResult), null, true);
        if (this.a.isEmpty() || p(connectionResult) || this.f968m.h(connectionResult, this.f962g)) {
            return;
        }
        if (connectionResult.f() == 18) {
            this.f964i = true;
        }
        if (!this.f964i) {
            d(g.i(this.c, connectionResult));
        } else {
            g gVar2 = this.f968m;
            gVar2.p.sendMessageDelayed(Message.obtain(gVar2.p, 9, this.c), this.f968m.a);
        }
    }

    public final void I(ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.q.d(this.f968m.p);
        com.google.android.gms.common.api.a.f fVar = this.b;
        fVar.h("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        H(connectionResult, null);
    }

    public final void J(s2 s2Var) {
        com.google.android.gms.common.internal.q.d(this.f968m.p);
        this.e.add(s2Var);
    }

    public final void K() {
        com.google.android.gms.common.internal.q.d(this.f968m.p);
        if (this.f964i) {
            E();
        }
    }

    public final void L() {
        com.google.android.gms.common.internal.q.d(this.f968m.p);
        d(g.r);
        this.d.f();
        for (i.a aVar : (i.a[]) this.f.keySet().toArray(new i.a[0])) {
            F(new o2(aVar, new TaskCompletionSource()));
        }
        c(new ConnectionResult(4));
        if (this.b.a()) {
            this.b.c(new i1(this));
        }
    }

    public final void M() {
        com.google.android.gms.common.internal.q.d(this.f968m.p);
        if (this.f964i) {
            l();
            g gVar = this.f968m;
            d(gVar.f954h.isGooglePlayServicesAvailable(gVar.f953g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.b.h("Timing out connection while resuming.");
        }
    }

    final boolean O() {
        return this.b.a();
    }

    public final boolean P() {
        return this.b.u();
    }

    public final boolean a() {
        return q(true);
    }

    @Override // com.google.android.gms.common.api.internal.b3
    public final void c1(ConnectionResult connectionResult, com.google.android.gms.common.api.a aVar, boolean z) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void j(int i2) {
        if (Looper.myLooper() == this.f968m.p.getLooper()) {
            h(i2);
        } else {
            this.f968m.p.post(new g1(this, i2));
        }
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final void m(ConnectionResult connectionResult) {
        H(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void o(Bundle bundle) {
        if (Looper.myLooper() == this.f968m.p.getLooper()) {
            g();
        } else {
            this.f968m.p.post(new f1(this));
        }
    }

    public final int r() {
        return this.f962g;
    }

    final int s() {
        return this.f967l;
    }

    public final ConnectionResult t() {
        com.google.android.gms.common.internal.q.d(this.f968m.p);
        return this.f966k;
    }

    public final com.google.android.gms.common.api.a.f v() {
        return this.b;
    }

    public final Map x() {
        return this.f;
    }
}
