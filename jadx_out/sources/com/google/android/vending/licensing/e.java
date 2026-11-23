package com.google.android.vending.licensing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class e implements ServiceConnection {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final SecureRandom f1359j = new SecureRandom();
    private ILicensingService a;
    private PublicKey b;
    private final Context c;
    private final j d;
    private Handler e;
    private final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f1360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<g> f1361h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Queue<g> f1362i = new LinkedList();

    private class a extends d.a {
        private final g a;
        private Runnable b;

        /* JADX INFO: renamed from: com.google.android.vending.licensing.e$a$a, reason: collision with other inner class name */
        class RunnableC0128a implements Runnable {
            RunnableC0128a(e eVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.i("LicenseChecker", "Check timed out.");
                a aVar = a.this;
                e.this.l(aVar.a);
                a aVar2 = a.this;
                e.this.h(aVar2.a);
            }
        }

        class b implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            b(int i2, String str, String str2) {
                this.a = i2;
                this.b = str;
                this.c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.i("LicenseChecker", "Received response.");
                if (e.this.f1361h.contains(a.this.a)) {
                    a.this.o();
                    a.this.a.g(e.this.b, this.a, this.b, this.c);
                    a aVar = a.this;
                    e.this.h(aVar.a);
                }
            }
        }

        public a(g gVar) {
            this.a = gVar;
            this.b = new RunnableC0128a(e.this);
            c1();
        }

        private void c1() {
            Log.i("LicenseChecker", "Start monitoring timeout.");
            e.this.e.postDelayed(this.b, 10000L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o() {
            Log.i("LicenseChecker", "Clearing timeout.");
            e.this.e.removeCallbacks(this.b);
        }

        @Override // com.google.android.vending.licensing.d
        public void P0(int i2, String str, String str2) {
            e.this.e.post(new b(i2, str, str2));
        }
    }

    public e(Context context, j jVar, String str) {
        this.c = context;
        this.d = jVar;
        this.b = j(str);
        String packageName = context.getPackageName();
        this.f = packageName;
        this.f1360g = k(context, packageName);
        HandlerThread handlerThread = new HandlerThread("background thread");
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
    }

    private void g() {
        if (this.a != null) {
            try {
                this.c.unbindService(this);
            } catch (IllegalArgumentException unused) {
                Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
            }
            this.a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h(g gVar) {
        this.f1361h.remove(gVar);
        if (this.f1361h.isEmpty()) {
            g();
        }
    }

    private int i() {
        return f1359j.nextInt();
    }

    private static PublicKey j(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(com.google.android.vending.licensing.n.a.a(str)));
        } catch (com.google.android.vending.licensing.n.b e) {
            Log.e("LicenseChecker", "Could not decode from Base64.");
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        } catch (InvalidKeySpecException e3) {
            Log.e("LicenseChecker", "Invalid key specification.");
            throw new IllegalArgumentException(e3);
        }
    }

    private static String k(Context context, String str) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("LicenseChecker", "Package not found. could not get version code.");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l(g gVar) {
        this.d.b(291, null);
        if (this.d.a()) {
            gVar.a().a(291);
        } else {
            gVar.a().c(291);
        }
    }

    private void m() {
        while (true) {
            g gVarPoll = this.f1362i.poll();
            if (gVarPoll == null) {
                return;
            }
            try {
                Log.i("LicenseChecker", "Calling checkLicense on service for " + gVarPoll.c());
                this.a.Q0((long) gVarPoll.b(), gVarPoll.c(), new a(gVarPoll));
                this.f1361h.add(gVarPoll);
            } catch (RemoteException e) {
                Log.w("LicenseChecker", "RemoteException in checkLicense call.", e);
                l(gVarPoll);
            }
        }
    }

    public synchronized void f(f fVar) {
        if (this.d.a()) {
            Log.i("LicenseChecker", "Using cached license response");
            fVar.a(256);
        } else {
            g gVar = new g(this.d, new h(), fVar, i(), this.f, this.f1360g);
            if (this.a == null) {
                Log.i("LicenseChecker", "Binding to licensing service.");
                try {
                    Intent intent = new Intent(new String(com.google.android.vending.licensing.n.a.a("Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U=")));
                    intent.setPackage(GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE);
                    if (this.c.bindService(intent, this, 1)) {
                        this.f1362i.offer(gVar);
                    } else {
                        Log.e("LicenseChecker", "Could not bind to service.");
                        l(gVar);
                    }
                } catch (com.google.android.vending.licensing.n.b e) {
                    e.printStackTrace();
                } catch (SecurityException unused) {
                    fVar.b(6);
                }
            } else {
                this.f1362i.offer(gVar);
                m();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a = ILicensingService.a.j(iBinder);
        m();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.w("LicenseChecker", "Service unexpectedly disconnected.");
        this.a = null;
    }
}
