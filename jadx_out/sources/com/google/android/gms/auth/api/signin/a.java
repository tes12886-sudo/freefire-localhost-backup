package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.internal.p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static c a(Context context, GoogleSignInOptions googleSignInOptions) {
        q.k(googleSignInOptions);
        return new c(context, googleSignInOptions);
    }

    public static GoogleSignInAccount b(Context context) {
        return p.c(context).e();
    }

    public static Task<GoogleSignInAccount> c(Intent intent) {
        d dVarA = com.google.android.gms.auth.api.signin.internal.j.a(intent);
        if (dVarA == null) {
            return com.google.android.gms.tasks.d.d(com.google.android.gms.common.internal.b.a(Status.f921h));
        }
        return (!dVarA.c().n() || dVarA.a() == null) ? com.google.android.gms.tasks.d.d(com.google.android.gms.common.internal.b.a(dVarA.c())) : com.google.android.gms.tasks.d.e(dVarA.a());
    }
}
