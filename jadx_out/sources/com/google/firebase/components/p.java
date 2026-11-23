package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.inject.Provider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p<T> {
    private final T a;
    private final c<T> b;

    private static class b implements c<Context> {
        private final Class<? extends Service> a;

        private b(Class<? extends Service> cls) {
            this.a = cls;
        }

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // com.google.firebase.components.p.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a(Context context) {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    interface c<T> {
        List<String> a(T t);
    }

    p(T t, c<T> cVar) {
        this.a = t;
        this.b = cVar;
    }

    public static p<Context> b(Context context, Class<? extends Service> cls) {
        return new p<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (r.class.isAssignableFrom(cls)) {
                return (r) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new x(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new x(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new x(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new x(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new x(String.format("Could not instantiate %s", str), e4);
        }
    }

    public List<Provider<r>> a() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.b.a(this.a)) {
            arrayList.add(new Provider() { // from class: com.google.firebase.components.c
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return p.c(str);
                }
            });
        }
        return arrayList;
    }
}
