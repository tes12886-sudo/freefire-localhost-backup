package com.google.android.vending.licensing;

import android.content.SharedPreferences;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class k {
    private final SharedPreferences a;
    private final i b;
    private SharedPreferences.Editor c = null;

    public k(SharedPreferences sharedPreferences, i iVar) {
        this.a = sharedPreferences;
        this.b = iVar;
    }

    public void a() {
        SharedPreferences.Editor editor = this.c;
        if (editor != null) {
            editor.commit();
            this.c = null;
        }
    }

    public String b(String str, String str2) {
        String string = this.a.getString(str, null);
        if (string == null) {
            return str2;
        }
        try {
            return this.b.b(string, str);
        } catch (m unused) {
            Log.w("PreferenceObfuscator", "Validation error while reading preference: " + str);
            return str2;
        }
    }

    public void c(String str, String str2) {
        if (this.c == null) {
            this.c = this.a.edit();
        }
        this.c.putString(str, this.b.a(str2, str));
    }
}
