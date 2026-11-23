package com.google.android.play.core.assetpacks;

import android.R;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class ExtractionForegroundService extends Service {
    private final j.d.a.d.a.b.f a = new j.d.a.d.a.b.f("ExtractionForegroundService");
    Context b;
    h2 c;
    NotificationManager d;

    private final synchronized void a(Intent intent) {
        String stringExtra = intent.getStringExtra("notification_title");
        String stringExtra2 = intent.getStringExtra("notification_subtext");
        long longExtra = intent.getLongExtra("notification_timeout", 1L);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("notification_on_click_intent");
        int i2 = Build.VERSION.SDK_INT;
        Notification.Builder timeoutAfter = i2 >= 26 ? new Notification.Builder(this.b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(longExtra) : new Notification.Builder(this.b).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false).setContentTitle(stringExtra).setSubText(stringExtra2);
        if (i2 >= 21) {
            timeoutAfter.setColor(intent.getIntExtra("notification_color", 0)).setVisibility(-1);
        }
        Notification notificationBuild = timeoutAfter.build();
        this.a.d("Starting foreground installation service.", new Object[0]);
        this.c.a(true);
        if (i2 >= 26) {
            c(intent.getStringExtra("notification_channel_name"));
        }
        startForeground(-1883842196, notificationBuild);
    }

    private final synchronized void b() {
        this.a.d("Stopping service.", new Object[0]);
        this.c.a(false);
        stopForeground(true);
        stopSelf();
    }

    @TargetApi(26)
    private final synchronized void c(String str) {
        this.d.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        j1.h(getApplicationContext()).a(this);
        this.d = (NotificationManager) this.b.getSystemService("notification");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        int intExtra = intent.getIntExtra("action_type", 0);
        if (intExtra == 1) {
            a(intent);
        } else if (intExtra == 2) {
            b();
        } else {
            this.a.b("Unknown action type received: %d", Integer.valueOf(intExtra));
        }
        return 2;
    }
}
