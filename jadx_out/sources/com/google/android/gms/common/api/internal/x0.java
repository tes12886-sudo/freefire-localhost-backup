package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends com.google.android.gms.common.api.e implements p1 {
    private final Lock b;
    private final com.google.android.gms.common.internal.l0 c;
    private final int e;
    private final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Looper f992g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v0 f997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final GoogleApiAvailability f998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    zabx f999n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final Map f1000o;
    Set p;
    final com.google.android.gms.common.internal.d q;
    final Map r;
    final com.google.android.gms.common.api.a.AbstractC0120a s;
    private final j t;
    private final ArrayList u;
    private Integer v;
    Set w;
    final l2 x;
    private final com.google.android.gms.common.internal.k0 y;
    private r1 d = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Queue f993h = new LinkedList();

    public x0(Context context, Lock lock, Looper looper, com.google.android.gms.common.internal.d dVar, GoogleApiAvailability googleApiAvailability, com.google.android.gms.common.api.a.AbstractC0120a abstractC0120a, Map map, List list, List list2, Map map2, int i2, int i3, ArrayList arrayList) {
        this.f995j = true != com.google.android.gms.common.util.d.c() ? 120000L : 10000L;
        this.f996k = 5000L;
        this.p = new HashSet();
        this.t = new j();
        this.v = null;
        this.w = null;
        r0 r0Var = new r0(this);
        this.y = r0Var;
        this.f = context;
        this.b = lock;
        this.c = new com.google.android.gms.common.internal.l0(looper, r0Var);
        this.f992g = looper;
        this.f997l = new v0(this, looper);
        this.f998m = googleApiAvailability;
        this.e = i2;
        if (i2 >= 0) {
            this.v = Integer.valueOf(i3);
        }
        this.r = map;
        this.f1000o = map2;
        this.u = arrayList;
        this.x = new l2();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.c.f((com.google.android.gms.common.api.e.b) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.c.g((com.google.android.gms.common.api.e.c) it2.next());
        }
        this.q = dVar;
        this.s = abstractC0120a;
    }

    private final void B(int i2) {
        r1 b1Var;
        Integer num = this.v;
        if (num == null) {
            this.v = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            throw new IllegalStateException("Cannot use sign-in mode: " + w(i2) + ". Mode was already set to " + w(this.v.intValue()));
        }
        if (this.d != null) {
            return;
        }
        boolean zU = false;
        boolean zD = false;
        for (com.google.android.gms.common.api.a.f fVar : this.f1000o.values()) {
            zU |= fVar.u();
            zD |= fVar.d();
        }
        int iIntValue = this.v.intValue();
        if (iIntValue != 1) {
            if (iIntValue == 2 && zU) {
                b1Var = t.p(this.f, this, this.b, this.f992g, this.f998m, this.f1000o, this.q, this.r, this.s, this.u);
            }
            this.d = b1Var;
        }
        if (!zU) {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        if (zD) {
            throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
        }
        b1Var = new b1(this.f, this, this.b, this.f992g, this.f998m, this.f1000o, this.q, this.r, this.s, this.u, this);
        this.d = b1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(com.google.android.gms.common.api.e eVar, q qVar, boolean z) {
        com.google.android.gms.common.internal.z.a.d.a(eVar).d(new u0(this, qVar, z, eVar));
    }

    @GuardedBy("mLock")
    private final void D() {
        this.c.b();
        r1 r1Var = this.d;
        com.google.android.gms.common.internal.q.k(r1Var);
        r1Var.e();
    }

    public static int t(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean zU = false;
        boolean zD = false;
        while (it.hasNext()) {
            com.google.android.gms.common.api.a.f fVar = (com.google.android.gms.common.api.a.f) it.next();
            zU |= fVar.u();
            zD |= fVar.d();
        }
        if (zU) {
            return (zD && z) ? 2 : 1;
        }
        return 3;
    }

    static String w(int i2) {
        if (i2 == 1) {
            return "SIGN_IN_MODE_REQUIRED";
        }
        if (i2 != 2) {
            return i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE";
        }
        return "SIGN_IN_MODE_OPTIONAL";
    }

    static /* bridge */ /* synthetic */ void y(x0 x0Var) {
        x0Var.b.lock();
        try {
            if (x0Var.f994i) {
                x0Var.D();
            }
        } finally {
            x0Var.b.unlock();
        }
    }

    static /* bridge */ /* synthetic */ void z(x0 x0Var) {
        x0Var.b.lock();
        try {
            if (x0Var.A()) {
                x0Var.D();
            }
        } finally {
            x0Var.b.unlock();
        }
    }

    @GuardedBy("mLock")
    final boolean A() {
        if (!this.f994i) {
            return false;
        }
        this.f994i = false;
        this.f997l.removeMessages(2);
        this.f997l.removeMessages(1);
        zabx zabxVar = this.f999n;
        if (zabxVar != null) {
            zabxVar.b();
            this.f999n = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.p1
    @GuardedBy("mLock")
    public final void a(Bundle bundle) {
        while (!this.f993h.isEmpty()) {
            i((d) this.f993h.remove());
        }
        this.c.d(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.p1
    @GuardedBy("mLock")
    public final void b(int i2, boolean z) {
        if (i2 == 1) {
            if (!z && !this.f994i) {
                this.f994i = true;
                if (this.f999n == null && !com.google.android.gms.common.util.d.c()) {
                    try {
                        this.f999n = this.f998m.zac(this.f.getApplicationContext(), new w0(this));
                    } catch (SecurityException unused) {
                    }
                }
                v0 v0Var = this.f997l;
                v0Var.sendMessageDelayed(v0Var.obtainMessage(1), this.f995j);
                v0 v0Var2 = this.f997l;
                v0Var2.sendMessageDelayed(v0Var2.obtainMessage(2), this.f996k);
            }
            i2 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.x.a.toArray(new BasePendingResult[0])) {
            basePendingResult.g(l2.c);
        }
        this.c.e(i2);
        this.c.a();
        if (i2 == 2) {
            D();
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    @GuardedBy("mLock")
    public final void c(ConnectionResult connectionResult) {
        if (!this.f998m.isPlayServicesPossiblyUpdating(this.f, connectionResult.f())) {
            A();
        }
        if (this.f994i) {
            return;
        }
        this.c.c(connectionResult);
        this.c.a();
    }

    @Override // com.google.android.gms.common.api.e
    public final ConnectionResult d() {
        boolean z = true;
        com.google.android.gms.common.internal.q.o(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.b.lock();
        try {
            if (this.e >= 0) {
                if (this.v == null) {
                    z = false;
                }
                com.google.android.gms.common.internal.q.o(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.v;
                if (num == null) {
                    this.v = Integer.valueOf(t(this.f1000o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.v;
            com.google.android.gms.common.internal.q.k(num2);
            B(num2.intValue());
            this.c.b();
            r1 r1Var = this.d;
            com.google.android.gms.common.internal.q.k(r1Var);
            ConnectionResult connectionResultB = r1Var.b();
            this.b.unlock();
            return connectionResultB;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.e
    public final com.google.android.gms.common.api.f<Status> e() {
        com.google.android.gms.common.internal.q.o(s(), "GoogleApiClient is not connected yet.");
        Integer num = this.v;
        boolean z = true;
        if (num != null && num.intValue() == 2) {
            z = false;
        }
        com.google.android.gms.common.internal.q.o(z, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        q qVar = new q(this);
        if (this.f1000o.containsKey(com.google.android.gms.common.internal.z.a.a)) {
            C(this, qVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            s0 s0Var = new s0(this, atomicReference, qVar);
            t0 t0Var = new t0(this, qVar);
            com.google.android.gms.common.api.e.a aVar = new com.google.android.gms.common.api.e.a(this.f);
            aVar.a(com.google.android.gms.common.internal.z.a.b);
            aVar.c(s0Var);
            aVar.d(t0Var);
            aVar.f(this.f997l);
            com.google.android.gms.common.api.e eVarE = aVar.e();
            atomicReference.set(eVarE);
            eVarE.f();
        }
        return qVar;
    }

    @Override // com.google.android.gms.common.api.e
    public final void f() {
        this.b.lock();
        try {
            int i2 = 2;
            boolean z = false;
            if (this.e >= 0) {
                com.google.android.gms.common.internal.q.o(this.v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.v;
                if (num == null) {
                    this.v = Integer.valueOf(t(this.f1000o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.v;
            com.google.android.gms.common.internal.q.k(num2);
            int iIntValue = num2.intValue();
            this.b.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i2 = iIntValue;
                    }
                    com.google.android.gms.common.internal.q.b(z, "Illegal sign-in mode: " + i2);
                    B(i2);
                    D();
                    this.b.unlock();
                    return;
                }
                i2 = iIntValue;
                com.google.android.gms.common.internal.q.b(z, "Illegal sign-in mode: " + i2);
                B(i2);
                D();
                this.b.unlock();
                return;
            } finally {
                this.b.unlock();
            }
            z = true;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.e
    public final void g() {
        this.b.lock();
        try {
            this.x.b();
            r1 r1Var = this.d;
            if (r1Var != null) {
                r1Var.f();
            }
            this.t.a();
            for (d dVar : this.f993h) {
                dVar.q(null);
                dVar.e();
            }
            this.f993h.clear();
            if (this.d != null) {
                A();
                this.c.a();
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.e
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f994i);
        printWriter.append(" mWorkQueue.size()=").print(this.f993h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.x.a.size());
        r1 r1Var = this.d;
        if (r1Var != null) {
            r1Var.h(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.e
    public final <A extends com.google.android.gms.common.api.a.b, T extends d<? extends com.google.android.gms.common.api.j, A>> T i(T t) {
        com.google.android.gms.common.api.a<?> aVarS = t.s();
        com.google.android.gms.common.internal.q.b(this.f1000o.containsKey(t.t()), "GoogleApiClient is not configured to use " + (aVarS != null ? aVarS.d() : "the API") + " required for this call.");
        this.b.lock();
        try {
            r1 r1Var = this.d;
            if (r1Var == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f994i) {
                this.f993h.add(t);
                while (!this.f993h.isEmpty()) {
                    d dVar = (d) this.f993h.remove();
                    this.x.a(dVar);
                    dVar.x(Status.f921h);
                }
            } else {
                t = (T) r1Var.k(t);
            }
            this.b.unlock();
            return t;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.e
    public final Context k() {
        return this.f;
    }

    @Override // com.google.android.gms.common.api.e
    public final Looper l() {
        return this.f992g;
    }

    @Override // com.google.android.gms.common.api.e
    public final boolean m(o oVar) {
        r1 r1Var = this.d;
        return r1Var != null && r1Var.g(oVar);
    }

    @Override // com.google.android.gms.common.api.e
    public final void n() {
        r1 r1Var = this.d;
        if (r1Var != null) {
            r1Var.d();
        }
    }

    @Override // com.google.android.gms.common.api.e
    public final void o(com.google.android.gms.common.api.e.c cVar) {
        this.c.g(cVar);
    }

    @Override // com.google.android.gms.common.api.e
    public final void p(com.google.android.gms.common.api.e.c cVar) {
        this.c.h(cVar);
    }

    @Override // com.google.android.gms.common.api.e
    public final void q(j2 j2Var) {
        Exception exc;
        String str;
        this.b.lock();
        try {
            Set set = this.w;
            if (set != null) {
                if (set.remove(j2Var)) {
                    this.b.lock();
                    try {
                        Set set2 = this.w;
                        if (set2 == null) {
                            this.b.unlock();
                        } else {
                            boolean z = !set2.isEmpty();
                            this.b.unlock();
                            if (!z) {
                            }
                        }
                        r1 r1Var = this.d;
                        if (r1Var != null) {
                            r1Var.c();
                        }
                    } finally {
                        this.b.unlock();
                    }
                } else {
                    exc = new Exception();
                    str = "Failed to remove pending transform - this may lead to memory leaks!";
                }
            }
            exc = new Exception();
            str = "Attempted to remove pending transform when no transforms are registered.";
            Log.wtf("GoogleApiClientImpl", str, exc);
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    public final boolean s() {
        r1 r1Var = this.d;
        return r1Var != null && r1Var.i();
    }

    final String v() {
        StringWriter stringWriter = new StringWriter();
        h("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }
}
