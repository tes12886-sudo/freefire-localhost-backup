package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationTokenManager {
    private static AuthenticationTokenManager d;
    public static final a e = new a(null);
    private f a;
    private final h.q.a.a b;
    private final g c;

    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            l.y.c.i.e(context, "context");
            l.y.c.i.e(intent, "intent");
        }
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final AuthenticationTokenManager a() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.d;
            if (authenticationTokenManager2 != null) {
                return authenticationTokenManager2;
            }
            synchronized (this) {
                authenticationTokenManager = AuthenticationTokenManager.d;
                if (authenticationTokenManager == null) {
                    h.q.a.a aVarB = h.q.a.a.b(r.f());
                    l.y.c.i.d(aVarB, "LocalBroadcastManager.ge…tance(applicationContext)");
                    AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(aVarB, new g());
                    AuthenticationTokenManager.d = authenticationTokenManager3;
                    authenticationTokenManager = authenticationTokenManager3;
                }
            }
            return authenticationTokenManager;
        }
    }

    public AuthenticationTokenManager(h.q.a.a aVar, g gVar) {
        l.y.c.i.e(aVar, "localBroadcastManager");
        l.y.c.i.e(gVar, "authenticationTokenCache");
        this.b = aVar;
        this.c = gVar;
    }

    private final void d(f fVar, f fVar2) {
        Intent intent = new Intent(r.f(), (Class<?>) CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", fVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", fVar2);
        this.b.d(intent);
    }

    private final void f(f fVar, boolean z) {
        f fVarC = c();
        this.a = fVar;
        if (z) {
            g gVar = this.c;
            if (fVar != null) {
                gVar.b(fVar);
            } else {
                gVar.a();
                com.facebook.internal.h0.h(r.f());
            }
        }
        if (com.facebook.internal.h0.c(fVarC, fVar)) {
            return;
        }
        d(fVarC, fVar);
    }

    public final f c() {
        return this.a;
    }

    public final void e(f fVar) {
        f(fVar, true);
    }
}
