package com.beetalk.sdk.t;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    protected SharedPreferences a;

    public b() {
        g();
    }

    protected abstract Context a();

    public long b(String str, long j2) {
        SharedPreferences sharedPreferences = this.a;
        return sharedPreferences == null ? j2 : sharedPreferences.getLong(str, j2);
    }

    public String c(String str, String str2) {
        SharedPreferences sharedPreferences = this.a;
        return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
    }

    protected String d() {
        return "";
    }

    public void e(String str, long j2) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong(str, j2);
        editorEdit.apply();
    }

    public void f(String str, String str2) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public void g() {
        Context contextA;
        if (this.a != null || (contextA = a()) == null) {
            return;
        }
        this.a = contextA.getSharedPreferences(d(), 0);
    }
}
