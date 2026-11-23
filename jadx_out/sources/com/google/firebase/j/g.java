package com.google.firebase.j;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
class g {
    private static g b;
    private static final SimpleDateFormat c = new SimpleDateFormat("dd/MM/yyyy z");
    private final SharedPreferences a;

    private g(Context context) {
        this.a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    static synchronized g a(Context context) {
        if (b == null) {
            b = new g(context);
        }
        return b;
    }

    static boolean b(long j2, long j3) {
        Date date = new Date(j2);
        Date date2 = new Date(j3);
        SimpleDateFormat simpleDateFormat = c;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    synchronized boolean c(long j2) {
        return d("fire-global", j2);
    }

    synchronized boolean d(String str, long j2) {
        if (!this.a.contains(str)) {
            this.a.edit().putLong(str, j2).apply();
            return true;
        }
        if (!b(this.a.getLong(str, -1L), j2)) {
            return false;
        }
        this.a.edit().putLong(str, j2).apply();
        return true;
    }
}
