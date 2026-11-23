package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class b4 {
    private final String a;
    private final boolean b;
    private boolean c;
    private boolean d;
    final /* synthetic */ h4 e;

    public b4(h4 h4Var, String str, boolean z) {
        this.e = h4Var;
        com.google.android.gms.common.internal.q.g(str);
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.p().getBoolean(this.a, this.b);
        }
        return this.d;
    }

    public final void b(boolean z) {
        SharedPreferences.Editor editorEdit = this.e.p().edit();
        editorEdit.putBoolean(this.a, z);
        editorEdit.apply();
        this.d = z;
    }
}
