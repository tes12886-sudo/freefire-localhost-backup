package com.facebook.j0.t;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.r;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l.y.c.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final String a = "com.facebook.j0.t.a";
    private static Boolean c;
    private static Boolean d;
    private static ServiceConnection e;
    private static Application.ActivityLifecycleCallbacks f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Intent f654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Object f655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f656i = new a();
    private static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.facebook.j0.t.a$a, reason: collision with other inner class name */
    public static final class ServiceConnectionC0080a implements ServiceConnection {
        ServiceConnectionC0080a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            i.e(componentName, "name");
            i.e(iBinder, "service");
            a aVar = a.f656i;
            a.f655h = d.a(r.f(), iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            i.e(componentName, "name");
        }
    }

    public static final class b implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: com.facebook.j0.t.a$b$a, reason: collision with other inner class name */
        static final class RunnableC0081a implements Runnable {
            public static final RunnableC0081a a = new RunnableC0081a();

            RunnableC0081a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (com.facebook.internal.m0.i.a.d(this)) {
                    return;
                }
                try {
                    Context contextF = r.f();
                    a aVar = a.f656i;
                    aVar.f(contextF, d.i(contextF, a.b(aVar)), false);
                    aVar.f(contextF, d.j(contextF, a.b(aVar)), true);
                } catch (Throwable th) {
                    com.facebook.internal.m0.i.a.b(th, this);
                }
            }
        }

        /* JADX INFO: renamed from: com.facebook.j0.t.a$b$b, reason: collision with other inner class name */
        static final class RunnableC0082b implements Runnable {
            public static final RunnableC0082b a = new RunnableC0082b();

            RunnableC0082b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (com.facebook.internal.m0.i.a.d(this)) {
                    return;
                }
                try {
                    Context contextF = r.f();
                    a aVar = a.f656i;
                    ArrayList<String> arrayListI = d.i(contextF, a.b(aVar));
                    if (arrayListI.isEmpty()) {
                        arrayListI = d.g(contextF, a.b(aVar));
                    }
                    aVar.f(contextF, arrayListI, false);
                } catch (Throwable th) {
                    com.facebook.internal.m0.i.a.b(th, this);
                }
            }
        }

        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            i.e(activity, "activity");
            try {
                r.n().execute(RunnableC0081a.a);
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            i.e(activity, "activity");
            i.e(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            i.e(activity, "activity");
            try {
                if (i.a(a.a(a.f656i), Boolean.TRUE) && i.a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    r.n().execute(RunnableC0082b.a);
                }
            } catch (Exception unused) {
            }
        }
    }

    private a() {
    }

    public static final /* synthetic */ Boolean a(a aVar) {
        return d;
    }

    public static final /* synthetic */ Object b(a aVar) {
        return f655h;
    }

    private final void e() {
        if (c != null) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(h.a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        c = boolValueOf;
        if (i.a(boolValueOf, Boolean.FALSE)) {
            return;
        }
        d = Boolean.valueOf(h.a("com.android.billingclient.api.ProxyBillingActivity") != null);
        d.b();
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage(GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE);
        i.d(intent, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
        f654g = intent;
        e = new ServiceConnectionC0080a();
        f = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Context context, ArrayList<String> arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            try {
                String string = new JSONObject(str).getString("productId");
                i.d(string, "sku");
                i.d(str, "purchase");
                map.put(string, str);
                arrayList2.add(string);
            } catch (JSONException e2) {
                Log.e(a, "Error parsing in-app purchase data.", e2);
            }
        }
        for (Map.Entry<String, String> entry : d.k(context, arrayList2, f655h, z).entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str2 = (String) map.get(key);
            if (str2 != null) {
                i.d(str2, "it");
                com.facebook.j0.v.d.f(str2, value, z);
            }
        }
    }

    public static final void g() {
        a aVar = f656i;
        aVar.e();
        if (!i.a(c, Boolean.FALSE) && com.facebook.j0.v.d.c()) {
            aVar.h();
        }
    }

    private final void h() {
        if (b.compareAndSet(false, true)) {
            Context contextF = r.f();
            if (contextF instanceof Application) {
                Application application = (Application) contextF;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f;
                if (activityLifecycleCallbacks == null) {
                    i.q("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = f654g;
                if (intent == null) {
                    i.q("intent");
                    throw null;
                }
                ServiceConnection serviceConnection = e;
                if (serviceConnection != null) {
                    contextF.bindService(intent, serviceConnection, 1);
                } else {
                    i.q("serviceConnection");
                    throw null;
                }
            }
        }
    }
}
