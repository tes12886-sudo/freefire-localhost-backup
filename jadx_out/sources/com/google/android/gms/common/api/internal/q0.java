package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Iterator;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements y0 {

    @NotOnlyInitialized
    private final b1 a;

    public q0(b1 b1Var) {
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
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void d() {
        Iterator it = this.a.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.a.f) it.next()).s();
        }
        this.a.f949n.p = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final void e() {
        this.a.n();
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final d g(d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
