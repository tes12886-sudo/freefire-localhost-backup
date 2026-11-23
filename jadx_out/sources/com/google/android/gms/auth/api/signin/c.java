package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public class c extends GoogleApi<GoogleSignInOptions> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f912k = a.a;

    static final enum a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) e.clone();
        }
    }

    c(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, j.d.a.c.b.a.a.e, googleSignInOptions, new com.google.android.gms.common.api.internal.a());
    }

    private final synchronized int r() {
        int i2;
        if (f912k == a.a) {
            Context contextH = h();
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(contextH, 12451000);
            if (iIsGooglePlayServicesAvailable == 0) {
                i2 = a.d;
            } else {
                i2 = (googleApiAvailability.getErrorResolutionIntent(contextH, iIsGooglePlayServicesAvailable, null) != null || DynamiteModule.a(contextH, "com.google.android.gms.auth.api.fallback") == 0) ? a.b : a.c;
            }
            f912k = i2;
        }
        return f912k;
    }

    public Intent p() {
        Context contextH = h();
        int i2 = j.a[r() - 1];
        if (i2 != 1) {
            return i2 != 2 ? com.google.android.gms.auth.api.signin.internal.j.g(contextH, g()) : com.google.android.gms.auth.api.signin.internal.j.b(contextH, g());
        }
        return com.google.android.gms.auth.api.signin.internal.j.e(contextH, g());
    }

    public Task<Void> q() {
        return p.b(com.google.android.gms.auth.api.signin.internal.j.c(c(), h(), r() == a.c));
    }
}
