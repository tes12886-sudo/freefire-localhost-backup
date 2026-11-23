package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class t implements r1 {
    private final Context a;
    private final x0 b;
    private final Looper c;
    private final b1 d;
    private final b1 e;
    private final Map f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.common.api.a.f f984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bundle f985i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Lock f989m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f983g = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ConnectionResult f986j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ConnectionResult f987k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f988l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @GuardedBy("mLock")
    private int f990n = 0;

    private t(Context context, x0 x0Var, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, Map map2, com.google.android.gms.common.internal.d dVar, com.google.android.gms.common.api.a.AbstractC0120a abstractC0120a, com.google.android.gms.common.api.a.f fVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.a = context;
        this.b = x0Var;
        this.f989m = lock;
        this.c = looper;
        this.f984h = fVar;
        this.d = new b1(context, x0Var, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new e3(this, null));
        this.e = new b1(context, x0Var, lock, looper, googleApiAvailabilityLight, map, dVar, map3, abstractC0120a, arrayList, new g3(this, null));
        h.f.a aVar = new h.f.a();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            aVar.put((com.google.android.gms.common.api.a.c) it.next(), this.d);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            aVar.put((com.google.android.gms.common.api.a.c) it2.next(), this.e);
        }
        this.f = Collections.unmodifiableMap(aVar);
    }

    private final PendingIntent B() {
        if (this.f984h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.a, System.identityHashCode(this.b), this.f984h.t(), j.d.a.c.f.d.i.a | 134217728);
    }

    @GuardedBy("mLock")
    private final void a(ConnectionResult connectionResult) {
        int i2 = this.f990n;
        if (i2 == 1) {
            j();
        } else if (i2 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.b.c(connectionResult);
            j();
        }
        this.f990n = 0;
    }

    @GuardedBy("mLock")
    private final void j() {
        Iterator it = this.f983g.iterator();
        while (it.hasNext()) {
            ((o) it.next()).onComplete();
        }
        this.f983g.clear();
    }

    @GuardedBy("mLock")
    private final boolean l() {
        ConnectionResult connectionResult = this.f987k;
        return connectionResult != null && connectionResult.f() == 4;
    }

    private final boolean m(d dVar) {
        b1 b1Var = (b1) this.f.get(dVar.t());
        com.google.android.gms.common.internal.q.l(b1Var, "GoogleApiClient is not configured to use the API required for this call.");
        return b1Var.equals(this.e);
    }

    private static boolean n(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.n();
    }

    public static t p(Context context, x0 x0Var, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, com.google.android.gms.common.internal.d dVar, Map map2, com.google.android.gms.common.api.a.AbstractC0120a abstractC0120a, ArrayList arrayList) {
        h.f.a aVar = new h.f.a();
        h.f.a aVar2 = new h.f.a();
        com.google.android.gms.common.api.a.f fVar = null;
        for (Map.Entry entry : map.entrySet()) {
            com.google.android.gms.common.api.a.f fVar2 = (com.google.android.gms.common.api.a.f) entry.getValue();
            if (true == fVar2.d()) {
                fVar = fVar2;
            }
            boolean zU = fVar2.u();
            com.google.android.gms.common.api.a.c cVar = (com.google.android.gms.common.api.a.c) entry.getKey();
            if (zU) {
                aVar.put(cVar, fVar2);
            } else {
                aVar2.put(cVar, fVar2);
            }
        }
        com.google.android.gms.common.internal.q.o(!aVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        h.f.a aVar3 = new h.f.a();
        h.f.a aVar4 = new h.f.a();
        for (com.google.android.gms.common.api.a aVar5 : map2.keySet()) {
            com.google.android.gms.common.api.a.c cVarB = aVar5.b();
            if (aVar.containsKey(cVarB)) {
                aVar3.put(aVar5, (Boolean) map2.get(aVar5));
            } else {
                if (!aVar2.containsKey(cVarB)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                aVar4.put(aVar5, (Boolean) map2.get(aVar5));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a3 a3Var = (a3) arrayList.get(i2);
            if (aVar3.containsKey(a3Var.a)) {
                arrayList2.add(a3Var);
            } else {
                if (!aVar4.containsKey(a3Var.a)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(a3Var);
            }
        }
        return new t(context, x0Var, lock, looper, googleApiAvailabilityLight, aVar, aVar2, dVar, abstractC0120a, fVar, arrayList2, arrayList3, aVar3, aVar4);
    }

    static /* bridge */ /* synthetic */ void w(t tVar, int i2, boolean z) {
        tVar.b.b(i2, z);
        tVar.f987k = null;
        tVar.f986j = null;
    }

    static /* bridge */ /* synthetic */ void x(t tVar, Bundle bundle) {
        Bundle bundle2 = tVar.f985i;
        if (bundle2 == null) {
            tVar.f985i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    static /* bridge */ /* synthetic */ void y(t tVar) {
        ConnectionResult connectionResult;
        if (!n(tVar.f986j)) {
            if (tVar.f986j != null && n(tVar.f987k)) {
                tVar.e.f();
                ConnectionResult connectionResult2 = tVar.f986j;
                com.google.android.gms.common.internal.q.k(connectionResult2);
                tVar.a(connectionResult2);
                return;
            }
            ConnectionResult connectionResult3 = tVar.f986j;
            if (connectionResult3 == null || (connectionResult = tVar.f987k) == null) {
                return;
            }
            if (tVar.e.f948m < tVar.d.f948m) {
                connectionResult3 = connectionResult;
            }
            tVar.a(connectionResult3);
            return;
        }
        if (!n(tVar.f987k) && !tVar.l()) {
            ConnectionResult connectionResult4 = tVar.f987k;
            if (connectionResult4 != null) {
                if (tVar.f990n == 1) {
                    tVar.j();
                    return;
                } else {
                    tVar.a(connectionResult4);
                    tVar.d.f();
                    return;
                }
            }
            return;
        }
        int i2 = tVar.f990n;
        if (i2 == 1) {
            tVar.j();
        } else if (i2 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
        } else {
            x0 x0Var = tVar.b;
            com.google.android.gms.common.internal.q.k(x0Var);
            x0Var.a(tVar.f985i);
            tVar.j();
        }
        tVar.f990n = 0;
    }

    public final boolean A() {
        this.f989m.lock();
        try {
            return this.f990n == 2;
        } finally {
            this.f989m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.r1
    @GuardedBy("mLock")
    public final ConnectionResult b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.r1
    @GuardedBy("mLock")
    public final void c() {
        this.d.c();
        this.e.c();
    }

    @Override // com.google.android.gms.common.api.internal.r1
    public final void d() {
        this.f989m.lock();
        try {
            boolean zA = A();
            this.e.f();
            this.f987k = new ConnectionResult(4);
            if (zA) {
                new j.d.a.c.f.d.n(this.c).post(new c3(this));
            } else {
                j();
            }
        } finally {
            this.f989m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.r1
    @GuardedBy("mLock")
    public final void e() {
        this.f990n = 2;
        this.f988l = false;
        this.f987k = null;
        this.f986j = null;
        this.d.e();
        this.e.e();
    }

    @Override // com.google.android.gms.common.api.internal.r1
    @GuardedBy("mLock")
    public final void f() {
        this.f987k = null;
        this.f986j = null;
        this.f990n = 0;
        this.d.f();
        this.e.f();
        j();
    }

    @Override // com.google.android.gms.common.api.internal.r1
    public final boolean g(o oVar) {
        this.f989m.lock();
        try {
            if ((!A() && !i()) || this.e.i()) {
                return false;
            }
            this.f983g.add(oVar);
            if (this.f990n == 0) {
                this.f990n = 1;
            }
            this.f987k = null;
            this.e.e();
            return true;
        } finally {
            this.f989m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.r1
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.h(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.h(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.r1
    public final boolean i() {
        this.f989m.lock();
        try {
            boolean z = false;
            if (this.d.i() && (this.e.i() || l() || this.f990n == 1)) {
                z = true;
            }
            return z;
        } finally {
            this.f989m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.r1
    @GuardedBy("mLock")
    public final d k(d dVar) {
        if (!m(dVar)) {
            return this.d.k(dVar);
        }
        if (!l()) {
            return this.e.k(dVar);
        }
        dVar.x(new Status(4, (String) null, B()));
        return dVar;
    }
}
