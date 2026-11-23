package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class w extends r {
    private final Context a;

    public w(Context context) {
        this.a = context;
    }

    private final void m() {
        if (com.google.android.gms.common.g.j(this.a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    @Override // com.google.android.gms.auth.api.signin.internal.q
    public final void f() {
        m();
        c cVarB = c.b(this.a);
        GoogleSignInAccount googleSignInAccountC = cVarB.c();
        GoogleSignInOptions googleSignInOptionsD = GoogleSignInOptions.f900k;
        if (googleSignInAccountC != null) {
            googleSignInOptionsD = cVarB.d();
        }
        com.google.android.gms.common.api.e.a aVar = new com.google.android.gms.common.api.e.a(this.a);
        aVar.b(j.d.a.c.b.a.a.e, googleSignInOptionsD);
        com.google.android.gms.common.api.e eVarE = aVar.e();
        try {
            if (eVarE.d().n()) {
                if (googleSignInAccountC != null) {
                    j.d.a.c.b.a.a.f.a(eVarE);
                } else {
                    eVarE.e();
                }
            }
        } finally {
            eVarE.g();
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.q
    public final void g() {
        m();
        p.c(this.a).a();
    }
}
