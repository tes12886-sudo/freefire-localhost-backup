package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class j implements h {
    private final Context a;
    private final Notification.Builder b;
    private final i.e c;
    private RemoteViews d;
    private RemoteViews e;
    private final List<Bundle> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RemoteViews f309i;

    j(i.e eVar) {
        int i2;
        Icon icon;
        List<String> listE;
        Bundle bundle;
        String str;
        int i3 = Build.VERSION.SDK_INT;
        this.f = new ArrayList();
        this.f307g = new Bundle();
        this.c = eVar;
        this.a = eVar.a;
        Context context = eVar.a;
        this.b = i3 >= 26 ? new Notification.Builder(context, eVar.K) : new Notification.Builder(context);
        Notification notification = eVar.T;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f300i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.e).setContentText(eVar.f).setContentInfo(eVar.f302k).setContentIntent(eVar.f298g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f299h, (notification.flags & 128) != 0).setLargeIcon(eVar.f301j).setNumber(eVar.f303l).setProgress(eVar.t, eVar.u, eVar.v);
        if (i3 < 21) {
            this.b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i3 >= 16) {
            this.b.setSubText(eVar.q).setUsesChronometer(eVar.f306o).setPriority(eVar.f304m);
            Iterator<i.a> it = eVar.b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle2 = eVar.D;
            if (bundle2 != null) {
                this.f307g.putAll(bundle2);
            }
            if (i3 < 20) {
                if (eVar.z) {
                    this.f307g.putBoolean("android.support.localOnly", true);
                }
                String str2 = eVar.w;
                if (str2 != null) {
                    this.f307g.putString("android.support.groupKey", str2);
                    if (eVar.x) {
                        bundle = this.f307g;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f307g;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = eVar.y;
                if (str3 != null) {
                    this.f307g.putString("android.support.sortKey", str3);
                }
            }
            this.d = eVar.H;
            this.e = eVar.I;
        }
        if (i3 >= 17) {
            this.b.setShowWhen(eVar.f305n);
        }
        if (i3 >= 19 && i3 < 21 && (listE = e(g(eVar.c), eVar.W)) != null && !listE.isEmpty()) {
            this.f307g.putStringArray("android.people", (String[]) listE.toArray(new String[listE.size()]));
        }
        if (i3 >= 20) {
            this.b.setLocalOnly(eVar.z).setGroup(eVar.w).setGroupSummary(eVar.x).setSortKey(eVar.y);
            this.f308h = eVar.P;
        }
        if (i3 >= 21) {
            this.b.setCategory(eVar.C).setColor(eVar.E).setVisibility(eVar.F).setPublicVersion(eVar.G).setSound(notification.sound, notification.audioAttributes);
            List listE2 = i3 < 28 ? e(g(eVar.c), eVar.W) : eVar.W;
            if (listE2 != null && !listE2.isEmpty()) {
                Iterator it2 = listE2.iterator();
                while (it2.hasNext()) {
                    this.b.addPerson((String) it2.next());
                }
            }
            this.f309i = eVar.J;
            if (eVar.d.size() > 0) {
                Bundle bundle3 = eVar.c().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i4 = 0; i4 < eVar.d.size(); i4++) {
                    bundle5.putBundle(Integer.toString(i4), k.b(eVar.d.get(i4)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                eVar.c().putBundle("android.car.EXTENSIONS", bundle3);
                this.f307g.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (i3 >= 23 && (icon = eVar.V) != null) {
            this.b.setSmallIcon(icon);
        }
        if (i3 >= 24) {
            this.b.setExtras(eVar.D).setRemoteInputHistory(eVar.s);
            RemoteViews remoteViews = eVar.H;
            if (remoteViews != null) {
                this.b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.I;
            if (remoteViews2 != null) {
                this.b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.J;
            if (remoteViews3 != null) {
                this.b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i3 >= 26) {
            this.b.setBadgeIconType(eVar.L).setSettingsText(eVar.r).setShortcutId(eVar.M).setTimeoutAfter(eVar.O).setGroupAlertBehavior(eVar.P);
            if (eVar.B) {
                this.b.setColorized(eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i3 >= 28) {
            Iterator<m> it3 = eVar.c.iterator();
            while (it3.hasNext()) {
                this.b.addPerson(it3.next().h());
            }
        }
        if (i3 >= 29) {
            this.b.setAllowSystemGeneratedContextualActions(eVar.R);
            this.b.setBubbleMetadata(i.d.c(eVar.S));
            androidx.core.content.b bVar = eVar.N;
            if (bVar != null) {
                bVar.a();
                throw null;
            }
        }
        if (h.h.h.a.c() && (i2 = eVar.Q) != 0) {
            this.b.setForegroundServiceBehavior(i2);
        }
        if (eVar.U) {
            if (this.c.x) {
                this.f308h = 2;
            } else {
                this.f308h = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i5 = notification.defaults & (-2);
            notification.defaults = i5;
            int i6 = i5 & (-3);
            notification.defaults = i6;
            this.b.setDefaults(i6);
            if (i3 >= 26) {
                if (TextUtils.isEmpty(this.c.w)) {
                    this.b.setGroup("silent");
                }
                this.b.setGroupAlertBehavior(this.f308h);
            }
        }
    }

    private void b(i.a aVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 20) {
            if (i2 >= 16) {
                this.f.add(k.f(this.b, aVar));
                return;
            }
            return;
        }
        IconCompat iconCompatE = aVar.e();
        Notification.Action.Builder builder = i2 >= 23 ? new Notification.Action.Builder(iconCompatE != null ? iconCompatE.p() : null, aVar.i(), aVar.a()) : new Notification.Action.Builder(iconCompatE != null ? iconCompatE.e() : 0, aVar.i(), aVar.a());
        if (aVar.f() != null) {
            for (RemoteInput remoteInput : n.b(aVar.f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        if (i2 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.g());
        if (i2 >= 28) {
            builder.setSemanticAction(aVar.g());
        }
        if (i2 >= 29) {
            builder.setContextual(aVar.j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
        builder.addExtras(bundle);
        this.b.addAction(builder.build());
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        h.f.b bVar = new h.f.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<m> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<m> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i2 = notification.defaults & (-2);
        notification.defaults = i2;
        notification.defaults = i2 & (-3);
    }

    @Override // androidx.core.app.h
    public Notification.Builder a() {
        return this.b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        i.f fVar = this.c.p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews remoteViewsE = fVar != null ? fVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null || (remoteViewsE = this.c.H) != null) {
            notificationD.contentView = remoteViewsE;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 16 && fVar != null && (remoteViewsD = fVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (i2 >= 21 && fVar != null && (remoteViewsF = this.c.p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (i2 >= 16 && fVar != null && (bundleA = i.a(notificationD)) != null) {
            fVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            return this.b.build();
        }
        if (i2 >= 24) {
            Notification notificationBuild = this.b.build();
            if (this.f308h != 0) {
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && this.f308h == 2) {
                    h(notificationBuild);
                }
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && this.f308h == 1) {
                    h(notificationBuild);
                }
            }
            return notificationBuild;
        }
        if (i2 >= 21) {
            this.b.setExtras(this.f307g);
            Notification notificationBuild2 = this.b.build();
            RemoteViews remoteViews = this.d;
            if (remoteViews != null) {
                notificationBuild2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.e;
            if (remoteViews2 != null) {
                notificationBuild2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f309i;
            if (remoteViews3 != null) {
                notificationBuild2.headsUpContentView = remoteViews3;
            }
            if (this.f308h != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && this.f308h == 2) {
                    h(notificationBuild2);
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && this.f308h == 1) {
                    h(notificationBuild2);
                }
            }
            return notificationBuild2;
        }
        if (i2 >= 20) {
            this.b.setExtras(this.f307g);
            Notification notificationBuild3 = this.b.build();
            RemoteViews remoteViews4 = this.d;
            if (remoteViews4 != null) {
                notificationBuild3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.e;
            if (remoteViews5 != null) {
                notificationBuild3.bigContentView = remoteViews5;
            }
            if (this.f308h != 0) {
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) != 0 && this.f308h == 2) {
                    h(notificationBuild3);
                }
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) == 0 && this.f308h == 1) {
                    h(notificationBuild3);
                }
            }
            return notificationBuild3;
        }
        if (i2 >= 19) {
            SparseArray<Bundle> sparseArrayA = k.a(this.f);
            if (sparseArrayA != null) {
                this.f307g.putSparseParcelableArray("android.support.actionExtras", sparseArrayA);
            }
            this.b.setExtras(this.f307g);
            Notification notificationBuild4 = this.b.build();
            RemoteViews remoteViews6 = this.d;
            if (remoteViews6 != null) {
                notificationBuild4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.e;
            if (remoteViews7 != null) {
                notificationBuild4.bigContentView = remoteViews7;
            }
            return notificationBuild4;
        }
        if (i2 < 16) {
            return this.b.getNotification();
        }
        Notification notificationBuild5 = this.b.build();
        Bundle bundleA = i.a(notificationBuild5);
        Bundle bundle = new Bundle(this.f307g);
        for (String str : this.f307g.keySet()) {
            if (bundleA.containsKey(str)) {
                bundle.remove(str);
            }
        }
        bundleA.putAll(bundle);
        SparseArray<Bundle> sparseArrayA2 = k.a(this.f);
        if (sparseArrayA2 != null) {
            i.a(notificationBuild5).putSparseParcelableArray("android.support.actionExtras", sparseArrayA2);
        }
        RemoteViews remoteViews8 = this.d;
        if (remoteViews8 != null) {
            notificationBuild5.contentView = remoteViews8;
        }
        RemoteViews remoteViews9 = this.e;
        if (remoteViews9 != null) {
            notificationBuild5.bigContentView = remoteViews9;
        }
        return notificationBuild5;
    }

    Context f() {
        return this.a;
    }
}
