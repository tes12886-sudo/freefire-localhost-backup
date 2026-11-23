package com.facebook;

import android.content.SharedPreferences;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private final SharedPreferences a;

    /* JADX WARN: Illegal instructions before constructor call */
    public g() {
        SharedPreferences sharedPreferences = r.f().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        l.y.c.i.d(sharedPreferences, "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)");
        this(sharedPreferences);
    }

    public g(SharedPreferences sharedPreferences) {
        l.y.c.i.e(sharedPreferences, "sharedPreferences");
        this.a = sharedPreferences;
    }

    public final void a() {
        this.a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
    }

    public final void b(f fVar) {
        l.y.c.i.e(fVar, "authenticationToken");
        try {
            this.a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", fVar.c().toString()).apply();
        } catch (JSONException unused) {
        }
    }
}
