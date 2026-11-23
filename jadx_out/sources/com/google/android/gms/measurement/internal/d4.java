package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class d4 {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    final /* synthetic */ h4 e;

    public d4(h4 h4Var, String str, long j2) {
        this.e = h4Var;
        com.google.android.gms.common.internal.q.g(str);
        this.a = str;
        this.b = j2;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.p().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j2) {
        SharedPreferences.Editor editorEdit = this.e.p().edit();
        editorEdit.putLong(this.a, j2);
        editorEdit.apply();
        this.d = j2;
    }
}
