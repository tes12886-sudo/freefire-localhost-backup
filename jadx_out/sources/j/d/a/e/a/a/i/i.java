package j.d.a.e.a.a.i;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class i implements e.a {
    CharSequence a;
    CharSequence b;
    int c;
    long d = -1;
    long e = -1;
    long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    PendingIntent f2020g;

    @Override // j.d.a.e.a.a.i.e.a
    public void a(long j2) {
        this.d = j2;
    }

    @Override // j.d.a.e.a.a.i.e.a
    public void b(long j2) {
        this.e = j2;
    }

    @Override // j.d.a.e.a.a.i.e.a
    public void c(PendingIntent pendingIntent) {
        this.f2020g = pendingIntent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    @Override // j.d.a.e.a.a.i.e.a
    public Notification d(Context context) {
        Notification.Builder builder = new Notification.Builder(context);
        builder.setContentTitle(this.a);
        long j2 = this.d;
        if (j2 > 0) {
            long j3 = this.e;
            if (-1 != j3) {
                builder.setProgress((int) (j2 >> 8), (int) (j3 >> 8), false);
            } else {
                builder.setProgress(0, 0, true);
            }
        } else {
            builder.setProgress(0, 0, true);
        }
        builder.setContentText(j.d.a.e.a.a.e.e(this.e, this.d));
        builder.setContentInfo(context.getString(j.d.a.e.a.a.e.l(context, "time_remaining_notification"), j.d.a.e.a.a.e.m(this.f)));
        int i2 = this.c;
        if (i2 == 0) {
            i2 = R.drawable.stat_sys_download;
        }
        builder.setSmallIcon(i2);
        builder.setOngoing(true);
        builder.setTicker(this.b);
        builder.setContentIntent(this.f2020g);
        builder.setOnlyAlertOnce(true);
        return builder.getNotification();
    }

    @Override // j.d.a.e.a.a.i.e.a
    public void e(CharSequence charSequence) {
        this.b = charSequence;
    }

    @Override // j.d.a.e.a.a.i.e.a
    public void f(long j2) {
        this.f = j2;
    }

    @Override // j.d.a.e.a.a.i.e.a
    public void setIcon(int i2) {
        this.c = i2;
    }

    @Override // j.d.a.e.a.a.i.e.a
    public void setTitle(CharSequence charSequence) {
        this.a = charSequence;
    }
}
