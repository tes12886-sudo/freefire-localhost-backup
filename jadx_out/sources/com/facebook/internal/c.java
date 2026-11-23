package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c extends BroadcastReceiver {
    private static c b = null;
    private static final String c = "com.parse.bolts.measurement_event";
    public static final a d = new a(null);
    private final Context a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final c a(Context context) {
            l.y.c.i.e(context, "context");
            if (c.a() != null) {
                return c.a();
            }
            c cVar = new c(context, null);
            c.b(cVar);
            c.c(cVar);
            return c.a();
        }
    }

    private c(Context context) {
        Context applicationContext = context.getApplicationContext();
        l.y.c.i.d(applicationContext, "context.applicationContext");
        this.a = applicationContext;
    }

    public /* synthetic */ c(Context context, l.y.c.f fVar) {
        this(context);
    }

    public static final /* synthetic */ c a() {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return b;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(c cVar) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return;
        }
        try {
            cVar.e();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
        }
    }

    public static final /* synthetic */ void c(c cVar) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return;
        }
        try {
            b = cVar;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
        }
    }

    private final void d() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            h.q.a.a aVarB = h.q.a.a.b(this.a);
            l.y.c.i.d(aVarB, "LocalBroadcastManager.ge…tance(applicationContext)");
            aVarB.e(this);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void e() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            h.q.a.a aVarB = h.q.a.a.b(this.a);
            l.y.c.i.d(aVarB, "LocalBroadcastManager.ge…tance(applicationContext)");
            aVarB.c(this, new IntentFilter(c));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void finalize() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            d();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            com.facebook.j0.m mVar = new com.facebook.j0.m(context);
            StringBuilder sb = new StringBuilder();
            sb.append("bf_");
            sb.append(intent != null ? intent.getStringExtra("event_name") : null);
            String string = sb.toString();
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
            Bundle bundle = new Bundle();
            Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
            if (setKeySet != null) {
                for (String str : setKeySet) {
                    l.y.c.i.d(str, "key");
                    bundle.putString(new l.d0.f("[ -]*$").b(new l.d0.f("^[ -]*").b(new l.d0.f("[^0-9a-zA-Z _-]").b(str, "-"), ""), ""), (String) bundleExtra.get(str));
                }
            }
            mVar.d(string, bundle);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
