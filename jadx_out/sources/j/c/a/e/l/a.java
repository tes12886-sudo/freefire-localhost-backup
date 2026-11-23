package j.c.a.e.l;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static void a(Context context) {
        ((AlarmManager) context.getSystemService("alarm")).cancel(d(context, 1));
    }

    public static void b(Context context) {
        ((AlarmManager) context.getSystemService("alarm")).cancel(d(context, 0));
    }

    public static void c(Context context) {
        ((AlarmManager) context.getSystemService("alarm")).cancel(d(context, 2));
    }

    private static PendingIntent d(Context context, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_ALARM_TYPE", i2);
        Intent intent = new Intent("com.garena.android.gpns.ALARM_ACTION" + d.a(context));
        b.a("AppId: com.garena.android.gpns.ALARM_ACTION" + d.a(context));
        intent.putExtra("DATA_BUNDLE", bundle);
        return PendingIntent.getBroadcast(context, i2, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
    }

    public static void e(Context context) {
        long j2 = 300000;
        ((AlarmManager) context.getSystemService("alarm")).setInexactRepeating(2, SystemClock.elapsedRealtime() + j2, j2, d(context, 1));
    }

    public static void f(Context context) {
        long j2 = 60000;
        ((AlarmManager) context.getSystemService("alarm")).setInexactRepeating(3, SystemClock.elapsedRealtime() + j2, j2, d(context, 0));
    }

    public static void g(Context context, int i2) {
        ((AlarmManager) context.getSystemService("alarm")).set(2, SystemClock.elapsedRealtime() + ((long) i2), d(context, 2));
    }
}
