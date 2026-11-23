package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class e4 {
    final String a;
    private final String b;
    private final String c;
    private final long d;
    final /* synthetic */ h4 e;

    /* synthetic */ e4(h4 h4Var, String str, long j2, a4 a4Var) {
        this.e = h4Var;
        com.google.android.gms.common.internal.q.g("health_monitor");
        com.google.android.gms.common.internal.q.a(j2 > 0);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = j2;
    }

    private final void c() {
        this.e.h();
        long jA = this.e.a.e().a();
        SharedPreferences.Editor editorEdit = this.e.p().edit();
        editorEdit.remove(this.b);
        editorEdit.remove(this.c);
        editorEdit.putLong(this.a, jA);
        editorEdit.apply();
    }

    private final long d() {
        return this.e.p().getLong(this.a, 0L);
    }

    public final void a(String str, long j2) {
        this.e.h();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        long j3 = this.e.p().getLong(this.b, 0L);
        if (j3 <= 0) {
            SharedPreferences.Editor editorEdit = this.e.p().edit();
            editorEdit.putString(this.c, str);
            editorEdit.putLong(this.b, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = this.e.a.G().i0().nextLong();
        long j4 = j3 + 1;
        long j5 = Long.MAX_VALUE / j4;
        SharedPreferences.Editor editorEdit2 = this.e.p().edit();
        if ((jNextLong & Long.MAX_VALUE) < j5) {
            editorEdit2.putString(this.c, str);
        }
        editorEdit2.putLong(this.b, j4);
        editorEdit2.apply();
    }

    public final Pair<String, Long> b() {
        long jAbs;
        this.e.h();
        this.e.h();
        long jD = d();
        if (jD == 0) {
            c();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jD - this.e.a.e().a());
        }
        long j2 = this.d;
        if (jAbs < j2) {
            return null;
        }
        if (jAbs > j2 + j2) {
            c();
            return null;
        }
        String string = this.e.p().getString(this.c, null);
        long j3 = this.e.p().getLong(this.b, 0L);
        c();
        return (string == null || j3 <= 0) ? h4.x : new Pair<>(string, Long.valueOf(j3));
    }
}
