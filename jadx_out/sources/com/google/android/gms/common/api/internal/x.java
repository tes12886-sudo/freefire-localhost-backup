package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

/* JADX INFO: loaded from: classes.dex */
public final class x extends w2 {
    private final h.f.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g f991g;

    x(LifecycleFragment lifecycleFragment, g gVar, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.f = new h.f.b();
        this.f991g = gVar;
        this.a.b("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, g gVar, b bVar) {
        LifecycleFragment lifecycleFragmentC = LifecycleCallback.c(activity);
        x xVar = (x) lifecycleFragmentC.e("ConnectionlessLifecycleHelper", x.class);
        if (xVar == null) {
            xVar = new x(lifecycleFragmentC, gVar, GoogleApiAvailability.getInstance());
        }
        com.google.android.gms.common.internal.q.l(bVar, "ApiKey cannot be null");
        xVar.f.add(bVar);
        gVar.d(xVar);
    }

    private final void v() {
        if (this.f.isEmpty()) {
            return;
        }
        this.f991g.d(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.w2, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.w2, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f991g.e(this);
    }

    @Override // com.google.android.gms.common.api.internal.w2
    protected final void m(ConnectionResult connectionResult, int i2) {
        this.f991g.J(connectionResult, i2);
    }

    @Override // com.google.android.gms.common.api.internal.w2
    protected final void n() {
        this.f991g.b();
    }

    final h.f.b t() {
        return this.f;
    }
}
