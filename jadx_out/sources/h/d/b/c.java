package h.d.b;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private final g.b.a.b a;
    private final ComponentName b;

    class a extends e {
        final /* synthetic */ Context b;

        a(Context context) {
            this.b = context;
        }

        @Override // h.d.b.e
        public final void a(ComponentName componentName, c cVar) {
            cVar.f(0L);
            this.b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    class b extends g.b.a.a.AbstractBinderC0174a {
        private Handler a = new Handler(Looper.getMainLooper());
        final /* synthetic */ h.d.b.b b;

        class a implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ Bundle b;

            a(int i2, Bundle bundle) {
                this.a = i2;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.d(this.a, this.b);
                throw null;
            }
        }

        /* JADX INFO: renamed from: h.d.b.c$b$b, reason: collision with other inner class name */
        class RunnableC0187b implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ Bundle b;

            RunnableC0187b(String str, Bundle bundle) {
                this.a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.a(this.a, this.b);
                throw null;
            }
        }

        /* JADX INFO: renamed from: h.d.b.c$b$c, reason: collision with other inner class name */
        class RunnableC0188c implements Runnable {
            final /* synthetic */ Bundle a;

            RunnableC0188c(Bundle bundle) {
                this.a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.c(this.a);
                throw null;
            }
        }

        class d implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ Bundle b;

            d(String str, Bundle bundle) {
                this.a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.e(this.a, this.b);
                throw null;
            }
        }

        class e implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ Uri b;
            final /* synthetic */ boolean c;
            final /* synthetic */ Bundle d;

            e(int i2, Uri uri, boolean z, Bundle bundle) {
                this.a = i2;
                this.b = uri;
                this.c = z;
                this.d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.f(this.a, this.b, this.c, this.d);
                throw null;
            }
        }

        b(c cVar, h.d.b.b bVar) {
        }

        @Override // g.b.a.a
        public void F0(String str, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new d(str, bundle));
        }

        @Override // g.b.a.a
        public void O0(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new RunnableC0188c(bundle));
        }

        @Override // g.b.a.a
        public void V(String str, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new RunnableC0187b(str, bundle));
        }

        @Override // g.b.a.a
        public void Y0(int i2, Uri uri, boolean z, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new e(i2, uri, z, bundle));
        }

        @Override // g.b.a.a
        public void j0(int i2, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new a(i2, bundle));
        }

        @Override // g.b.a.a
        public Bundle q0(String str, Bundle bundle) {
            h.d.b.b bVar = this.b;
            if (bVar == null) {
                return null;
            }
            bVar.b(str, bundle);
            throw null;
        }
    }

    c(g.b.a.b bVar, ComponentName componentName, Context context) {
        this.a = bVar;
        this.b = componentName;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public static boolean b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    private g.b.a.a.AbstractBinderC0174a c(h.d.b.b bVar) {
        return new b(this, bVar);
    }

    private f e(h.d.b.b bVar, PendingIntent pendingIntent) {
        boolean zM;
        g.b.a.a.AbstractBinderC0174a abstractBinderC0174aC = c(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zM = this.a.R(abstractBinderC0174aC, bundle);
            } else {
                zM = this.a.M(abstractBinderC0174aC);
            }
            if (zM) {
                return new f(this.a, abstractBinderC0174aC, this.b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f d(h.d.b.b bVar) {
        return e(bVar, null);
    }

    public boolean f(long j2) {
        try {
            return this.a.T0(j2);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
