package h.a.a.g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import h.a.a.c;
import h.a.a.d;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private final Context a;
    private final ServiceConnectionC0180a b;
    private final String c;
    private final h.a.a.h.a d;
    private final AtomicLong e = new AtomicLong(0);

    /* JADX INFO: renamed from: h.a.a.g.a$a, reason: collision with other inner class name */
    class ServiceConnectionC0180a implements ServiceConnection {
        private final BlockingQueue<IBinder> a = new LinkedBlockingQueue();

        ServiceConnectionC0180a() {
        }

        IBinder a() throws InterruptedException, TimeoutException {
            IBinder iBinderPoll = this.a.poll(10L, TimeUnit.SECONDS);
            if (iBinderPoll != null) {
                return iBinderPoll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.a.add(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            a.this.b();
        }
    }

    public a(Context context) throws c {
        this.a = context;
        ComponentName componentNameF = f(context);
        this.b = g(componentNameF);
        this.d = d();
        this.c = componentNameF.getPackageName();
    }

    private static ComponentName f(Context context) throws c {
        PackageManager packageManager = context.getPackageManager();
        ServiceInfo serviceInfoE = d.e(d.a(packageManager), packageManager);
        if (serviceInfoE != null) {
            return new ComponentName(serviceInfoE.packageName, serviceInfoE.name);
        }
        throw new c("No compatible AndroidX Advertising ID Provider available.");
    }

    public long a() {
        return this.e.incrementAndGet();
    }

    void b() {
        if (this.e.getAndSet(Long.MIN_VALUE) >= 0) {
            this.a.unbindService(this.b);
        }
    }

    public h.a.a.h.a c() {
        return this.d;
    }

    h.a.a.h.a d() {
        return h.a.a.h.a.AbstractBinderC0181a.j(this.b.a());
    }

    public String e() {
        return this.c;
    }

    ServiceConnectionC0180a g(ComponentName componentName) throws IOException {
        Intent intent = new Intent("androidx.ads.identifier.provider.GET_AD_ID");
        intent.setComponent(componentName);
        ServiceConnectionC0180a serviceConnectionC0180a = new ServiceConnectionC0180a();
        if (this.a.bindService(intent, serviceConnectionC0180a, 1)) {
            return serviceConnectionC0180a;
        }
        throw new IOException("Connection failure");
    }

    public boolean h() {
        return this.e.get() >= 0;
    }

    public boolean i(long j2) {
        if (!this.e.compareAndSet(j2, Long.MIN_VALUE)) {
            return !h();
        }
        this.a.unbindService(this.b);
        return true;
    }
}
