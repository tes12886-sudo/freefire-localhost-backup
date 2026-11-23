package com.facebook;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    private final SharedPreferences a;

    public c0() {
        SharedPreferences sharedPreferences = r.f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        l.y.c.i.d(sharedPreferences, "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    public final void a() {
        this.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    public final b0 b() {
        String string = this.a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new b0(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(b0 b0Var) {
        l.y.c.i.e(b0Var, "profile");
        JSONObject jSONObjectD = b0Var.d();
        if (jSONObjectD != null) {
            this.a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObjectD.toString()).apply();
        }
    }
}
