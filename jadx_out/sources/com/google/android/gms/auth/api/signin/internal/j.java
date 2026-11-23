package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static com.google.android.gms.common.l.a a = new com.google.android.gms.common.l.a("GoogleSignInCommon", new String[0]);

    public static com.google.android.gms.auth.api.signin.d a(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!intent.hasExtra("googleSignInStatus") && !intent.hasExtra("googleSignInAccount")) {
            return null;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        if (googleSignInAccount != null) {
            status = Status.f;
        }
        return new com.google.android.gms.auth.api.signin.d(googleSignInAccount, status);
    }

    public static Intent b(Context context, GoogleSignInOptions googleSignInOptions) {
        a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static com.google.android.gms.common.api.f<Status> c(com.google.android.gms.common.api.e eVar, Context context, boolean z) {
        a.a("Signing out", new Object[0]);
        d(context);
        return z ? com.google.android.gms.common.api.g.b(Status.f, eVar) : eVar.i(new k(eVar));
    }

    private static void d(Context context) {
        p.c(context).a();
        Iterator<com.google.android.gms.common.api.e> it = com.google.android.gms.common.api.e.j().iterator();
        while (it.hasNext()) {
            it.next().n();
        }
        com.google.android.gms.common.api.internal.g.a();
    }

    public static Intent e(Context context, GoogleSignInOptions googleSignInOptions) {
        a.a("getFallbackSignInIntent()", new Object[0]);
        Intent intentB = b(context, googleSignInOptions);
        intentB.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return intentB;
    }

    public static com.google.android.gms.common.api.f<Status> f(com.google.android.gms.common.api.e eVar, Context context, boolean z) {
        a.a("Revoking access", new Object[0]);
        String strE = c.b(context).e();
        d(context);
        return z ? f.a(strE) : eVar.i(new m(eVar));
    }

    public static Intent g(Context context, GoogleSignInOptions googleSignInOptions) {
        a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent intentB = b(context, googleSignInOptions);
        intentB.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentB;
    }
}
