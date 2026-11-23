package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends j.d.a.c.g.b.d implements com.google.android.gms.common.api.e.b, com.google.android.gms.common.api.e.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.AbstractC0120a f951h = j.d.a.c.g.f.c;
    private final Context a;
    private final Handler b;
    private final com.google.android.gms.common.api.a.AbstractC0120a c;
    private final Set d;
    private final com.google.android.gms.common.internal.d e;
    private j.d.a.c.g.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c2 f952g;

    public d2(Context context, Handler handler, com.google.android.gms.common.internal.d dVar) {
        com.google.android.gms.common.api.a.AbstractC0120a abstractC0120a = f951h;
        this.a = context;
        this.b = handler;
        com.google.android.gms.common.internal.q.l(dVar, "ClientSettings must not be null");
        this.e = dVar;
        this.d = dVar.g();
        this.c = abstractC0120a;
    }

    static /* bridge */ /* synthetic */ void r1(d2 d2Var, j.d.a.c.g.b.l lVar) {
        ConnectionResult connectionResultF = lVar.f();
        if (connectionResultF.n()) {
            com.google.android.gms.common.internal.u0 u0VarH = lVar.h();
            com.google.android.gms.common.internal.q.k(u0VarH);
            com.google.android.gms.common.internal.u0 u0Var = u0VarH;
            connectionResultF = u0Var.f();
            if (connectionResultF.n()) {
                d2Var.f952g.b(u0Var.h(), d2Var.d);
            } else {
                String strValueOf = String.valueOf(connectionResultF);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(strValueOf)), new Exception());
                d2Var.f952g.c(connectionResultF);
            }
        } else {
            d2Var.f952g.c(connectionResultF);
        }
        d2Var.f.s();
    }

    @Override // j.d.a.c.g.b.f
    public final void g0(j.d.a.c.g.b.l lVar) {
        this.b.post(new b2(this, lVar));
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void j(int i2) {
        this.f.s();
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final void m(ConnectionResult connectionResult) {
        this.f952g.c(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void o(Bundle bundle) {
        this.f.j(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, j.d.a.c.g.g] */
    public final void s1(c2 c2Var) {
        j.d.a.c.g.g gVar = this.f;
        if (gVar != null) {
            gVar.s();
        }
        this.e.l(Integer.valueOf(System.identityHashCode(this)));
        com.google.android.gms.common.api.a.AbstractC0120a abstractC0120a = this.c;
        Context context = this.a;
        Looper looper = this.b.getLooper();
        com.google.android.gms.common.internal.d dVar = this.e;
        this.f = abstractC0120a.c(context, looper, dVar, dVar.h(), this, this);
        this.f952g = c2Var;
        Set set = this.d;
        if (set == null || set.isEmpty()) {
            this.b.post(new a2(this));
        } else {
            this.f.b();
        }
    }

    public final void t1() {
        j.d.a.c.g.g gVar = this.f;
        if (gVar != null) {
            gVar.s();
        }
    }
}
