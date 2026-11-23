package com.beetalk.sdk.t;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j extends k implements Serializable {
    private SharedPreferences a;
    private String b;

    public j(Context context) {
        this(context, null);
    }

    public j(Context context, String str) {
        this.b = str;
        if (TextUtils.isEmpty(str)) {
            this.b = "com.garena.msdk.token_cache";
        }
        Context applicationContext = context.getApplicationContext();
        this.a = (applicationContext != null ? applicationContext : context).getSharedPreferences(this.b, 0);
    }

    private String q(Object obj) {
        return obj instanceof String ? (String) obj : "";
    }

    @Override // com.beetalk.sdk.t.k
    public Map<String, String> i() {
        HashMap map = new HashMap();
        for (String str : this.a.getAll().keySet()) {
            map.put(str, this.a.getString(str, ""));
        }
        return map;
    }

    @Override // com.beetalk.sdk.t.k
    public void m(String str) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    @Override // com.beetalk.sdk.t.k
    public void o(Map<String, String> map) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        for (String str : map.keySet()) {
            editorEdit.putString(str, q(map.get(str)));
        }
        editorEdit.apply();
    }

    public void p() {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.clear();
        editorEdit.apply();
    }
}
