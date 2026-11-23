package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.se;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class t5 extends h3 {
    private final v9 a;
    private Boolean b;
    private String c;

    public t5(v9 v9Var, String str) {
        com.google.android.gms.common.internal.q.k(v9Var);
        this.a = v9Var;
        this.c = null;
    }

    private final void m(ja jaVar, boolean z) {
        com.google.android.gms.common.internal.q.k(jaVar);
        com.google.android.gms.common.internal.q.g(jaVar.a);
        o(jaVar.a, false);
        this.a.b0().o(jaVar.b, jaVar.q, jaVar.u);
    }

    private final void o(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.a.d().o().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.b == null) {
                    this.b = Boolean.valueOf("com.google.android.gms".equals(this.c) || com.google.android.gms.common.util.o.a(this.a.c(), Binder.getCallingUid()) || com.google.android.gms.common.h.a(this.a.c()).c(Binder.getCallingUid()));
                }
                if (this.b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.a.d().o().b("Measurement Service called with invalid calling package. appId", r3.x(str));
                throw e;
            }
        }
        if (this.c == null && com.google.android.gms.common.g.o(this.a.c(), Binder.getCallingUid(), str)) {
            this.c = str;
        }
        if (str.equals(this.c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1(t tVar, ja jaVar) {
        this.a.l();
        this.a.i0(tVar, jaVar);
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void A(ja jaVar) {
        com.google.android.gms.common.internal.q.g(jaVar.a);
        com.google.android.gms.common.internal.q.k(jaVar.v);
        l5 l5Var = new l5(this, jaVar);
        com.google.android.gms.common.internal.q.k(l5Var);
        if (this.a.f().o()) {
            l5Var.run();
        } else {
            this.a.f().t(l5Var);
        }
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final List<y9> B0(ja jaVar, boolean z) {
        m(jaVar, false);
        String str = jaVar.a;
        com.google.android.gms.common.internal.q.k(str);
        try {
            List<aa> list = (List) this.a.f().p(new q5(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aa aaVar : list) {
                if (z || !ca.F(aaVar.c)) {
                    arrayList.add(new y9(aaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.d().o().c("Failed to get user properties. appId", r3.x(jaVar.a), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void J(ja jaVar) {
        m(jaVar, false);
        q1(new k5(this, jaVar));
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final List<y9> J0(String str, String str2, boolean z, ja jaVar) {
        m(jaVar, false);
        String str3 = jaVar.a;
        com.google.android.gms.common.internal.q.k(str3);
        try {
            List<aa> list = (List) this.a.f().p(new e5(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aa aaVar : list) {
                if (z || !ca.F(aaVar.c)) {
                    arrayList.add(new y9(aaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.d().o().c("Failed to query user properties. appId", r3.x(jaVar.a), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final List<b> L0(String str, String str2, String str3) {
        o(str, true);
        try {
            return (List) this.a.f().p(new i5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.d().o().b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final String Q(ja jaVar) {
        m(jaVar, false);
        return this.a.z(jaVar);
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void X0(ja jaVar) {
        com.google.android.gms.common.internal.q.g(jaVar.a);
        o(jaVar.a, false);
        q1(new j5(this, jaVar));
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void a1(t tVar, ja jaVar) {
        com.google.android.gms.common.internal.q.k(tVar);
        m(jaVar, false);
        q1(new m5(this, tVar, jaVar));
    }

    final void c1(t tVar, ja jaVar) {
        p3 p3VarW;
        String str;
        String str2;
        if (!this.a.T().r(jaVar.a)) {
            u1(tVar, jaVar);
            return;
        }
        this.a.d().w().b("EES config found for", jaVar.a);
        s4 s4VarT = this.a.T();
        String str3 = jaVar.a;
        se.a();
        com.google.android.gms.internal.measurement.c1 c1VarC = null;
        if (s4VarT.a.z().w(null, f3.B0) && !TextUtils.isEmpty(str3)) {
            c1VarC = s4VarT.f1278i.c(str3);
        }
        if (c1VarC != null) {
            try {
                Bundle bundleQ = tVar.b.q();
                HashMap map = new HashMap();
                for (String str4 : bundleQ.keySet()) {
                    Object obj = bundleQ.get(str4);
                    if (obj != null) {
                        map.put(str4, obj);
                    }
                }
                String strA = y5.a(tVar.a);
                if (strA == null) {
                    strA = tVar.a;
                }
                if (c1VarC.b(new com.google.android.gms.internal.measurement.b(strA, tVar.d, map))) {
                    if (c1VarC.c()) {
                        this.a.d().w().b("EES edited event", tVar.a);
                        tVar = x9.M(c1VarC.e().c());
                    }
                    u1(tVar, jaVar);
                    if (c1VarC.d()) {
                        for (com.google.android.gms.internal.measurement.b bVar : c1VarC.e().f()) {
                            this.a.d().w().b("EES logging created event", bVar.b());
                            u1(x9.M(bVar), jaVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (com.google.android.gms.internal.measurement.c2 unused) {
                this.a.d().o().c("EES error. appId, eventName", jaVar.b, tVar.a);
            }
            p3VarW = this.a.d().w();
            str = tVar.a;
            str2 = "EES was not applied to event";
        } else {
            p3VarW = this.a.d().w();
            str = jaVar.a;
            str2 = "EES not loaded for";
        }
        p3VarW.b(str2, str);
        u1(tVar, jaVar);
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final List<y9> e1(String str, String str2, String str3, boolean z) {
        o(str, true);
        try {
            List<aa> list = (List) this.a.f().p(new f5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aa aaVar : list) {
                if (z || !ca.F(aaVar.c)) {
                    arrayList.add(new y9(aaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.d().o().c("Failed to get user properties as. appId", r3.x(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void f1(final Bundle bundle, ja jaVar) {
        m(jaVar, false);
        final String str = jaVar.a;
        com.google.android.gms.common.internal.q.k(str);
        q1(new Runnable(this, str, bundle) { // from class: com.google.android.gms.measurement.internal.b5
            private final t5 a;
            private final String b;
            private final Bundle c;

            {
                this.a = this;
                this.b = str;
                this.c = bundle;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.r1(this.b, this.c);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void h1(b bVar) {
        com.google.android.gms.common.internal.q.k(bVar);
        com.google.android.gms.common.internal.q.k(bVar.c);
        com.google.android.gms.common.internal.q.g(bVar.a);
        o(bVar.a, true);
        q1(new d5(this, new b(bVar)));
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void j1(t tVar, String str, String str2) {
        com.google.android.gms.common.internal.q.k(tVar);
        com.google.android.gms.common.internal.q.g(str);
        o(str, true);
        q1(new n5(this, tVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void l0(y9 y9Var, ja jaVar) {
        com.google.android.gms.common.internal.q.k(y9Var);
        m(jaVar, false);
        q1(new p5(this, y9Var, jaVar));
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final byte[] m1(t tVar, String str) {
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.k(tVar);
        o(str, true);
        this.a.d().v().b("Log and bundle. event", this.a.a0().p(tVar.a));
        long jB = this.a.e().b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.f().q(new o5(this, tVar, str)).get();
            if (bArr == null) {
                this.a.d().o().b("Log and bundle returned null. appId", r3.x(str));
                bArr = new byte[0];
            }
            this.a.d().v().d("Log and bundle processed. event, size, time_ms", this.a.a0().p(tVar.a), Integer.valueOf(bArr.length), Long.valueOf((this.a.e().b() / 1000000) - jB));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.a.d().o().d("Failed to log and bundle. appId, event, error", r3.x(str), this.a.a0().p(tVar.a), e);
            return null;
        }
    }

    final t p1(t tVar, ja jaVar) {
        r rVar;
        if ("_cmp".equals(tVar.a) && (rVar = tVar.b) != null && rVar.n() != 0) {
            String strL = tVar.b.l("_cis");
            if ("referrer broadcast".equals(strL) || "referrer API".equals(strL)) {
                this.a.d().u().b("Event has been filtered ", tVar.toString());
                return new t("_cmpx", tVar.b, tVar.c, tVar.d);
            }
        }
        return tVar;
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final List<b> q(String str, String str2, ja jaVar) {
        m(jaVar, false);
        String str3 = jaVar.a;
        com.google.android.gms.common.internal.q.k(str3);
        try {
            return (List) this.a.f().p(new h5(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.d().o().b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    final void q1(Runnable runnable) {
        com.google.android.gms.common.internal.q.k(runnable);
        if (this.a.f().o()) {
            runnable.run();
        } else {
            this.a.f().r(runnable);
        }
    }

    final /* synthetic */ void r1(String str, Bundle bundle) {
        j jVarV = this.a.V();
        jVarV.h();
        jVarV.j();
        byte[] bArrB = jVarV.b.Y().x(new o(jVarV.a, "", str, "dep", 0L, 0L, bundle)).b();
        jVarV.a.d().w().c("Saving default event parameters, appId, data size", jVarV.a.H().p(str), Integer.valueOf(bArrB.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrB);
        try {
            if (jVarV.P().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                jVarV.a.d().o().b("Failed to insert default event parameters (got -1). appId", r3.x(str));
            }
        } catch (SQLiteException e) {
            jVarV.a.d().o().c("Error storing default event parameters. appId", r3.x(str), e);
        }
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void t0(ja jaVar) {
        m(jaVar, false);
        q1(new r5(this, jaVar));
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void u0(b bVar, ja jaVar) {
        com.google.android.gms.common.internal.q.k(bVar);
        com.google.android.gms.common.internal.q.k(bVar.c);
        m(jaVar, false);
        b bVar2 = new b(bVar);
        bVar2.a = jaVar.a;
        q1(new c5(this, bVar2, jaVar));
    }

    @Override // com.google.android.gms.measurement.internal.i3
    public final void v0(long j2, String str, String str2, String str3) {
        q1(new s5(this, str2, str3, str, j2));
    }
}
