package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class g4 {
    private final String a;
    private boolean b;
    private String c;
    final /* synthetic */ h4 d;

    public g4(h4 h4Var, String str, String str2) {
        this.d = h4Var;
        com.google.android.gms.common.internal.q.g(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.p().getString(this.a, null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.d.p().edit();
        editorEdit.putString(this.a, str);
        editorEdit.apply();
        this.c = str;
    }
}
