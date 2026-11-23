package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private z a;
    private final SharedPreferences b;
    private final a c;

    public static final class a {
        public final z a() {
            return new z(r.f(), null, 2, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c() {
        SharedPreferences sharedPreferences = r.f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        l.y.c.i.d(sharedPreferences, "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)");
        this(sharedPreferences, new a());
    }

    public c(SharedPreferences sharedPreferences, a aVar) {
        l.y.c.i.e(sharedPreferences, "sharedPreferences");
        l.y.c.i.e(aVar, "tokenCachingStrategyFactory");
        this.b = sharedPreferences;
        this.c = aVar;
    }

    private final com.facebook.a b() {
        String string = this.b.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return com.facebook.a.p.b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final com.facebook.a c() {
        Bundle bundleC = d().c();
        if (bundleC == null || !z.d.g(bundleC)) {
            return null;
        }
        return com.facebook.a.p.c(bundleC);
    }

    private final z d() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            if (this.a == null) {
                synchronized (this) {
                    if (this.a == null) {
                        this.a = this.c.a();
                    }
                    l.s sVar = l.s.a;
                }
            }
            z zVar = this.a;
            if (zVar != null) {
                return zVar;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final boolean e() {
        return this.b.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private final boolean h() {
        return r.y();
    }

    public final void a() {
        this.b.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (h()) {
            d().a();
        }
    }

    public final com.facebook.a f() {
        if (e()) {
            return b();
        }
        if (!h()) {
            return null;
        }
        com.facebook.a aVarC = c();
        if (aVarC == null) {
            return aVarC;
        }
        g(aVarC);
        d().a();
        return aVarC;
    }

    public final void g(com.facebook.a aVar) {
        l.y.c.i.e(aVar, "accessToken");
        try {
            this.b.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", aVar.s().toString()).apply();
        } catch (JSONException unused) {
        }
    }
}
