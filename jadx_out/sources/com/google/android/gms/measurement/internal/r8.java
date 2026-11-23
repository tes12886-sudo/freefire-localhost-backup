package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class r8 extends f4 {
    private final q8 c;
    private i3 d;
    private volatile Boolean e;
    private final m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i9 f1271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<Runnable> f1272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m f1273i;

    protected r8(a5 a5Var) {
        super(a5Var);
        this.f1272h = new ArrayList();
        this.f1271g = new i9(a5Var.e());
        this.c = new q8(this);
        this.f = new a8(this, a5Var);
        this.f1273i = new c8(this, a5Var);
    }

    private final boolean C() {
        this.a.a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        h();
        this.f1271g.a();
        m mVar = this.f;
        this.a.z();
        mVar.b(f3.J.b(null).longValue());
    }

    private final void E(Runnable runnable) {
        h();
        if (H()) {
            runnable.run();
            return;
        }
        int size = this.f1272h.size();
        this.a.z();
        if (size >= 1000) {
            this.a.d().o().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f1272h.add(runnable);
        this.f1273i.b(60000L);
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        h();
        this.a.d().w().b("Processing queued up service tasks", Integer.valueOf(this.f1272h.size()));
        Iterator<Runnable> it = this.f1272h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e) {
                this.a.d().o().b("Task exception while flushing queue", e);
            }
        }
        this.f1272h.clear();
        this.f1273i.d();
    }

    private final ja G(boolean z) {
        Pair<String, Long> pairB;
        this.a.a();
        j3 j3VarB = this.a.b();
        String string = null;
        if (z) {
            r3 r3VarD = this.a.d();
            if (r3VarD.a.A().d != null && (pairB = r3VarD.a.A().d.b()) != null && pairB != h4.x) {
                String strValueOf = String.valueOf(pairB.second);
                String str = (String) pairB.first;
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(str).length());
                sb.append(strValueOf);
                sb.append(":");
                sb.append(str);
                string = sb.toString();
            }
        }
        return j3VarB.o(string);
    }

    static /* synthetic */ void x(r8 r8Var, ComponentName componentName) {
        r8Var.h();
        if (r8Var.d != null) {
            r8Var.d = null;
            r8Var.a.d().w().b("Disconnected from device MeasurementService", componentName);
            r8Var.h();
            r8Var.p();
        }
    }

    static /* synthetic */ i3 y(r8 r8Var, i3 i3Var) {
        r8Var.d = null;
        return null;
    }

    public final boolean H() {
        h();
        j();
        return this.d != null;
    }

    protected final void I() {
        h();
        j();
        E(new d8(this, G(true)));
    }

    protected final void J(boolean z) {
        h();
        j();
        if (z) {
            C();
            this.a.I().o();
        }
        if (v()) {
            E(new e8(this, G(false)));
        }
    }

    final void K(i3 i3Var, com.google.android.gms.common.internal.y.a aVar, ja jaVar) {
        int size;
        p3 p3VarO;
        String str;
        h();
        j();
        C();
        this.a.z();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List<com.google.android.gms.common.internal.y.a> listS = this.a.I().s(100);
            if (listS != null) {
                arrayList.addAll(listS);
                size = listS.size();
            } else {
                size = 0;
            }
            if (aVar != null && size < 100) {
                arrayList.add(aVar);
            }
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                com.google.android.gms.common.internal.y.a aVar2 = (com.google.android.gms.common.internal.y.a) arrayList.get(i4);
                if (aVar2 instanceof t) {
                    try {
                        i3Var.a1((t) aVar2, jaVar);
                    } catch (RemoteException e) {
                        e = e;
                        p3VarO = this.a.d().o();
                        str = "Failed to send event to the service";
                        p3VarO.b(str, e);
                    }
                } else if (aVar2 instanceof y9) {
                    try {
                        i3Var.l0((y9) aVar2, jaVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        p3VarO = this.a.d().o();
                        str = "Failed to send user property to the service";
                        p3VarO.b(str, e);
                    }
                } else if (aVar2 instanceof b) {
                    try {
                        i3Var.u0((b) aVar2, jaVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        p3VarO = this.a.d().o();
                        str = "Failed to send conditional user property to the service";
                        p3VarO.b(str, e);
                    }
                } else {
                    this.a.d().o().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = size;
        }
    }

    protected final void L(t tVar, String str) {
        com.google.android.gms.common.internal.q.k(tVar);
        h();
        j();
        C();
        E(new f8(this, true, G(true), this.a.I().p(tVar), tVar, str));
    }

    protected final void M(b bVar) {
        com.google.android.gms.common.internal.q.k(bVar);
        h();
        j();
        this.a.a();
        E(new h8(this, true, G(true), this.a.I().r(bVar), new b(bVar), bVar));
    }

    protected final void N(AtomicReference<List<b>> atomicReference, String str, String str2, String str3) {
        h();
        j();
        E(new i8(this, atomicReference, null, str2, str3, G(false)));
    }

    protected final void O(com.google.android.gms.internal.measurement.i1 i1Var, String str, String str2) {
        h();
        j();
        E(new j8(this, str, str2, G(false), i1Var));
    }

    protected final void P(AtomicReference<List<y9>> atomicReference, String str, String str2, String str3, boolean z) {
        h();
        j();
        E(new k8(this, atomicReference, null, str2, str3, G(false), z));
    }

    protected final void Q(com.google.android.gms.internal.measurement.i1 i1Var, String str, String str2, boolean z) {
        h();
        j();
        E(new s7(this, str, str2, G(false), z, i1Var));
    }

    protected final void R(y9 y9Var) {
        h();
        j();
        C();
        E(new t7(this, G(true), this.a.I().q(y9Var), y9Var));
    }

    protected final void S() {
        h();
        j();
        ja jaVarG = G(false);
        C();
        this.a.I().o();
        E(new u7(this, jaVarG));
    }

    public final void T(AtomicReference<String> atomicReference) {
        h();
        j();
        E(new v7(this, atomicReference, G(false)));
    }

    public final void U(com.google.android.gms.internal.measurement.i1 i1Var) {
        h();
        j();
        E(new w7(this, G(false), i1Var));
    }

    protected final void V() {
        h();
        j();
        ja jaVarG = G(true);
        this.a.I().t();
        E(new x7(this, jaVarG));
    }

    protected final void W(k7 k7Var) {
        h();
        j();
        E(new y7(this, k7Var));
    }

    @Override // com.google.android.gms.measurement.internal.f4
    protected final boolean m() {
        return false;
    }

    public final void o(Bundle bundle) {
        h();
        j();
        E(new z7(this, G(false), bundle));
    }

    final void p() {
        h();
        j();
        if (H()) {
            return;
        }
        if (r()) {
            this.c.c();
            return;
        }
        if (this.a.z().H()) {
            return;
        }
        this.a.a();
        List<ResolveInfo> listQueryIntentServices = this.a.c().getPackageManager().queryIntentServices(new Intent().setClassName(this.a.c(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
            this.a.d().o().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextC = this.a.c();
        this.a.a();
        intent.setComponent(new ComponentName(contextC, "com.google.android.gms.measurement.AppMeasurementService"));
        this.c.a(intent);
    }

    final Boolean q() {
        return this.e;
    }

    final boolean r() {
        p3 p3VarW;
        String str;
        p3 p3VarR;
        String str2;
        h();
        j();
        if (this.e == null) {
            h();
            j();
            h4 h4VarA = this.a.A();
            h4VarA.h();
            boolean z = false;
            Boolean boolValueOf = !h4VarA.p().contains("use_service") ? null : Boolean.valueOf(h4VarA.p().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                this.a.a();
                if (this.a.b().u() == 1) {
                    z = true;
                } else {
                    this.a.d().w().a("Checking service availability");
                    int iO = this.a.G().O(12451000);
                    if (iO == 0) {
                        p3VarW = this.a.d().w();
                        str = "Service available";
                    } else if (iO != 1) {
                        if (iO != 2) {
                            if (iO == 3) {
                                p3VarR = this.a.d().r();
                                str2 = "Service disabled";
                            } else if (iO == 9) {
                                p3VarR = this.a.d().r();
                                str2 = "Service invalid";
                            } else if (iO != 18) {
                                this.a.d().r().b("Unexpected service status", Integer.valueOf(iO));
                            } else {
                                p3VarW = this.a.d().r();
                                str = "Service updating";
                            }
                            p3VarR.a(str2);
                        } else {
                            this.a.d().v().a("Service container out of date");
                            if (this.a.G().N() >= 17443) {
                                z = boolValueOf == null;
                            }
                        }
                        z2 = false;
                    } else {
                        this.a.d().w().a("Service missing");
                    }
                    p3VarW.a(str);
                    z = true;
                }
                if (!z && this.a.z().H()) {
                    this.a.d().o().a("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    h4 h4VarA2 = this.a.A();
                    h4VarA2.h();
                    SharedPreferences.Editor editorEdit = h4VarA2.p().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.e = Boolean.valueOf(z2);
        }
        return this.e.booleanValue();
    }

    protected final void s(i3 i3Var) {
        h();
        com.google.android.gms.common.internal.q.k(i3Var);
        this.d = i3Var;
        D();
        F();
    }

    public final void t() {
        h();
        j();
        this.c.b();
        try {
            com.google.android.gms.common.n.a.b().c(this.a.c(), this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final void u(com.google.android.gms.internal.measurement.i1 i1Var, t tVar, String str) {
        h();
        j();
        if (this.a.G().O(12451000) == 0) {
            E(new b8(this, tVar, str, i1Var));
        } else {
            this.a.d().r().a("Not bundling data. Service unavailable or out of date");
            this.a.G().U(i1Var, new byte[0]);
        }
    }

    final boolean v() {
        h();
        j();
        return !r() || this.a.G().N() >= f3.u0.b(null).intValue();
    }
}
