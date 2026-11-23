package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements r1, b3 {
    private final Lock a;
    private final Condition b;
    private final Context c;
    private final GoogleApiAvailabilityLight d;
    private final a1 e;
    final Map f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final com.google.android.gms.common.internal.d f943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Map f944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final com.google.android.gms.common.api.a.AbstractC0120a f945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotOnlyInitialized
    private volatile y0 f946k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final x0 f949n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final p1 f950o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map f942g = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ConnectionResult f947l = null;

    public b1(Context context, x0 x0Var, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, com.google.android.gms.common.internal.d dVar, Map map2, com.google.android.gms.common.api.a.AbstractC0120a abstractC0120a, ArrayList arrayList, p1 p1Var) {
        this.c = context;
        this.a = lock;
        this.d = googleApiAvailabilityLight;
        this.f = map;
        this.f943h = dVar;
        this.f944i = map2;
        this.f945j = abstractC0120a;
        this.f949n = x0Var;
        this.f950o = p1Var;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((a3) arrayList.get(i2)).a(this);
        }
        this.e = new a1(this, looper);
        this.b = lock.newCondition();
        this.f946k = new q0(this);
    }

    @Override // com.google.android.gms.common.api.internal.r1
    @GuardedBy("mLock")
    public final ConnectionResult b() {
        e();
        while (this.f946k instanceof p0) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (this.f946k instanceof c0) {
            return ConnectionResult.e;
        }
        ConnectionResult connectionResult = this.f947l;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.r1
    @GuardedBy("mLock")
    public final void c() {
        if (this.f946k instanceof c0) {
            ((c0) this.f946k).i();
        }
    }

    @Override // com.google.android.gms.common.api.internal.b3
    public final void c1(ConnectionResult connectionResult, com.google.android.gms.common.api.a aVar, boolean z) {
        this.a.lock();
        try {
            this.f946k.b(connectionResult, aVar, z);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.r1
    public final void d() {
    }

    @Override // com.google.android.gms.common.api.internal.r1
    @GuardedBy("mLock")
    public final void e() {
        this.f946k.e();
    }

    @Override // com.google.android.gms.common.api.internal.r1
    @GuardedBy("mLock")
    public final void f() {
        if (this.f946k.f()) {
            this.f942g.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.r1
    public final boolean g(o oVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.r1
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String strConcat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f946k);
        for (com.google.android.gms.common.api.a aVar : this.f944i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) aVar.d()).println(":");
            com.google.android.gms.common.api.a.f fVar = (com.google.android.gms.common.api.a.f) this.f.get(aVar.b());
            com.google.android.gms.common.internal.q.k(fVar);
            fVar.g(strConcat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.r1
    public final boolean i() {
        return this.f946k instanceof c0;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void j(int i2) {
        this.a.lock();
        try {
            this.f946k.c(i2);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.r1
    @GuardedBy("mLock")
    public final d k(d dVar) {
        dVar.n();
        return this.f946k.g(dVar);
    }

    final void m() {
        this.a.lock();
        try {
            this.f949n.A();
            this.f946k = new c0(this);
            this.f946k.d();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    final void n() {
        this.a.lock();
        try {
            this.f946k = new p0(this, this.f943h, this.f944i, this.d, this.f945j, this.a, this.c);
            this.f946k.d();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void o(Bundle bundle) {
        this.a.lock();
        try {
            this.f946k.a(bundle);
        } finally {
            this.a.unlock();
        }
    }

    final void p(ConnectionResult connectionResult) {
        this.a.lock();
        try {
            this.f947l = connectionResult;
            this.f946k = new q0(this);
            this.f946k.d();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    final void q(z0 z0Var) {
        this.e.sendMessage(this.e.obtainMessage(1, z0Var));
    }

    final void r(RuntimeException runtimeException) {
        this.e.sendMessage(this.e.obtainMessage(2, runtimeException));
    }
}
