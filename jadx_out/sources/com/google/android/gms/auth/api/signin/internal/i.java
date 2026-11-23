package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i extends com.google.android.gms.common.internal.g<u> {
    private final GoogleSignInOptions G;

    public i(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.e.b bVar, com.google.android.gms.common.api.e.c cVar) {
        super(context, looper, 91, dVar, bVar, cVar);
        googleSignInOptions = googleSignInOptions == null ? new GoogleSignInOptions.a().a() : googleSignInOptions;
        if (!dVar.d().isEmpty()) {
            GoogleSignInOptions.a aVar = new GoogleSignInOptions.a(googleSignInOptions);
            Iterator<Scope> it = dVar.d().iterator();
            while (it.hasNext()) {
                aVar.f(it.next(), new Scope[0]);
            }
            googleSignInOptions = aVar.a();
        }
        this.G = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String J() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String K() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final boolean d() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int k() {
        return 12451000;
    }

    public final GoogleSignInOptions r0() {
        return this.G;
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final Intent t() {
        return j.b(D(), this.G);
    }

    @Override // com.google.android.gms.common.internal.c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof u ? (u) iInterfaceQueryLocalInterface : new v(iBinder);
    }
}
