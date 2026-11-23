package j.d.a.e.a.a.i;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes.dex */
public class j implements e.a {
    CharSequence a;
    int b;
    long e;
    PendingIntent f;
    long c = -1;
    long d = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Notification f2021g = new Notification();

    @Override // j.d.a.e.a.a.i.e.a
    public void a(long j2) {
        this.c = j2;
    }

    @Override // j.d.a.e.a.a.i.e.a
    public void b(long j2) {
        this.d = j2;
    }

    @Override // j.d.a.e.a.a.i.e.a
    public void c(PendingIntent pendingIntent) {
        this.f = pendingIntent;
    }

    @Override // j.d.a.e.a.a.i.e.a
    public Notification d(Context context) {
        Notification notification = this.f2021g;
        notification.icon = this.b;
        int i2 = notification.flags | 2;
        notification.flags = i2;
        if (Build.VERSION.SDK_INT > 10) {
            notification.flags = i2 | 8;
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), j.d.a.e.a.a.e.i(context, "status_bar_ongoing_event_progress_bar"));
        remoteViews.setTextViewText(j.d.a.e.a.a.e.h(context, "title"), this.a);
        remoteViews.setViewVisibility(j.d.a.e.a.a.e.h(context, "description"), 0);
        remoteViews.setTextViewText(j.d.a.e.a.a.e.h(context, "description"), j.d.a.e.a.a.e.e(this.d, this.c));
        remoteViews.setViewVisibility(j.d.a.e.a.a.e.h(context, "progress_bar_frame"), 0);
        int iH = j.d.a.e.a.a.e.h(context, "progress_bar");
        long j2 = this.c;
        remoteViews.setProgressBar(iH, (int) (j2 >> 8), (int) (this.d >> 8), j2 <= 0);
        remoteViews.setViewVisibility(j.d.a.e.a.a.e.h(context, "time_remaining"), 0);
        remoteViews.setTextViewText(j.d.a.e.a.a.e.h(context, "time_remaining"), context.getString(j.d.a.e.a.a.e.l(context, "time_remaining_notification"), j.d.a.e.a.a.e.m(this.e)));
        remoteViews.setTextViewText(j.d.a.e.a.a.e.h(context, "progress_text"), j.d.a.e.a.a.e.d(this.d, this.c));
        remoteViews.setImageViewResource(j.d.a.e.a.a.e.h(context, "appIcon"), this.b);
        notification.contentView = remoteViews;
        notification.contentIntent = this.f;
        return notification;
    }

    @Override // j.d.a.e.a.a.i.e.a
    public void e(CharSequence charSequence) {
    }

    @Override // j.d.a.e.a.a.i.e.a
    public void f(long j2) {
        this.e = j2;
    }

    @Override // j.d.a.e.a.a.i.e.a
    public void setIcon(int i2) {
        this.b = i2;
    }

    @Override // j.d.a.e.a.a.i.e.a
    public void setTitle(CharSequence charSequence) {
        this.a = charSequence;
    }
}
