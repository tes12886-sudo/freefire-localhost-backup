package com.facebook.j0.x;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.internal.h0;
import com.facebook.internal.n;
import com.facebook.r;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import l.t.m;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final String a;
    private static Boolean b;
    public static final c c = new c();

    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");

        private final String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    public static final class b implements ServiceConnection {
        private final CountDownLatch a = new CountDownLatch(1);
        private IBinder b;

        public final IBinder a() throws InterruptedException {
            this.a.await(5L, TimeUnit.SECONDS);
            return this.b;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            i.e(componentName, "name");
            this.a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            i.e(componentName, "name");
            i.e(iBinder, "serviceBinder");
            this.b = iBinder;
            this.a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            i.e(componentName, "name");
        }
    }

    /* JADX INFO: renamed from: com.facebook.j0.x.c$c, reason: collision with other inner class name */
    public enum EnumC0092c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    static {
        String simpleName = c.class.getSimpleName();
        i.d(simpleName, "RemoteServiceWrapper::class.java.simpleName");
        a = simpleName;
    }

    private c() {
    }

    private final Intent a(Context context) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && n.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null && n.a(context, "com.facebook.wakizashi")) {
                    return intent2;
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public static final boolean b() {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return false;
        }
        try {
            if (b == null) {
                b = Boolean.valueOf(c.a(r.f()) != null);
            }
            Boolean bool = b;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return false;
        }
    }

    public static final EnumC0092c c(String str, List<com.facebook.j0.c> list) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            i.e(str, "applicationId");
            i.e(list, "appEvents");
            return c.d(a.CUSTOM_APP_EVENTS, str, list);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    private final EnumC0092c d(a aVar, String str, List<com.facebook.j0.c> list) {
        EnumC0092c enumC0092c;
        String str2;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            EnumC0092c enumC0092c2 = EnumC0092c.SERVICE_NOT_AVAILABLE;
            com.facebook.j0.v.b.b();
            Context contextF = r.f();
            Intent intentA = a(contextF);
            if (intentA == null) {
                return enumC0092c2;
            }
            b bVar = new b();
            try {
                if (!contextF.bindService(intentA, bVar, 1)) {
                    return EnumC0092c.SERVICE_ERROR;
                }
                try {
                    try {
                        IBinder iBinderA = bVar.a();
                        if (iBinderA != null) {
                            com.facebook.l0.a.a aVarJ = com.facebook.l0.a.a.AbstractBinderC0096a.j(iBinderA);
                            Bundle bundleA = com.facebook.j0.x.b.a(aVar, str, list);
                            if (bundleA != null) {
                                aVarJ.O(bundleA);
                                h0.f0(a, "Successfully sent events to the remote service: " + bundleA);
                            }
                            enumC0092c2 = EnumC0092c.OPERATION_SUCCESS;
                        }
                        return enumC0092c2;
                    } catch (RemoteException e) {
                        enumC0092c = EnumC0092c.SERVICE_ERROR;
                        str2 = a;
                        h0.e0(str2, e);
                        contextF.unbindService(bVar);
                        h0.f0(str2, "Unbound from the remote service");
                        return enumC0092c;
                    }
                } catch (InterruptedException e2) {
                    enumC0092c = EnumC0092c.SERVICE_ERROR;
                    str2 = a;
                    h0.e0(str2, e2);
                    contextF.unbindService(bVar);
                    h0.f0(str2, "Unbound from the remote service");
                    return enumC0092c;
                }
            } finally {
                contextF.unbindService(bVar);
                h0.f0(a, "Unbound from the remote service");
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public static final EnumC0092c e(String str) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            i.e(str, "applicationId");
            return c.d(a.MOBILE_APP_INSTALL, str, m.g());
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }
}
