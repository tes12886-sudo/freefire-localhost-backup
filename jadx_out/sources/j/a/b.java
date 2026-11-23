package j.a;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends IntentService {
    public b(String str) {
        super(str);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager.getNotificationChannel(j.b.a.a.e) == null) {
                NotificationChannel notificationChannel = new NotificationChannel(j.b.a.a.e, "BBAppLogger", 1);
                notificationChannel.setDescription("Internal Logging");
                notificationChannel.enableLights(false);
                notificationChannel.enableVibration(false);
                notificationChannel.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            startForeground(j.b.a.a.f, new Notification.Builder(this, j.b.a.a.e).setContentTitle("Logging").setContentText("We are doing the crazy stuff here").build());
        }
    }
}
