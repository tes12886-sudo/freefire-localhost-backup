package com.google.firebase.analytics.a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzee;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Subscriber;
import com.google.firebase.f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b implements com.google.firebase.analytics.a.a {
    private static volatile com.google.firebase.analytics.a.a c;
    final com.google.android.gms.measurement.a.a a;
    final Map<String, Object> b;

    class a implements com.google.firebase.analytics.a.a.InterfaceC0129a {
        a(b bVar, String str) {
        }
    }

    b(com.google.android.gms.measurement.a.a aVar) {
        q.k(aVar);
        this.a = aVar;
        this.b = new ConcurrentHashMap();
    }

    public static com.google.firebase.analytics.a.a d(FirebaseApp firebaseApp, Context context, Subscriber subscriber) {
        q.k(firebaseApp);
        q.k(context);
        q.k(subscriber);
        q.k(context.getApplicationContext());
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.isDefaultApp()) {
                        subscriber.b(f.class, c.a, d.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    c = new b(zzee.t(context, null, null, null, bundle).u());
                }
            }
        }
        return c;
    }

    static final /* synthetic */ void e(com.google.firebase.events.a aVar) {
        boolean z = ((f) aVar.a()).a;
        synchronized (b.class) {
            com.google.firebase.analytics.a.a aVar2 = c;
            q.k(aVar2);
            ((b) aVar2).a.d(z);
        }
    }

    private final boolean f(String str) {
        return (str.isEmpty() || !this.b.containsKey(str) || this.b.get(str) == null) ? false : true;
    }

    @Override // com.google.firebase.analytics.a.a
    public void a(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.d(str, str2)) {
            this.a.c(str, str2, obj);
        }
    }

    @Override // com.google.firebase.analytics.a.a
    public com.google.firebase.analytics.a.a.InterfaceC0129a b(String str, com.google.firebase.analytics.a.a.b bVar) {
        Object fVar;
        q.k(bVar);
        if (!com.google.firebase.analytics.connector.internal.b.a(str) || f(str)) {
            return null;
        }
        com.google.android.gms.measurement.a.a aVar = this.a;
        if ("fiam".equals(str)) {
            fVar = new com.google.firebase.analytics.connector.internal.d(aVar, bVar);
        } else {
            fVar = ("crash".equals(str) || "clx".equals(str)) ? new com.google.firebase.analytics.connector.internal.f(aVar, bVar) : null;
        }
        if (fVar == null) {
            return null;
        }
        this.b.put(str, fVar);
        return new a(this, str);
    }

    @Override // com.google.firebase.analytics.a.a
    public void c(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.b(str2, bundle) && com.google.firebase.analytics.connector.internal.b.e(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.b.g(str, str2, bundle);
            this.a.a(str, str2, bundle);
        }
    }
}
