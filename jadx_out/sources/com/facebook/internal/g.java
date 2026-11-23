package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final String[] a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private g() {
    }

    public static final String a() {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            Context contextF = com.facebook.r.f();
            List<ResolveInfo> listQueryIntentServices = contextF.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (listQueryIntentServices != null) {
                HashSet hashSetS = l.t.h.s(a);
                Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (serviceInfo != null && hashSetS.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    public static final String b() {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + com.facebook.r.f().getPackageName();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    public static final String c(String str) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            l.y.c.i.e(str, "developerDefinedRedirectURI");
            if (i0.e(com.facebook.r.f(), str)) {
                return str;
            }
            return i0.e(com.facebook.r.f(), b()) ? b() : "";
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }
}
