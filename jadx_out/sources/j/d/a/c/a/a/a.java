package j.d.a.c.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.q;
import j.d.a.c.f.a.d;
import j.d.a.c.f.a.e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public class a {

    @GuardedBy("this")
    private com.google.android.gms.common.a a;

    @GuardedBy("this")
    private d b;

    @GuardedBy("this")
    private boolean c;
    private final Object d = new Object();

    @GuardedBy("mAutoDisconnectTaskLock")
    private b e;

    @GuardedBy("this")
    private final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f1945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f1946h;

    /* JADX INFO: renamed from: j.d.a.c.a.a.a$a, reason: collision with other inner class name */
    public static final class C0230a {
        private final String a;
        private final boolean b;

        public C0230a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final String toString() {
            String str = this.a;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    static class b extends Thread {
        private WeakReference<a> a;
        private long b;
        CountDownLatch c = new CountDownLatch(1);
        boolean d = false;

        public b(a aVar, long j2) {
            this.a = new WeakReference<>(aVar);
            this.b = j2;
            start();
        }

        private final void a() {
            a aVar = this.a.get();
            if (aVar != null) {
                aVar.a();
                this.d = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.c.await(this.b, TimeUnit.MILLISECONDS)) {
                    return;
                }
                a();
            } catch (InterruptedException unused) {
                a();
            }
        }
    }

    private a(Context context, long j2, boolean z, boolean z2) {
        Context applicationContext;
        q.k(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.c = false;
        this.f1946h = j2;
        this.f1945g = z2;
    }

    public static C0230a b(Context context) {
        c cVar = new c(context);
        boolean zA = cVar.a("gads:ad_id_app_context:enabled", false);
        float fB = cVar.b("gads:ad_id_app_context:ping_ratio", 0.0f);
        String strC = cVar.c("gads:ad_id_use_shared_preference:experiment_id", "");
        a aVar = new a(context, -1L, zA, cVar.a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.h(false);
            C0230a c0230aC = aVar.c();
            aVar.i(c0230aC, zA, fB, SystemClock.elapsedRealtime() - jElapsedRealtime, strC, null);
            aVar.a();
            return c0230aC;
        } catch (Throwable th) {
            try {
                aVar.i(null, zA, fB, -1L, strC, th);
                throw th;
            } catch (Throwable th2) {
                aVar.a();
                throw th2;
            }
        }
    }

    public static void d(boolean z) {
    }

    private static com.google.android.gms.common.a e(Context context, boolean z) throws IOException, com.google.android.gms.common.d {
        try {
            context.getPackageManager().getPackageInfo(GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE, 0);
            int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
            if (iIsGooglePlayServicesAvailable != 0 && iIsGooglePlayServicesAvailable != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            com.google.android.gms.common.a aVar = new com.google.android.gms.common.a();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (com.google.android.gms.common.n.a.b().a(context, intent, aVar, 1)) {
                    return aVar;
                }
                throw new IOException("Connection failure");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new com.google.android.gms.common.d(9);
        }
    }

    private static d f(Context context, com.google.android.gms.common.a aVar) throws IOException {
        try {
            return e.j(aVar.a(10000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    private final void g() {
        synchronized (this.d) {
            b bVar = this.e;
            if (bVar != null) {
                bVar.c.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f1946h > 0) {
                this.e = new b(this, this.f1946h);
            }
        }
    }

    private final void h(boolean z) {
        q.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                a();
            }
            com.google.android.gms.common.a aVarE = e(this.f, this.f1945g);
            this.a = aVarE;
            this.b = f(this.f, aVarE);
            this.c = true;
            if (z) {
                g();
            }
        }
    }

    private final boolean i(C0230a c0230a, boolean z, float f, long j2, String str, Throwable th) {
        if (Math.random() > f) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", z ? "1" : "0");
        if (c0230a != null) {
            map.put("limit_ad_tracking", c0230a.b() ? "1" : "0");
        }
        if (c0230a != null && c0230a.a() != null) {
            map.put("ad_id_size", Integer.toString(c0230a.a().length()));
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            map.put("experiment_id", str);
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j2));
        new j.d.a.c.a.a.b(this, map).start();
        return true;
    }

    public final void a() {
        q.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f == null || this.a == null) {
                return;
            }
            try {
                if (this.c) {
                    com.google.android.gms.common.n.a.b().c(this.f, this.a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.c = false;
            this.b = null;
            this.a = null;
        }
    }

    public C0230a c() {
        C0230a c0230a;
        q.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                q.k(this.a);
                q.k(this.b);
                c0230a = new C0230a(this.b.e(), this.b.s0(true));
            } else {
                synchronized (this.d) {
                    b bVar = this.e;
                    if (bVar == null || !bVar.d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    h(false);
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    q.k(this.a);
                    q.k(this.b);
                    try {
                        c0230a = new C0230a(this.b.e(), this.b.s0(true));
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            throw th;
        }
        g();
        return c0230a;
    }

    protected void finalize() throws Throwable {
        a();
        super.finalize();
    }
}
