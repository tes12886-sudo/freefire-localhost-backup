package com.facebook.j0.t;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.internal.p;
import com.facebook.r;
import java.util.concurrent.atomic.AtomicBoolean;
import l.d0.q;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final f b = new f();
    private static final AtomicBoolean a = new AtomicBoolean(false);

    private f() {
    }

    public static final void a() {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return;
        }
        try {
            a.set(true);
            b();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
        }
    }

    public static final void b() {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return;
        }
        try {
            if (a.get()) {
                if (b.c() && p.g(p.b.IapLoggingLib2)) {
                    b.c(r.f());
                } else {
                    a.g();
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
        }
    }

    private final boolean c() {
        String string;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            Context contextF = r.f();
            ApplicationInfo applicationInfo = contextF.getPackageManager().getApplicationInfo(contextF.getPackageName(), 128);
            return (applicationInfo == null || (string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version")) == null || Integer.parseInt((String) q.i0(string, new String[]{"."}, false, 3, 2, null).get(0)) < 2) ? false : true;
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
        return false;
    }
}
