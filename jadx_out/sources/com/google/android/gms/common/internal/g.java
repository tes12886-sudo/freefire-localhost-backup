package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class g<T extends IInterface> extends c<T> implements com.google.android.gms.common.api.a.f, k0 {
    private final d D;
    private final Set E;
    private final Account F;

    @Deprecated
    protected g(Context context, Looper looper, int i2, d dVar, com.google.android.gms.common.api.e.b bVar, com.google.android.gms.common.api.e.c cVar) {
        this(context, looper, i2, dVar, (com.google.android.gms.common.api.internal.f) bVar, (com.google.android.gms.common.api.internal.l) cVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected g(Context context, Looper looper, int i2, d dVar, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.l lVar) {
        h hVarB = h.b(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        q.k(fVar);
        q.k(lVar);
        this(context, looper, hVarB, googleApiAvailability, i2, dVar, fVar, lVar);
    }

    protected g(Context context, Looper looper, h hVar, GoogleApiAvailability googleApiAvailability, int i2, d dVar, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.l lVar) {
        super(context, looper, hVar, googleApiAvailability, i2, fVar == null ? null : new i0(fVar), lVar == null ? null : new j0(lVar), dVar.j());
        this.D = dVar;
        this.F = dVar.a();
        Set<Scope> setD = dVar.d();
        q0(setD);
        this.E = setD;
    }

    private final Set q0(Set set) {
        p0(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Executor B() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Set<Scope> H() {
        return this.E;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> e() {
        return u() ? this.E : Collections.emptySet();
    }

    protected final d o0() {
        return this.D;
    }

    protected Set<Scope> p0(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.internal.c
    public final Account z() {
        return this.F;
    }
}
