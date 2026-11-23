package j.d.a.e.a.a.i;

import android.R;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Messenger;

/* JADX INFO: loaded from: classes.dex */
public class e implements j.d.a.e.a.a.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f2005m = -908767821;
    private final Context b;
    private final NotificationManager c;
    private String d;
    private j.d.a.e.a.a.f e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Notification f2006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Notification f2007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f2008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f2009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PendingIntent f2010k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private j.d.a.e.a.a.b f2011l;
    private int a = -1;
    final a f = c.a();

    public interface a {
        void a(long j2);

        void b(long j2);

        void c(PendingIntent pendingIntent);

        Notification d(Context context);

        void e(CharSequence charSequence);

        void f(long j2);

        void setIcon(int i2);

        void setTitle(CharSequence charSequence);
    }

    e(Context context, CharSequence charSequence) {
        this.b = context;
        this.f2008i = charSequence;
        this.c = (NotificationManager) context.getSystemService("notification");
        Notification notification = new Notification();
        this.f2006g = notification;
        this.f2007h = notification;
    }

    public void a() {
        j.d.a.e.a.a.f fVar = this.e;
        if (fVar != null) {
            fVar.onDownloadStateChanged(this.a);
        }
    }

    public void b(PendingIntent pendingIntent) {
        this.f2010k = pendingIntent;
    }

    public void c(Messenger messenger) {
        j.d.a.e.a.a.f fVarA = j.d.a.e.a.a.c.a(messenger);
        this.e = fVarA;
        j.d.a.e.a.a.b bVar = this.f2011l;
        if (bVar != null) {
            fVarA.onDownloadProgress(bVar);
        }
        int i2 = this.a;
        if (i2 != -1) {
            this.e.onDownloadStateChanged(i2);
        }
    }

    @Override // j.d.a.e.a.a.f
    public void onDownloadProgress(j.d.a.e.a.a.b bVar) {
        Notification notificationD;
        this.f2011l = bVar;
        j.d.a.e.a.a.f fVar = this.e;
        if (fVar != null) {
            fVar.onDownloadProgress(bVar);
        }
        if (bVar.a <= 0) {
            notificationD = new Notification.Builder(this.b).setSmallIcon(R.drawable.stat_sys_download).setTicker(this.d).setContentTitle(this.f2008i).setContentText(this.f2009j).setContentIntent(this.f2010k).build();
            this.f2006g = notificationD;
        } else {
            this.f.b(bVar.b);
            this.f.a(bVar.a);
            this.f.setIcon(R.drawable.stat_sys_download);
            this.f.c(this.f2010k);
            this.f.e(((Object) this.f2008i) + ": " + this.f2009j);
            this.f.setTitle(this.f2008i);
            this.f.f(bVar.c);
            notificationD = this.f.d(this.b);
        }
        this.f2007h = notificationD;
        this.c.notify(f2005m, this.f2007h);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    @Override // j.d.a.e.a.a.f
    public void onDownloadStateChanged(int i2) {
        int iL;
        Notification notificationBuild;
        int i3;
        j.d.a.e.a.a.f fVar = this.e;
        if (fVar != null) {
            fVar.onDownloadStateChanged(i2);
        }
        if (i2 != this.a) {
            this.a = i2;
            boolean z = true;
            if (i2 == 1 || this.f2010k == null) {
                return;
            }
            int i4 = R.drawable.stat_sys_download_done;
            if (i2 != 0) {
                if (i2 == 7) {
                    iL = j.d.a.e.a.a.e.f(this.b, i2);
                    z = false;
                } else {
                    if (i2 != 2 && i2 != 3) {
                        if (i2 == 4) {
                            i4 = R.drawable.stat_sys_download;
                        } else if (i2 != 5) {
                            switch (i2) {
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                    iL = j.d.a.e.a.a.e.f(this.b, i2);
                                    break;
                                default:
                                    iL = j.d.a.e.a.a.e.f(this.b, i2);
                                    break;
                            }
                            i4 = R.drawable.stat_sys_warning;
                        } else {
                            iL = j.d.a.e.a.a.e.f(this.b, i2);
                            z = false;
                        }
                    }
                    iL = j.d.a.e.a.a.e.f(this.b, i2);
                }
                this.f2009j = this.b.getString(iL);
                this.d = this.f2008i.toString();
                notificationBuild = new Notification.Builder(this.b).setTicker(((Object) this.f2008i) + ": " + this.f2009j).setSmallIcon(i4).setContentTitle(this.d).setContentText(this.f2009j).setContentIntent(this.f2010k).build();
                this.f2007h = notificationBuild;
                if (z) {
                    i3 = notificationBuild.flags | 2;
                } else {
                    int i5 = notificationBuild.flags & (-3);
                    notificationBuild.flags = i5;
                    i3 = i5 | 16;
                }
                notificationBuild.flags = i3;
                this.c.notify(f2005m, notificationBuild);
            }
            iL = j.d.a.e.a.a.e.l(this.b, "state_unknown");
            z = false;
            i4 = R.drawable.stat_sys_warning;
            this.f2009j = this.b.getString(iL);
            this.d = this.f2008i.toString();
            notificationBuild = new Notification.Builder(this.b).setTicker(((Object) this.f2008i) + ": " + this.f2009j).setSmallIcon(i4).setContentTitle(this.d).setContentText(this.f2009j).setContentIntent(this.f2010k).build();
            this.f2007h = notificationBuild;
            if (z) {
                i3 = notificationBuild.flags | 2;
            } else {
                int i6 = notificationBuild.flags & (-3);
                notificationBuild.flags = i6;
                i3 = i6 | 16;
            }
            notificationBuild.flags = i3;
            this.c.notify(f2005m, notificationBuild);
        }
    }

    @Override // j.d.a.e.a.a.f
    public void onServiceConnected(Messenger messenger) {
    }
}
