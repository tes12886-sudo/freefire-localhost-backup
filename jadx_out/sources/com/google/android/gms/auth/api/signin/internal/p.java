package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    private static p c;
    private c a;
    private GoogleSignInAccount b;

    private p(Context context) {
        c cVarB = c.b(context);
        this.a = cVarB;
        this.b = cVarB.c();
        this.a.d();
    }

    public static synchronized p c(Context context) {
        return d(context.getApplicationContext());
    }

    private static synchronized p d(Context context) {
        if (c == null) {
            c = new p(context);
        }
        return c;
    }

    public final synchronized void a() {
        this.a.a();
        this.b = null;
    }

    public final synchronized void b(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.a.f(googleSignInAccount, googleSignInOptions);
        this.b = googleSignInAccount;
    }

    public final synchronized GoogleSignInAccount e() {
        return this.b;
    }
}
