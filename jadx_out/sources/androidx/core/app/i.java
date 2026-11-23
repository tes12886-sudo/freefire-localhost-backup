package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class i {

    public static class a {
        final Bundle a;
        private IconCompat b;
        private final n[] c;
        private final n[] d;
        private boolean e;
        boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f291g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f292h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f293i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f294j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f295k;

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.c(null, "", i2) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, n[] nVarArr, n[] nVarArr2, boolean z, int i2, boolean z2, boolean z3) {
            this.f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.i() == 2) {
                this.f293i = iconCompat.e();
            }
            this.f294j = e.d(charSequence);
            this.f295k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = nVarArr;
            this.d = nVarArr2;
            this.e = z;
            this.f291g = i2;
            this.f = z2;
            this.f292h = z3;
        }

        public PendingIntent a() {
            return this.f295k;
        }

        public boolean b() {
            return this.e;
        }

        public n[] c() {
            return this.d;
        }

        public Bundle d() {
            return this.a;
        }

        public IconCompat e() {
            int i2;
            if (this.b == null && (i2 = this.f293i) != 0) {
                this.b = IconCompat.c(null, "", i2);
            }
            return this.b;
        }

        public n[] f() {
            return this.c;
        }

        public int g() {
            return this.f291g;
        }

        public boolean h() {
            return this.f;
        }

        public CharSequence i() {
            return this.f294j;
        }

        public boolean j() {
            return this.f292h;
        }
    }

    public static class b extends f {
        private Bitmap e;
        private IconCompat f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f296g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f297h;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.i$b$b, reason: collision with other inner class name */
        private static class C0015b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        @Override // androidx.core.app.i.f
        public void b(h hVar) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 16) {
                Notification.BigPictureStyle bigPictureStyleBigPicture = new Notification.BigPictureStyle(hVar.a()).setBigContentTitle(this.b).bigPicture(this.e);
                if (this.f296g) {
                    IconCompat iconCompat = this.f;
                    if (iconCompat == null) {
                        a.a(bigPictureStyleBigPicture, null);
                    } else if (i2 >= 23) {
                        C0015b.a(bigPictureStyleBigPicture, this.f.q(hVar instanceof j ? ((j) hVar).f() : null));
                    } else if (iconCompat.i() == 1) {
                        a.a(bigPictureStyleBigPicture, this.f.d());
                    } else {
                        a.a(bigPictureStyleBigPicture, null);
                    }
                }
                if (this.d) {
                    a.b(bigPictureStyleBigPicture, this.c);
                }
                if (i2 >= 31) {
                    c.a(bigPictureStyleBigPicture, this.f297h);
                }
            }
        }

        @Override // androidx.core.app.i.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f296g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }
    }

    public static class c extends f {
        private CharSequence e;

        @Override // androidx.core.app.i.f
        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.e);
            }
        }

        @Override // androidx.core.app.i.f
        public void b(h hVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(hVar.a()).setBigContentTitle(this.b).bigText(this.e);
                if (this.d) {
                    bigTextStyleBigText.setSummaryText(this.c);
                }
            }
        }

        @Override // androidx.core.app.i.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.e = e.d(charSequence);
            return this;
        }
    }

    public static final class d {

        private static class a {
            static Notification.BubbleMetadata a(d dVar) {
                if (dVar == null) {
                    return null;
                }
                dVar.a();
                throw null;
            }
        }

        private static class b {
            static Notification.BubbleMetadata a(d dVar) {
                if (dVar == null) {
                    return null;
                }
                dVar.b();
                throw null;
            }
        }

        public static Notification.BubbleMetadata c(d dVar) {
            if (dVar == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                return b.a(dVar);
            }
            if (i2 == 29) {
                return a.a(dVar);
            }
            return null;
        }

        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent a() {
            throw null;
        }

        public String b() {
            throw null;
        }
    }

    public static class e {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        androidx.core.content.b N;
        long O;
        int P;
        int Q;
        boolean R;
        d S;
        Notification T;
        boolean U;
        Icon V;

        @Deprecated
        public ArrayList<String> W;
        public Context a;
        public ArrayList<a> b;
        public ArrayList<m> c;
        ArrayList<a> d;
        CharSequence e;
        CharSequence f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        PendingIntent f298g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f299h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        RemoteViews f300i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Bitmap f301j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        CharSequence f302k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f303l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f304m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f305n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f306o;
        f p;
        CharSequence q;
        CharSequence r;
        CharSequence[] s;
        int t;
        int u;
        boolean v;
        String w;
        boolean x;
        String y;
        boolean z;

        @Deprecated
        public e(Context context) {
            this(context, null);
        }

        public e(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.d = new ArrayList<>();
            this.f305n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.T = notification;
            this.a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.f304m = 0;
            this.W = new ArrayList<>();
            this.R = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap e(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(h.h.b.b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(h.h.b.a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d = dimensionPixelSize;
            double dMax = Math.max(1, bitmap.getWidth());
            Double.isNaN(d);
            Double.isNaN(dMax);
            double d2 = d / dMax;
            double d3 = dimensionPixelSize2;
            double dMax2 = Math.max(1, bitmap.getHeight());
            Double.isNaN(d3);
            Double.isNaN(dMax2);
            double dMin = Math.min(d2, d3 / dMax2);
            double width = bitmap.getWidth();
            Double.isNaN(width);
            int iCeil = (int) Math.ceil(width * dMin);
            double height = bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, iCeil, (int) Math.ceil(height * dMin), true);
        }

        private void n(int i2, boolean z) {
            Notification notification;
            int i3;
            if (z) {
                notification = this.T;
                i3 = i2 | notification.flags;
            } else {
                notification = this.T;
                i3 = (i2 ^ (-1)) & notification.flags;
            }
            notification.flags = i3;
        }

        public e A(int i2) {
            this.F = i2;
            return this;
        }

        public e B(long j2) {
            this.T.when = j2;
            return this;
        }

        public e a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new j(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e f(boolean z) {
            n(16, z);
            return this;
        }

        public e g(String str) {
            this.K = str;
            return this;
        }

        public e h(int i2) {
            this.E = i2;
            return this;
        }

        public e i(PendingIntent pendingIntent) {
            this.f298g = pendingIntent;
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f = d(charSequence);
            return this;
        }

        public e k(CharSequence charSequence) {
            this.e = d(charSequence);
            return this;
        }

        public e l(int i2) {
            Notification notification = this.T;
            notification.defaults = i2;
            if ((i2 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e m(PendingIntent pendingIntent) {
            this.T.deleteIntent = pendingIntent;
            return this;
        }

        public e o(Bitmap bitmap) {
            this.f301j = e(bitmap);
            return this;
        }

        public e p(int i2, int i3, int i4) {
            Notification notification = this.T;
            notification.ledARGB = i2;
            notification.ledOnMS = i3;
            notification.ledOffMS = i4;
            notification.flags = ((i3 == 0 || i4 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e q(boolean z) {
            this.z = z;
            return this;
        }

        public e r(int i2) {
            this.f303l = i2;
            return this;
        }

        public e s(int i2) {
            this.f304m = i2;
            return this;
        }

        public e t(boolean z) {
            this.f305n = z;
            return this;
        }

        public e u(int i2) {
            this.T.icon = i2;
            return this;
        }

        public e v(Uri uri) {
            Notification notification = this.T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public e w(Uri uri, int i2) {
            Notification notification = this.T;
            notification.sound = uri;
            notification.audioStreamType = i2;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i2).build();
            }
            return this;
        }

        public e x(f fVar) {
            if (this.p != fVar) {
                this.p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public e y(CharSequence charSequence) {
            this.T.tickerText = d(charSequence);
            return this;
        }

        public e z(long[] jArr) {
            this.T.vibrate = jArr;
            return this;
        }
    }

    public static abstract class f {
        protected e a;
        CharSequence b;
        CharSequence c;
        boolean d = false;

        public void a(Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(h hVar);

        protected abstract String c();

        public RemoteViews d(h hVar) {
            return null;
        }

        public RemoteViews e(h hVar) {
            return null;
        }

        public RemoteViews f(h hVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.a != eVar) {
                this.a = eVar;
                if (eVar != null) {
                    eVar.x(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            return notification.extras;
        }
        if (i2 >= 16) {
            return k.c(notification);
        }
        return null;
    }
}
